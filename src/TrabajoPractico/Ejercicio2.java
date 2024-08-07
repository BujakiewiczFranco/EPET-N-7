package TrabajoPractico;

import java.util.Scanner;

public class Ejercicio2{

    Scanner key=new Scanner(System.in);

    public void Cinco(){

        /*

        a) Llevar a cabo un programa que permita cargar completamente con números 5 una
        matriz de 4x5 (4 filas, 5 columnas)

        */

        System.out.println("a)");
        System.out.println();

        int[][] cinco=new int [4][5];

        for(int f=0;f<cinco.length;f++){
            for(int c=0;c<cinco.length;c++){
                cinco[f][c]=5;
            }

    }

        for(int f=0;f<cinco.length;f++){
            System.out.println();
            for(int c=0;c<cinco.length;c++){
                System.out.print(cinco[f][c]);
            }

        }

}

 public void Perros(){

        /*

  b) Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3x3 (3 filas,
  3 columnas) con razas de perros. Una vez cargada la misma, sera necesario hacer un recorrido
  por la misma y mostrar los datos cargados por pantalla.

  */

     System.out.println("b)");
     System.out.println();

     String[][] razas=new String[3][3];

   for(int f=0;f<razas.length;f++){
       for(int c=0;c<razas.length;c++){
           System.out.println("Ingresar una raza:");
           razas[f][c]=key.next();
       }
   }

     System.out.print("Las razas ingresadas fueron:");
     for(int f=0;f<razas.length;f++) {
         for (int c=0;c<razas.length;c++) {
             System.out.print(" "+razas[f][c]);
         }
     }

 }

 public void Alumnos() {

        /*

        c) En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
        secundario. Cada fila corresponde a las notas y al promedio de cada alumno.

        Se necesita un programa que permita a un profesor cargar en las primeras 3 posiciones
        de cada fila las notas del alumno y que en la última columna se calculen los promedios

        Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y promedio
        correspondiente recorriendo la matriz

         */

     System.out.println("c)");
     System.out.println();


     double[][] notas=new double[4][4];


     for (int f=0;f<notas.length;f++) {
         System.out.println("Alumno n°"+(f+1));
         for (int c =0;c<3;c++) {
             System.out.println("Nota del trimestre n°" + (c + 1)+":");
             notas[f][c]=key.nextDouble();
         }
     }

     for (int f=0;f<notas.length;f++) {
         for (int c=0;c<3;c++) {
             notas[f][3]=notas[f][3]+notas[f][c];
         }
     }

     for (int f=0;f<notas.length;f++) {
        notas[f][3]=notas[f][3]/3;
     }

     System.out.println("         T1  T2  T3  Pro");

     for(int f=0;f<notas.length;f++){
         System.out.print("Alumno "+(f+1));
         for(int c=0;c<notas.length;c++){
             System.out.print(" "+notas[f][c]);
         }
         System.out.println();
     }

 }

}