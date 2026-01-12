import java.util.Scanner;

public class GPAToGrade{
    public static void main(String[] args) {
        printGpaMessage(getGpaTimesTen());
    }

    public static int getGpaTimesTen() {
        int gpaTimesTen = -1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your GPA: ");
            gpaTimesTen = (int)(10 * sc.nextDouble());
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value for GPA.");
            return -1;
        }
        return gpaTimesTen;
    }
    public static void printGpaMessage(int gpaTimesTen) {
        if ((gpaTimesTen < 0 && gpaTimesTen != -1) || (gpaTimesTen > 40)) { 
            System.out.println("Invalid GPA. Please enter a GPA between 0.0 and 4.0."); 
        }
        else {
            switch (gpaTimesTen) {
                case 40:
                    System.out.println("Your grade is:" + "95-100" + "%");
                    break;
                case 0:
                    System.out.println("Your grade is:" + "0-65" + "%");
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Your grade is:" + ((gpaTimesTen)+55) + "-" + ((gpaTimesTen)+56) + "%");
                    break;
            }
        }
    }
}