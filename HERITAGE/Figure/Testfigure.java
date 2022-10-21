package HERITAGE.Figure;

public class Testfigure {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle();
        Figure cercle = new Cercle();
        Figure rectancleColore = new RectangleColeré();

        rectangle.setcntre(12, 55);
        System.out.println(rectangle.toString());

        System.out.println(cercle.getX());
        

    }
}
