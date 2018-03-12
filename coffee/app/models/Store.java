// Store.java

package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import io.ebean.Model;

@Entity
@Table(name="stores")
public class Store extends Model {

	// Data Members 
	
	@Id
	@Column(name="store_id")
	public int StoreId;
	
	@Column(name="store_name")
	public String StoreName;
	
	@Column(name="store_img")
	public String StoreImg;

	public  Store(int StoreId, String StrName, String StoreImg){
		this.setStoreName(StrName);
		this.setStoreId(StoreId);
		this.setStoreImg(StoreImg);
	}
	
	public void setStoreImg(String StoreImg){
		this.StoreImg= StoreImg;
	}

	public void setStoreName(String name){
		this.StoreName= name;
	}

	public void setStoreId(int id){
		this.StoreId= id;
    }

    public String getStoreName(){
        return this.StoreName;
    }

    public int getStoreId(){
    	return this.StoreId;
    }
    
    public String getStoreImg(){
    	return this.StoreImg;
    }
}