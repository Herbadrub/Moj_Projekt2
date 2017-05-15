package com.example;

/**
 * Created by Jurij on 28. 02. 2017.
 */

public class DataMain {
    public static void main (String args[]){

        Lokacija l1= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 1", 46.560004,15.6298197);
        Lokacija l2= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 2", 46.560004,15.6298197);

        User a1= new User("Prvi", "Janez", "janeznik");
        User a2= new User("Drugi", "Janez", "janeznik");
        User a3= new User("Tretji", "Janez", "janeznik");

        Pacient p1= new Pacient(a1, "Bolan", l1);
        Pacient p2= new Pacient(a2, "Bolan", l2);

        Termin t1= new Termin(p1,"Nujni poseg","1.1.1001");
        Termin t2= new Termin(p2,"Nujni poseg","1.1.2020");

        Delavec zaposleni= new Delavec(a3);
        zaposleni.dodajTermin(t1);
        zaposleni.dodajTermin(t2);

        System.out.println("\n***Uporabniki:  \n");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println("\n***Pacienti:  \n");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("\n***Termini:  \n");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println("\n***Zaposleni:  \n");
        System.out.println(zaposleni.toString());
    }




}
