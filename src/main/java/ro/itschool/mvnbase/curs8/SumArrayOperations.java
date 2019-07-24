package ro.itschool.mvnbase.curs8;

public abstract class SumArrayOperations  implements ArrayOperation{

    abstract String getSource();

    @Override
    public int sum(int[] array) {
        int result=0;
        for (int elem : array){
            result+=elem;
        }
        return result;
    }
}
