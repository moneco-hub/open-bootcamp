package intro_programacion_ejercicio_tema_03;

public class Main {
    public static void main(String[] args) {
        //PRIMERA PARTE
        //Crear una función con tres parámetros que sean números que se suman entre sí.
        //Llamar a la función en el main y darle valores.
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;

        int suma = sum(num1, num2, num3);

        System.out.println("La suma es:" + suma);


        //SEGUNDA PARTE
        //Crear una clase coche.
        //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        //Una función que incremente el número de puertas que tiene el coche.
        //Crear un objeto miCoche en el main y añadirle una puerta.
        //Mostrar el número de puertas que tiene el objeto.

        Coche miCoche = new Coche();
        miCoche.incrementar_puertas();
        System.out.println("El número de puertas que tiene el coche es:" + miCoche.numero_puertas);
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

}


