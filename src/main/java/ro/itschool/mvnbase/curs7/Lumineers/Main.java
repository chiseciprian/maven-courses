package ro.itschool.mvnbase.curs7.Lumineers;

public class Main {
    public static void main(String[] args) {
        OilLamp oilLamp=new OilLamp();
        LightBulb lightBulb = new LightBulb();

        getStatus(oilLamp);
        getStatus(lightBulb);

        oilLamp.bright();
        lightBulb.bright();

        getStatus(oilLamp);
        getStatus(lightBulb);

    }
    private static void getStatus(Lumineers lumineers){
        System.out.println(lumineers.status());
    }
}
