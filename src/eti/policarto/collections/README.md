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

Pode guardar primitivos ou referências. 


# Collections

## ArrayList

```
ArrayList a = new ArrayList();
ArrayList<Tipo> a = new ArrayList();
```

Encapsula um array comum e traz vários últilitários prontos.
Trabalha melhor quando não têm que se remover índices.


## Vector

```
Vector a = new Vector();
Vector<Tipo> a = new Vector();
```

Mesmo comportamento do Linked, mas é usado quando se deseja manter a unicidade da lista trabalhando com múltiplas threads.


