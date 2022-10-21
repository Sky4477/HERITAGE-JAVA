package HERITAGE.Personne_Metier;

public class Personne {
    protected String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "je suis " + nom ;
    }
    
}
class Forgeron extends Personne{

    public Forgeron(String nom) {
        super(nom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" le Forgeron";
    }

}

class Menuisier extends Personne{

    public Menuisier(String nom) {
        super(nom);
        //TODO Auto-generated constructor stub
    }
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString()+" le Munisier";
}

}