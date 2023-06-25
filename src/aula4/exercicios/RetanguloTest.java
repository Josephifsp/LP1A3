package aula_04.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import aula_03.exemplos.Retangulo;

public class RetanguloTest {
    
    @Test
    public void criaUmRetanguloComBase5EAltura8() {
        int base = 5;
        int altura = 8;

        Retangulo retangulo = new Retangulo(base, altura);

        assertEquals(base, retangulo.getBase());
        assertEquals(altura, retangulo.getAltura());
    }

    @Test
    public void retanguloDeBase5EAltura8DeveTerArea40() {
        double areaEsperada = 40.0;
        
        Retangulo retangulo = new Retangulo(5, 8);

        assertEquals(areaEsperada, retangulo.calcularArea());
    }

    @Test
    public void retanguloDeBase5eAltura8DeveTerPerimetro26() {
        double perimetroEsperado = 26.0;

        Retangulo retangulo = new Retangulo(5, 8);

        assertEquals(perimetroEsperado, retangulo.calcularPerimetro());
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDaBaseForZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(0, 8);
        });
        assertEquals("Base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDaBaseForNegativo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-5, 8);
        });
        assertEquals("Base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDaAlturaForZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(5, 0);
        });
        assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDaAlturaForNegativo() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(5, -8);
        });
        assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }

}
