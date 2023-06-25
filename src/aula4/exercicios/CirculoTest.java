package aula_04.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    
    @Test
    public void criaUmCirculoDeRaio8() {
        double raio = 8;
        Circulo circulo = new Circulo(8);
        assertEquals(raio, circulo.getRaio());
    }

    @Test
    public void circuloDeRaio8DeveTerDiametroDe16() {
        double diametroEsperado = 16.0;
        Circulo circulo = new Circulo(8);
        assertEquals(diametroEsperado, circulo.calcularDiametro());
    }

    @Test
    public void circuloDeRaio8DeveTerPerimetro50_24() {
        double perimetroEsperado = 50.24;
        Circulo circulo = new Circulo(8);
        assertEquals(perimetroEsperado, circulo.calcularPerimetro(), 0.01);
    }

    @Test
    public void circuloDeRaio8DeveTerArea201_06() {
        double areaEsperada = 201.06;
        Circulo circulo = new Circulo(8);
        assertEquals(areaEsperada, circulo.calcularArea(), 0.01);
    }

    @Test
    public void deveAlterarOValorDoRaio() {
        Circulo circulo = new Circulo(8);
        circulo.setRaio(15);
        assertEquals(15, circulo.getRaio());
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDoRaioForZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(0);
        });
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDoRaioForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-8);
        });
    }

}
