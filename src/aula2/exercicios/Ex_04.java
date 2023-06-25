package aula_02.exercicios;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        final int NUMERO_CARACTERES = 7;
        final int NUMERO_DIGITOS = 4;

        System.out.println("Código Identificador: ");
        Scanner sc = new Scanner(System.in);
        String cod = sc.nextLine();

        String br_var = cod.substring(0, 2);
        String num_var = cod.substring(2, 6);
        String x_var = cod.substring(6);

        if (!verificarCaracteres(cod, NUMERO_CARACTERES)) {
            throw new RuntimeException("Código Inválido");
        }

        if (!verificarSigla("BR", br_var)) {
            throw new RuntimeException("Código Inválido");
        }

        if (!verificarNumeros(num_var)) {
            throw new RuntimeException("Código Inválido");
        }

        if (!verificarSigla("X", x_var)) {
            throw new RuntimeException("Código Inválido");
        }

        System.out.println("Código Válido");
    }

    public static boolean verificarCaracteres(String codigo, int numero_caracteres) {
        return codigo.length() == numero_caracteres;
    }

    public static boolean verificarSigla(String modelo, String sigla) {
        return sigla.equals(modelo);
    }

    public static boolean verificarNumeros(String codigo_numerico) {
        if (codigo_numerico == null || codigo_numerico.isEmpty()) {
            return false;
        }
        for (int i = 0; i < codigo_numerico.length(); i++) {
            char c = codigo_numerico.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
