public class Decreasing_Increasing {
    public static void main(String[] args){
        int n = 5;
        print(n);
    }
    public static void print(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
