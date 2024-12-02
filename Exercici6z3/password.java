package Exercici6z3;
import java.util.Random;
import java.util.Scanner;
public class password {
    private String pass;
    private int longitud = 8;

    public password(int longitud) {
        crearContrasenya(longitud);
        this.longitud = longitud;
    }

    public password() {
        crearContrasenya(8);
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void crearContrasenya(int longitud) {
        for (int i = 0; i < longitud; i++) {
            char caracter = (char) (Math.random() * (126 - 33) + 33);
            this.pass += caracter;
        }
        System.out.println("La contrasenya generada és: " + pass);
    }
}












