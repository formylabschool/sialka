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
@Table(name="keterangan")
public class Keterangan {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_keterangan")
    private int id;
    @Column(name="nama_keterangan",nullable = false, length = 50)
    private String namaKeterangan;
    @ManyToOne
    private Materi materi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKeterangan() {
        return namaKeterangan;
    }

    public void setNamaKeterangan(String namaKeterangan) {
        this.namaKeterangan = namaKeterangan;
    }

    public Materi getMateri() {
        return materi;
    }

    public void setMateri(Materi materi) {
        this.materi = materi;
    }
    
}
