package ro.itschool.mvnbase.curs19.sort;

public class SelectionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems==null){
            return null;
        }
        for (int i = 0; i < elems.length; i++) {
            int minPos = foundMin(elems, i);
            swap(elems, i, minPos);
        }
        return elems;
    }

    public int foundMin(int[] arr, int pos) {
        int minpos = pos;
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] < arr[minpos]) {
                minpos = i;
            }
        }
        return minpos;
    }

}
