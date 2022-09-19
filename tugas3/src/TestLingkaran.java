public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran();
        l.r = 14;
        System.out.println("===== PROGRAM MENGHITUNG LUAS DAN KELILING LINGKARAN =====");
        System.out.println("Luas lingkaran dengan jari-jari 14     : " + l.hitungLuas());
        System.out.println("Keliling lingkaran dengan jari-jari 14 : " + l.hitungKeliling());
    }
}
