package musicregister;

public class Key {

    private int keyNumber;
    private String adress;
    private String owner;
    
    public Key() {
        
    }

    public Key(int keyNumber, String adress, String owner) {
        this.keyNumber = keyNumber;
        this.adress = adress;
        this.owner = owner;
    } 

    public int getKeyNumber() {
        return keyNumber;
    }

    public String getAdress() {
        return adress;
    }

    public String getOwner() {
        return owner;
    }
        
    public void setKeyNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
}