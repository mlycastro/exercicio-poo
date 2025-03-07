package org.example;


import java.util.List;

public class mediaAritmetica {
    public static double calcularMedia(List<Double> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("lista vazia.");
        }
        double soma = 0;
        for (Double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.size();
    }
    public static void main(String[])args) {
    List<Double> numeros = List.of(10.0, 20.0, 30.0, 40.0, 50.0);

        System.out.printf("média aritmetica: " + calcularMedia(numeros));


        }
    }
