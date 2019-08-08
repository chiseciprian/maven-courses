package ro.itschool.mvnbase.curs19.search;

public class LinearSearchRecursion implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }
        if (elems.length==0){
            return false;
        }
        int left = 0;
        int right = elems.length-1;
        if (right < 1) {
            return false;
        }
        if (elems[right] == elem)
            return true;
        if (elems[left] == elem)
            return true;
        return search(elems, elem, left + 1, right - 1);
    }

    private boolean search(int[] elems, int elem, int left, int right) {
        if (right < 1) {
            return false;
        }
        if (elems[left] == elem)
            return true;
        if (elems[right] == elem)
            return true;
        return search(elems, elem, left + 1, right - 1);
    }
}
