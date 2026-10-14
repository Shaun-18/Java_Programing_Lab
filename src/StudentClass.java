public class StudentClass {
    String name;
    String studentnumber;
    double mark;


    StudentClass(String name, String studentnumber, double mark ){
        this.name = name;
        this.studentnumber = studentnumber;
        this.mark = mark;
    }
    void displayDetails(){
        System.out.println("name: "+name +" Student Number: " + studentnumber + " Mark: " + mark + " Has passed " + hasPassed(mark));
    }
    boolean hasPassed( double mark){
       if ( mark >= 50){
           return true;
       }else {
           return false;
       }
    }
}
