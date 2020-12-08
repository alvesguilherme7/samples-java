package eti.policarto.charset;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String nome = "Sérgio Camarão";//UTF_8

        byte[] bytes = nome.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println(new String(bytes)); //SÃ©rgio CamarÃ£o

        System.out.println(new String(bytes, StandardCharsets.UTF_8)); //Sérgio Camarão

    }
}
