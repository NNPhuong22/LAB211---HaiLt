/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0071;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author NNPhuong
 */
public class Manager {

    private List<Task> listTasks = new ArrayList<>();

    public Manager() {
        listTasks.add(new Task(1, 1, "Dev program", new Date(), 15, 16, "dev", "review"));
        listTasks.add(new Task(2, 2, "Test program", new Date(), 15, 16, "Test", "review"));
        listTasks.add(new Task(3, 2, "Java", new Date(), 15, 16, "Test", "review"));
        listTasks.add(new Task(7, 2, "Winform", new Date(), 15, 16, "Test", "review"));
    }

    public void addTask() {
        int id = 1;
        if (!listTasks.isEmpty()) {
            id = listTasks.get(listTasks.size() - 1).getId() + 1;
        }
        String name = Validate.getString("Requirement Name: ", null);
        Integer taskTypeId = Validate.CheckInt("Task Type: ", 1, 4, null);
        Date date = Validate.CheckDate("Date: ", null);
        Double from = Validate.getDouble("From: ", "From [8.0-17.5]", 8.0, 17.5, null);
        Double to = Validate.getDouble("To: ", "To[" + from + "-17.5]", from, 17.5, null);
        String assignee = Validate.getString("Assignee: ",  null);
        String reviewer = Validate.getString("Reviewer: ",  null);
        listTasks.add(new Task(id, taskTypeId, name, date, from, to, assignee, reviewer));
        System.out.println("Add task successful!");
    }
    public void updateTask(){
        System.out.println("------------Update Task-------------");
        int index = indexId();
        if (index != -1) {
            Task task = listTasks.get(index);
            String name = Validate.getString("Requirement Name: ",  "nope");
            Integer taskTypeId = Validate.CheckInt("Task Type: ", 1, 4, "nope");
            Date date = Validate.CheckDate("Date: ", "nope");
            Double from = Validate.getDouble("From: ", "From[8.0-17.5]", 8.0, 17.5, "nope");
            Double to = null;
            if (from != null) {
                task.setFrom(from);
                if (from > task.getTo()) {
                    to = Validate.getDouble("To: ", "To[" + from + "-17.5]", from, 17.5, null);
                } else {
                    to = Validate.getDouble("To: ", "To[" + from + "-17.5]", from, 17.5, "nope");
                }
            } else {
                to = Validate.getDouble("To: ", "To[" + task.getFrom() + "-17.5]", task.getFrom(), 17.5, "nope");
            }
            if (to != null) {
                task.setTo(to);
            }

            String assignee = Validate.getString("Assignee: ", "nope");
            String reviewer = Validate.getString("Reviewer: ","nope");
            if (name != null) {
                task.setName(name);
            }
            if (taskTypeId != null) {
                task.setTaskTypeId(taskTypeId);
            }
            if (date != null) {
                task.setDate(date);
            }
            if (assignee != null) {
                task.setAssignee(assignee);
            }
            if (reviewer != null) {
                task.setReviewer(reviewer);
            }
        } else {
            System.out.println("Id not found");
        }
    }

    public void deleteTask() {
        System.out.println("---------Del Task------");
        do {            
            int index = indexId();
        if (index != -1) {
            listTasks.remove(index);
            System.out.println("Remove successfull");
            return;
        }
            System.out.println("Id not found");
        } while (true);
        
    }
    public void getDataTasks() {
        if (listTasks.isEmpty()) {
            System.out.println("List task is empty");
        } else {
            Collections.sort(listTasks);
            System.out.println("----------------------"
                    + "--------------------------- Task descending order"
                    + "--------------------------------------------------------");
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
            for (int i = listTasks.size()-1; i >= 0; i--) {
                System.out.println(listTasks.get(i).toString());
            }
    }
    }

    private int indexId() {
        int id = Validate.CheckInt("Requirement ID: ", 1, Integer.MAX_VALUE, null);
        for (int i = 0; i < listTasks.size(); i++) {
            Task task = listTasks.get(i);
            if (task.getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
