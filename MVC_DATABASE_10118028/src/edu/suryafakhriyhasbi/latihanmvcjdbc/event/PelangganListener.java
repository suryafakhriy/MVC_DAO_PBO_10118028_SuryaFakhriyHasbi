/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.suryafakhriyhasbi.latihanmvcjdbc.event;

import edu.suryafakhriyhasbi.latihanmvcjdbc.entity.Pelanggan;
import edu.suryafakhriyhasbi.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * Nama  : Surya Fakhriy Hasbi
 * NIM   : 10118028
 * Kelas : IF-1
 *
 * @author SuryaFakhriyHasbi
 */
public interface PelangganListener {
    
    //parameter dari model pelanggan
    public void onChange(PelangganModel model);
    
    //parameter dari entity databases pelanggan
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    //karna tidak perlu menambahkan data ke dalam tabel,
    //jadi ondelete tidak perlu memasukkan data 
    // alias tidak perlu memakai parameter
    public void onDelete();
    
}
