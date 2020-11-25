# java.lang.* | String

O pacote java.lang � sem d�vida o mais importante do Java.
Sem ele � imposs�vel escrever um programa. 

T�o importante que voc� nem precisa importa-lo.
O compilador j� assume isso. 

String � em minha opini�o, a classe mais importante.
Voc� tamb�m n�o conseguir� criar nenhuma aplica��o em java sem importar essa classe. 

Ela � t�o importante que pode ser instanciada como um ``Object Literal``
Ou seja:
```
String nome = "M�rio" 
// ao inves de
String nome2 = new String("Luigi") 
```
Mas, como tudo na vida tem pontos bons e ruins, a classe String � imut�vel.
Isso muito bom para algumas situa��o, mas ruins para outras.

Quando se quer criar um longo texto, por exemplo. 
A classe ```StringBuilder``` � a mais indicada para isso. 
Ela n�o cria um objeto a cada altera��o, ao contr�rio de sua irm� ``String``

Todas as classes estendem de ``Object`` e possuem o met�do ``toString()``,
esse foi criado para ser rescrito. 

Cada classe de seu programa deveria implmentar este met�do e informar o estado de seus atributos mais importantes.

Assim seria poss�vel executar o c�digo de exemplo deste pacote. 
Veja o met�do main. 
