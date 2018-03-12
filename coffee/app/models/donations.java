
public class donations {

    // Data Members 
    private int StoreId;
    private int productId; 
    private String email;
    private int donationId; 
    
//    public  Store(String emailStr,int StoreIdNum,int productIdInt,int dontId){
//    setDonationId(dontId);
//    setProductId(productIdInt);
//    setStoreId(StoreIdNum);
//    setEmail(emailStr);
//    }
//    
    public void setEmail(String name){
    
    this.email= name;
    }
    
    public void setProductId(int id){
    
        this.productId= id;
        }
        public void setStoreId(int name){
    
            this.StoreId= name;
            }
            
            public int setDonationId(){
            
                return this.donationId;
                }
    
                public String getEmail(){
    
                    return this.email;
                    }
                    
                    public int getProductId(){
                    
                       return this.productId;
                        }
                        public int getStoreId(){
                    
                            return this.StoreId;
                            }
                            
                            public int getDonationId(){
                            
                                return this.donationId;
                                }
                    
                    
               
                    
    
      
    
    }