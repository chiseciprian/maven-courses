package ro.itschool.mvnbase.curs17.recursivitate;

public class Pow {
    public int pow(int b, int p) {
        if (p<0){

        }
        if (p == 0) {
            return 1;
        } else {
            return b * pow(b, p - 1);
        }
    }
}
