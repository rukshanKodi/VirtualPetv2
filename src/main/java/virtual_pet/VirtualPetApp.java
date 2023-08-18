package virtual_pet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class VirtualPetApp {

    public static void main(String[] args) throws IOException {
        // System.out.append("Windows Detected");
        // set Windows Dos Terminal width 80, height 25
        // Process p = Runtime.getRuntime().exec("mode 80, 25");

        NumberInput ni = new NumberInput();
        textInput ti = new textInput();
        System.out.print("\033[H\033[2J");
        System.out.println("welcome to the pet Shelter");
        System.out.println("Select what you want to do");
        int PHMNum = 1;
        animator anm = new animator();
        HashMap<Integer, VirtualPet> hMap = hashmaps.getInstance().referenceData;
        printOutPut prout = new printOutPut();
        // HashMap<Integer, hashmaps> hMap = hashmaps.getInstance().referenceData;

        int output = ni.getValidatedFeed("[1 - intake pet] [2 - remove pet - not implemented  ] [0 - exit] ");
        switch (output) {

            case 1: {

                System.out.print("\033[H\033[2J");

                // output = ni.getValidatedFeed("[1 - cat] [2 - dog ] [0 - exit] ");

                do {
                    System.out.print("\033[H\033[2J");
                    System.out.println("select a pet you like to take in to the shelter? " + '\n');
                    System.out.println("what is the name of  your pet? ");
                    String sOutput = ti.getStringValue("name");
                    System.out.println("select your pet type ");
                    output = ni.getValidatedFeed("[1 - cat] [2 - dog ] [3 - Robot]  ");
                    String petType = "";
                    if (output == 1) {

                        Random rand = new Random();
                        petType = "cat";
                        Cat cat = new Cat(sOutput, petType, rand.nextInt(75 - 10 + 1) + 10,
                                rand.nextInt(75 - 10 + 1) + 10, rand.nextInt(75 - 10 + 1) + 10,
                                rand.nextInt(75 - 10 + 1) + 10,
                                UUID.randomUUID().toString());
                        hMap.put(PHMNum, cat);
                        PHMNum++;
                    } else if (output == 2) {
                        petType = "dog";
                        Random rand = new Random();
                        Dog dog = new Dog(sOutput, petType, rand.nextInt(75 - 10 + 1) + 10,
                                rand.nextInt(75 - 10 + 1) + 10, rand.nextInt(75 - 10 + 1) + 10,
                                rand.nextInt(75 - 10 + 1) + 10,
                                UUID.randomUUID().toString());
                        hMap.put(PHMNum, dog);
                        PHMNum++;
                    } else if (output == 3) {
                        petType = "robot";
                        Random rand = new Random();
                        Robot robot = new Robot(sOutput, petType, rand.nextInt(75 - 10 + 1) + 10,
                                rand.nextInt(75 - 10 + 1) + 10);

                        hMap.put(PHMNum, robot);
                        PHMNum++;
                    }

                    System.out.print("\033[H\033[2J");

                    prout.catOutput();

                    System.out.println("Do you want to add a new pet?");
                    output = ni.getValidatedFeed("[1 - yes] [2 - No ]");
                    System.out.print("\033[H\033[2J");
                    if (output != 1) {
                        System.out.print("\033[H\033[2J");
                        break;

                    }
                } while (output == 1);
            }
            case 2: {

                System.out.print("\033[H\033[2J");
                prout.catOutput();
                System.out.println("Check your pet need. For treat please select its ID" + '\n');
                prout.dogOutput();
                System.out.println("individual care not implemented in code");
                // output = ni.getValidatedFeed("Enter pet ID");
                System.out.println("Lets Treat all");

                Tick tick = new Tick();
                // tick.setHunger();
                // prout.catOutput();
                // boolean alive;

                while (output != 0) {
                    output = ni.getValidatedFeed(
                            "Enter pet Need:[ 1 - Food ] [ 2 - water ] [ 3 - play with pet ] [4 - Clean cage] [5 - Charge Robots] [0 - EXIT ]");
                    System.out.print("\033[H\033[2J");
                    switch (output) {
                        case 0:
                            System.out.println("Thank you - Come again");
                            System.exit(0);
                            break;
                        case 1:
                            System.out.print("\033[H\033[2J");
                            prout.catOutput();
                            tick.setHunger();
                            prout.catOutput(); // object of scanner class
                            break;

                        case 2:
                            System.out.print("\033[H\033[2J");
                            prout.catOutput();
                            tick.setThirst();
                            prout.catOutput();
                            break;

                        case 3:
                            System.out.print("\033[H\033[2J");
                            prout.catOutput();
                            tick.setBoredom();
                            prout.catOutput();
                            break;
                        case 4:
                            System.out.print("\033[H\033[2J");
                            prout.catOutput();
                            tick.setClean();
                            prout.catOutput();
                            break;
                        case 5:
                            System.out.print("\033[H\033[2J");
                            prout.catOutput();
                            tick.setCharge();
                            prout.catOutput();
                            break;
                    }

                }

            }
        }
    }
}
