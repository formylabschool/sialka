/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name = "jurusan")
@SequenceGenerator(name = "jurusan_sq", allocationSize = 1, initialValue = 1, sequenceName = "sq_jurusan")
public class Jurusan {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jurusan_sq")
    @Column(name = "id_jurusan")
    private Integer id;
    private String kodeJurusan;
    private String nama;
    private Double harga;

    public Jurusan() {
    }
    
    

    public Jurusan(Integer id, String kodeJurusan, String nama, Double harga) {
        this.id = id;
        this.kodeJurusan = kodeJurusan;
        this.nama = nama;
        this.harga = harga;
    }
    
        
    @OneToMany
    private List<Materi> materis = new ArrayList<>();

    public List<Materi> getMateris() {
        return materis;
    }

    public void setMateris(List<Materi> materis) {
        this.materis = materis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

}
