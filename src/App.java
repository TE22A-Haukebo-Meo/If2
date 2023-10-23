import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Ålder?");
        Scanner tb = new Scanner(System.in);
        //int age = tb.nextInt();
//        System.out.println("Äru medlem");
//          tb.nextLine();
//      String medlem = tb.nextLine();
//
//        if(age>=18)
//        {
//            System.out.println("Ajde kom in");
//        }
//        else if(medlem.equalsIgnoreCase("ja"))
//        {
//            System.out.println("Ajde kom in");
//        }
//        else{
//            System.out.println("Jalla tagga härifrån");
//        }
        /*System.out.println("Ange Användarnamn");
        String user = tb.nextLine();
        System.out.println("Ange lösenord");
        String pass = tb.nextLine();

        if(user.equals("root")  && (pass.equals("passwd")))
        {
            System.out.println("VÄlkommen tillbaka root");
        } 
        else{
            System.out.println("Fel användarnamn eller lösenord.");
        } */

        System.out.println("Meny väderprogram");
        System.out.println("1. Temperatur");
        System.out.println("2. Vindhastighet");
        System.out.println("3. Luftfuktighet");
        System.out.println("Vilken vill du veta?");
        int L = tb.nextInt();

        switch(L){
            case 1:
                System.out.println("Mycket varmt");
                break;
            case 2:
                System.out.println("Veri afast");
                break;
            case 3:
                System.out.println("No mucho");
                break;
        }
    }
}

