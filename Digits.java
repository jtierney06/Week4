import java.util.Scanner;
public class Digits{
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = input.nextInt();
        input.close();
        int ones = num % 10;
        int tens = num % 100 - ones;
        int hunds = num % 1000 - tens - ones;
        int tens_place = tens - tens + tens/10;
        int hunds_place = hunds - hunds + hunds/100;
    
        System.out.println("The ones place is " + ones);
        System.out.println("The Tens place is " + tens_place);
        System.out.println("The Hundreds place is " + hunds_place);

    }
}