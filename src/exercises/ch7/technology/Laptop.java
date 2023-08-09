package exercises.ch7.technology;

public class Laptop extends Computer {

    private boolean isTablet = false;

    public Laptop(String aBrand, String aType){
        super(aBrand, aType);
    }

    public String uploadSoftware(){
        return "Software installed";
    }

    public boolean isTablet() {
        return isTablet;
    }

    public void setTablet(boolean tablet) {
        isTablet = tablet;
    }
}
