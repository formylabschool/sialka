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
@Table(name="jadwal", uniqueConstraints = 
        { @UniqueConstraint(name = "uq_jadwal",columnNames = {"jam","intruktur_id","tanggal"}),
        @UniqueConstraint(name = "ug_instruktur", columnNames = {"tanggal","ruangan_id","jam"}),
        @UniqueConstraint(name = "ug_kelas", columnNames = {"kelas_id_kelas","jam","tanggal"}),
        }
)
public class Jadwal {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_jadwal")
    private Integer id;
    @OneToOne
     @JoinColumns(@JoinColumn(name = "ruangan_id"))
    private Ruangan ruangan;
    @OneToOne
    @JoinColumns(@JoinColumn(name = "intruktur_id"))
    private Instruktur instruktur;
    @OneToOne
    private Materi materi;
    @OneToOne
    private Kelas kelas;
    @JoinColumns(@JoinColumn(name = "kelas_id_kelas"))
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date tanggal;
    private String jam;

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

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

 
    
}
