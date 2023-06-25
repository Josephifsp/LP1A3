package aula_04.exercicios;

import aula_03.exemplos.Quadrado;
import aula_03.exemplos.Retangulo;

public class CanvasDinamico {
    private Quadrado[] quadrados;
    private Retangulo[] retangulos;
    private int quantidadeQuadrados;
    private int quantidadeRetangulos;

    public CanvasDinamico(int capacidadeQuadrados, int capacidadeRetangulos) {
        quadrados = new Quadrado[capacidadeQuadrados];
        retangulos = new Retangulo[capacidadeRetangulos];
        quantidadeQuadrados = 0;
        quantidadeRetangulos = 0;
    }

    public void adicionarQuadrado(Quadrado novoQuadrado) {
        if (quantidadeQuadrados < quadrados.length) {
            quadrados[quantidadeQuadrados++] = novoQuadrado;
        } else {
            quadrados = adicionarElementoDinamico(quadrados, novoQuadrado);
        }
    }

    public void adicionarRetangulo(Retangulo novoRetangulo) {
        if (quantidadeRetangulos < retangulos.length) {
            retangulos[quantidadeRetangulos++] = novoRetangulo;
        } else {
            retangulos = adicionarElementoDinamico(retangulos, novoRetangulo);
        }
    }

    private static <T> T[] adicionarElementoDinamico(T[] array, T novoElemento) {
        T[] novoArray = java.util.Arrays.copyOf(array, array.length + 1);
        novoArray[array.length] = novoElemento;
        return novoArray;
    }

    public int getCapacidadeQuadrados() {
        return quadrados.length;
    }

    public int getCapacidadeRetangulos() {
        return retangulos.length;
    }

    public int getQuantidadeQuadrados() {
        return quantidadeQuadrados;
    }

    public int getQuantidadeRetangulos() {
        return quantidadeRetangulos;
    }

    public double getSomaAreaQuadrados() {
        double soma = 0.0;
        for (int i = 0; i < quantidadeQuadrados; i++) {
            soma += quadrados[i].calcularArea();
        }
        return soma;
    }

    public double getSomaAreaRetangulos() {
        double soma = 0.0;
        for (int i = 0; i < quantidadeRetangulos; i++) {
            soma += retangulos[i].calcularArea();
        }
        return soma;
    }

    public double getSomaPerimetroQuadrados() {
        double soma = 0.0;
        for (int i = 0; i < quantidadeQuadrados; i++) {
            soma += quadrados[i].calcularPerimetro();
        }
        return soma;
    }

    public double getSomaPerimetroRetangulos() {
        double soma = 0.0;
        for (int i = 0; i < quantidadeRetangulos; i++) {
            soma += retangulos[i].calcularPerimetro();
        }
        return soma;
    }
}
