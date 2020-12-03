package eti.policarto.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class OrdenandoMain {
    public static void main(String[] args) {
        List<Jogador> time = new LinkedList<>();
        time.add(new Jogador("Guilherme",10));
        time.add(new Jogador("Carlos",11));
        time.add(new Jogador("Leonardo",9));

        // move 1 posi��o para todos
        Collections.rotate(time,1);

        printEscalacao(time);

        // obedece a ordena��o natural da classe Jogado
        Collections.sort(time);

        printEscalacao(time);

        // ordena pelo crit�rio passado como par�metro .class
        time.sort(new OrdenarPorNumero());

        printEscalacao(time);

        // � poss�vel simplificar a express�o anterior com lambdas (fun��es an�nimas)
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
        for (Jogador l : list) {
            System.out.println(l);
        }
        System.out.println("--------");
    }
}
