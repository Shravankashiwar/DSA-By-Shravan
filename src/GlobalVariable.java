public class GlobalVariable {
    static int x = 10;
    public static void main(String[] args) {
        change();
        System.out.println(x);

        int x = 30;
        System.out.println(x);
    }
    public static void change() {
        x = 20;

    }
}
