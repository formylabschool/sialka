/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name = "materi")
public class Materi implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_materi")
    private Integer id;
    private String kodeMateri;
    private String nama;
    private Integer teori;
    private Integer praktek;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeMateri() {
        return kodeMateri;
    }

    public void setKodeMateri(String kodeMateri) {
        this.kodeMateri = kodeMateri;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getTeori() {
        return teori;
    }

    public void setTeori(Integer teori) {
        this.teori = teori;
    }

    public Integer getPraktek() {
        return praktek;
    }

    public void setPraktek(Integer praktek) {
        this.praktek = praktek;
    }

}
