package mates;

import java.util.ArrayList;
import java.util.List;

public class Funcionesrecursivas {
    //1
    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static int sumaMemoria(int n, int i, int acumulado) {
        if (i > n) {
            return acumulado;
        } else {
            return sumaMemoria(n, i + 1, acumulado + i);
        }
    }

    public static int sumavesion2(int n) {
        return sumaMemoria(n, 1, 0);
    }

    //2
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //3
    public static int potencia(int n, int base) {
        if (n == 0) {
            return 1;
        } else {
            return base * potencia(n - 1, base);
        }
    }

    //4
    public static int lista(List<Integer> lista) {
        int n = lista.size();
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }

    }

    //5
    public static double media(List<Double> lista) {
        int n = lista.size();
        if (n == 0) {
            return 0;
        } else {
            double total = (double) n + (double) suma(n - 1);
            return total / (double) n;
        }

    }

    //6
    private static double calcularVarianzaRecursiva(List<Double> lista, double media, int indice) {
        if (indice == lista.size()) {
            return 0;
        }
        double diferencia = lista.get(indice) - media;
        return Math.pow(diferencia, 2) + calcularVarianzaRecursiva(lista, media, indice + 1);
    }

    public static double calcularDesviacionTipica(List<Double> lista) {
        double media = media(lista);
        double varianza = calcularVarianzaRecursiva(lista, media,1);
        return Math.sqrt(varianza);
    }

    //7
    public static int sumapares(int n) {
        if (n <= 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return n + sumapares(n - 1);
            } else {
                return sumapares(n - 1);
            }
        }
    }

    //8
    public static int listaenteros(List<Integer> lista) {
        int n = lista.size();
        if (n == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return n + sumapares(n - 1);
            } else {
                return sumapares(n - 1);
            }
        }
    }

    //9
    public static int obtenerlistapares(List<Integer>lista) {
        int n = lista.size();
        System.out.println("9) La nueva lista de numeros pares es: ");
        if (n % 2 == 0) {
            List<Integer> nuevalista= List.of(sumapares(n - 1),n + sumapares(n - 1));
            System.out.println(nuevalista);
        }
        return n;
    }

    //10
    public static int listapares(int n) {
        int i = 1;
        if (n <= 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return listapares(n - i);
            } else {
                return listapares(n - i);
            }
        }
    }

    //11
    public static int productoescalar(List<Integer>lista1, List<Integer>lista2) {
        if (lista1.isEmpty() || lista2.isEmpty()) {
            return 0;
        } else {
            return lista1.get(0) * lista2.get(0) + productoescalar(new ArrayList<>(lista1.subList(1, lista1.size())), new ArrayList<>(lista2.subList(1, lista2.size())));
        }

    }
    //12
    public static int fibonachi(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }

    }
    //13
    public static String cocientefibonachi() {
        if ((double) fibonachi(13) /fibonachi(12)==1+Math.sqrt(5)/2){
            return "son iguales";
        }else{
            return "es " + (double) fibonachi(13) /fibonachi(12) + " son diferentes";
        }

    }
    //14
    public static Double relacionfibonachi(int n){
        double f1=fibonachi(n);
        double f2=fibonachi(n+1);
        return f2/f1;
    }


}