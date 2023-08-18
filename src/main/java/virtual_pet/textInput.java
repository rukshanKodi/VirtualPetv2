package virtual_pet;
import java.util.Scanner;
public class textInput {
    private Scanner input = new Scanner(System.in);

    public String getStringValue(String prompt) {
        String value = "";

        boolean exitMethod = false;
        do {
            System.out.print(prompt + ": ");
            try {
                value = input.nextLine();
                boolean empty = value.isEmpty();
                if (empty) {
                    throw new Exception();
                }
               for (int i = 0; i < value.length(); i++) {
                    if (value.length() >= 50) {
                        throw new Exception();
                    }
                    boolean isLetter = Character.isLetter(value.charAt(i));
                    if (!isLetter) {
                        throw new Exception();
                    }
                }
                exitMethod = true;
            } catch (Exception e) {
                System.out.println("Input values should be max 50 characters. No special inputs");
            }
        } while (!exitMethod);
        return value;
    }
}
