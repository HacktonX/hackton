// Prodcts.java

package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import io.ebean.Model;

@Entity
@Table(name="product")
public class Prodcts extends Model {

    // Data Members 
	
	@Id
	@Column(name="product_id")
	public int productId;
	
	@Column(name="product_name")
	public String productName;
	
	@Column(name="product_price")
	public int productPrice;
	
	// Ctor
    
    public  Prodcts(String StrName,int IdNum,int price){
    	this.setProductName(StrName);
    	this.setProductId(IdNum);
    	this.setProductPrice(price);
    }
    
    public void setProductName(String name){
    	this.productName= name;
    }
    
    public void setProductId(int id){
    	this.productId= id;
    }
    
    public String getProductName(){
    	return this.productName;
    }
    
    public int getProductId(){
    	return this.productId;
    }
    
    public void setProductPrice(int price){            	
    	this.productPrice= price;
    }
                
    public int getProductPrice(){      
    	return this.productPrice;
    }    
 }