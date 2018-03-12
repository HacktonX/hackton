
public class products {

    // Data Members 
    private String productName;
    private int productId;
    private int productPrice; 
    
    public  Store(String StrName,int IdNum,int price){
    setProductName(StrName);
    setProductId(IdNum);
    setProductPrice(price);
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
                
                    public String getProductPrice(){
                
                        return this.productPrice;
                        }
    
    }