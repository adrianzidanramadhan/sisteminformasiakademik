public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(
                "Maryam", "maryam@gmail.com", "Jl. Mawar No.1", "081234567890",
                "M12345", "Teknik Informatika", 3.85);

        Dosen dosen = new Dosen(
                "Budi Santoso", "budi@kampus.ac.id", "Jl. Melati No.2", "081298765432",
                "D98765", "Pemrograman Java");

        MataKuliah mk = new MataKuliah("MK001", "Pemrograman Java", 3);

        System.out.println("=== Informasi Mahasiswa ===");
        mhs.tampilkanInfo();

        System.out.println("\n=== Informasi Dosen ===");
        dosen.tampilkanInfo();

        System.out.println("\n=== Informasi Mata Kuliah ===");
        mk.tampilkanInfo();

        System.out.println("\n=== Interaksi ===");
        mhs.ambilMataKuliah(mk);
        dosen.mengajar();
    }
}
