package application;

import java.util.ArrayList;

public class Main {
    final static int CURRENT_YEAR = 2026;
    public static void main(String[] args){
        final String GREETING_MESSAGE = "Saludo estudiantes de Java"

        String [] namesStudents = {"Juan", "Maria", "Pedro", "Ana", "luis"};
        int [] birthYear = {2000, 1998, 2002, 1995, 2001};

        list<int[]> agesStudentlist = new ArrayList<>();
        showMessage(GREETING_MESSAGE);
    }
    static void showMessage(String message) {
        System.out.println(message);
    }
    static int calculateAge(int  birthYear){
        return CURRENT_YEAR - birthYear;
    }



}
