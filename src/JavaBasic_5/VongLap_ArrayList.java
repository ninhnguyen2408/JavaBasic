package JavaBasic_5;

import java.util.ArrayList;

public class VongLap_ArrayList {

    public static void thongTinNhanVien() {
        ArrayList<String> thongtinnv = new ArrayList<>();
        thongtinnv.add("Ninh");
        thongtinnv.add("Nam");

        for (String item : thongtinnv) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {

        //int mangSoChan[] = new int[26];
        ArrayList<Integer> listSoNguyen = new ArrayList<>();
        //int index = 0;

        for (int i = 2; i <= 90; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
                listSoNguyen.add(i);
                //index++;
            }
        }

        for (int item : listSoNguyen) {
            System.out.println(item);
        }

        thongTinNhanVien();
    }
}
