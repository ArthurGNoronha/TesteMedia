package org.example;

public class CalculoMedia {
    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarSituacao(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Segunda Oportunidade";
        } else {
            return "Reprovado";
        }
    }
}
