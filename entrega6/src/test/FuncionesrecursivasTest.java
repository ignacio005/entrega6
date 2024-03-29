package test;
import mates.Funcionesrecursivas;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Ejercicio 28
public class FuncionesrecursivasTest {
    @Test
    void numeropositivo(){
        //1
        int resultado1 = Funcionesrecursivas.suma(10);
        assertEquals(55,resultado1);
        //2
        int resultado2 = Funcionesrecursivas.factorial(5);
        assertEquals(120,resultado2);
        //3
        int resultado3 = Funcionesrecursivas.potencia(3,2);
        assertEquals(8,resultado3);
        //4
        int resultado4 = Funcionesrecursivas.lista(List.of(1,2,3,4));
        assertEquals(10,resultado4);
        //5
        double resultado5 = Funcionesrecursivas.media(List.of(1.0,2.0,3.0,4.0));
        assertEquals(2.5,resultado5);
        //6
        double resultado6 = Funcionesrecursivas.calcularDesviacionTipica(List.of(1.0,2.0,3.0,4.0));
        assertEquals(1.6583123951777,resultado6);
        //7
        int resultado7 = Funcionesrecursivas.sumapares(8);
        assertEquals(20,resultado7);
        //8
        int resultado8 = Funcionesrecursivas.listaenteros(List.of(1,2,3,4));
        assertEquals(6,resultado8);
        //9
        int resultado9 = Funcionesrecursivas.obtenerlistapares(List.of(1,2,3,4));
        assertEquals(List.of(1,2,3,4).size(),resultado9);
        //11
        int resultado11 = Funcionesrecursivas.productoescalar(List.of(1,2,3),List.of(2,4,6));
        assertEquals(28,resultado11);
        //12
        int resultado12 = Funcionesrecursivas.fibonachi(9);
        assertEquals(34,resultado12);
        //13
        String resultado13 = Funcionesrecursivas.cocientefibonachi();
        assertEquals("es " + (double) Funcionesrecursivas.fibonachi(13) /Funcionesrecursivas.fibonachi(12) + " son diferentes",resultado13);
        //14
        double resultado14 = Funcionesrecursivas.relacionfibonachi(9);
        assertEquals(1.6176470588235294,resultado14);

    }
    @Test
    void cero(){
        //1
        int resultado1 = Funcionesrecursivas.suma(0);
        assertEquals(0,resultado1);
        //2
        int resultado2 = Funcionesrecursivas.factorial(0);
        assertEquals(1,resultado2);
        //3
        int resultado3 = Funcionesrecursivas.potencia(0,2);
        assertEquals(1,resultado3);
        //4
        int resultado4 = Funcionesrecursivas.lista(List.of());
        assertEquals(0,resultado4);
        //5
        double resultado5 = Funcionesrecursivas.media(List.of());
        assertEquals(0,resultado5);
        //6
        double resultado6 = Funcionesrecursivas.calcularDesviacionTipica(List.of(1.0));
        assertEquals(0,resultado6);
        //7
        int resultado7 = Funcionesrecursivas.sumapares(0);
        assertEquals(0,resultado7);
        //8
        int resultado8 = Funcionesrecursivas.listaenteros(List.of());
        assertEquals(0,resultado8);
        //9
        int resultado9 = Funcionesrecursivas.obtenerlistapares(List.of());
        assertEquals(List.of().size(),resultado9);
        //10
        int resultado10 = Funcionesrecursivas.listapares(0);
        assertEquals(0,resultado10);
        //11
        int resultado11 = Funcionesrecursivas.productoescalar(List.of(),List.of());
        assertEquals(0,resultado11);


    }

}
