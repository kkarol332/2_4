import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz operację (1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz): ");
        int wybor = scanner.nextInt();
        if (wybor < 1 || wybor > 4) {
            System.out.println("Błąd, wybierz numer z zakresu od 1 do 4");
            return; 
        }
       
        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();
        
        switch (wybor) {
            case 1:
                System.out.println("Wynik sumy: " + (liczba1 + liczba2));
                break;
            case 2:
                System.out.println("Wynik różnicy: " + (liczba1 - liczba2));
                break;
            case 3:
                System.out.println("Wynik iloczynu: " + (liczba1 * liczba2));
                break;
            case 4:
                
                if (liczba2 == 0) {
                    System.out.println("Błąd, nie można dzielić przez zero");
                } else {
                    System.out.println("Wynik ilorazu: " + (liczba1 / liczba2));
                }
                break;
        }

        scanner.close();
    }
}