/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.interfaces;

import java.util.List;
import models.Region;

/**
 *
 * @author LENOVO
 */
public interface IRegionDAO {
    public List<Region> getALL();
    
    public Region getById(int regionID);
    
    public boolean insert (Region region);
    
    public boolean update (Region region);
    
    public boolean delete (int regionId);
    
    
}
