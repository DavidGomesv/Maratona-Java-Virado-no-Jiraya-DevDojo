package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;

        // +, -, *, /

        System.out.println( numero02 + numero01 + " Valor: " + numero02 + numero01);
        System.out.println(resultado);

        // %

        double resto = 20 %2;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=

        boolean is1020 = 10 < 20;
        boolean is1010 = 10 <= 20;
        boolean is1030 = 10 > 20;
        boolean is1040 = 10 >= 20;
        boolean is1050 = 10 == 20;
        boolean is1060 = 10 != 20;

        System.out.println(is1010);
        System.out.println(is1020);
        System.out.println(is1030);
        System.out.println(is1040);
        System.out.println(is1050);
        System.out.println(is1060);



    }
}
