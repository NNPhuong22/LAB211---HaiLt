package fromcounts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANG THAI
 */
public class ArrayIntList {

    private int[] elementData;
    private int size;

    public ArrayIntList() {
    }

    public ArrayIntList(int[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    public int[] fromCounts() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i += 2) {
            for (int j = 1; j <= elementData[i]; j++) {
                list.add(elementData[i + 1]);
            }
        }
        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

}
