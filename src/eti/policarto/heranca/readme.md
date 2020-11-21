# Heren�a em Java
Todas as vezes que voc� cria uma classe em java, voc� j� est� usando heran�a e, talvez, nem saiba. 

Como assim ? Todas as classes em java herdam da classe ```java.lang.Object```. 
Como isso j� � implicito voc� n�o precisa verbalizar no c�digo. 

Alguma vez na vida voc� j� usou o met�do ```toString()```.
E alguma vez lembra de te-lo criado ?
Pois �, esse met�do foi criado na classe ```java.lang.Object``` e como estendemos dessa classe (mesmo sem verbalizar), esse met�do j� fica dispon�vel para uso. 

O uso de heran�a nos permitir reutilizar c�digos da nossa aplica��o e nos garante a possibilidade de usar o Poliorfismo. 

Poliofirmo � a capacidade de se criar refer�ncias para determiando objeto, atrav�s do tipo mais gen�rico. 
```
Object objeto = new QualquerClasse()
```

Object pode receber a refer�ncia de qualquer classe. 
Isso nos traz a possibilidade de reaproveirar determinados comportamentos na aplica��o. 
Traz maior legibildiade e facilita (e muito) a manuten��o. 

N�o h� espa�o para c�digo repetido em Java :)

Veja os exemplos de c�digo para entender melhor.

```
public class Filho {

}

public class Main {
    public static void main(String[] args) {
        Filho souFilhoDeObject = new Filho();
        souFilhoDeObject.toString();
    }
}

Console -> eti.policarto.heranca.Filho@1b6d3586

```

Perceba que a classe Filho n�o possui o met�do ```toString()```, 
mas � poss�vel acessar por que ela herda este met�do da classe m�e (```java.lang.Object```)


Agora vamos sobrescrever o met�do ```toString()```.

````
public class Filho {
    @Override
    public String toString() {
        return "Fa�o parte da classe Filho.";
    }
}

public class Main {
    public static void main(String[] args) {
        Filho souFilhoDeObject = new Filho();
        System.out.println(souFilhoDeObject.toString());
    }
}

Console -> Fa�o parte da classe Filho.

````

Agora, mesmo que eu uso o Poliorfismo, o comportamento ser� o mesmo.


````
public class Filho {
    @Override
    public String toString() {
        return "Fa�o parte da classe Filho.";
    }
}

public class Main {
    public static void main(String[] args) {
        Object souFilhoDeObject = new Filho();
        System.out.println(souFilhoDeObject.toString());
    }
}

Console -> Fa�o parte da classe Filho.

````

Repare que eu refenciei o ```Filho``` com o tipo mais gen�rico, que � o ```Object```.
Mesmo assim pude acessar o met�do ```toString``` do ```Filho```. 
Neste c�digo n�o fica evidente, mas a� est� um dos maiores benef�cios da heran�a. 

A capacidade de se criar comportamentos gen�ricos para serem aplicados em diversos cen�rios.