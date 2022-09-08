package academy.devdojo.maratonajava.introducao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Aula02TiposPrimitivos {


    public static void main(String[] args) {

        //PRIMITIVOS
        int idade = 1000000000;
        int id = (int) 100000000000l;//casting
        long numeroGrande = 100000l;
        double salarioDouble = 2000.0d;
        float salarioFloat = 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("idade" + idade);
        System.out.println(falso);
        System.out.println(caractere);

        //STRINGS

        String nome = "nome";
System.out.println(nome);

    }


}
