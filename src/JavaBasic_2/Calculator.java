package JavaBasic_2;

public class Calculator {
    public static int tongHaiSoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public static float tichHaiSoThuc(float number1, float number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println(tongHaiSoNguyen(2, 6));
        System.out.println(tichHaiSoThuc(5F, 2.6F));
    }
}
