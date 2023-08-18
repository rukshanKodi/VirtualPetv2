package virtual_pet;

import java.util.HashMap;

//(to access it, it must be inherited from another class).
public abstract class VirtualPet {
    private String name;
    private String type;
    private int hunger;
    private int thirst;
    private int boredom;
     private int clean;
   

    //HashMap<Integer, VirtualPet> hashM = hashmaps.getInstance().referenceData;
    


    //creating a constructor
    public VirtualPet(String name, String type, int hunger, int thirst, int boredom, int clean) {
        this.name = name;
        this.type = type;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.clean = clean;
         
    }
    public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }
    //getter and setter .. these methods return and set variable values through these methods

    public String getName() {
        return name;
    }

  

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    

  
}
