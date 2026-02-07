package application;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        System.out.println("hola Mundo");
        String name = " Juan";
        int age = 26;
        boolean male = true;
        System.out.println(name + " " + age + " años " + male);
        int anoActual = 2026;
        final int ANONACIMINETO = 1999;
        int currentage = anoActual - ANONACIMINETO;
        System.out.println(currentage + " " + "Es su edad");


        for (int i = 1 ; i <= 10; i++ )
            System.out.println(i);
    }
}
