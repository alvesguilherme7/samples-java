# Vetores
Temos dois tipos de vetores, primitivos e por referência.

`` int[] vetor = new int[5]; // vetor de 5 posições primitivo``
<br /><br />
`` ContaCorrente[] contas = new ContaCorrente[2];//// vetor de 5 posições por referência``
 
 Nos primitvos o valor é armazenado, ao contrário das referência que apontam para um espaço no HEAP ( Nome do espaço de memória no Java).
 
 Todos os objetos no Java são criados por referência. 
 Isso signifca que ele existe somente uma vez na memória.
 Mas isso não impede que tenhamos várias variáveis para apontar esse objeto. 
 
 Como no exemplo abaixo:
 
 ````
ContaCorrente contaCorrente = new ContaCorrente(1,1);
        ContaCorrente[] contas = new ContaCorrente[2];
        contas[0] = contaCorrente;
        contas[0].setAgencia(2);
        System.out.println(contaCorrente.getAgencia());
        // A saída será 2
```` 
 
Os vetores, assim como as ``String`` podem ser criados de forma litereal, ou seja:

``int[] vetorLiteral = { 1, 2, 3 };`` ou ``ContaCorrente[] vetorLiteralCC = { null, null, new ContaCorrente(1,1) };``


