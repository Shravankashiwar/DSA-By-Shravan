import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = Reverse(n,0);
        System.out.print(ans);

    }
    public static int Reverse(int n, int ans){
        if(n==0) return ans;
        ans = (ans * 10) + (n%10);
        n = n/10;
        ans = Reverse(n,ans);
        return ans;
    }
}
