import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    void Reverse(){
        int []numbers = {81, 62, 93, 49, 57};
        int [] RevNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            RevNumbers[i] = numbers[numbers.length - i - 1];
        }
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = RevNumbers[i];
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(RevNumbers[i]);
        }
        System.out.println("-----End of lab---------");
    }
}
