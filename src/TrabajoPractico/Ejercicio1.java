package TrabajoPractico;

import java.util.Scanner;

public class Ejercicio1{

    Scanner key=new Scanner(System.in);

    public void Nombrar(){

        /*

        a) Llevar a cabo un programa que incluya un vector que almacene los siguientes nombres:

           Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.

           Realizar un recorrido del vector para cargar los datos y otro recorrido para
           mostrar los mismos por pantalla.

         */

       String[] nombre=new String[8];

        System.out.println("a)");
        System.out.println();

        for(int n=0;n<nombre.length;n++){

            if(n==0){
              nombre[n]="Alejandra";
            }else{
                if(n==1){
                    nombre[n]="Leonardo";
                }else{
                    if(n==2){
                        nombre[n]="Rosa";
                    }else{
                        if(n==3){
                            nombre[n]="Guillermo";
                        }else{
                            if(n==4){
                                nombre[n]="Gabriel";
                            }else{
                                if(n==5){
                                    nombre[n]="Daniel";
                                }else{
                                    if(n==6){
                                        nombre[n]="Luisa";
                                    }else{
                                        nombre[n]="Ludmila";
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

        for(int f=0;f<nombre.length;f++){
                System.out.print(" "+nombre[f]);
        }

    }

    public void MayMen(){

        /*

        b) Realizar un programa que permita la carga por telcado de 10 números en un vector.
        Una vez cargados, se necesita que el programa determine cual es el mayor y el menor.

         */

        System.out.println();
        System.out.println("b)");

        int[] num=new int[10];

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

        System.out.println();
        System.out.println("c)");

        int[] numeros=new int[15];
        int tres=0;

        for(int i=0;i<numeros.length;i++){
            System.out.println("Ingresar número:");
            numeros[i]=key.nextInt();
            if(numeros[i]==3){
                tres=tres+1;
            }

        }

        System.out.println("Se ingresó el número 3 "+tres+" veces");

    }

    public void Promedio(){

        /*

        d) Un empleado desea guardar en un vector sus 12 sueldos del año. A partir de esa
        carga, necesita un programa que determine y muestre por pantalla la suma total de
        sus 12 sueldos y el promedio de sueldo que tuvo en el año.

         */

        System.out.println();
        System.out.println("d)");

        int[] sueldo=new int[12];

        for(int i=0;i<sueldo.length;i++){
            System.out.println("Sueldo del mes "+(i+1));
            sueldo[i]=key.nextInt();
        }

        int total=0;

        for(int i=0;i<sueldo.length;i++){
            total=total+sueldo[i];
        }

        int promedio=total/12;

        System.out.println("El total de sueldo anual es: "+total+"$ y el promedio: "+promedio+"$");

    }

    public void Temperatura(){

        /*

        e) En tres vectores diferentes se guardan los datos de temperaturas máximas y mínimas
        de 5 ciudades de Misiones. En el primer vector se guardan los nombres de las ciudades
        , en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas
        máximas alcanzadas en la última semana. Se necesita un programa que permita la carga
        de las cuidades, sus temperaturas mínimas y máximas; además, deberá poder informar por
        pantalla cual fue la ciudad con la temperatura más baja y cual con la temperatura más
        alta (dando a conocer al mismo tiempo la cantidad de grados).

         */

        System.out.println();
        System.out.println("e)");

        String[] ciudades=new String[5];
        int[] minima=new int[5];
        int[] maxima=new int[5];

        for(int i=0;i<ciudades.length;i++){
            System.out.println("Ingresar ciudad:");
            ciudades[i]=key.next();
            System.out.println("Ingresar su temperatura mínima:");
            minima[i]= key.nextInt();
            System.out.println("Ingresar su temperatura maxima:");
            maxima[i]= key.nextInt();
        }

        int mayor,menor,mayor2,menor2;
        int min=0;
        int max=0;
        int min2=0;
        int max2=0;
        mayor=menor=minima[0];
        mayor2=menor2=maxima[0];

        for(int i=0;i<ciudades.length;i++){

            if(minima[i]>mayor){
                mayor=minima[i];
                max=i;
            }

            if(minima[i]<menor){
                menor=minima[i];
                min=i;
            }

            if(maxima[i]>mayor2){
                mayor2=maxima[i];
                max2=i;
            }

            if(maxima[i]>menor2){
                menor2=maxima[i];
                min2=i;
            }

        }

        if(menor<menor2){
            System.out.println("La ciudad con la temperatura más baja fue: "+ciudades[min]+" con: "+menor+"°C");
        }else{
            System.out.println("La ciudad con la temperatura más baja fue: "+ciudades[min2]+" con: "+menor2+"°C");
        }

        if(mayor>mayor2){
            System.out.println("La ciudad con la temperatura más alta fue:"+ciudades[max]+" con: "+mayor+"°C");
        }else{
            System.out.println("La ciudad con la temperatura más alta fue:"+ciudades[max2]+" con: "+mayor2+"°C");
        }

    }

}





