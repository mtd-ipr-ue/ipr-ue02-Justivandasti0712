import libraries.In;


public class ue02_2 {
    public static void main(String[] args) {
        int year, month;

        System.out.println("Geben sie eine Jahreszahl ein: ");
        year=In.readInt();
        System.out.println("Geben sie eine Monatszahl ein: ");
        month= In.readInt();

        switch (month) {
            case 1,3,5,7,8,10,12 :
                System.out.println("Der Monat hat 31 Tage ");
                break;
            case 2:
                if((year%400)==0 && (year%4)==0){
                    System.out.println("Dies ist ein Schaltjahr, der Februar hat 29 Tage");
                    break;
                }
                if((year%4)==0){
                    if((year%100)==0){
                        System.out.println("Dies ist kein Schaltjahr, der Februat hat 28 Tage");
                        break;
                    }
                    else{
                        System.out.println("Dies ist ein Schaltjahr, der Februar hat 29 Tage");
                    }

                break;
                }

            case 4,6,9,11:
                System.out.println("Der Monat hat 30 Tage");
                break;
            default:
                System.out.println("Sie haben eine falsche Monatszahl eingegeben. (1-12)");
                break;
        }

    }
}
