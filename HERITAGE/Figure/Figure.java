package HERITAGE.Figure;

public class Figure {
    private double x,y;

    public Figure() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Figure x=" + x + ", y=" + y + "";
    }

  void setcntre(double x,double y){
 this.x=x;
 this.y=y;
  }  
}
/**
 * Cercle extends Figure
 */
class Cercle extends Figure {
protected double rayon;
public Cercle(){
    
}
@Override
public String toString() {
    return "Cercle [rayon=" + rayon + "]";
}

public double Surface(){
    double s= Math.PI*Math.pow(rayon, 2);
    return s;
}
public double getRayon() {
    return rayon;
}
public void setRayon(double rayon) {
    this.rayon = rayon;
}
double estInterieur(double D,double R){
return estInterieur(D, R);
}
}

/**
 * Rectangle extends Figure
 */
 class Rectangle extends Figure {

   private double longueur,largeur;

public Rectangle() {
}

@Override
public String toString() {
    return "Rectangle longueur=" + longueur + ", largeur=" + largeur + "";
}
 double Surface(){
    double s=longueur*largeur;
    return s;
 }
 public double getLargeur() {
     return largeur;
 }
 public double getLongueur() {
     return longueur;
 }
 public void setLargeur(double largeur) {
     this.largeur = largeur;
 }
 public void setLongueur(double longueur) {
     this.longueur = longueur;
 }   
}
/**
 * RectangleColeré extends Rectangle
 */
 class RectangleColeré extends Rectangle {
    protected int couleur;

    public RectangleColeré() {
    }

    @Override
    public String toString() {
        return "RectangleColeré couleur=" + couleur + "";
    }
     
}
