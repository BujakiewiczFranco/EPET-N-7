package MatrizEmpleados;

import java.util.Scanner;

public class Faltas{

    private Scanner tec;
    private String nombres [];
    private int faltas [];
    private int dias [][];
    private String menos;
    private int Fmenos;

    public void cargar(){

        tec=new Scanner(System.in);
        nombres=new String [3];
        faltas=new int [3];

        for(int f=0;f<3;f++){
            System.out.println("Nombre del empleado "+f+":");
            nombres[f]=tec.next();
            System.out.println("Cuántos días faltó (Ingresar 0 en caso de no tener faltas):");
            faltas[f]=tec.nextInt();
        }

        if(faltas[0]<faltas[1]){
            menos=nombres[0];
            Fmenos=faltas[0];
        } else {
            if(faltas[1]<faltas[2]){
                menos=nombres[1];
                Fmenos=faltas[1];
            } else {
                menos=nombres[2];
                Fmenos=faltas[2];
            }

        }

    }

    public void faltas(){

        dias=new int[3][];

        for(int i=0;i<3;i++){
          dias[i]=new int[faltas[i]];
        }

        for(int f=0;f<dias.length;f++){
            int dia=1;
            for(int c=0;c<dias[f].length;c++){
            dias[f][c]=dia;
            dia=dia+1;
            }
        }
    }

    public void mostrar(){

        System.out.println();
        System.out.println("Días que faltaron:");
        System.out.println();

        for(int f=0;f<dias.length;f++){
            System.out.print(nombres[f]+":");
            if(faltas[f]==0){
                System.out.print("Sin faltas");
            }
            for(int c=0;c<dias[f].length;c++){
                System.out.print(" "+"dia n°"+dias[f][c]);
            }
            System.out.println();
        }

        System.out.println();

       if(faltas[1]==faltas[0]&&faltas[2]==faltas[0]){
           System.out.println("Todos faltaron la misma cantidad de días");
       }else{
           if(faltas[0]==Fmenos&&nombres[0]!=menos){
               System.out.println(nombres[0]+" y "+menos+" Faltaron la menor cantidad de días");
           }else{
               if(faltas[1]==Fmenos&&nombres[1]!=menos){
                   System.out.println(nombres[1]+" y "+menos+" Faltaron la menor cantidad de días");
               }else{
                   if(faltas[2]==Fmenos&&nombres[2]!=menos){
                       System.out.println(nombres[2]+" y "+menos+" Faltaron la menor cantidad de días");
                   }else{
                       System.out.println(menos+" Faltó la menor cantidad de días");
                   }
               }
           }
       }
            }
         }
