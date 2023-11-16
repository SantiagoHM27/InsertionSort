Insertion Sort

El ordenamiento por inserción (Insertion Sort) es un algoritmo de ordenamiento simple que funciona de manera similar a cómo las personas ordenan las cartas en sus manos al jugar póker.

Imagina que tienes una mano de cartas desordenadas. Para ordenarlas, tomas una carta a la vez y la insertas en su lugar correcto entre las cartas que ya has ordenado en tu otra mano. Repites este proceso hasta que todas las cartas estén ordenadas en tu otra mano.

    Funciona de la siguiente manera:

    tenemos una serie de numeros (9 ,6, 4, 2, 3)
    el orden comienza diviendo el arreglo en 2 partes, la primera es la del primer digito y la segunda es la de los demas.

    entonces comienza regulando, en este caso el primer numero es el 9, ¿9 es mayor que 6? Si, entonces avanza una, posteriormente hara lo mismo con  todos y cada uno de los valores de la lista. El orden quedaria de la siguiente manera: (6, 4, 2, 3, 9).

    Continua lo mismo con el ahora nuevo primer digito que es el 6, ¿6 es mayor que 4?. si, avanza, continua con los otros dos digitos hasta que llega con el 9 y como es menor queda junto, el orden seria de la siguiente manera: (4, 2, 3, 6, 9)

    el mismo proceso se hace con los digitos restantes y el resultado final seria el siguiente: (2, 3, 4, 6, 9)

    terminando el ordenamiento de manera satisfactoria.

    Ventajas:
    1. Simple de implementar: El algoritmo de ordenamiento por inserción es fácil de entender e implementar.

    2. Eficiente para listas pequeñas: Para listas pequeñas, el ordenamiento por inserción puede ser más rápido que otros algoritmos de ordenamiento más complejos como el ordenamiento rápido (quicksort) o el ordenamiento por mezcla (mergesort).

    Desventajas:
    1. Ineficiente para listas grandes: El ordenamiento por inserción tiene una complejidad de tiempo de O(n^2) en el peor de los casos, lo que lo hace ineficiente para listas grandes.

    2.Dependiente de la entrada: Aunque el ordenamiento por inserción es eficiente para listas parcialmente ordenadas, su rendimiento puede disminuir significativamente para listas que están en orden inverso.