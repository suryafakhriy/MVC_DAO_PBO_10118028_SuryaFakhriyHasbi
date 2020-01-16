/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.suryafakhriyhasbi.latihanmvcjdbc.service;

import edu.suryafakhriyhasbi.latihanmvcjdbc.entity.Pelanggan;
import edu.suryafakhriyhasbi.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * Nama  : Surya Fakhriy Hasbi
 * NIM   : 10118028
 * Kelas : IF-1
 *
 * @author SuryaFakhriyHasbi
 */
public interface PelangganDao {

    //Untuk melakukan aktifitas CRUD
    // Get By ID dan Get By Email
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    // unique
    public Pelanggan getPelanggan(String email) throws PelangganException;

    // Jika ingin meload semua data pelanggan
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
