package FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {

//        OS obj = new Windows();
//        obj.specs();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.specs();
    }
}

