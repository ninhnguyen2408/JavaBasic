package JavaBasic_3;

public class BaiTap {

    static void soSanh(int n) {
        int number = 100;

        if (n == number) {
            System.out.println("n = number");
        } else if (n < number) {
            System.out.println("n < number");
        } else {
            System.out.println("n > number");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;


        System.out.println(a > b);
        System.out.println(b > c);
        System.out.println((b > a) & (c > b));
        System.out.println((c > a) || (a > b));
        soSanh(100);


    }
}
