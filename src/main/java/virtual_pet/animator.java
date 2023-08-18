package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import java.io.*;
import java.lang.*;
import java.util.*;

public class animator {
    public void animate() {
        char char1 = ' '; // '░'
        char char2 = '_'; // '█'
        StringBuilder bAnimate = new StringBuilder();
        Stream.generate(() -> char1).limit(50).forEach(bAnimate::append);
        for (int i = 0; i < 50; i++) {
            bAnimate.replace(i, i + 1, String.valueOf(char2));
            String line = "\r" + bAnimate;
            System.out.print(line);
            try {
                Thread.sleep(25);
            } catch (InterruptedException ignored) {
            }
        }
    }




public void animate2() {
    HashMap<Integer, VirtualPet> hMap = hashmaps.getInstance().referenceData;
    for (Map.Entry<Integer, VirtualPet> entry : hMap.entrySet()) {
//System.out.println(entry.getValue().get());


    }





}
}