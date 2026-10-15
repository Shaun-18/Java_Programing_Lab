
void main() {
    StudentDetails student = new StudentDetails();
    student.getDATA();


    ShoppingTotal total = new ShoppingTotal();
    total.getPrice();


    TemperatureConversion convert = new TemperatureConversion();
    convert.gettemp();


    PassorFail grade = new PassorFail();
    grade.getGrade();


    GradeCalculator grades = new GradeCalculator();
    grades.getGrades();


    NumberAnalysis analysis = new NumberAnalysis();
    analysis.getAnalysis();


    LogicCheck check = new LogicCheck();
    check.getLogit();


    StoreStudentMarks storedmarks = new StoreStudentMarks();
    storedmarks.StudentMarks();


    ArrayStatistics stats = new ArrayStatistics();
    stats.getStats();


    ArraySearch search = new ArraySearch();
    search.Search();


    EvenOddArray even_odd = new EvenOddArray();
    even_odd.EvenOdd();

    ReverseArray reverse = new ReverseArray();
    reverse.Reverse();

    StudentClass studentClass1 = new StudentClass("Kagiso", "218044682", 90);
    studentClass1.displayDetails();
    StudentClass studentClass2 = new StudentClass("Shaun", "226044682", 45);
    studentClass2.displayDetails();

    BankAccount bankAccount = new BankAccount("K Molefe", "123456789", 3000);
    bankAccount.display();

    Product product = new Product("123456", "StaSoft", 50, 23.50);
    product.displayProduct();

    Rectangle rectangle1 = new Rectangle(7.2, 25.3);
    rectangle1.displayResults();
    Rectangle rectangle2 = new Rectangle(5.5, 20);
    rectangle2.displayResults();

    StudentResultsSystem resultsSystem = new StudentResultsSystem("Kagiso", "123456", new double[]{79, 56, 90});
   //StudentResultsSystem resultsSystem1 = new StudentResultsSystem("Kagiso", "123456", new double[]{45, 46, 35});
    resultsSystem.displayStudent();
}

