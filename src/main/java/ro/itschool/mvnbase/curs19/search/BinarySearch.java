package ro.itschool.mvnbase.curs19.search;

import java.util.Arrays;

public class BinarySearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems==null){
            return false;
        }
        if (elems.length==0){
            return false;
        }
        if (elems[elems.length/2]==elem){
            return true;
        }else if(elem<elems[elems.length/2]) {
           return search(Arrays.copyOfRange(elems,0,elems.length/2),elem);
        }else if (elem>elems[elems.length/2]){
            return search(Arrays.copyOfRange(elems,elems.length/2+1,elems.length),elem);
        }
        return false;
    }
}
