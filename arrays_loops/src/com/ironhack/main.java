package com.ironhack;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {  //si pones main te sale la opcion de que te pinte el methodo main
        int[] numbers = {0, 1, 2, 3, 4};
       new loop();
        //tamaño del array es fijo, no puede haber mas elementos que los declarados, si menos si no se ponen
        // solo se puede usar un tipo de dato en el array, no varios.
        //para saber el tamaño es un atributo del array no un metodo, como aqui abajo hago

        System.out.println(numbers.length);

        // otra forma de inicializar el array, que nos reserve en memoria 10 posiciones en las que voy a poner 10 enteros

        int[] numbers2 = new int [10];

        System.out.println(numbers2[0]);

        numbers2[0] = 1;

        String [] words = new String[10];
        System.out.println(words[1]);
        words[1] = "Hello";

// lista de array o array list nos permite modificar el tamaño de los arrays

        ArrayList<String> wordlist = new ArrayList<>();

        //AÑADIR ELEMENTOS

        wordlist.add("hello");
        wordlist.add(1, "hi");
        wordlist.add(1, "hi2");
        System.out.println(wordlist.get(0));
        System.out.println(wordlist.get(1));
        System.out.println(wordlist.get(2));

        //SUSTITUIR ELEMENTOS
        wordlist.set(1,"another word");
        System.out.println(wordlist.size());
        System.out.println(wordlist.get(1));

        //BUCLE FOR //
        // siempre 3 argumentos,
        // 1 . donde queremos que empiece, donde instanciamos nuestro indice,
        //2. la condicion que cuando se deja de cumplir se acaba el bucle
        // 3. como aumenta el bucle

        for (int x = 0; x < wordlist.size(); x++){
            System.out.println(wordlist.get(x));
        }

        // BUCLE WHILE ////
        //SOLO ACEPTA UN UNICO PARAMETRO, el que dice la condicion de cuando para el índice

        int i = 0;
        while ( i < wordlist.size()) {
            System.out.println(++i);
        }

        //POR NOMENCLATURA SE SUELE PONER, cuando hay un indice la i, dos indices la j y tres indices la k

        // BUCLE DO WHILE

        int j =  0;
        do {
            System.out.println(j++);
        } while (1 == 0);

        // FOR EACH  - NI IDEAAA

        for(String word : wordlist){
            System.out.println(word);
        }


        //EJERCICIO la variable es la posicon en la que entras a recorrer el indice

        int[] AInicial = {5, 4, 3, 2, 1};
        int[] ANuevo = new int[AInicial.length];

        for (int x = 0 ; x < AInicial.length ; x++) {
            int m = x+1;
            if(m < AInicial.length) {
                ANuevo[x] = AInicial[x] * AInicial[m];
            }
            else {
                ANuevo[x] = AInicial[x] * AInicial[0];
            }
            //AInicial[x] =
        }

        // FOR EACH

        for(int numero : ANuevo){
            System.out.println(numero);
        }

        //for (int x = AInicial.length ;  ; x--) {



        //int[] Array1 = {1, 2, 3, 4, 5};



    }


}
