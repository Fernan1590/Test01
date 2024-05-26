import com.sun.jndi.ldap.sasl.SaslInputStream;
import models.Raton;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduza modelo: ");
        String modelo = scanner.nextLine();
        System.out.printf("Introduzca precio: ");
        String precio = scanner.nextLine();

        Raton raton1 = new Raton(modelo, Float.valueOf(precio));
        System.out.println(raton1);
    }
}