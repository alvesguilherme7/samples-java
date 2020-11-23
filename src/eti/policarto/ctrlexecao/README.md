
# Controle de Exce��es em Java

## Veja a classe Main. 

O controle de exce��es � primordial para toda e qualquer aplica��o.
Principalmente no mundo Web.

O controle dessas, evitam que nossa aplica��o pare abruptamente,
sem tratar ou fornecer um feedback m�nimo ao usu�rio.

Dominar o controle de exce��es � criar aplica��es preparadas para o mundo real.

## A Heran�a no controle de exe��es | Uncheked e Cheked

A classe m�e das exce��es em java � a ```java.lang.Throwable``` .
Existem duas divis�es para o tratamentos delas, s�o:
   1. Uncheked;
   2. Cheked.

Antes de falar sobre esses dois tipos, vamos falar sobre a heran�a envolvida nos n�veis inferiores.
Funciona assim:

![Heran�a Exce��es](./imgs/1.PNG)

Logicamente, existem outras classes, mas essas s�o suficientes para eu me expressar.
```java.lang.Throwable``` � a classe capaz de lan�ar objetos na fila de execu��o do java.
Objetos de erros e/ou exce��es.

Logo ap�s vem a classe ```java.lang.Exception```.
Voc� pode criar suas pr�prias exce��es estendendo dessa classe.
Se voc� estender diretamente dessa classe, ter� uma exce��o do tipo Checked.
Isso significa que em tempo de escrita voc� j� sabe que ali pode ocorrer um problema.
Sabendo disso, o compilador te "obriga" a realizar um tratamento.

O Java possui in�meras classes de exce��es nativas.
Algumas delas s�o ckekeds e outras unchekeds.
Um exemplo de unchekeds � a famosa  ```java.lang.NullPointerException```.
Essa s� fica "vis�vel" em tempo de execu��o.
As IDEs te ajudam a evitar em tempo de escrita, mas quem nunca passou por essa, que atire a primeira pedra.

Por acontecer em tempo de execu��o ela � unchekeds.
O compilador n�o vai te obrigar a trat�-la, pois na teoria ele n�o sabe que ela pode acontecer.

Outro exemplo � a ```java.lang.IllegalStateException```,
percebe pela imagem que essa estende primeiramente da classe
```java.lang.RuntimeException```.

Voc� deve evitar criar exce��es que j� existem na API nativa do Java.
Quando for necess�rio, crie exce��es que descrevam o problema pelo seu nome.
Para uma boa legibilidade, sempre adicione Exception no final.
```MinhaException```

## Fechando recursos de forma inteligente

Al�m de evitar que o programe se encerre de forma inesperada, o controle de exce��es nos ajuda a
controlar melhor os recursos utilizados pela a aplica��o.
Por exemplo, conex�es com o banco, tokens de api e etc.
Para isso al�m do try e o catch, temos  o finally.
O finally sempre � executado, independente se ocorreu erro ou n�o.
Ideal para conex�es externas a aplica��o. 

A API nativa do Java, ap�s a vers�o 1.7, tem uma forma mais inteligente de fechar os recursos.
Com o try-with-resources.
Veja sobre a classe ``java.lang`.AutoCloseable``

## Escrevendo melhor

Utilize o controle de exce��es para diminuir a complexibilidade de seus c�digos.
Menos ifs, menos decis�es em tempo de execu��o.
As exce��es interrompem o fluxo da aplica��o, use isso ao seu favor.

````
if(saldo > 0 ){
   // voc� pode sacar
}else{
  // voc� N�O pode sacar
}

````

por

````
if(saldo < 0 )
   throw new Exception("Voc� n�o pode sacar.");
//Voc� pode sacar
````