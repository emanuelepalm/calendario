import java.util.Scanner;

public class Menu {
    Calendario calendario = Calendario.getInstance();
    Scanner scanner = new Scanner(System.in);
    public void startMenu() {
        System.out.println("Benvenuto nel calendario!");
        System.out.println("Vuoi controllare: \n1)MESE \n2)STAGIONE\n0)ESCI");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                monthMenu();
                break;
            case 2:
                seasonMenu();
                break;
            case 0:
                break;
            default:
                System.err.println("TASTO ERRATO!");
                startMenu();
        }
    }
    public void monthMenu() {
        System.out.println("Inserisci un anno");
        calendario.setYear(scanner.nextInt());
        System.out.println("Inserisci un giorno");
        calendario.setDay(scanner.nextInt());
        String mese = calendario.monthOfDay();
        System.out.println( calendario.getDay() +" "+ mese);
        startMenu();
    }
    public void seasonMenu() {
        System.out.println("Inserisci un anno");
        calendario.setYear(scanner.nextInt());
        System.out.println("Inserisci un giorno");
        calendario.setDay(scanner.nextInt());
        String stagione = calendario.seasonOfDay();
        System.out.println(stagione);
        startMenu();
    }
}
