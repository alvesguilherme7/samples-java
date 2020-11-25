# java.lang.* | String

O pacote java.lang é sem dúvida o mais importante do Java.
Sem ele é impossível escrever um programa. 

Tão importante que você nem precisa importa-lo.
O compilador já assume isso. 

String é em minha opinião, a classe mais importante.
Você também não conseguirá criar nenhuma aplicação em java sem importar essa classe. 

Ela é tão importante que pode ser instanciada como um ``Object Literal``
Ou seja:
```
String nome = "Mário" 
// ao inves de
String nome2 = new String("Luigi") 
```
Mas, como tudo na vida tem pontos bons e ruins, a classe String é imutável.
Isso muito bom para algumas situação, mas ruins para outras.

Quando se quer criar um longo texto, por exemplo. 
A classe ```StringBuilder``` é a mais indicada para isso. 
Ela não cria um objeto a cada alteração, ao contrário de sua irmã ``String``

Todas as classes estendem de ``Object`` e possuem o metódo ``toString()``,
esse foi criado para ser rescrito. 

Cada classe de seu programa deveria implmentar este metódo e informar o estado de seus atributos mais importantes.

Assim seria possível executar o código de exemplo deste pacote. 
Veja o metódo main. 
