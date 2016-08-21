package Clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by fer on 17/08/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        System.out.println("Por favor ingrese el numero de ejercicio que desea ejecutar (Para ver los problemas escriba 32, para salir cualquier otra cosa)");
        switch (sc.nextInt()){
            case 1:ejercicio1();
                break;
            case 2:ejercicio2();
                break;
            case 3:ejercicio3();
                break;
            case 4:ejercicio4();
                break;
            case 5:ejercicio5();
                break;
            case 6:ejercicio6();
                break;
            case 7:ejercicio7(sc.nextInt());
                break;
            case 8:ejercicio8();
                break;
            case 9:ejercicio9();
                break;
            case 10:ejercicio10();
                break;
            case 11:ejercicio11(sc.nextInt());
                break;
            case 12:ejercicio12(sc.nextInt());
                break;
            case 13:ejercicio13(sc.nextInt());
                break;
            case 14:ejercicio14();
                break;
            case 15:ejercicio15(sc.nextInt());
                break;
            case 16:ejercicio16(sc.nextInt());
                break;
            case 17:ejercicio17(sc.nextInt());
                break;
            case 18:ejercicio18(sc.nextInt());
                break;
            case 19:ejercicio19();
                break;
            case 20:ejercicio20();
                break;
            case 21:ejercicio21();
                break;
            case 22:ejercicio22(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
                break;
            case 23:ejercicio23(sc.nextInt(),sc.nextInt());
                break;
            case 24:ejercicio24(sc.nextInt());
                break;
            case 25:ejercicio2();
                break;
            case 26:ejercicio2();
                break;
            case 27:ejercicio2();
                break;
            case 28:ejercicio2();
                break;
            case 29:ejercicio2();
                break;
            case 30:ejercicio2();
                break;
            case 31:ejercicio2();
                break;
            case 32:ejercicio2();
                break;
            default:System.out.println("adiosito");
                break;
        }
        while(a!=1){
            try {
                System.out.println(sc.nextInt());

            }
            catch (InputMismatchException e){
                a=1;
            }

        }





    }
    /*1. Hacer un programa que imprima los números del 0 al 100*/
    static void ejercicio1(){
        for(int i=0;i<=100;i++){
            System.out.println(i + ", ");
        }
    }
/*2. Hacer un programa que imprima los números del 100 al 0 en orden decreciente*/


    static void ejercicio2(){
        for(int i=100;i>=0;i--){
            System.out.println(i + ", ");
        }
    }

/*3. Hacer un programa que imprima las sumas de los 100 primeros números enteros*/

    static void ejercicio3(){
        int suma=0;
        for(int i=0;i<=100;i++){
            suma=+ i;
        }
        System.out.println(suma);
    }
/*4. Hacer un programa que imprima los números pares entre el 0 al 100*/

    static void ejercicio4(){
        for(int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i + ", ");
            }

        }
    }

/*5. Hacer un programa que imprima los números impares hasta el 100 y que imprima cuantos impares hay*/

    static void ejercicio5(){
        int cant=0;
        for(int i=0;i<=100;i++){
            if (i%2!=0){
                System.out.println(i + ", ");
                cant=+1;
            }

        }
        System.out.println("Cantidad: " +  cant);
    }
/*6. Hacer un programa que imprima los números impares desde el 100 hasta la unidad y que calcule su suma*/

    static void ejercicio6(){
        int sum=0;
        for(int i=100;i>0;i--){
            if (i%2!=0){
                System.out.println(i + ", ");
                sum= sum + i;
            }

        }
        System.out.println("suma: " +  sum);
    }

/*7. Hacer un programa que imprima todos los números naturales que hay desde la unidad hasta un número introducido por teclado*/

    static void ejercicio7(int num){
        for(int i=0;i<=num;i++){
            System.out.println(i + ", ");
        }
    }

/*8. Hacer un  programa que imprima y cuente los múltiplos de 3 que hay entre 1 y 100*/

    static void ejercicio8(){
        int cant=0;
        for(int i=0;i<=100;i++){
            if (i%3==0){
                System.out.println(i + ", ");
                cant= cant+1;
            }

        }
        System.out.println("Cantidad: " +  cant);
    }

