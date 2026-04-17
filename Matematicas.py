import sys

# Definimos las funciones de operaciones matematicas
def dividir(num1, num2):
    return num1 / num2

def sumar(numeros):
    return sum(numeros)

def restar(numeros):
    if not numeros:
        return 0.0
    resultado = numeros[0]
    for x in numeros[1:]:
        resultado -= x
    return resultado

def multiplicar(numeros):
    if not numeros:
        return 0.0
    resultado = numeros[0]
    for x in numeros[1:]:
        resultado *= x
    return resultado
# Creamos el menú en un bucle infinito que romperemos cuando el usuario lo desee
while True:
    print("\nBienvenido, ¿qué operacion desea realizar?:")
    print("1) Sumar")
    print("2) Restar")
    print("3) Multiplicar")
    print("4) Dividir")
    print("5) Salir")
    
    # Bloque try-except para evitar que el programa falle si el usuario ingresa texto
    try:
        opcion = int(input("Seleccione una opción: "))
    except ValueError:
        print("\n[!] Error: Por favor introduzca un número válido.")
        continue # Vuelve al inicio del bucle while

    if opcion == 4:
        try:
            num1 = float(input("Introduce el primer numero: "))
            while True:
                num2 = float(input("Introduce el segundo numero: "))
                if num2 != 0:
                    break # Salimos del bucle si el divisor es válido
                print("[!] El divisor no puede ser 0")
                
            print("-> El resultado de la división es: ", dividir(num1, num2))
        except ValueError:
             print("\n[!] Error: Debes ingresar un número.")

    elif opcion == 5:
        print("Gracias por utilizar el sistema")
        sys.exit(0)
        
    elif opcion in [1, 2, 3]: # Si la opción es 1, 2 o 3
        try:
            cant = int(input("¿Cuántos números desea utilizar para la operación?: "))
            if cant <= 0:
                print("[!] Debe introducir al menos 1 número.")
                continue
                
            numeros = []
            for _ in range(cant): # Usamos '_' porque no necesitamos el valor del contador
                numeros.append(float(input("Introduce el numero: ")))
                
            if opcion == 1:
                print("-> El resultado de la suma es: ", sumar(numeros))
            elif opcion == 2:
                print("-> El resultado de la resta es: ", restar(numeros))
            elif opcion == 3:
                print("-> El resultado de la multiplicación es: ", multiplicar(numeros))
        except ValueError:
            print("\n[!] Error: Debes ingresar un número válido.")
    else:
        print("\n[!] Opción no válida. Intente de nuevo.")
        
    # Validamos si desea continuar
    try:
        ejecuta = int(input("\n¿Desea continuar utilizando la aplicacion? 1)Si / 2)No: "))
        if ejecuta != 1:
            print("Gracias por utilizar el sistema")
            break # Rompemos el bucle principal while True
    except ValueError:
        print("\nEntrada no válida, cerrando la aplicación...")
        break
