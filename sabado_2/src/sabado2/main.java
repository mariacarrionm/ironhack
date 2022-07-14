package sabado2;

import java.io.FileWriter;
import java.util.Scanner;

public class main {


    /**Terminal Commands Linux
     *
     *
     pwd (print working directory) Writes the full pathname of the current working directory to the standard output.
     cd (change directory) Change the current working directory.
     cd .. Allow you to move to the parent directory.
     ls (list) List the contents (except hidden files) of a directory or directories given to it via standard input.
     ls -a (list) List the contents (including hidden files) of a directory or directories given to it via standard input.
     ls -l List the contents (except hidden files) with their attributes of a directory or directories given to it via standard input.
     ls -la List the contents including hidden files with their attributes.
     clear Clear the console (terminal) shortcut ctrl + L
     mkdir <directory name> (make directory) Create a directory
     touch <file name> Create a file
     cat <file name> Display file content on the console (terminal)
     history Show historic of used command
     rm <file name> (remove) Delete file
     Terminal Commands Windows
     cd Change the current working directory.
     dir List the contents.
     cls Clear the console.
     md o mkdir Create a directory.
     copy con archivo.txt Create a file.
     type Display file content on the console.
     rd Delete directory.
     del Delete file.**/

    /**
     * Git Commands
     * <p>
     * <p>
     * init Create staging (on RAM) and a local repository (.git folder)
     * add Add untracked files to staging
     * rm Remove files from staging
     * status Show files changes
     * commit Adds changes from staging to the repo versioning
     * push Upload commits to a remote branch
     * checkout get a branch
     * branch create a branch
     * pull download commits from remote branch
     * clone clones a repo
     * remote add origin add a remote repo
     **/

    public static void main(String[] args) {
        /**     Scanner scanner = new Scanner(System.in); // inicializamos la clase que nos permite meter datos por consola

         System.out.println("please introduce tu nombre");
         String name = scanner.nextLine();
         System.out.println("Hello " + name);

         System.out.println("how old are you?");
         int age = scanner.nextInt();

         while (age < 0 || age > 130) {
         System.err.println("No es valida la edad. Vuelve a insertala");
         age = scanner.nextInt();
         }
         if (age >= 18) {
         System.out.println("welcome");
         } else {
         System.out.println("sorry no puedes acceder");
         }
         **/
        /** Create a program that reads from standard input a string and prints the count of the words that starts with
         a vowel. Skipping all the words how doesn't start with a vowel and print it as an error. **/

        Scanner scanner = new Scanner(System.in);


        System.out.println("introduce la frase que quieras");
        String frase = scanner.nextLine();

        String[] arraySentence = frase.split(" ");
        int contar = 0;
        //EMPEZAMOS UN BUCLE FOR EACH, SE VE que es for each CON LOS ":" que se usan. VAMOS A RECORRER UN lista de STRINGS, por eso empezamos por string.
        // Le damos un nombre que queramos para llamar asi a cada string que vamos a recorrer del array
        // y ponemos ":" y el array que vamos a recorrer
        for (String palabra : arraySentence) {
            if (palabra.startsWith("a")
                    || palabra.startsWith("e")
                    || palabra.startsWith("i")
                    || palabra.startsWith("o")
                    || palabra.startsWith("u")){
             contar = contar + 1;
            } else {
                System.err.println("es un error");
                //System.err.println(palabra);
            }
        }
        System.out.println(contar);
    }





}
