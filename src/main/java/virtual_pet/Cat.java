package virtual_pet;

public class Cat extends VirtualPet{

    private String id;

    public Cat(String name, String type, int hunger, int thirst, int boredom, int clean, String id) {
        super(name, type, hunger, thirst, boredom, clean);
        this.id = id;
    }


}
