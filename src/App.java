import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("Mi nombre es Mateo");
        System.out.println("Un gusto poder conocerte");// se puede poner soaut y asi lo hace mas rapido
        /*Asi de puede comentar todo el codigo xd
          eset comentario es de multimple linea*/
        //variables 
        //enteros 
        byte entero = 12;//byte de -128 a 127
        System.out.println("numero entero:" +entero);

        short entero2 = 12456;// -32768 a 32767
        System.out.println("numero entero: " +entero2);

        int entero3 = 456532; // é muito extenso, deposito muitas variables
        System.out.println("numeroentero3: " +entero3);

        long entero4 = 452453453; //é muito extenso, e que mes almacena
        System.out.println("numeroentero4: " +entero4);




        //decimales
        double decimal1 = 45.656565; //almazena números decimais
        System.out.println("Primer decimal: "+decimal1);
        
        float decimal2 = 4.46f; //almazena números decimais petite
        System.out.println("Segundo decimal: " +decimal2);



        //caracteres

        char caractere = 'a'; //cualquier caracter der teclado
        System.out.println("Caracter: " +caractere);

        //boolean 
        boolean desicion = true; // desicion saber si algo es verdadero o falso 
        System.out.println("Esto es: " +desicion);



        //Tipos de datos no primitivos

        Integer numero=null; //armazena qualquer numero alem de nulo
        System.out.println("el numero es:" +numero);

        String palabra="Hola que tal?"; //armazena cadeias de caracteres
        System.out.println(palabra);

        // constantes 

        final int num = 10; // o número será o mesmo durante todo o programa

        System.out.println(num);

        //Entrada de dados 
        int dato;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        dato = entrada.nextInt();
        System.out.println("El numero es: "+dato);

        
    }

  }

