package com.example;

/**
 * Created by Jurij on 27. 02. 2017.
 */

public class User {
    private String user_ID;
    private String user_ime;
    private String user_priimek;


    public User(String idUser, String Ime, String Priimek) {
        this.user_ID = idUser;
        this.user_ime = Ime;
        this.user_priimek = Priimek;
    }

    public void setUser_ID(String ID){
       this.user_ID=ID;
    }
    public void setUser_ime(String Ime){
        this.user_ime=Ime;
    }
    public void setUser_priimek(String Priimek){
        this.user_priimek=Priimek;
    }
    public String getUser_ID(){
        return this.user_ID;
    }
    public String getUser_ime(){
        return this.user_ime;
    }
    public String getUser_priimek(){
        return this.user_priimek;
    }
    @Override
    public String toString(){
        return "\nOseba: "+this.user_ID+" - "+this.user_ime+" "+this.user_priimek;
    }
}
