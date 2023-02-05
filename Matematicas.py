import sys

# Definimos las funciones de operaciones matematicas
def dividir(num1, num2):
    resultado = float(num1 / num2)
    return resultado

def sumar(numeros):
    resultado = float(0)
    for x in numeros:
        resultado = resultado + float(x)
    return resultado

def restar(numeros):
    resultado = float(0)
    cont = int(0)
    for x in numeros:
        if cont == 0:
            resultado = float(x)
        else:
            resultado = resultado - float(x)
        cont += 1
    return resultado

def multiplicar(numeros):
    resultado = float(0)
    cont = int(0)
    for x in numeros:
        if cont == 0:
            resultado = float(x)
        else:
            resultado = resultado * float(x)
        cont += 1
    return resultado
# Creamos un menu para que el usuarios elija la operacion y el cual se ejecutara mientras el usuario no seleccione la opcion para salir
ejecuta = int(1)
while ejecuta == 1:
    print("Bienvenido, que operacion desea realizar:")
    print("1)Sumar")
    print("2)Restar")
    print("3)Multiplicar")
    print("4)Dividr")
    print("5)Salir")
    opcion = int(input())
    num2 = float(0)
    # Para la opcion de division solo se puede realizar entre 2 numeros
    if opcion == 4:
        num1 = float(input("Introduce el primer numero:"))
        # Generamos un ciclo para validar que no se hagan divisiones con divisor 0
        while num2 == 0:
            num2 = float(input("Introduce el segundo numero:"))
            if num2 == 0:
                print("El divisor no puede ser 0")
        print("El resultado de la division es: ", dividir(num1, num2))
    elif opcion == 5:
        print("Gracias por utilizar el sistema")
        sys.exit(0)
    else:
        # Se genera un array con la cantidad de numeros que el usuario introduzca
        cant = int(input("¿Cuantos numero desea utilizar para la operacion?: "))
        numeros = []
        for i in range(cant):
            numeros.append(float(input("Introduce el numero: ")))
        # Se realizan las llamadas a las funciones dependiendo de la operacion seleccionada
        if opcion == 1:
            print("El resultado de la suma es: ", sumar(numeros))
        elif opcion == 2:
            print("El resultado de la resta es: ", restar(numeros))
        elif opcion == 3:
            print("El resultado de la multiplicacion es: ", multiplicar(numeros))
        
    ejecuta = int(input("¿Desea continuar utilizando la aplicacion: 1)Si/2)No "))
    
            



