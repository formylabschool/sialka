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
import javax.persistence.OneToOne;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
public class Nilai {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_nilai")
    private int Id;
    @OneToOne
    private Keterangan keterangan;
    @Column(nullable = false)
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
