import java.util.Scanner;
public class print_1_to_n {
//    Method - 2 with 1 variable(global variable)
    static int n = 5;
    public static void main(String[] args) {
        int ans = fact(n);
        System.out.print(ans);
    }
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
    //    method 1 with 2 parameters
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(1, n);
//    }
//
//    public static void print(int x, int n) {
//        if (x > n) return;
//        System.out.println(x);
//        print(x + 1, n);
//    }
}
