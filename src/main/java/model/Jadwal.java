/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.OneToOne;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class Jadwal {
    private Integer id;
    @OneToOne
    private Ruangan ruangan;
    @OneToOne
    private Instruktur instruktur;
    @OneToOne
    private Materi materi;
    private Date tanggal;
    private Date jam_awal;
    private Date jam_akhir;

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
