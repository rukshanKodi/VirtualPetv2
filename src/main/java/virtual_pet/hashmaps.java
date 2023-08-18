package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class hashmaps {

    private static  hashmaps instance = new hashmaps();

    public hashmaps() {
        Map<Integer, VirtualPet> hashmaps = new HashMap<Integer, VirtualPet>();
        this.referenceData = (HashMap<Integer, VirtualPet>) hashmaps;

    }
    public HashMap<Integer, VirtualPet> referenceData;
    public static hashmaps getInstance() {
        return instance;
    }

}
