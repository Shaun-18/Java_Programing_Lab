
void main() {
    StudentDetails student = new StudentDetails();
ShoppingTotal total = new ShoppingTotal();
TemperatureConversion covenvert = new TemperatureConversion();

    System.out.println("Student Name: " + student.StuName);
    System.out.println("Age: " + student.age);
    System.out.println("Average Mark: " + student.AvgMark);
    System.out.println("Registered: " + student.isReg);

    System.out.println("Your Total is: "+ total.AmtDue);

    System.out.println(covenvert.fahrenheit);
    }

