package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        CalculoMedia calculoMedia = new CalculoMedia();
        double media = calculoMedia.calcularMedia(nota1, nota2, nota3);
        String string = calculoMedia.verificarSituacao(media);

        System.out.println("Média: " + media);
        System.out.println("Situação: " + string);
    }
}
