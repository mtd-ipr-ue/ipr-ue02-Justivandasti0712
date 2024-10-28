import libraries.In;


public class ue02_3 {
    public static void main(String[] args) {
        int r=4;
        double x,y;
        double complength;

        System.out.println("Gebe eine x Koordinate ein: ");
        x=In.readDouble();
        System.out.println("Gebe eine y Koordinate ein: ");
        y=In.readDouble();

        if((x>0 && y>0) && (x<=4 && y<=4)){
            complength = Math.sqrt((x*x)+(y*y));
            if (complength>r) {
             System.out.println("Die Koordinaten liegen innerhalb der grünen Fläche");
            }
            else{
               System.out.println("Die eingegebenen Koordinaten liegen nicht innerhalb der grünen Fläche");
            }  
    }
    else{
        System.out.println("Die eingegebenen Koordinaten liegen nicht innerhalb der grünen Fläche (falsche Eingabe)");
    }
}
}
