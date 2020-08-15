package ba.unsa.etf.rpr;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean sumaCifara(int i){
        int suma = 0, broj = i;
        while(broj != 0){
            //System.out.println("check " + broj);

            suma += broj % 10;
            broj = broj / 10;
        }

        if(i % suma == 0) return true;
        return false;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner ulaz = new Scanner(System.in);
        int n = 0;

        System.out.println("Unesite n: ");
        n = ulaz.nextInt();
        for(int i = 1; i <= n; i++)
            if(sumaCifara(i))
                System.out.println(i);
    }
}
