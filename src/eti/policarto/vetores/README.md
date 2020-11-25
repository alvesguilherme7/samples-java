# Vetores
Temos dois tipos de vetores, primitivos e por refer�ncia.

`` int[] vetor = new int[5]; // vetor de 5 posi��es primitivo``
<br /><br />
`` ContaCorrente[] contas = new ContaCorrente[2];//// vetor de 5 posi��es por refer�ncia``
 
 Nos primitvos o valor � armazenado, ao contr�rio das refer�ncia que apontam para um espa�o no HEAP ( Nome do espa�o de mem�ria no Java).
 
 Todos os objetos no Java s�o criados por refer�ncia. 
 Isso signifca que ele existe somente uma vez na mem�ria.
 Mas isso n�o impede que tenhamos v�rias vari�veis para apontar esse objeto. 
 
 Como no exemplo abaixo:
 
 ````
ContaCorrente contaCorrente = new ContaCorrente(1,1);
        ContaCorrente[] contas = new ContaCorrente[2];
        contas[0] = contaCorrente;
        contas[0].setAgencia(2);
        System.out.println(contaCorrente.getAgencia());
        // A sa�da ser� 2
```` 
 
Os vetores, assim como as ``String`` podem ser criados de forma litereal, ou seja:

``int[] vetorLiteral = { 1, 2, 3 };`` ou ``ContaCorrente[] vetorLiteralCC = { null, null, new ContaCorrente(1,1) };``