/*9. Hacer un programa que calcule la suma de los números impares comprendidos entre el 0 y 100*/

    static int ejercicio9(){
        int sum=0;
        for(int i=100;i>0;i--){
            if (i%2!=0){
                sum= sum + i;
            }

        }
        return sum;
    }
/*10. Hacer un algoritmo que imprima y cuente los múltiplos de 5 que hay entre 1 y 500*/

    static void ejercicio10(){
        int cant=0;
        for(int i=0;i<=500;i++){
            if (i%5==0){
                System.out.println(i + ", ");
                cant= cant+1;
            }

        }
        System.out.println("Cantidad: " +  cant);
    }
/*11. Imprimir, contar y sumar los múltiplos de 2 hasta un número que introducimos por teclado*/

    static void ejercicio11(int num){
        int sum=0,cant=0;
        for(int i=0;i<=num;i++){
            if (i%2==0){
                System.out.println(i + ", ");
                cant=cant+1;
                sum=sum+i;
            }

        }
        System.out.println("cantidad: "+ cant);
        System.out.println("sumatoria: "+sum);
    }
/*12. Imprimir, contar y sumar los múltiplos de 10 hasta un número que introducimos por teclado*/

    static void ejercicio12(int num){
        int sum=0,cant=0;
        for(int i=0;i<=num;i++){
            if (i%10==0){
                System.out.println(i + ", ");
                cant=cant+1;
                sum=sum+i;
            }

        }
        System.out.println("cantidad: "+ cant);
        System.out.println("sumatoria: "+sum);
    }
    /* 13. Introducir un número por teclado menor que 500. Imprimir, sumar y contar los números que están separadas entre si 8 posiciones, desde ese número al 500 */
    static void ejercicio13(int num){
        int sum=0,cant=0;
        if (num<=500){
            for(int i=num;i<=500;i=i+8){

                System.out.println(i + ", ");
                cant=cant+1;
                sum=sum+i;


            }
        }
        System.out.println("cantidad: "+ cant);
        System.out.println("sumatoria: "+sum);
    }

/*14. Calcular la suma de los cuadrados de los números pares entre el 0 y el 100.*/

    static int ejercicio14(){
        int sum=0;
        for(int i=0;i<=100;i++){
            if (i%2==0){
                sum=sum+(i*i);
            }
        }
        return sum;
    }
/*15. Introducir un número por teclado menor que 100.imprimir la suma de los cuadrados de los números que están separados entre sí 4 posiciones.*/

    static int ejercicio15(int num){
        int sum=0;
        for(int i=0;i<=100;i++){
            if (i%4==0){
                sum=sum+(i*i);
            }
        }
        return sum;
    }
