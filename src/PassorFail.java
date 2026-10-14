public class PassorFail {
public void getGrade(){
    double mark = 90;
    String grade = "pass";

    if(mark >= 50){
        grade = "pass";
    }else{
        grade = "Fail";
    }
    System.out.println(grade);

    System.out.println("-----End of lab---------");
}

}
