package HERITAGE.Vehicule;

public class gestion_vehicule {
    public static void main(String[] args) throws InterruptedException {
        voiture V1= new voiture("toyota", "21/10/2022",
         20002 , 8  , 4, 3000, 2000);
         voiture V2= new voiture("Ferrari", "12/03/2020", 100000
         , 400, 2
         , 300, 1000);

         voiture V3= new voiture("Porshe", "12/12/2001", 90000,
          10, 4, 400, 10000);

          Avion A1=new Avion("crislair", "20/12/2019", 
          1200000, "Reaction", 1000);

          Avion A2= new Avion("Betwennes", "4/5/1999",
           12900, "helices", 200 );

           

           // Creation Tableau Garage et Hangars
           Object [] garage={V1,V2,V3};
           Object [] hangars={A1,A2};

           // Parcourir et Afficher les les items
           for(Object i:garage ){
            ((voiture) i).calculePrix();
            ((voiture) i).concatenation();
            System.out.println("Voiture: "+ i.toString());
           }

           // Parcourir et  Afficher les les items
           for (Object i: hangars){
            ((Avion) i).calculePrix();
            
            System.out.println("Avion: "+i.toString());
            
           }
    }
}
