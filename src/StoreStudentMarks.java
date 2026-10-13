public class StoreStudentMarks {
    public void StudentMarks(){
        int [] mark = {60, 80, 20, 45, 100};
        int sum = 0;
        double average = 0;

        for  (int i = 0; i < 5; i++) {
            System.out.println(mark[i]);
            sum += mark[i];
        }
        average = sum/ mark.length;
        System.out.println("The sum is: "+ sum);
        System.out.println("The Average is: "+ average);


    }
}
