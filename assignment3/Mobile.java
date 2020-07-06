/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author A C E R
 */
//user-defined class
import java.io.*;

public class Mobile implements Serializable {
    
    String name, address, type, gender;
    int noIC, phoneNo;


    public Mobile(String name, int noIC, int phoneNo, String gender, String address, String type) {
        this.name = name;
        this.noIC = noIC;
        this.phoneNo = phoneNo;
        this.address = address;
        this.type = type;
        this.gender = gender;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoIC() {
        return noIC;
    }

    public void setNoIC(int noIC) {
        this.noIC = noIC;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
        public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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


    
}
