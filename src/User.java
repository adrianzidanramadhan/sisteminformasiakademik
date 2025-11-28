public class User {
    private String nama;
    private String email;
    private String alamat;
    private String noHP;

    public User(String nama, String email, String alamat, String noHP) {
        setNama(nama);
        setEmail(email);
        setAlamat(alamat);
        setNoHP(noHP);
    }

    public void tampilkanInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("Alamat     : " + alamat);
        System.out.println("No HP      : " + noHP);
    }

    public String getNama() { return nama; }
    public void setNama(String nama) {
        if(nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Error: Nama tidak boleh kosong!");
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if(email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Email harus mengandung '@'!");
        }
    }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) {
        if(alamat != null && !alamat.trim().isEmpty()) {
            this.alamat = alamat;
        } else {
            System.out.println("Error: Alamat tidak boleh kosong!");
        }
    }

    public String getNoHP() { return noHP; }
    public void setNoHP(String noHP) {
        if(noHP != null && noHP.matches("\\d{10,}")) {
            this.noHP = noHP;
        } else {
            System.out.println("Error: No HP minimal 10 digit angka!");
        }
    }
}
