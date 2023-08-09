package exercises.ch7.technology;

public class SmartPhone extends Computer {

    private String network;
    private boolean hasAvailableUpdates = false;

    public boolean isHasAvailableUpdates() {
        return hasAvailableUpdates;
    }

    public void setHasAvailableUpdates(boolean hasAvailableUpdates) {
        this.hasAvailableUpdates = hasAvailableUpdates;
    }

    public SmartPhone(String aBrand, String aType){
        super(aBrand, aType);
    }

    public String checkForUpdates(){
        if (hasAvailableUpdates){
            return "Updates Available";
        } else {
            return "No Updates Available";
        }
    }

}
