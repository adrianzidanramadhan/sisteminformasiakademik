public class Dosen extends User {
    private String nidn;
    private String mataKuliahAjar;

    public Dosen(String nama, String email, String alamat, String noHP,
                 String nidn, String mataKuliahAjar) {
        super(nama, email, alamat, noHP);
        setNidn(nidn);
        setMataKuliahAjar(mataKuliahAjar);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIDN       : " + nidn);
        System.out.println("Matkul Ajar: " + mataKuliahAjar);
    }

    public String getNidn() { return nidn; }
    public void setNidn(String nidn) {
        if(nidn != null && nidn.matches("D\\d+")) {
            this.nidn = nidn;
        } else {
            System.out.println("Error: NIDN harus diawali 'D' diikuti angka!");
        }
    }

    public String getMataKuliahAjar() { return mataKuliahAjar; }
    public void setMataKuliahAjar(String mataKuliahAjar) {
        if(mataKuliahAjar != null && !mataKuliahAjar.trim().isEmpty()) {
            this.mataKuliahAjar = mataKuliahAjar;
        } else {
            System.out.println("Error: Mata kuliah ajar tidak boleh kosong!");
        }
    }

    public void mengajar() {
        System.out.println("Dosen " + getNama() + " sedang mengajar mata kuliah " + mataKuliahAjar);
    }
}
