import libraries.In;


public class ue02_1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Zahl 1: ");
        num1= In.readInt();
        System.out.println("Zahl 2: ");
        num2= In.readInt();
        System.out.println("Zahl 3: ");
        num3= In.readInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println( num1 + " ist die größte Zahl");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 +" ist die größte Zahl");
        }
        else{
            System.out.println(num3 + " ist die größte Zahl");
        }
        


        
    }
}
