package archivo;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        //CONTROL DE ARCHIVOS

        //CREAR UN ARCHVO

        /** FileWriter filewriter = new FileWriter("demo.txt", false);
         filewriter.write("Esta e sla primera linea");
         filewriter.write("Esta es la segunda linea");

         filewriter.close();

         File file = new File("demo.txt");

         Scanner scanner =  new Scanner(file);
         while (scanner.hasNextLine()) {
         System.out.println(scanner.nextLine());
         }
         **/

        File archivonombres = new File("oscar_age_female.csv");
        FileWriter creoarchivo = new FileWriter("result.txt", true);

        Scanner escanear = new Scanner(archivonombres);
        ArrayList <String[]> filas = new ArrayList<>();

        while (escanear.hasNextLine()) {
           // System.out.println(escanear.nextLine());
            String[] arrayPersona = (escanear.nextLine()).split(",");
            filas.add(arrayPersona);

        }

        String[] cabeceras = filas.get(0);


        /** SOLUCION DE LA PROFE
         *
         */

        // Open file to be written in
        FileWriter writer = new FileWriter("result.txt", true);

        // Open file
        File file = new File("oscar_age_female.csv");

        // Create scanner object to iterate over the file
        Scanner scanner = new Scanner(file);

        // Skip first line
        String data = scanner.nextLine();

        // Iterate over the file
        while (scanner.hasNextLine()) {
            data = scanner.nextLine();
            // Split the line to have each  column
            String[] row = data.split(",");

            // Print on the file
            writer.write("Name: " + row[3] + "\n");
            writer.write("Year: " + row[1] + "\n");
            writer.write("Age: " + row[2] + "\n");
            writer.write("Movie: " + row[4] + "\n");
            writer.write("==================" + "\n");
        }

        // Close buffers
        scanner.close();
        writer.close();
    }
}
