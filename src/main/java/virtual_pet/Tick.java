package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Tick {
    HashMap<Integer, VirtualPet> hMap = hashmaps.getInstance().referenceData;
   // HashMap<Integer, Robot> hMapR = hashm.getInstance().referenceData;
    Random rand = new Random();

    public void setHunger() {
        for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
            // if (entry.getKey() == 1) {
            entry.getValue().setHunger(entry.getValue().getHunger() - rand.nextInt(50 - 5) + 5);
            entry.getValue().setBoredom(entry.getValue().getBoredom() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setThirst(entry.getValue().getHunger() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setClean(entry.getValue().getClean() + rand.nextInt(50 - 5) + 5);
            // }

        }

    }

    public void setThirst() {
        for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
            // if (entry.getKey() == 1) {
            entry.getValue().setHunger(entry.getValue().getHunger() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setBoredom(entry.getValue().getBoredom() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setThirst(entry.getValue().getHunger() - rand.nextInt(50 - 5) + 5);
            entry.getValue().setClean(entry.getValue().getClean() + rand.nextInt(50 - 5) + 5);
            // }

        }

    }

    public void setBoredom() {
        for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
            // if (entry.getKey() == 1) {
            entry.getValue().setHunger(entry.getValue().getHunger() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setBoredom(entry.getValue().getBoredom() - rand.nextInt(25 - 5) + 5);
            entry.getValue().setThirst(entry.getValue().getHunger() + rand.nextInt(50 - 5) + 5);
            entry.getValue().setClean(entry.getValue().getClean() + rand.nextInt(50 - 5) + 5);
            // }
        }
    }

    public void setClean() {
        for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
            // if (entry.getKey() == 1) {
            entry.getValue().setHunger(entry.getValue().getHunger() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setBoredom(entry.getValue().getBoredom() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setThirst(entry.getValue().getHunger() + rand.nextInt(50 - 5) + 5);
            entry.getValue().setClean(entry.getValue().getClean() - rand.nextInt(50 - 5) + 5);
             }

        }

            public void setCharge() {
        for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
            // if (entry.getKey() == 1) {

            entry.getValue().setHunger(entry.getValue().getHunger() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setBoredom(entry.getValue().getBoredom() + rand.nextInt(25 - 5) + 5);
            entry.getValue().setThirst(entry.getValue().getHunger() + rand.nextInt(50 - 5) + 5);
            entry.getValue().setClean(entry.getValue().getClean() - rand.nextInt(50 - 5) + 5);
            // }

        }

    
    }
}
