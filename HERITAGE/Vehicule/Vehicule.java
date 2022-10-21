package HERITAGE.Vehicule;

import java.sql.Date;

public class Vehicule {
    protected String marque;
    protected String date;
    protected double prix_achat,prix_courant;
    
    public Vehicule(String marque, String date, double prix_achat) {
        this.marque = marque;
        this.date = date;
        this.prix_achat = prix_achat;
    }

    @Override
    public String toString() {
        return " marque=" + marque + ", date=" + date + ", prix_achat=" + prix_achat + ", prix_courant="
                + prix_courant + " ";
    }

    void calculePrix(){
        prix_courant=prix_achat;
    }

}
// class voiture qui herite des fonction de vehicule
class voiture extends Vehicule{
    double cylindrée ;
    int nbr_portes ;
    int puissance ;
    double kilométrage;
    public voiture(String marque, String date, double prix_achat, 
    double cylindrée, int nbr_portes, int puissance,
            double kilométrage) {
        super(marque, date, prix_achat);
        this.cylindrée = cylindrée;
        this.nbr_portes = nbr_portes;
        this.puissance = puissance;
        this.kilométrage = kilométrage;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    void concatenation(){
        marque="C "+marque;
    }
    void calculePrix(){
       if (kilométrage>=10000) {
        prix_courant=prix_achat-((prix_achat* 5)/100);
       } else if (marque=="Renault" || marque=="Fiat" || marque=="Chevrolet"){
        prix_courant=prix_achat-((prix_achat* 10)/100);
       }else if(marque=="Ferrari" || marque=="Porche" ){
        prix_courant=prix_achat-((prix_achat* 20)/100);
       }
       else{
        prix_courant=prix_achat;
       }
    }  

}

// class Avion qui herite des fonction de vehicule

class Avion extends Vehicule{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    String type;
    int nbr_heure_vol;
    public Avion(String marque, String date, 
    double prix_achat, String type, int nbr_heure_vol) {
        super(marque, date, prix_achat);
        this.type = type;
        this.nbr_heure_vol = nbr_heure_vol;
    }
    
    void calculePrix(){
        if (nbr_heure_vol>=1000 && type=="Reaction") {
         prix_courant=prix_achat-((prix_achat* 10)/100);
        } else if (nbr_heure_vol>=100 && type=="helices"){
         prix_courant=prix_achat-((prix_achat* 10)/100);
        }
     }  

}
