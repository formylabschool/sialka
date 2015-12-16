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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name="absensi")
public class Absensi {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_absensi")
    private Integer idAbsensi;
    @ManyToOne
    private Siswa siswa;

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }
    @Temporal(TemporalType.DATE)
    @Column(unique = true)
    private Date tanggal;

    public Integer getIdAbsensi() {
        return idAbsensi;
    }

    public void setIdAbsensi(Integer idAbsensi) {
        this.idAbsensi = idAbsensi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
}
