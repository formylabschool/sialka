/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
public class Nilai {
    @Id
    private int Id;
    private String keterangan;
    private Integer Skor;
    @OneToOne
    Siswa siswa;
    @OneToMany
    Materi materi;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Integer getSkor() {
        return Skor;
    }

    public void setSkor(Integer Skor) {
        this.Skor = Skor;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }

    public Materi getMateri() {
        return materi;
    }

    public void setMateri(Materi materi) {
        this.materi = materi;
    }
    
    
}
