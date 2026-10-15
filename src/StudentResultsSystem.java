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
         return true;
      } else {
         return false;
      }
   }
   void passcount(){
      int passcounter = 0;
      if (isGrade() = true){
         passcounter++;
      }

   }
   void displayStudent(){
      System.out.println("Student name: "+ stuName + " Student Number "+ stuNumber + " Average " + average() + " Passed? " );
   }
}
