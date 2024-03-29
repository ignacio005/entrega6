import mates.Funcionesrecursivas;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        System.out.println("1) La suma de los 10 primeros numeros naturales es: " + Funcionesrecursivas.suma(10));
        System.out.println("1.1) La suma de los 10 primeros numeros naturales es: " + Funcionesrecursivas.sumavesion2(10));
        System.out.println("2) El factorial del 5 es " + Funcionesrecursivas.factorial(5));
        System.out.println("3) La potencia n-esima de un número es " + Funcionesrecursivas.potencia(3,2));
        List<Integer> l = List.of(1,2,3,4);
        List<Double> l2 = List.of(1.0,2.0,3.0,4.0);
        System.out.println("4) La suma de los elementos de la lista es " + Funcionesrecursivas.lista(l));
        System.out.println("5) La media de los elementos de la lista es " + Funcionesrecursivas.media(l2));
        System.out.println("6) La desviación tipica es " + Funcionesrecursivas.calcularDesviacionTipica(l2));
        System.out.println("7) La suma de los primeros numeros pares hasta n asumiendo n ≥ 2 es " + Funcionesrecursivas.sumapares(8));
        System.out.println("8) La suma de los elementos pares de una lista de enteros " + Funcionesrecursivas.listaenteros(l));
        Funcionesrecursivas.obtenerlistapares(l);
        System.out.println("10) La lista de los primeros números pares hasta n asumiendo n ≥ 2 son: " + Funcionesrecursivas.listapares(9));
        List<Integer> l3 = List.of(1,2,3);
        List<Integer> l4 = List.of(2,4,6);
        System.out.println("11) El producto escalar es " + Funcionesrecursivas.productoescalar(l3,l4));
        System.out.println("12) El elemento n-ésimo de la sucesión de Fibonacci " + Funcionesrecursivas.fibonachi(9));
        System.out.println("13) El cociente entre el decimo tercer y el decimo segundo elemento " + Funcionesrecursivas.cocientefibonachi());
        System.out.println("14) La relación entre la sucesión de Fibonacci y la razón áurea es " + Funcionesrecursivas.relacionfibonachi(9));
    }
}