
package com.projeto.ValidadorCPF;

import java.util.Scanner;

public class ValidadorCPF {
    public ValidadorCPF() {
    }

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11) {
            return false;
        } else if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        } else {
            int soma1 = 0;
            int soma2 = 0;
            int[] pesos1 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2};
            int[] pesos2 = new int[]{11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

            int digito1;
            for(digito1 = 0; digito1 < 9; ++digito1) {
                soma1 += Character.getNumericValue(cpf.charAt(digito1)) * pesos1[digito1];
            }

            digito1 = soma1 % 11 < 2 ? 0 : 11 - soma1 % 11;

            int digito2;
            for(digito2 = 0; digito2 < 9; ++digito2) {
                soma2 += Character.getNumericValue(cpf.charAt(digito2)) * pesos2[digito2];
            }

            soma2 += digito1 * 2;
            digito2 = soma2 % 11 < 2 ? 0 : 11 - soma2 % 11;
            return cpf.charAt(9) == digito1 + 48 && cpf.charAt(10) == digito2 + 48;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF (formato XXX.XXX.XXX-XX): ");
        String cpf = scanner.nextLine();
        if (validarCPF(cpf)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }

        scanner.close();
    }
}
