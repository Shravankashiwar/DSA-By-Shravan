import java.util.Scanner;
public class Sum_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = Sum(n,0);
        System.out.print(ans);
    }
    public static int Sum(int n, int ans){
        if(n==0) return ans;
        ans = ans + (n%10);
        n = n/10;
        ans = Sum(n,ans);
        return ans;
    }
}
