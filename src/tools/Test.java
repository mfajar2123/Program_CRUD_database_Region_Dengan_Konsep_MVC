/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.concretes.RegionController;
import daos.concretes.RegionDAO;
import models.Region;
import views.RegionView;

/**
 *
 * @author DevidBa
 */
public class Test {

    public static void main(String[] args) {
        DbConnection connection = new DbConnection();
        System.out.println(connection.getConnection());
        
//      System.out.println("++++MUHAMAD FAJARRRR++++");  
//      RegionDAO rdao = new RegionDAO(connection.getConnection());       
//      Region region = new Region(6,"Jawa Barat");
//      System.out.println("Program update = "+rdao.update(region));  

//     System.out.println("++++MUHAMAD FAJARRRR++++"); 
//     RegionDAO rdao = new RegionDAO(connection.getConnection());       
//     Region region = new Region(6,"Jakarta");
//     System.out.println("Program insert = "+rdao.insert(region));

//       System.out.println("++++MUHAMAD FAJARRRR++++"); 
//      RegionDAO rdao = new RegionDAO(connection.getConnection());       
//     // Region region = new Region(5);
//      System.out.println("Program delete = "+rdao.delete(6));

//        System.out.println("++++MUHAMAD FAJARRRR++++");
//        RegionDAO rdao = new RegionDAO(connection.getConnection());       
//        Region region = new Region();
//        region = rdao.getById(3);
//        System.out.println(region.getRegionId() + " Sukses " + region.getRegionName());

//    System.out.println("++++MUHAMAD FAJARRRR++++");
//    RegionDAO rdao = new RegionDAO(connection.getConnection());    
//    for (Region region : rdao.getALL()) {
//        
//    System.out.println(region.getRegionId()+" "+region.getRegionName());

//RegionController rc = new RegionController(connection.getConnection());
//        System.out.println(rc.delete("6"));
        
//        RegionController rc = new RegionController(connection.getConnection());
//        System.out.println(rc.insert("5", "JABAR HIJI"));

//          RegionController rc = new RegionController(connection.getConnection());
//        System.out.println(rc.update("5","AMERICA"));
        
//        RegionController rc = new RegionController(connection.getConnection());
//        for (Region region : rc.getAll()) {
//            System.out.println(region.getRegionId()+". "+region.getRegionName());

////        RegionController rc = new RegionController(connection.getConnection());
////        for (Region region : rc.getById(id) {
////            System.out.println(region.getRegionId()+". "+region.getRegionName());
//        
//        }

RegionView rv = new RegionView(connection.getConnection());
        
        
} 


     

    }
