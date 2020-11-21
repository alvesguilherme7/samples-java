# Herença em Java
Todas as vezes que você cria uma classe em java, você já está usando herança e, talvez, nem saiba. 

Como assim ? Todas as classes em java herdam da classe ```java.lang.Object```. 
Como isso já é implicito você não precisa verbalizar no código. 

Alguma vez na vida você já usou o metódo ```toString()```.
E alguma vez lembra de te-lo criado ?
Pois é, esse metódo foi criado na classe ```java.lang.Object``` e como estendemos dessa classe (mesmo sem verbalizar), esse metódo já fica disponível para uso. 

O uso de herança nos permitir reutilizar códigos da nossa aplicação e nos garante a possibilidade de usar o Poliorfismo. 

Poliofirmo é a capacidade de se criar referências para determiando objeto, através do tipo mais genêrico. 
```
Object objeto = new QualquerClasse()
```

Object pode receber a referência de qualquer classe. 
Isso nos traz a possibilidade de reaproveirar determinados comportamentos na aplicação. 
Traz maior legibildiade e facilita (e muito) a manutenção. 

Não há espaço para código repetido em Java :)

Veja os exemplos de código para entender melhor.

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

Perceba que a classe Filho não possui o metódo ```toString()```, 
mas é possível acessar por que ela herda este metódo da classe mãe (```java.lang.Object```)


Agora vamos sobrescrever o metódo ```toString()```.

````
public class Filho {
    @Override
    public String toString() {
        return "Faço parte da classe Filho.";
    }
}

public class Main {
    public static void main(String[] args) {
        Filho souFilhoDeObject = new Filho();
        System.out.println(souFilhoDeObject.toString());
    }
}

Console -> Faço parte da classe Filho.

````

Agora, mesmo que eu uso o Poliorfismo, o comportamento será o mesmo.


````
public class Filho {
    @Override
    public String toString() {
        return "Faço parte da classe Filho.";
    }
}

public class Main {
    public static void main(String[] args) {
        Object souFilhoDeObject = new Filho();
        System.out.println(souFilhoDeObject.toString());
    }
}

Console -> Faço parte da classe Filho.

````

Repare que eu refenciei o ```Filho``` com o tipo mais genêrico, que é o ```Object```.
Mesmo assim pude acessar o metódo ```toString``` do ```Filho```. 
Neste código não fica evidente, mas aí está um dos maiores benefícios da herança. 

A capacidade de se criar comportamentos genêricos para serem aplicados em diversos cenários.