 import java.util.Scanner;

public class studentgrade {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("====  Student Grade Calculator ====");
        System.out.println("Enter student name:");
        String name=scanner.nextLine();

        System.out.println("Enter mark 1:");
        double mark1=scanner.nextDouble();

        System.out.println("Enter mark 2:");
        double mark2=scanner.nextDouble();

        System.out.println("Enter mark 3:");
        double mark3=scanner.nextDouble();

        double average=(mark1+mark2+mark3)/3;

        String grade;
        if (average >= 70){
            grade = "A";
        } else if (average >= 60) {
            grade="B";
        } else if (average >= 50) {
            grade="C";
        } else if (average >= 40) {
            grade="D";
        }
        else {
            grade="F";
        }
        System.out.println("\n====  RESULT =====");
        System.out.println("Student: " + name );
        System.out.printf("Average:%.2f%n", average);
        System.out.println("Grade:" + grade);

        scanner.close();

    }
}
