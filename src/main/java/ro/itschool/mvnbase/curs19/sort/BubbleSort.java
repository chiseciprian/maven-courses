package ro.itschool.mvnbase.curs19.sort;

public class BubbleSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems==null){
            return null;
        }
        boolean sort = false;
        while (sort == false) {
            sort = true;
            for (int i = 0; i < elems.length-1; i++) {
                if (elems[i] > elems[i + 1]) {
                    swap(elems, i,i+1);
                    sort = false;
                }
            }
        }
        return elems;
    }




}
