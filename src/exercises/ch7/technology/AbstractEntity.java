package exercises.ch7.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {

    private int ID;

    AbstractEntity (){
        this.ID = ThreadLocalRandom.current().nextInt(0,100 +1);
    }

    public int getID() {
        return ID;
    }
}
