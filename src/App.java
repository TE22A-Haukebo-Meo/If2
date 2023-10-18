import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tal1 = 10;
        int tal2 = 20;

        if(tal2>tal1)
        {
            System.out.println(tal2+" är större än "+tal1);
        }
        else{
            System.out.println(tal2+" är mindre än "+tal1);
        }
    

    Scanner tb = new Scanner(System.in);

    int klocka = tb.nextInt();


    if(klocka>=7)
    {
        System.out.println("WAKE UP! ITS THE FIRST OF THE MONTH!");
    }
    else if(klocka==12)
    {
        System.out.println("Vad gör en tandläkare på lunchen? Käkar.");
    }
    else if(klocka>=23)
    {
        System.out.println("GO TO SLEEP");
    }
    else{
        System.out.println("HE HE HUUU");
    }


    }
}

