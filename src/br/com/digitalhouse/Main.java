package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Loteroa dos sonhos
        Map<Integer,String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0,"Ovos");
        loteriaDosSonhos.put(1,"Água");
        loteriaDosSonhos.put(2,"Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4,"Dentista");
        loteriaDosSonhos.put(5,"Fogo");

        for (int chave : loteriaDosSonhos.keySet()){
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));
        }

        //Apelidos dos amigos
        Map<String,List<String>> apelidos = new HashMap<>();
        //João
        List<String> joao = new ArrayList<>();

        joao.add("Juan");
        joao.add("Fissura");
        joao.add("Maromba");

        apelidos.put("João", joao);

        //Miguel
        List<String> miguel = new ArrayList<>();

        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");

        apelidos.put("Miguel", miguel);

        //Maria
        List<String> maria = new ArrayList<>();

        maria.add("Wonder Woman");
        maria.add("Mary");
        maria.add("Marilene");

        apelidos.put("Maria", maria);

        //Lucas
        List<String> lucas = new ArrayList<>();

        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");

        apelidos.put("Lucas", lucas);

        for (String chave: apelidos.keySet()){
            System.out.println("Apelidos do " + chave);
            for (String apelido : apelidos.get(chave)) {
                System.out.println("\t" + apelido);
            }
        }
        
    }
}
