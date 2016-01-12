/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name = "kelas")
public class Kelas {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_kelas")
    private int id;
    @Column(name = "kode_kelas")
    private String kodeKelas;
    @Column(name = "nama_kelas", nullable = false, length = 50)
    private String namaKelas;
    @Column(nullable = false, length = 10)
    private String tahun;
    @ManyToOne
    private Jurusan jurusan;

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

}
