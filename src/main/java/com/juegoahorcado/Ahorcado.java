package com.juegoahorcado;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';

        }

        while (!palabraAdivinada && intentos < intentosMaximos) {

            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra, por favor");
            char letra = sc.next().charAt(0);

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta, te quedan " + (intentosMaximos-intentos)+ " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("Perdiste, te has quedado sin intentos");
        }

        sc.close();

    }
}