/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name="buku_tamu")
public class BukuTamu {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_buku_tamu")
    private int id;
   //@Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date tanggal;
    @Column(nullable = false,length = 30)
    private String nama;
    @Column(name="yang_dituju",nullable = false,length = 30)
    private String yangDituju;
    @Column(nullable = false)
    private String keperluan;
    @Column(nullable = false)
    private String alamat;
    @Column (length = 15)
    private String kontak;

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getYangDituju() {
        return yangDituju;
    }

    public void setYangDituju(String yangDituju) {
        this.yangDituju = yangDituju;
    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
