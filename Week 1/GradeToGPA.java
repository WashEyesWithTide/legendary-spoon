import java.util.Scanner;
public class GradeToGPA {
    public static void main(String[] args) {
        calculateGPA(getGrade());
    }
    public static double getGrade() {
        System.out.print("Enter your grade: ");
        try (Scanner sc = new Scanner(System.in)) {
            double grade = sc.nextDouble();
            return grade;
        }
        catch (Exception e) {
            System.out.print("Invalid inpput. Please enter a numeric value for grade");
            return -1;
        }
    }

    public static void calculateGPA(double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a grade between 0.0 and 100.0.");
            return;
        }
        if (grade >= 95.0) {
            System.out.println("Your GPA is: " + "4.0");
            return;
        }
        else if (grade < 65.0) {
            System.out.println("Your GPA is: " + "0.0");
            return;
        }
        System.out.println("Your GPA is: " + Math.floor(grade-55)/10);
    }
}