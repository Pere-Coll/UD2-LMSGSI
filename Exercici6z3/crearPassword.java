package Exercici6z3;
import java.util.Scanner;

public class crearPassword {
    int numContrasenyes = 100;
    password[] contrasenyes = new password[numContrasenyes];
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean sortir = true;
    }

    public void menu() {
        boolean sortir = false;
        int longitud;
        do {
            System.out.println("Generador de contrasenyes");
            System.out.println("1. Crear contrasenya");
            System.out.println("2. Sortir");
            System.out.print("Tria una opció: ");
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    System.out.println("Quantes contrasenyes vols generar?");
                    int numContrasenyes = sc.nextInt();
                    for (int i = 0; i < numContrasenyes; i++) {
                        System.out.println("Quin tamany de contrasenya vols? per defecte es 8, si la vols canviar pitja 1: ");
                        int opcio2 = sc.nextInt();
                        if (opcio2 == 1) {
                            System.out.println("Introdueix la longitud de la contrasenya");
                            longitud = sc.nextInt();
                        } else
                            longitud = 8;
                        contrasenyes[i] = new password();
                        numContrasenyes++;
                    }
                    break;
                case 2:
                    System.out.println("Heu sortir del programa");
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció incorrecta");
            }
        } while (!sortir);
    }
}







