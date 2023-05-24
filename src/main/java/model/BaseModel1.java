package model;

import java.io.Serializable;
public class BaseModel1 implements Serializable {
    private int id;
    private String name;
    private String address;
    private String type;
    private static int sma = 10000;

    public BaseModel1(int id, String name, String address, String type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    
    public BaseModel1(){
        id = sma++;
    }
    public int getId() {   
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {    
        this.type = type;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        BaseModel1.sma = sma;
    }

    public Object[] toObjects(){
        return new Object[]{
            getId(), getName(), getAddress(), getType()
        };
    }
}
