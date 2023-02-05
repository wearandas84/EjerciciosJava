//Importamos la clase Scanner para poder leer desde la linea de comandos
import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args){
        int opcion, cant;
        int ejecuta = 1;
        double num1;
        double num2 = 0;
        /*Inicializamos un objeto de la clase Matematicas 
        para tener acceso a las funciones de operacion*/
        Matematicas oper = new Matematicas();
        /* Inicializamos el Scanner para leer desde linea de comandos */
        Scanner lector = new Scanner(System.in);
        while(ejecuta == 1){
            //Creamos un menu, el cual se ejecutara mientras hasta que el usuario desee salir
            System.out.println("Bienvenido seleccione la operacion que desea realizar:");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            opcion = lector.nextInt();
            //Para el caso de la division solo se permite para 2 numeros.
            if(opcion == 4){
                System.out.println("Introduce el primer numero:");
                num1 = lector.nextDouble();
                //Se valida que el divisor no sea 0
                while(num2 == 0){
                    System.out.println("Introduce el segundo numero:");
                    num2 = lector.nextDouble();
                    if(num2 == 0){
                        System.out.println("El divisor no puede ser 0");
                    }
                }
                double resultado = oper.division(num1, num2);
                System.out.println("El resultado de la division es: "+ resultado);
            } else {
                //En caso de elegir salir se imprime mensaje, cerramos el lector y detenemos la ejecucion.
                if(opcion == 5){
                    System.out.println("Gracias por utilizar la herramienta");
                    lector.close();
                    System.exit(0);
                } else {
                    /*Si se selecciona una operacion de Suma, Resta o Multiplicacion, se solicita la
                     cantidad de numeros con los cuales se desea ejecutar.*/
                    System.out.println("¿Cuantos numeros desea utilizar para la operacion?:");
                    cant = lector.nextInt();
                    /* Se inicializa un arreglo de numeros doubles para precision decimal en el cual se
                       almacenan los numeros con un ciclo for utilizando el indice. */
                    double[] numeros = new double[cant];
                    for(int i = 0; i < cant; i++){
                        System.out.println("Introduce el numero:");
                        numeros[i] = lector.nextDouble();
                    }
                    /* Con un switch dependiendo de la opcion seleccionada se ejecuta una funcion para la operacion. */
                    switch(opcion){
                        case 1:
                            System.out.println("El resultado de la Suma es:" + oper.sumar(numeros, cant));
                            break;
                        case 2:
                            System.out.println("El resultado de la Resta es:" + oper.restar(numeros, cant));
                            break;
                        case 3:
                            System.out.println("El resultado de la Multiplicacion es:" + oper.multiplicar(numeros, cant));
                            break;
                    }
                }                  
            }
            System.out.println("¿Desea continuar ejecutando la aplicacion? 1)Si/2)No");
            ejecuta = lector.nextInt();
        }
        System.out.println("Gracias por utilizar la herramienta");
        lector.close();
        
    }


    //Creamos las funciones matematicas para realizar las operaciones.
    public double sumar(double[] numeros, int cant){
        double resultado=0;
        for(int i = 0; i < cant; i++){
            resultado += numeros[i];
        }
        return resultado;
    }

    public double restar(double[] numeros, int cant){
        double resultado=0;
        for(int i = 0; i < cant; i++){
            if(i == 0){
                //Si es el primer numero se almacena en la variable resultado y a partir del segundo se resta para evitar errores.
                resultado = numeros[i];
            } else {
                resultado -= numeros[i];
            }
            
        }
        return resultado;
    }

    public double multiplicar(double[] numeros, int cant){
        double resultado=0;
        for(int i = 0; i < cant; i++){
            if(i == 0){
                //Si es el primer numero se almacena en la variable resultado y a partir del segundo se multiplica para evitar errores.
                resultado = numeros[i];
            } else {
                resultado *= numeros[i];
            }
            
        }
        return resultado;
    }

    public double division(double num1, double num2){
        double resultado;
        resultado = num1 / num2;
        return resultado;
    }
}