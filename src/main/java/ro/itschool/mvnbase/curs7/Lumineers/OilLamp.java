package ro.itschool.mvnbase.curs7.Lumineers;

public class OilLamp implements Lumineers {
    boolean burn;

    @Override
    public void bright() {
        burn=true;
    }

    @Override
    public void noBright() {
        burn=false;
    }

    @Override
    public String status() {
        if (burn==true){
            return "Oil lamp is burning";
        }else {
            return "Oil lamp is not burning";
        }
    }
}
