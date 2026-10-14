public class EvenOddArray {
    public void EvenOdd(){
        int [] numbers = {10, 15, 5, 7, 30, 2};
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
               evenCount++;
            }else {
                oddCount++;
            }
        }
        int[] oddNumbers = new int[oddCount];
        int [] evenNumbers =new int[evenCount] ;
        int evenIndex = 0;
        int oddIndex = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenIndex]  = numbers[i];
                evenIndex++;
            }else {
                oddNumbers[oddIndex] = numbers[i];
                oddIndex++;

            }
        }
        System.out.println("The even numbers are:");
        for(int i = 0; i < evenNumbers.length; i++){
            System.out.println(evenNumbers[i]);
        }


        System.out.println("The odd numbers are:");
        for(int i = 0; i < oddNumbers.length; i++){
            System.out.println(oddNumbers[i]);
        }




        System.out.println("There are: " + evenCount + " even numbers ");
        System.out.println("There are: "+oddCount + " odd numbers");

        System.out.println("-----End of lab---------");

    }
}
