import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args){
        int opcion, cant;
        int ejecuta = 1;
        double num1, num2;
        Matematicas oper = new Matematicas();
        Scanner lector = new Scanner(System.in);
        while(ejecuta == 1){
            System.out.println("Bienvenido seleccione la operacion que desea realizar:");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("5) Salir");
            opcion = lector.nextInt();
            if(opcion == 4){
                System.out.println("Introduce el primer numero:");
                num1 = lector.nextDouble();
                System.out.println("Introduce el segundo numero:");
                num2 = lector.nextDouble();
                double resultado = oper.division(num1, num2);
                System.out.println("El resultado de la division es: "+ resultado);
            } else {
                if(opcion == 5){
                    System.out.println("Gracias por utilizar la herramienta");
                    lector.close();
                    System.exit(0);
                } else {
                    System.out.println("¿Cuantos numeros desea utilizar para la operacion?:");
                    cant = lector.nextInt();
                    double[] numeros = new double[cant];
                    for(int i = 0; i < cant; i++){
                        System.out.println("Introduce el numero:");
                        numeros[i] = lector.nextDouble();
                    }
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