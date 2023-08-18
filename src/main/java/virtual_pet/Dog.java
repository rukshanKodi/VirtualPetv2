package virtual_pet;

public class Dog extends VirtualPet{

    private String id;

        

    public Dog(String name, String type, int hunger, int thirst, int boredom, int clean, String id) {
        super(name, type, hunger, thirst, boredom, clean);
        this.id = id;
    }


}