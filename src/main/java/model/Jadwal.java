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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name="jadwal", uniqueConstraints = @UniqueConstraint(name = "uq_jadwal",columnNames = {"jam_awal","jam_akhir","intruktur_id"}))
public class Jadwal {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_jadwal")
    private Integer id;
    @OneToOne
    private Ruangan ruangan;
    @OneToOne
    @JoinColumns(@JoinColumn(name = "intruktur_id"))
    private Instruktur instruktur;
    @OneToOne
    private Materi materi;
    @OneToOne
    private Kelas kelas;
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Temporal(TemporalType.TIME)
    private Date jam_awal;
    @Temporal(TemporalType.TIME)
    private Date jam_akhir;

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public Instruktur getInstruktur() {
        return instruktur;
    }

    public void setInstruktur(Instruktur instruktur) {
        this.instruktur = instruktur;
    }

    public Materi getMateri() {
        return materi;
    }

    public void setMateri(Materi materi) {
        this.materi = materi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getJam_awal() {
        return jam_awal;
    }

    public void setJam_awal(Date jam_awal) {
        this.jam_awal = jam_awal;
    }

    public Date getJam_akhir() {
        return jam_akhir;
    }

    public void setJam_akhir(Date jam_akhir) {
        this.jam_akhir = jam_akhir;
    }
    
}
