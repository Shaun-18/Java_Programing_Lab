import java.util.Arrays;

public class ArrayStatistics {
    public void getStats(){
        int [] number = {20, 90, 60, 40, 28, 50};
        int highCount= 0;
        int highest = Arrays.stream(number).max().getAsInt();
        int lowest = Arrays.stream(number).min().getAsInt();

        for (int i = 0; i < 6; i++ ) {
            if (number[i] >= 50) {
                highCount++;
            }
        }


        System.out.println("The highest is: "+highest);
        System.out.println("The lowest is: "+ lowest);
        System.out.println("The are "+ number.length + " elements in this Array");
        System.out.println("There are/is: " + highCount + " Numbers that are above 50");
    }
}
