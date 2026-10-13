public class EvenOddArray {
    public void EvenOdd(){
        int [] numbers = {10, 15, 5, 7, 30, 2};
        int[] oddNumbers = {};
        int [] evenNumbers ={} ;
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
               numbers[i] = evenNumbers[evenCount];
               evenCount++;
            }else {
                numbers[i] = oddNumbers[oddCount];
                oddCount++;
            }
        }
        System.out.println(evenNumbers.length);
        System.out.println(oddNumbers.length);

    }
}
