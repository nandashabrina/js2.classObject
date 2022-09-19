public class TestMahasiswa {
    public static void main(String[] args) {
        //instansiasi objek 1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        System.out.println();
        //instansiasi objek 2
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 202;
        mhs2.nama = "Aryo";
        mhs2.alamat = "Jl. Mawar No 2A";
        mhs2.kelas = "2A";
        mhs2.tampilBiodata();

        System.out.println();
        //instansiasi objek 3
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 303;
        mhs3.nama = "Lily";
        mhs3.alamat = "Jl. Lily No 1A";
        mhs3.kelas = "3A";
        mhs3.tampilBiodata();
    }
}
