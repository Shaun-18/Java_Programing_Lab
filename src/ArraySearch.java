
public class ArraySearch {
    public void Search() {
        int[] number = {10, 20, 30, 5, 30, 14};
        int searcher = 30;
        boolean found = false;
        int foundCounter = 0;

        for (int i = 0; i < number.length; i++) {
            if (searcher == number[i]) {
                found = true;
                foundCounter++;

                System.out.println("Value found at index: " + i);
            }
        }

        if (found) {
            System.out.println("Total matches: " + foundCounter);
        } else {
            System.out.println("Value not found");
        }
        System.out.println("-----End of lab---------");
    }

}