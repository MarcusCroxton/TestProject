import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Scanned = new Scanner(System.in);
        Integer Num1 = 0;
        Integer Num2 = 0;
        Integer Num3 = 0;
        Integer Num4 = 0;

        System.out.println("Please enter a 4 digit binary number");
        String Str = Scanned.next();

        Num1 = Integer.valueOf(Str.substring(0, 1));
        Num2 = Integer.valueOf(Str.substring(1, 2));
        Num3 = Integer.valueOf(Str.substring(2, 3));
        Num4 = Integer.valueOf(Str.substring(3, 4));

        Num2 = Num2 * 2;
        Num3 = Num3 * 4;
        Num4 = Num4 * 8;

        System.out.println("Your number converted to Denary is: " + Num1 + Num2 + Num3 + Num4);
    }
}
