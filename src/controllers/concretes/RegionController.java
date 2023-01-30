/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.concretes;

import daos.concretes.RegionDAO;
import daos.interfaces.IRegionDAO;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import models.Region;


/**
 *
 * @author LENOVO
 */
public class RegionController {
    private IRegionDAO rdao;

    
    public RegionController (Connection connection) {
        rdao = new RegionDAO(connection);
    
}
 
public String insert(String regionId, String regionName) {
    //Region region = new Region();
    //parsing
    int newRegionId = Integer.parseInt(regionId);
    Region region = new Region (newRegionId, regionName);
    if (rdao.insert(region)){
        return "data berhasil diinput";
    } else {
        return "data gagal diinput";
    }
  }

public String update(String regionId, String regionName) {
    //Region region = new Region();
    //parsing
   int newRegionId = Integer.parseInt(regionId);
    Region region = new Region (newRegionId, regionName);
    if (rdao.update(region)){
        return "data berhasil diubah";
    } else {
        return "data gagal diubah";
    }
  }

public String delete(String regionId) {
    //Region region = new Region();
    //parsing
  int newRegionId = Integer.parseInt(regionId);
   // Region region = new Region ();
    if (rdao.delete(newRegionId)){
        return "data berhasil dihapus";
    } else {
        return "data gagal dihapus";
    }
  }

public List<Region> getAll() {
        return rdao.getALL();
    }

    
public Region getById() {
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan id: ");
    return rdao.getById(input.nextInt());
    } 





  }


   