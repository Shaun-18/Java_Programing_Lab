public class GradeCalculator {
    public void getGrades(){
        double mark = 72;
        String grade;

        if(mark >= 0 || mark <= 100){
            if (mark <= 49 ){
                grade = "Fail";
            } else if(mark >= 50 && mark <= 69){
                grade = "Pass";
            } else if (mark >= 70 && mark<= 79) {
                grade = "Merit";
            } else{
                grade = "Distinction";
            }
        } else {
            System.out.println("Please enter a valid mark");
            grade = "Invalid";
        }
        System.out.println("Your grade is: " + grade);
    }
}
