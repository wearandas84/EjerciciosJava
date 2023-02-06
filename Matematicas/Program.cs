using System;

namespace Matematicas
{
    class Program
    {
        //Declaramos las funciones para las distintas operaciones matematicas
        public double Sumar(double[] numeros, int cant){
            double resultado = 0;
            for(int i = 0; i < cant; i++){
                resultado += numeros[i];
            }
            return resultado;
        }

        public double Restar(double[] numeros, int cant){
            double resultado = 0;
            for(int i = 0; i < cant; i++){
                //Si es el primer numero lo almacenamos para evitar falsos negativos por variable inicilizada en 0
                if(i == 0){
                    resultado = numeros[i];
                }
                else {
                    resultado -= numeros[i];
                }               
            }
            return resultado;
        }

        public double Multiplicar(double[] numeros, int cant){
            double resultado = 0;
            for(int i = 0; i < cant; i++){
                //Si es el primero numero almacenamos para evitar falsas multiplicaciones por 0, por variable inicializada en 0
                if(i == 0){
                    resultado = numeros[i];
                }
                else {
                    resultado *= numeros[i];
                }               
            }
            return resultado;
        }
        
        public double Dividir(double num1, double num2){
            double resultado;
            resultado = num1 / num2;
            return resultado;
        }
        static void Main(string[] args)
        {
            int ejecuta = 1;
            //Creamos un menu dentro del un loop While para que la aplicacion se mantenga en ejecucion mientras el usuario lo requiera
            while(ejecuta == 1){
                Console.WriteLine("Bienvenido al sistema, selecciona un opcion: ");
                Console.WriteLine("1)Sumar");
                Console.WriteLine("2)Restar");
                Console.WriteLine("3)Multiplicar");
                Console.WriteLine("4)Dividir");
                Console.WriteLine("5)Salir");
                int opcion;
                Program oper = new Program();
                opcion = System.Convert.ToInt32(Console.ReadLine());
                if(opcion == 5){
                    System.Environment.Exit(0);
                } else {
                    //Si la opcion es division esta solo se permite para 2 numeros.
                    if(opcion == 4){
                        double num1, resultado;
                        double num2 = 0;
                        Console.WriteLine("Introduce el primer numero: ");
                        num1 = System.Convert.ToDouble(Console.ReadLine());
                        while(num2 == 0){
                            Console.WriteLine("Introduce el segundo numero: ");
                            num2 = System.Convert.ToDouble(Console.ReadLine());
                            //Se valida que el divisor no sea negativo.
                            if(num2 == 0){
                                Console.WriteLine("El divisor no puede ser 0");
                            }
                        }
                        resultado = oper.Dividir(num1, num2);
                        Console.WriteLine("El resultado de la division es: " + resultado);
                    } else {
                        Console.WriteLine("¿Cuantos numeros utilizara para la operacion?: ");
                        //Se genera un array del tamaño de numeros proporcionados.
                        int cant = System.Convert.ToInt32(Console.ReadLine());
                        double[] numeros = new double[cant];
                        for(int i = 0; i < cant; i++){
                            //Se almacenan los numeros en el array
                            Console.WriteLine("Introduce el numero: ");
                            numeros[i] = System.Convert.ToDouble(Console.ReadLine());
                        }
                        //Mediante un switch se llaman las funciones de operacion de acuerdo a la funcion.
                        switch(opcion){
                            case 1:
                                double suma = oper.Sumar(numeros, cant);
                                Console.WriteLine("El resultado de la suma es: " + suma);
                                break;
                            
                            case 2:
                                double resta = oper.Restar(numeros, cant);
                                Console.WriteLine("El resultado de la suma es: " + resta);
                                break;
                            
                            case 3:
                                double multiplica = oper.Multiplicar(numeros, cant);
                                Console.WriteLine("El resultado de la suma es: " + multiplica);
                                break;
                        }
                    }
                }
                Console.WriteLine("¿Desea continuar ejecutando la aplicacion? 1)Si/2No: ");
                ejecuta = System.Convert.ToInt32(Console.ReadLine());
                //Se valida si el usuario quiere seguir ejecutando la aplicacion
                if(ejecuta == 2){
                    Console.WriteLine("Gracias por utilizar la aplicacion");
                    System.Environment.Exit(0);
                }
            }
            
        }
    }
}