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
import javax.persistence.Table;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name = "jurusan")
public class Jurusan {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_jurusan")
    private Integer id;
    private String kodeJurusan;
    private String nama;
    private Double harga;
    private Integer jumlahPertemuan;

    public Integer getJumlahPertemuan() {
        return jumlahPertemuan;
    }

    public void setJumlahPertemuan(Integer jumlahPertemuan) {
        this.jumlahPertemuan = jumlahPertemuan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

}
