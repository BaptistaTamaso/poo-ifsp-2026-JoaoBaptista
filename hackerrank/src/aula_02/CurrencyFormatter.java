package aula_02;

import java.util.*;
import java.text.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franca = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usFormatado = us.format(payment);
        String indiaFormatado = india.format(payment);
        String chinaFormatado = china.format(payment);
        String francaFormatado = franca.format(payment);

        System.out.println("US: " + usFormatado);
        System.out.println("India: " + indiaFormatado);
        System.out.println("China: " + chinaFormatado);
        System.out.println("France: " + francaFormatado);
    }
}

