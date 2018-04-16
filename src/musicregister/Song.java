package musicregister;

public class Song {

    private int keyNumber;
    private String adress;
    private String owner;
    
    public Song() {
        
    }
    
    public Song(int keyNumber, String adress, String owner) {
        
        this.keyNumber = keyNumber;
        this.adress = adress;
        this.owner = owner;
        
    }
    
    public int getInt(String type) {
        
        switch(type) {
            
            case "keyNumber":
                return keyNumber;
            
        }
        
        return 0;
        
    }
    
    public String getString(String type) {
     
        switch(type) {
            
            case "adress":
                return adress;
            case "owner":
                return owner;
            
        }
        
        return null;
        
    }
    
}
