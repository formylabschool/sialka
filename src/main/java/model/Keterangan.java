/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author muhamadhanifmuhsin
 */
@Entity
public class Keterangan {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String namaKeterangan;
    @ManyToOne
    private Materi materi;
}
