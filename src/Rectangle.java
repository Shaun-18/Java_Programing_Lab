public class Rectangle {
    double width;
    double height;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double area(){
        return width * height;
    }
     public double perimeter(){
       return  (width * height) * 2;
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void displayResults(){
        System.out.println("The Area is: " + area());
        System.out.println("The Parimeter is "+ perimeter());
    }
}
