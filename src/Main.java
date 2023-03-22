/*
Question : Java Program to Find the Area of Parallelogram . Given the dimensions of a parallelogram, find out its area
________________________________________________________________________________________________________________________
Case 1 (Simple Test Case):

Enter the base and the height of the parallelogram
8.34
5.678
Area = 47.35452
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Area,Base,Height;
        System.out.println("Enter the Base of parallelogram :");
        Base = sc.nextDouble();
        System.out.println("Enter the Height of parallelogram :");
        Height = sc.nextDouble();
        Area = Base * Height;
        System.out.println("Printing the result : " + Area);
    }
}