public class Barang {
    private String kode;
    private String namaBarang;
    private double hargaDasar; 
    private double diskon; 

    Barang(String kode, String namaBarang, double hargaDasar, double diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    private double hitungHargaJual(){
        double hargaJual;
        hargaJual = hargaDasar - (diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode barang  : " +kode);
        System.out.println("Nama barang  : " + namaBarang);
        System.out.println("Harga barang : " + hargaDasar);
        System.out.println("Harga diskon : " + diskon);
        System.out.println("Harga jual   : " + hitungHargaJual());
    }
}
