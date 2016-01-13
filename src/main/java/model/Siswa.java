/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name = "siswa")
public class Siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_siswa")
    private Integer id;
    @Column(name = "kode_siswa", nullable = false, length = 20)
    private String kodeSiswa;
    @Column(nullable = false, length = 30)
    private String nama;
    @Column(name = "tempat_lahir", nullable = false)
    private String tempatLahir;
    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_lahir", nullable = false)
    private Date tanggalLahir;
    @Column(name = "jenis_kelamin", nullable = false)
    private String jenisKelamin;
    @Column(name = "pendidikan_terakhir", nullable = false)
    private String pendidikanTerakhir;
    @Column(nullable = false)
    private String kontak;
    @Column(nullable = false, length = 30)
    private String email;
    @Column(nullable = false)
    private String alamat;
    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_pendaftaran", nullable = false)
    private Date tanggalPendaftaran;

    @OneToOne
    private Kelas kelas;
    @Column(name = "harga_total", nullable = false)
    private Double hargaTotal;
    @Column(nullable = false)
    private Double sisa;
    @Column(nullable = false)
    private Boolean lunas;
    @Column(name = "tahun_ajaran", nullable = false)
    private String tahunAjaran;
    
    @OneToOne
    Pembayaran pembayaran1;
    @OneToOne
    Pembayaran pembayaran2;

    public Pembayaran getPembayaran1() {
        return pembayaran1;
    }

    public void setPembayaran1(Pembayaran pembayaran1) {
        this.pembayaran1 = pembayaran1;
    }

    public Pembayaran getPembayaran2() {
        return pembayaran2;
    }

    public void setPembayaran2(Pembayaran pembayaran2) {
        this.pembayaran2 = pembayaran2;
    }

   

    

   

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalPendaftaran() {
        return tanggalPendaftaran;
    }

    public void setTanggalPendaftaran(Date tanggalPendaftaran) {
        this.tanggalPendaftaran = tanggalPendaftaran;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeSiswa() {
        return kodeSiswa;
    }

    public void setKodeSiswa(String kodeSiswa) {
        this.kodeSiswa = kodeSiswa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(Double hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public Double getSisa() {
        return sisa;
    }

    public void setSisa(Double sisa) {
        this.sisa = sisa;
    }

    public Boolean getLunas() {
        return lunas;
    }

    public void setLunas(Boolean lunas) {
        this.lunas = lunas;
    }

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

}
