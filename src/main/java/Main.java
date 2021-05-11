import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserisci un anno");
        Calendario calendario = Calendario.getInstance();
        Scanner scanner = new Scanner(System.in);
        calendario.setYear(scanner.nextInt());
        System.out.println("Inserisci un giorno");
        calendario.setDay(scanner.nextInt());
        String mese = calendario.monthOfDay();
        System.out.println(mese);

    }
}
