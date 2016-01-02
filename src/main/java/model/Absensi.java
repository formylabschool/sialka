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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.eclipse.jdt.internal.compiler.parser.Parser;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
@Table(name="absensi",uniqueConstraints = @UniqueConstraint (name="uq_absensi",columnNames={"tanggal","id_siswa"}))
public class Absensi {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="id_absensi")
    private Integer idAbsensi;
    @ManyToOne
    @JoinColumns(@JoinColumn(name = "id_siswa"))
    private Siswa siswa;

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }
    @Temporal(TemporalType.DATE)
    
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
