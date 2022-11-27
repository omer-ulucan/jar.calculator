package Calculator;
import java.util.Scanner;
import Methods.Methods;

public class Calculator {
    public static void main(String[] args) {
        Methods metot = new Methods();
        Scanner sc = new Scanner(System.in);
        String act = "1. ADD\n" + "2. SUBSTRACT\n" + "3. MULTIPLY\n" +
                "4. DIVIDE\n" + "5. SINUS\n" + "6. COSINE\n" +
                "7. TANGENT\n" + "8. SQRT\n" + "9. POWER\n" +
                "10. MOD\n" + "PRESS Q TO EXIT CALCULATOR";
        System.out.println("WELCOME TO THE CALCULATOR....");
        System.out.println("***************************");
        System.out.println("PLEASE ENTER FIRST VALUE : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("PLEASE ENTER SECOND VALUE : ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("***************************");
        System.out.println(act);
        System.out.println("PLEASE SELECT A TRANSACTION : ");
        double c = 0;
        String tract = sc.next();
        while (true) {
            switch (tract) {
                case "q":
                    System.out.println("EXITING THE CALCULATOR....");
                    return;
                case "1":
                    metot.Add(a, b, c);
                    return;
                case "2":
                    metot.Substract(a, b, c);
                    return;
                case "3":
                    metot.Multiply(a, b, c);
                    return;
                case "4":
                    metot.Divide(a, b, c);
                    return;
                case "5":
                    metot.sin(a, b, c);
                    return;
                case "6":
                    metot.cos(a, b, c);
                    return;
                case "7":
                    metot.tan(a, b, c);
                    return;
                case "8":
                    metot.sqrt(a, b, c);
                    return;
                case "9":
                    metot.power(a, b, c);
                    return;
                case "10":
                    metot.mod(a, b, c);
                    return;
                default:
                    System.out.println("UNDEFINED PROCESS");
                    return;
            }
        }
    }
}
