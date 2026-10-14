
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
StudentClass studentClass2 = new StudentClass("Shaun", "226044682", 63);
studentClass2.displayDetails();

}

