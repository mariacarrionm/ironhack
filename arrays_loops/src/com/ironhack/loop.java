package com.ironhack;

public class loop {
    public static int[] ) {
        int[] numList = {4, 1, 3, 2, 5};
        int sum = 52;
        int suma = 0;

        for (int x = 0; x < numList.length; x++) {
            suma += numList[x];
        }
/**
        int sumaArray = numList[0]; // es 4 porque es la primera posicion del array
        for (int i : numList) { // declaras una variable del mismo tipo que el array y a continuacion el array que vas a recorrer
            if (i < sum) // i empieza siendo 4, ¿es 1 mayor que 1? -> no. Por lo que no se ejecuta la logica del if
                // luego preguntas ¿es i menor que minNum?
                //¿es 1 menor que 1? -> no. Por lo que no se ejecuta la logica del if

                maxNum = i;// Siguiente vuelta: i es ahora 5
            //  preguntas ¿es i mayor maxNum?
            //¿es 5 mayor que 1? -> Si. Se ejecuta la logica del if y numMax toma el valor 5.

            if (i < minNum)// luego preguntas ¿es i menor que minNum?
                //¿es 5 menor que 1? -> no. Por lo que no se ejecuta la logica del if
                //  Y se repite hasta el último número del array
                minNum = i;
        }
**/
        System.out.println(suma);
    }
}
// Insert solution code here
