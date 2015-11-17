/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
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
@Table(name="siswa")
public class Siswa {
@Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id; 
    private String kodeSiswa;
    private String nama;
    @Temporal(TemporalType.DATE)
    private Date tanggalPendaftaran;
    @OneToOne
    private Jurusan jurusan;
    private Double hargaTotal;
    private Double sisa;
    private Boolean lunas;
    private Double nilai1;
    private Double nilai2;
    private Double nilai3;

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

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
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

    public Double getNilai1() {
        return nilai1;
    }

    public void setNilai1(Double nilai1) {
        this.nilai1 = nilai1;
    }

    public Double getNilai2() {
        return nilai2;
    }

    public void setNilai2(Double nilai2) {
        this.nilai2 = nilai2;
    }

    public Double getNilai3() {
        return nilai3;
    }

    public void setNilai3(Double nilai3) {
        this.nilai3 = nilai3;
    }

}
