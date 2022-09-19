public class Peminjaman{
    private int id;
    private String namaMember;
    private String namaGame;
    private int lamaSewa; //in days
    private int harga;
    private int hargaByr;

    Peminjaman(int id, String namaMember, String namaGame, int lamaSewa, int harga){
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.lamaSewa = lamaSewa;
        this.harga = harga;
    }

    public void printPeminjaman(){
        System.out.println("============DATA PEMINJAMAN==========");
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama member   : " + namaMember);
        System.out.println("Nama game     : " + namaGame);
        System.out.println("Durasi sewa   : " + lamaSewa);
        System.out.println("Harga bayar   : " + hargaByr);
    }

    public int hitungHrg(){
        hargaByr = lamaSewa * harga;
        return hargaByr;
    }
}