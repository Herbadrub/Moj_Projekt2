package com.example;

/**
 * Created by Jurij on 14. 03. 2017.
 */

import java.util.ArrayList;

import sun.rmi.runtime.Log;

public class DataAll {
    private User userMe;
    private ArrayList<Termin> mojiTermini;
    private ArrayList<User> mojiZaposleni;
    private ArrayList<User> aktivniZaposleni;
    private ArrayList<Termin> aktivni;
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public DataAll(){
        userMe = new User();
        mojiTermini = new ArrayList<>();
        mojiZaposleni= new ArrayList<>();
        aktivni= new ArrayList<>();
        flag =0;
    }
    //to je test
    public User getUserMe() {
        return userMe;
    }
    public ArrayList<Termin> getMojiTermini() {
        return mojiTermini;
    }
    public void setUserMe(User userMe) {
        this.userMe = userMe;
    }
    public void setMojiTermini(ArrayList<Termin> mojiTermini) {
        this.mojiTermini = mojiTermini;
    }
    public void addTermin(Termin novi){
        mojiTermini.add(novi);
    }
    public int getSteviloTerminov(){
        return mojiTermini.size();
    }
    public ArrayList<User> getMojiZaposleni() {
        return mojiZaposleni;
    }
    public void setMojiZaposleni(ArrayList<User> mojiZaposleni) {
        this.mojiZaposleni = mojiZaposleni;
    }
    public void dodaj_zaposlenega(User oseba){
        this.mojiZaposleni.add(oseba);
    }
    public void izpis()
    {
        this.userMe= new User();
    }

    public ArrayList<User> getAktivniZaposleni() {
        return aktivniZaposleni;
    }

    public void setAktivniZaposleni(ArrayList<User> aktivniZaposleni) {
        this.aktivniZaposleni = aktivniZaposleni;
    }

    public ArrayList<Termin> getAktivni() {
        return aktivni;
    }

    public void setAktivni(ArrayList<Termin> aktivni) {
        this.aktivni = aktivni;
    }

    public static DataAll scenarijA()
    {
        DataAll da = new DataAll();
//46.3622743!4d15.1106582
        Lokacija l1= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 1", 46.3622743,15.1106582);
        Lokacija l2= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 2", 46.3622743,15.1106582);

        Oseba a1= new Oseba("1", "Janez", "janeznik");
        Oseba a2= new Oseba("2", "Janez", "janeznik");
        Oseba a3= new Oseba("3", "Janez", "janeznik");
        Oseba a4= new Oseba("4", "Janez", "janeznik");
        Oseba a5= new Oseba("5", "Janez", "janeznik");
        Oseba a6= new Oseba("6", "Janez", "janeznik");
        Oseba a7= new Oseba("7", "Janez", "janeznik");
        Oseba a8= new Oseba("8", "Janez", "janeznik");
        Oseba a9= new Oseba("9", "Janez", "janeznik");
        Oseba a10= new Oseba("10", "Janez", "janeznik");
        Oseba a11= new Oseba("11", "Janez", "janeznik");
        Oseba a12= new Oseba("12", "Janez", "janeznik");

        Pacient p1= new Pacient(a1, "Bolan1", l1);
        Pacient p2= new Pacient(a2, "Bolan2", l2);
        Pacient p3= new Pacient(a3, "Bolan3", l2);
        Pacient p4= new Pacient(a4, "Bolan4", l2);
        Pacient p5= new Pacient(a5, "Bolan5", l2);
        Pacient p6= new Pacient(a6, "Bolan6", l2);
        Pacient p7= new Pacient(a7, "Bolan7", l2);
        Pacient p8= new Pacient(a8, "Bolan8", l2);
        Pacient p9= new Pacient(a9, "Bolan9", l2);
        Pacient p10= new Pacient(a10, "Bolan10", l2);
        Pacient p11= new Pacient(a11, "Bolan11", l2);
        Pacient p12= new Pacient(a12, "Bolan12", l2);


        Termin t1= new Termin(p1,"Nujni poseg","1.1.1001","D2551");
        Termin t2= new Termin(p2,"Nujni poseg","1.1.2020","D2551");
        Termin t3= new Termin(p3,"Nujni poseg","1.1.2020","D2551");
        Termin t4= new Termin(p4,"Nujni poseg","1.1.2020","D2551");
        Termin t5= new Termin(p5,"Nujni poseg","1.1.2020","D2551");
        Termin t6= new Termin(p6,"Nujni poseg","1.1.2020","D2551");
        Termin t7= new Termin(p7,"Nujni poseg","1.1.2020","D2552");
        Termin t8= new Termin(p8,"Nujni poseg","1.1.2020","D2552");
        Termin t9= new Termin(p9,"Nujni poseg","1.1.2020","D2552");
        Termin t10= new Termin(p10,"Nujni poseg","1.1.2020","D2552");
        Termin t11= new Termin(p11,"Nujni poseg","1.1.2020","D2553");
        Termin t12= new Termin(p12,"Nujni poseg","1.1.2020","D2553");

        da.addTermin(t1);
        da.addTermin(t2);
        da.addTermin(t3);
        da.addTermin(t4);
        da.addTermin(t5);
        da.addTermin(t6);
        da.addTermin(t7);
        da.addTermin(t8);
        da.addTermin(t9);
        da.addTermin(t10);
        da.addTermin(t11);
        da.addTermin(t12);

        User d1 = new User("D2551","Jurij","Konovsek","123","031333277","jurij_konovsek@mail.com");
        User d2 = new User("D2552","Matija","Krsnovic","123","041756638","matija_krsnovic@mail.com");
        User d3 = new User("D2553","Mateja","Grabn","123","068736492","mateja_grabn@mail.com");
        User d4 = new User("D2554","Rado","Van","123","051847576","radovan@mail.com");

        da.dodaj_zaposlenega(d1);
        da.dodaj_zaposlenega(d2);
        da.dodaj_zaposlenega(d3);
        da.dodaj_zaposlenega(d4);

        return da;
    }
    public void izbrisiTermin(int i){
        for(int j=0;j<aktivni.size();j++){
            if(aktivni.get(j).getPacient().getOseba().getOseba_ID().equals(i))
            {
                aktivni.remove(i);
                break;
            }
        }

    }
    public void filtreraj(){
        aktivni=new ArrayList<>();
        for(int i=0;i<mojiTermini.size();i++)
        {
            if(mojiTermini.get(i).getId_delavca().equals(userMe.getUser_ID()))
            {
                //Log.("PASSED", "ID: " + userMe.getUser_ID() + ", PASS: " + mojiTermini.get(i).getId_delavca());
                aktivni.add(mojiTermini.get(i));
            }
            else
            {
                //Log.e("PASSED", "ID: " + userMe.getUser_ID() + ", BRISEM: " + mojiTermini.get(i).getId_delavca());
            }
        }
        aktivniZaposleni= new ArrayList<>();
        for(int i=0;i<mojiZaposleni.size();i++)
        {
            if(mojiZaposleni.get(i).getUser_ID().equals(userMe.getUser_ID()))
            {

            }
            else
            {
                aktivniZaposleni.add(mojiZaposleni.get(i));
            }
        }

    }
}
