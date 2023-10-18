import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ålder?");
        Scanner tb = new Scanner(System.in);
        int age = tb.nextInt();
        System.out.println("Äru medlem");
            tb.nextLine();
        String medlem = tb.nextLine();

        if(age>=18)
        {
            System.out.println("Ajde kom in");
        }
        else if(medlem.equalsIgnoreCase("ja"))
        {
            System.out.println("Ajde kom in");
        }
        else{
            System.out.println("Jalla tagga härifrån");
        }
    }
}

