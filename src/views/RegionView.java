
package views;

import controllers.concretes.RegionController;
import daos.concretes.RegionDAO;
import daos.interfaces.IRegionDAO;
import java.sql.Connection;
import models.Region;
import java.util.Scanner;



public class RegionView {

    
    private IRegionDAO rdao;
    private static RegionController rc;
  
   

   
       public  RegionView(Connection connection) {
        int inputdataInt;
     
        

        rdao = new RegionDAO(connection);
        Scanner scanner = new Scanner(System.in);
        
        boolean ulang;
        while(ulang =true){
        System.out.println("");
        System.out.println("====================================================");        
        System.out.println("========= WELCOME TO PROGRAM MUHAMAD FAJAR =========");
        System.out.println("====================================================");
        
        System.out.println("        "+"==============================");
        System.out.println("        "+"========= MENU UTAMA =========");
        System.out.println("        "+"=============================="+"\n");
        System.out.println("        "+"==============================");
        System.out.println("        =   "+"   1. Insert Data        =");
        System.out.println("        =   "+"   2. Show Data          =");
        System.out.println("        =   "+"   3. Edit Data          =");
        System.out.println("        =   "+"   4. Delete Data        =");
        System.out.println("        =   "+"   5. Show Data by ID    =");      
        System.out.println("        =   "+"   0. Keluar/Selesai     =");
        System.out.println("        "+"==============================");
        System.out.println("");
        System.out.print("    "+"PILIH MENU> ");
            
        switch (inputdataInt = scanner.nextInt()) {
            case 0:
                System.out.println("---- Terima Kasih Sudah Menggunakan Program Ini :)----");
                System.exit(0);
                break;
            case 1:
                insertData();
                break;
            case 2:
                showData();
                break;
            case 3:
                updateData();
                break;
            case 4:
                deleteData();
                break;
            case 5:
                showDataById();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
   
      
        } 
 }
    public void insertData() {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("-------- INSERT DATA --------");
    System.out.println("-----------------------------");
        
        DbConnection connectionn = new DbConnection();   
        RegionController RC1 = new RegionController(connectionn.getConnection());
     
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan id: ");
            String id = input.nextLine();
            System.out.print("Masukkan name: ");
            String name = input.nextLine();
            System.out.println(RC1.insert(id, name));  


    
 }
    
    public void showData() {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("-------- SHOW DATA --------");
    System.out.println("-----------------------------");
        
        DbConnection connectionn = new DbConnection();   
        RegionController RC2 = new RegionController(connectionn.getConnection());
    
            for (Region region : RC2.getAll()) {
            System.out.println(region.getRegionId() + ". " + region.getRegionName());
    
    }
    
}
    public void updateData() {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("-------- UPDATE DATA --------");
    System.out.println("-----------------------------");
        
        DbConnection connectionn = new DbConnection();   
        RegionController RC3 = new RegionController(connectionn.getConnection());
   
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan id: ");
            String id = input.nextLine();
            System.out.print("Masukkan name: ");
            String name = input.nextLine();
            System.out.println(RC3.update(id, name));  
    }
    
    public void deleteData() {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("-------- DELETE DATA --------");
    System.out.println("-----------------------------");
        
        DbConnection connectionn = new DbConnection();   
        RegionController RC4 = new RegionController(connectionn.getConnection());
        
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan id: ");
            String id = input.nextLine();
            System.out.println(RC4.delete(id));  
    
}
    public void showDataById() {
    System.out.println("");
    System.out.println("-----------------------------");
    System.out.println("------- SHOW DATA BY ID ----");
    System.out.println("-----------------------------");
        
        DbConnection connectionn = new DbConnection();   
        RegionController RC5 = new RegionController(connectionn.getConnection());
        
            Region region =RC5.getById();
          
            System.out.println(region.getRegionId()+" "+region.getRegionName());  
        
            

    }
}

 
    
