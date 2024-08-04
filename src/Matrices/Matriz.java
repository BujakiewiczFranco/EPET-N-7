package Matrices;

import java.util.Scanner;

public class Matriz{

    private Scanner tec;
    private int Mat[][];
    private int col;

    public void Martiz5(){

        tec=new Scanner(System.in);
        Mat=new int [5][];

        for(int i=0;i<5;i++){
            col=col+1;
            Mat[i]=new int[col];
        }

        for(int f=0;f<5;f++){
            System.out.println("Fila "+f);
           for(int c=0;c<Mat[f].length;c++){
               System.out.println("Ingresar componente:");
               Mat[f][c]=tec.nextInt();
           }
        }

        for(int f=0;f<5;f++){
            for(int c=0;c<Mat[f].length;c++){
                System.out.print(" "+Mat[f][c]);
            }
            System.out.println();
        }

    }
}
