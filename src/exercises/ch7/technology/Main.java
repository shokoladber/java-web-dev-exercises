package exercises.ch7.technology;

public class Main {

    public static void main(String[] args){

        Laptop macBookAir = new Laptop("Apple", "MacBook Air");
        System.out.println(macBookAir.uploadSoftware());

        SmartPhone iPhone = new SmartPhone("Apple", "iPhone");
        System.out.println(iPhone.checkForUpdates());
        iPhone.setHasAvailableUpdates(true);
        System.out.println(iPhone.checkForUpdates());
        System.out.println(iPhone.getID());
        System.out.println(macBookAir.getID());

    }

}
