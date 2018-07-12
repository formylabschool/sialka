/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.ColumnTransformer;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
public class Login {
    @Id
    @Column(name="nama_pengguna")
    private String namaPengguna;
    
    @ColumnTransformer(read = "decode(kata_sandi, 'password')", write = "encode(?, 'password')")
    @Column(name = "kata_sandi")
    private String kataSandi;

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
    
    
    
    
}
