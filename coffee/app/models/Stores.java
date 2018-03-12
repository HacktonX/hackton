
public class Store {

// Data Members 
private String StoreName;
private int StoreId; 

public  Store(String StrName,int IdNum){
setStoreName(StrName);
setStoreId(IdNum);
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
    


}