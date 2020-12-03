package eti.policarto.collections;

import java.util.*;

public class OrdenandoMain {
    public static void main(String[] args) {
        List<Jogador> time = new LinkedList<>();
        time.add(new Jogador("Guilherme",10));
        time.add(new Jogador("Carlos",11));
        time.add(new Jogador("Leonardo",9));

        // move 1 posição para todos
        Collections.rotate(time,1);

        printEscalacao(time);

        // obedece a ordenação natural da classe Jogado
        Collections.sort(time);

        printEscalacao(time);

        // ordena pelo critério passado como parâmetro .class
        time.sort(new OrdenarPorNumero());

        printEscalacao(time);

        // podemos usar também classes anônimas
        time.sort(new Comparator<Jogador>() {
            @Override
            public int compare(Jogador o1, Jogador o2) {
                return o1.getNumero() - o2.getNumero();
            }
        });

        // simplicar com uma expressão lambda
        time.sort((o1,o2) -> o1.getNumero() - o2.getNumero());

        // simplificando mais ainda
        time.sort(Comparator.comparingInt(Jogador::getNumero));

        printEscalacao(time);

    }

    public static class OrdenarPorNumero implements Comparator<Jogador> {

        @Override
        public int compare(Jogador o1, Jogador o2) {
            return o1.getNumero() - o2.getNumero();
        }
    }

    public static void printEscalacao(List<Jogador> list){
        System.out.println("--------");
        list.forEach(System.out::println);
        System.out.println("--------");
    }
}
