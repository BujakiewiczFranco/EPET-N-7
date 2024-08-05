package TrabajoPractico;

import java.util.Scanner;

public class Ejercicio_1{

    Scanner key=new Scanner(System.in);

    public void Nombrar(){

        /*

        a) Llevar a cabo un programa que incluya un vector que almacene los siguientes nombres:

           Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.

           Realizar un recorrido del vector para cargar los datos y otro recorrido para
           mostrar los mismos por pantalla.

         */

        enum Nombres{
            Alejandra,Leonardo,Rosa,Guillermo,Gabriel,Daniel,Luisa,Ludmila
        }

       String[] nombre;
        nombre=new String[8];
        boolean valid=false;

        for(int n=0;n<nombre.length;n++){

            while(valid){
                System.out.println("Ingresar un nombre:");
                nombre[n]=key.next();
                if(nombre[n].equals(Nombres.values())){
                    valid=false;
            }else{
                    System.out.println("Nombre invalido");
                }

            }
        }

    }

    public void MayMen(){

        /*

        b) Realizar un programa que permita la carga por telcado de 10 números en un vector.
        Una vez cargados, se necesita que el programa determine cual es el mayor y el menor.

         */

        int[] num;
        num=new int[10];

        for(int i=0;i<num.length;i++){
            System.out.println("Ingresar número:");
            num[i]=key.nextInt();
        }

        int may,men;
        may=men=num[0];

        for(int i=0;i<num.length;i++){

         if(num[i]>may){
             may=num[i];
         }

         if(num[i]<men){
             men=num[i];
         }

        }

        System.out.println("El mayor es: "+may+" y el menor es: "+men);

    }

    public void Tres(){

        /*

        c) Realizar un programa que permita la carga por teclado de 15 números en un vector.
        Una vez cargados, se necesita que el programa cuente e informe cuántas veces se cargó
        el número 3 (si es que se cargó alguna vez).

         */

        int[] numeros=new int[15];
        int tres=0;

        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingresar número:");
            numeros[i]=key.nextInt();
            if(numeros[i]==3){
                tres=tres+1;
            }

            System.out.println("Se ingresó el número 3 "+tres+" veces");

        }

    }



}





