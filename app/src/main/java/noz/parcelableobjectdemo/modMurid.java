package noz.parcelableobjectdemo;

/**
 * Created by CLient-Pc on 16/10/2016.
 */

public class modMurid {

    String Nama, Alamat, MatPel, Umur;

    public modMurid(String nama, String alamat, String matPel, String umur) {
        Nama = nama;
        Alamat = alamat;
        MatPel = matPel;
        Umur = umur;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getMatPel() {
        return MatPel;
    }

    public void setMatPel(String matPel) {
        MatPel = matPel;
    }

    public String getUmur() {
        return Umur;
    }

    public void setUmur(String umur) {
        Umur = umur;
    }
}
