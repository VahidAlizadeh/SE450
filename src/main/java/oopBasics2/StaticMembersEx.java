package oopBasics2;

public class StaticMembersEx {
    //static variables
    static double length=25.5, breadth=10.0;
    //static method
    public static double area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("***Static members example: Exploring class variables and class methods.***\n");
        System.out.println("Length of the Rectangle is :" + StaticMembersEx.length + " unit");
        System.out.println("Breadth of the Rectangle is :" + StaticMembersEx.breadth + " unit");
        System.out.println("Area of Rectangle is " + StaticMembersEx.area() + " sq.unit");
    }
}
