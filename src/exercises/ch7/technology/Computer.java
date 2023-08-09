package exercises.ch7.technology;

public class Computer extends AbstractEntity {

    private String brand;
    private String type;
    private String color;
    private double screenSize;

    public Computer(String aBrand, String aType){
        super();
        brand = aBrand;
        type = aType;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

}
