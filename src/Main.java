import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Punto 1:

        /*System.out.println("Ingrese un número decimal");
        double valorDecimal = sc.nextDouble();

        short valorShort = (short) valorDecimal;
        int valorInt = (int) valorDecimal;
        long valorLong = (long) valorDecimal;
        float valorFloat = (float) valorDecimal;
        String valorString = Double.toString(valorDecimal);

        System.out.println("Valor original (double): " + valorDecimal);
        System.out.println("Valor short: " + valorShort);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Valor float: " + valorFloat);
        System.out.println("Valor string: " + valorString);*/


        //Punto 2:

        /*System.out.println("Ingrese un valor mayor a -129 y menor a 128");
        int valor = sc.nextInt();

        if (valor < -129 || valor > 128){
            System.out.println("Número fuera de rango.");
        }else{
            byte valorByte = (byte) valor;
            System.out.println("El número ingresado fue " + valor + " el cual puede ser ingresado en una variable de tipo byte.");
        }*/


        //Punto 3:

        /*System.out.println("Ingrese un número de 3 dígitos: ");
        int numero = sc.nextInt();

        if (numero < 100 || numero > 999){
            System.out.println("Número fuera de rango");
        }else{
            int valor1 = numero % 10;
            int numero1 = numero / 10;

            int numero2 = (int) numero1;
            int valor2 = numero2 % 10;
            numero2 = numero2 / 10;

            int numero3 = (int) numero2;
            int valor3 = numero3 % 10;

            int suma = valor1 + valor2 + valor3;

            System.out.println("La suma entre dígitos de " + numero + " da como resultado " + suma);
        }*/


        //Punto 4:

        /*int c200 = 0, c100 = 0, c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0,
                c05 = 0, c025 = 0, c010 = 0, c005 = 0;
        double valor;

        System.out.println("Ingrese la cantidad: ");
        valor = sc.nextDouble();

        if (valor < 0) {
            System.out.println("Valor no válido.");
        }else{
            while (valor >= 200) {
                valor = valor - 200;
                c200 = c200 + 1;
            }
            System.out.println("200: " + c200);
            while (valor >= 100) {
                valor = valor - 100;
                c100 = c100 + 1;
            }
            System.out.println("100: " + c100);
            while (valor >= 50) {
                valor = valor - 50;
                c50 = c50 + 1;
            }
            System.out.println("50: " + c50);
            while (valor >= 20) {
                valor = valor - 20;
                c20 = c20 + 1;
            }
            System.out.println("20: " + c20);
            while (valor >= 10) {
                valor = valor - 10;
                c10 = c10 + 1;
            }
            System.out.println("10: " + c10);
            while (valor >= 5) {
                valor = valor - 5;
                c5 = c5 + 1;
            }
            System.out.println("5: " + c5);
            while (valor >= 2) {
                valor = valor - 2;
                c2 = c2 + 1;
            }
            System.out.println("2: " + c2);
            while (valor >= 1) {
                valor = valor - 1;
                c1 = c1 + 1;
            }
            System.out.println("1: " + c1);
            while (valor >= 0.5) {
                valor = valor - 0.5;
                c05 = c05 + 1;
            }
            System.out.println("0.50: " + c05);
            while (valor >= 0.25) {
                valor = valor - 0.25;
                c025 = c025 + 1;
            }
            System.out.println("0.25: " + c025);
            while (valor >= 0.10) {
                valor = valor - 0.10;
                c010 = c010 + 1;
            }
            System.out.println("0.10: " + c010);
            while (valor >= 0.05) {
                valor = valor - 0.05;
                c005 = c005 + 1;
            }
            System.out.println("0.05: " + c05);
        }*/


        //Punto 5:

        /*System.out.println("Ingrese un número entero: ");
        Integer numero = sc.nextInt();
        System.out.println("Variable tipo " + numero.getClass() + numero);
        String.valueOf(numero);
        System.out.println("Variable tipo String: " + numero.getClass() + numero);*/


        //Punto 6:

        /*String cadena = "La lluvia en Mendoza es escasa";
        System.out.println("La longitud de la cadena es de " + cadena.length() + " caracteres");*/


        //Punto 7:

        /*System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        int longitud = cadena.length();
        int contadorVocales=0, i;

        for (i = 0; i < longitud; i++){

            char caracter = cadena.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La longitud de la cadena es de " + longitud + " y contiene un total de " + contadorVocales + " vocales.");*/


        //Punto 8:

        /*System.out.println("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        int longitud = cadena.length();
        int i;

        for (i = 0; i < longitud; i++){

            char caracter = cadena.charAt(i);

            if (caracter == 'a') {
                cadena = cadena.replace('a', 'e');
            }
        }

        System.out.println("La nueva cadena es '" + cadena + "'");*/


        //Punto 9: (terminar)

        /*String cadenaNueva, cadena = "La lluvia en Mendoza es escasa";
        cadena = Arrays.toString(cadena.getBytes());
        int i, longitud = cadena.length();
        */


        //Punto 10:

        /*System.out.println("Ingrese una frase: ");
        String cadena = sc.nextLine();
        int opcion;

        do{
            System.out.println("Si quiere pasar su frase a mayúsculas presione 1\nSi quiere pasarla a minúsculas pulse 2: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    cadena = cadena.toUpperCase();
                    System.out.println(cadena);
                    break;
                case 2:
                    cadena = cadena.toLowerCase();
                    System.out.println(cadena);
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }

        }while (opcion != 1 & opcion != 2);*/


        //Punto 11:

        /*String palabra1, palabra2;
        System.out.println("Ingrese 2 palabras: ");
        palabra1 = sc.nextLine();
        palabra2 = sc.nextLine();

        int compareTo = palabra1.compareTo(palabra2);
        int compareToIgnoreCase = palabra1.compareToIgnoreCase(palabra2);
        boolean equals = palabra1.equals(palabra2);

        if (compareTo == 0){
            System.out.println("Para el metodo compareTo las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareTo las frases no son iguales.");
        }

        if (compareToIgnoreCase == 0){
            System.out.println("Para el metodo compareToIgnoreCase las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareToIgnoreCase las frases no son iguales.");
        }

        if (equals){
            System.out.println("Para el metodo compareTo las frases son iguales.");
        }else{
            System.out.println("Para el metodo compareTo las frases no son iguales.");
        }*/


        //Punto 12:

        /*String cadena = "Otorrinolaringología", nuevaCadena;
        nuevaCadena = cadena.substring(3,5);
        System.out.println(cadena);
        System.out.println(nuevaCadena);*/


        //Punto 13:

        /*String cadena1, cadena2;
        System.out.println("Ingrese dos cadenas: ");
        cadena1 = sc.nextLine();
        cadena2 = sc.nextLine();

        if (cadena1.contains(cadena2)){
            System.out.println("La cadena '" + cadena2 + "' si se encuentra dentro de la cadena '" + cadena1 + "'");
        }else{
            System.out.println("La cadena '" + cadena2 + "' no se encuentra dentro de la cadena '" + cadena1 + "'");
        }*/


        //Punto 16:

        /*Double doubleObj = 0.0;
        System.out.println("La variable '" + doubleObj + "' es de tipo objeto.");
        doubleObj.doubleValue();
        System.out.println("Ahora la variable '" + doubleObj + "' es de tipo primitiva.");*/


        //Punto 17:

        /*Date fehcaActual = new Date();
        String fechaFormateada = Funciones.getFechaString(fehcaActual);
        System.out.println("Fecha formateada: " + fechaFormateada);*/


        //Punto 18:

        /*int dia, mes, anio;
        System.out.println("Ingrese día: ");
        dia = sc.nextInt();
        System.out.println("Ingrese mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese año: ");
        anio = sc.nextInt();

        Date fechaDate = Funciones.getFechaDate(dia,mes,anio);
        System.out.println("Fecha tipo Date: " + fechaDate);*/


        //Punto 19:



    }
}
