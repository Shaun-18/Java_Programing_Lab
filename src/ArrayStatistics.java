import java.util.Arrays;

public class ArrayStatistics {
    public void getStats(){
        int [] number = {20, 90, 30, 40, 28, 49};
        int highest = Arrays.stream(number).max().getAsInt();
        int lowest = Arrays.stream(number).min().getAsInt();


        System.out.println("The highest is: "+highest);
        System.out.println("The lowest is: "+ lowest);
        System.out.println("The are "+ number.length + " elements in this Array");
    }
}
