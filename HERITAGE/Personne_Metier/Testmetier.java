package HERITAGE.Personne_Metier;

import Meteo.main;

public class Testmetier {
    public static void main(String[] args) {
    Personne[] personne = new Personne [4];
    personne [0] = new Personne ("Salah");
    personne [1] = new Forgeron ("Ali");
    personne [2] = new Menuisier ("Mohamed");
    personne [3] = new Forgeron ("Amor");
    for (int i=0; i < personne.length;i++)
        System.out.println(personne[i].toString());
    

    }
}
