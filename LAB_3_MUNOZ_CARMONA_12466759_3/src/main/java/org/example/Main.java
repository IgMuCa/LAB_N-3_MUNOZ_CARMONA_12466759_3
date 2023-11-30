package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


       //METODO PARA SCANNEAR
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese nombre de usuario");
        String userName= scanner.nextLine();
        //Scannea si es administrador o usuario normal
        System.out.println("(1) Administrador");
        System.out.println("(2) Usuario Normal");
        String userCategoria= scanner.nextLine();
        System.out.println("Usuario creado");
        System.out.print(userName);
        System.out.println(userCategoria);



    }
}