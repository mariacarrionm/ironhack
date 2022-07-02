package com.ironhack;

public class main {
    public static void main(String[] args) {

        //tipo de datos //


        String var2 = "Helo World";
        int var3 = 1;
        int var4 = -1;
        double var5 = 1.53;
        boolean var6 = true;
        float var7 = 7000;

        //operadores//

        System.out.println(1 + 2);
        System.out.println(1 - 5);
        System.out.println(1 * 2);
        System.out.println(1 / 5);
        System.out.println(11 % 5);

        int edad1 = 20;
        int edad2 = 30;

        if (edad1 > edad2) {
            System.out.println("la Edad1 es myor que la Edad2");
        } else if (edad1 == edad2) {
            System.out.println("Las edades son iguales");
            System.out.println("Las edades son iguales");

        } else {
            System.out.println("la edad1 es menos que la edad2");
        }
        String today = "tuesday";
        switch (today) {
            case "monday":
                System.out.println("hoy es lunes");
                break;
            case "tuesday":
                System.out.println("hoy es martes");
                break;
            case "wednesday":
                System.out.println("hoy es miercoles");
                break;
            case "thursday":
                System.out.println("hoy es jueves");
                break;
            case "friday":
                System.out.println("hoy es viernes");
                break;
            case "saturday":
                System.out.println("hoy es sabado");
                break;
            case "sunday":
                System.out.println("hoy es domingo");
                break;
            default:
                System.out.println("Esto no e sun dia d ela semana");
                break;
        }
        System.out.println(concatenateStrings("my name is", "maria"));
        System.out.println(productFormatter(" la frase ", " el dia hoy "));
        System.out.println(Math.pow(2,3));
    }

    //FIN DEL METODO MAIN//


// METODO DE CONCATENAR FRASE//

    public static String concatenateStrings(String word1, String word2) {
        return word1 + word2;
    }

//METODO EJERCICIO CON ESTE ENUNCIADO//
/**--------------
Create a method named productFormatter that receives a String name productName
and a String date as parameters.
This method should return the productName trimmed, change spaces by _
and append the date at the end of the string. The result must be given in uppercase.
-----------*/

//SOLUCION DEL EJERCICIO CON ESTE ENUNCIADO//
    public static String productFormatter(String productname, String date) {
        return (productname.trim().concat(date)).replace(" ","_").toUpperCase();
    }


    //atajos//
    //Alt + shif con una linea seleccionada y botones de arriba abajo//
    //Control + D duplicar filas//
    //COntrol + flecha hacia los lados"//


}