/* 16. Introducir un número por teclado que nos diga si es positivo o negativo . */

    static void ejercicio16(int num){
        if (num>=0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
    }
/* 17. Introducir un número por teclado. Que nos diga si es par o impar. */

    static void ejercicio17(int num){
        if (num%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
/*18. Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado*/

    static void ejercicio18(int num){
        int cant=0;
        for(int i=1;i<=num;i++){
            if (i%3==0){
                System.out.println(i + ", ");
                cant=cant+1;
            }

        }
        System.out.println("cantidad: "+ cant);
    }
/* 19. Hacer un programa que imprima los números del 1 al 100 .que calcule la suma de todos los números pares por un lado y otro la de todos los impares. */

    static void ejercicio19(){
        int sump=0,sumi=0;
        for(int i=1;i<=100;i++){
            System.out.print(i + ", ");
            if (i%2==0){
                sump= sump+i;
            }
            else{
                sumi=sumi+i;
            }
        }
        System.out.println();
        System.out.println("Suma de impares: " + sumi);
        System.out.println("Suma de pares: " + sump);
    }

/*20. Imprimir y contar los números que son múltiplos de 2 o 3 que hay del 1 al 100.*/

    static void ejercicio20(){
        int cant2=0,cant3=0;
        for(int i=1;i<=100;i++){
            if (i%3==0){
                System.out.println(i + ", ");
                cant3=cant3+1;
            }
            if (i%2==0){
                System.out.println(i + ", ");
                cant2=cant2+1;
            }

        }
        System.out.println("cantidad Mult 2: "+ cant2);
        System.out.println("cantidad Mult 3: "+ cant3);
    }

/*21. Imprimir y contar los números que son múltiplos de 2 y 3 que hay del 1 al 100.*/

    static void ejercicio21(){
        int cant=0;
        for(int i=1;i<=100;i++){
            if (i%3==0){
                System.out.println(i + ", ");
                cant=cant+1;
            }
            if (i%2==0){
                System.out.println(i + ", ");
                cant=cant+1;

            }

        }
        System.out.println("cantidad Mult 2 Y Mult 3: "+ cant);
    }

/*22. Hacer un programa que imprima el mayor el menor de una serie de cinco números  que vamos introduciendo por teclado.*/

    static void ejercicio22(int n1,int n2,int n3, int n4, int n5){
        int max=n1,min=n1;
        if (max<n2){
            max=n2;
        }
        if (max<n3){
            max=n3;
        }
        if (max<n4){
            max=n4;
        }
        if (max<n5){
            max=n5;
        }
        if (min>n2){
            min=n2;
        }
        if (min>n3){
            min=n3;
        }
        if (min>n4){
            min=n4;
        }
        if (min>n5){
            min=n5;
        }
        System.out.println("Minimo: " + min);
        System.out.println("Máximo: " + max);
    }

/*23. Introducir dos números por teclado. Imprimir los números naturales que hay entre ambos números empezando por el más pequeño, contar cuantos hay y cuántos de ellos son pares. Calcular la suma de los impares.*/

    static void ejercicio23(int num1,int num2){
        int cant=0,cantP=0,sumI=0;
        if (num1>num2){
            int aux=num2;
            num2=num1;
            num1=aux;
        }
        for (int i=num1;num2>=i;i++){
            System.out.print(i + ", ");
            cant = cant +1;
            if (i%2==0){
                cantP=cantP+1;
            }
            else{
                sumI=sumI+i;
            }
        }
        System.out.println();
        System.out.println("Cantidad de numeros: " + cant);
        System.out.println("Cantidad de numeros pares: " + cantP);
        System.out.println("Suma de numeros impares: "+sumI);
    }

/*24. Introducir una serie de números. Decir si esos números son mayores o menores de 10.*/

    static int ejercicio24(int a){
        if (a>10) {
            return 1;
        }
        else if (a<10) {
            return 0;
        }
        else{
            return -1;
        }
    }


/*Prácticos Viernes 12 de Agosto









24. Introducir una serie de números. Decir si esos números son mayores o menores de 10.
25. Introducir tantos números que hay entre el 1 al 100.excepto los múltiplos de 2.
26. Imprimir y sumar los números desde el cero hasta un número determinado, excepto los múltiplos de 5 imprimir el valor de la suma de los múltiplos de 5.
27. Imprimir y contar los números, que son a la vez múltiplos de 2 y 3, que hay entre la unidad y el determinado número.
28. Introducir una serie de números. Sumar los múltiplos  de 5. Cual es el mayor y cuántos números se han introducido.
29. Introducir dos números por teclado de tal forma que el segundo sea mayor que el primero. A partir del primero. Imprimir los números separados. Entre si 7 unidades, contarlos. Cuántos de estos son pares y cuanto vale la suma de los impares.
30. Introducir una cantidad por teclado. Si es menor que 500, sumarle el 50 por ciento; si es mayor o igual a 500 pero menor que 1000, sumarle el 7 por ciento; si es mayor que 1000 y menor o igual a 5000, restarle el 5 por ciento
31. Desarrolle un programa que obtenga un número desde el teclado e imprima por consola los siguientes 100 números de la serie fibonacci */
}
