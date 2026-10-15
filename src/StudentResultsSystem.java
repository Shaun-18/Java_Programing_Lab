public class StudentResultsSystem {
   String stuName;
   String stuNumber;
   double [] marks;

   StudentResultsSystem(String stuName, String stuNumber, double[] marks){
      this.stuName = stuName;
      this.stuNumber = stuNumber;
      this.marks = marks;
   }

   public double average(){
     double marksSum = 0;
      for (int i = 0; i < marks.length; i++){
        if (marks[i]> 0 && marks[i] < 100){
         marksSum = marksSum + marks[i];
      } else {
           System.out.println("Invalid mark");
        }

   }
      return marksSum / marks.length;
      }
   public boolean isGrade(){
      if (average() >= 50){
         System.out.println("Student has passed");
         return true;

      } else {
         System.out.println("Failed");
         return false;
      }
   }
//   void passcount(){
//      int passcounter = 0;
//      if (isGrade() = true){
//         passcounter++;
//      }
//   public boolean hasPassed(){
//      return true;


   void displayStudent(){
      System.out.println("Student name: "+ stuName + " Student Number "+ stuNumber + " Average " + average() + " Passed?  "+  isGrade() );
   }
}
