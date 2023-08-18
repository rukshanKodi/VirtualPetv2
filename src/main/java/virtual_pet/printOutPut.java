package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class printOutPut {
    HashMap<Integer, VirtualPet> hMap = hashmaps.getInstance().referenceData;
    public String output = "";
    animator anm = new animator();

    public void catOutput() {

        {
            System.out.println("[ Your pet Status  ]");
            anm.animate();
            System.out.println('\n');
            for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
                // if (entry.getKey() == 1)
                // entry.getValue().setHunger(entry.getValue().getHunger()+100);

                System.out.println("\u001B[34m" +
                        "[" + "Type: " + entry.getValue().getType() + "]" + '\u0009'
                        + "[" + "Name: " + entry.getValue().getName() + "]" + '\u0009'
                        + "[" + "Hungry: " + entry.getValue().getHunger() + "]" + '\u0009'
                        + "[" + "Boredom : " + entry.getValue().getBoredom() + "]" + '\u0009'
                        + "[" + "Thirsty : " + entry.getValue().getThirst() + "]"+ '\u0009'
                        + "[" + "Clean : " + entry.getValue().getClean() + "]"
                        + "\u001B[37m");

 //System.out.println('\n');
          //  for (int i = 0; i == hMap.size(); ++i) {
           //     System.out.println(" values " + hMap.get(i).getBoredom());
          ///  }
            }
           
        }

    }

    public void dogOutput() { // not used

        {
            System.out.println("[ Your pet info  ]");
            anm.animate();
            System.out.println('\n');
            for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
                System.out.println("\u001B[34m" +
                        "[" + "Pet ID: " + entry.getKey().intValue() + "]" + '\u0009'
                        + "[" + "Type: " + entry.getValue().getType() + "]" + '\u0009'
                        + "[" + "Name: " + entry.getValue().getName() + "]" + '\u0009'
                        + "\u001B[37m");

            }
        }

    }
}
