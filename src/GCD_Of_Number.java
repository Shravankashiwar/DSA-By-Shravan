import java.util.Scanner;

public class GCD_Of_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        int gcd = 0;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
