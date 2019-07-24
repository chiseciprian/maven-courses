package ro.itschool.mvnbase.curs7.Lumineers;

public class LightBulb implements Lumineers {
    boolean switchButton;

    @Override
    public void bright() {
        switchButton=true;
    }

    @Override
    public void noBright() {
        switchButton=false;
    }

    @Override
    public String status() {
        if (switchButton==true){
            return "Bulb light is turn on";
        }else {
            return "Bulb light is turn off";
        }
    }
}
