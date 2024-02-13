import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Second try

        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();
        int birthYear;

        System.out.println("Ingrese año de nacimiento");
        birthYear=Integer.parseInt(scanner.nextLine());
        int totalAge = currentYear-birthYear;

        if (birthYear<currentYear&&totalAge<130){
            System.out.println(totalAge);
        }else {
            System.out.println("Fecha de nacimiento erronea");
        }
    }
}