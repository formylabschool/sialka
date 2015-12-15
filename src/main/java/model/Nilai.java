/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    @OneToOne
    private Keterangan keterangan;
    private Integer Skor;
    @OneToOne
    Siswa siswa;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Keterangan getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(Keterangan keterangan) {
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
   

    
}
