package virtual_pet;

public class Robot extends VirtualPet {
    private int charging;

    public Robot(String name, String type, int clean,int charging) {
        super(name, type, 0 , 0 , 0 , clean);
        this.charging = charging;

    }

    public int getCharging() {
        return charging;
    }

    public void setCharging() {
        this.charging = charging;
    }
}
