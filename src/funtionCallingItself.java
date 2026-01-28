public class funtionCallingItself {
    public static void main(String[] args){
        print(1);
    }
    public static void print(int n){
        if(n==5) return;
        System.out.println("shravan");
        print(n+1);
    }
}

