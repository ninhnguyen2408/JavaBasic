package JavaBasic_1;

public class SinhVien {
    // Biến toàn cục ( Instance variable )
    int age = 25;

    // Biến tĩnh ( static variable )
    static String adress = "Quang Nam";

    public static void main(String[] args) {

        // Biến cục bộ ( Local variable )
        SinhVien sv = new SinhVien();
        String name = "Nguyen Van Ninh";


        System.out.println("Họ tên Sinh viên: " + name);
        System.out.println("Tuổi: " + sv.age);
        System.out.println("Địa chỉ: " + adress);
        System.out.println("Học  Trường: " + ThongTin.truong);
        System.out.println("Học ngành: " + ThongTin.nganh);

    }
}
