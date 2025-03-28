package JavaBasic_4;

public class BaiTapFor {
    public static void main(String[] args) {

        int mangSoChan[] = new int[26];
        int index = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
                mangSoChan[index] = i;
                index++;
            }
        }

        for (int item :mangSoChan){
            System.out.println(item);
        }

    }
}
