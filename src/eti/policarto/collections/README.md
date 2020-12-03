# Array

## array
```
int[] numeros = new int[2];
numeros[0] = 10;
``

``
int[] numeros = new int[2]
numeros[0] = new Classe();    
```

Pode guardar primitivos ou refer�ncias. 


# Collections

## ArrayList

```
ArrayList a = new ArrayList();
ArrayList<Tipo> a = new ArrayList();
```

Encapsula um array comum e traz v�rios �ltilit�rios prontos.
Trabalha melhor quando n�o t�m que se remover �ndices.


## Vector

```
Vector a = new Vector();
Vector<Tipo> a = new Vector();
```

Mesmo comportamento do Linked, mas � usado quando se deseja manter a unicidade da lista trabalhando com m�ltiplas threads.


