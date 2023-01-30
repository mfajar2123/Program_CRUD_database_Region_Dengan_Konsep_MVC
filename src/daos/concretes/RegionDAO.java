/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.concretes;

import daos.interfaces.IRegionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author DevidBa
 */
public class RegionDAO implements IRegionDAO {

    private Connection connection;

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

  

    @Override
    public boolean insert(Region region) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO REGION(id, name) VALUES(?,?)");
            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.setString(2, region.getRegionName());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
    }
    @Override
    public Region getById(int regionID) {
        Region region = new Region();
        try {
            ResultSet resultSet = connection
            .prepareStatement("SELECT * FROM region WHERE id="+regionID)
            .executeQuery();
            resultSet.next();
            region.setRegionId(resultSet.getInt(1));
            region.setRegionName(resultSet.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return region;
    }
    
    @Override
    public boolean update(Region region) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE region SET name =?  WHERE id=? ");
            preparedStatement.setString(1, region.getRegionName());
            preparedStatement.setInt(2, region.getRegionId());
            preparedStatement.execute();
            return true;
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean delete (int regionId) {
        
        try {
           
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM region WHERE id= " + regionId );
//            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.executeUpdate();
            return true;
          
        } catch (SQLException e) {
            e.printStackTrace();
    
        }
        return false;
    }

    @Override
    public List<Region> getALL() {
         List<Region> regions = new ArrayList<>();
        String query = "SELECT * FROM REGION";
        try {
            ResultSet resultSet = connection
                    .prepareStatement(query)
                    .executeQuery();
            while (resultSet.next()) {
                Region region = new Region(resultSet.getInt(1), resultSet.getString(2));
                region.setRegionId(resultSet.getInt(1));
                region.setRegionName(resultSet.getString(2));
                regions.add(region);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return regions;
    }
   
   
    
    
    
 }   

  