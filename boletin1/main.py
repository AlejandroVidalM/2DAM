#ej1
print ("Hola mundo")
#Crear dos variables numéricas, sumarlas y mostrar el resultado
var1=1
var2=2
print(var1+var2)
#Mostrar el precio final (con IVA) de un producto con un valor de 100, suponiendo que el IVA es el 21%.
valorProducto=100
porcentaje=21
porciento=100
print(valorProducto*(1+porcentaje/porciento))
#De dos números, saber cual es el mayor.
var1=int(input("Escribe un número: "))
var2=int(input("Escribe otro número: "))
print("El mayor es ",max([var1,var2]))
#Crea una variable numérica y si está entre 0 y 10, mostrar un mensaje indicandolo.
var1=int(input("Escribe un número: "))
r = range(11)
r2 = range(11,21)
r3 = range(21,31)
if var1 in r:
    print("tu numero está entre 0 y 10")
#Añadir al anterior ejercicio, que si está entre 11 y 20, muestre otro mensaje diferente y si está entre 21
# y 30 otro mensaje.
elif var1 in r2:
    print("tu numero está entre 10 y 20")
elif var1 in r3:
    print("tu numero está entre 20 y 30")
#Mostrar con un while los números del 1 al 100.
var1=0
while var1<100:
    var1+=1
    print(var1)
#Mostrar con un for los números del 1 al 100.
for i in range(1,101):
    print(i)
#Implementar un programa en Python que pida un número indeterminado de cadenas de caracteres
# por el teclado, y cuando se finalice dicha introducción, muestre el listado de palabras.
cadena=input("Introduzca un texto: ")
print(cadena.split())
#Realiza la misma operación del ejercicio anterior pero con números
cadena=input("Introduzca un número: ")
print(list(cadena))
#Escribe un programa que pida primero un número entero y después pida
# números enteros hasta que la suma de los números introducidos coincida con el número inicial.
# El programa termina escribiendo la lista de números.
limite=int(input("Introduzca el límite: "))
lista=[]
suma=0
while limite>suma:
    var1=int(input("Escribe un número: "))
    lista.append(var1)
    suma+=var1
print(lista)
#Escribe un programa que genere un número aleatorio entre 0 y 10 y nos pida adivinarlo Tenemos 3 intentos.
from random import randrange
vidas=3
aleatorio=randrange(11)
print(aleatorio)
while vidas!=0:
    var1=int(input("Escribe un número: "))
    if var1==aleatorio:
        print("Victoria")
        vidas=0
    else:
        vidas-=1
        print("Te quedan ",vidas,"intentos")
#Implementa una función que calcule el factorial de un número.
# Recuerda que el factorial de un número es el producto de todos los números desde ese número hasta 1.
# Por ejemplo, el factorial de 3, 3!, es 6
var1=int(input("Introduzca un numero: "))
factorial=1
for i in range(var1):
    factorial=factorial*(i+1)
print("factorial: ",factorial)
#Crea una función en python, triangulo, que reciba un número entero, e imprima un patrón
# como este por pantalla. Este sería el resultado de llamar a triangulo(5)
def triangulo(longitud):
    for i in range(longitud):
        print("*"*(i+1))
    for i in reversed(range(longitud)):
        print("*"*(i))
triangulo(5)
#Escribe un programa en python que, dada una lista (y haciendo uso de la función type)
# imprima cada elemento de la lista, indicando su tipo.
lista=[1,"1","hola",5.6,'test',-15,True]
for i in lista:
    print(i," es de tipo ",type(i))
#Escribe un programa que sea capaz de escribir los N primeros números de la sucesión de fibonacci.
cantidad=int(input("Escribe la cantidad de elementos que desea ver de la sucesion de fibonacci: "))
a=1
b=0
c=1
n=1
while cantidad>0:
#Utilizar end para terminar en espacio en vez de en salto de linea
    print(c,end=" ")
    c=a+b
    b=a
    a=c
    cantidad-=1
#Escribe un programa en Python que, dada una lista de elementos, nos muestre la misma pero sin elementos duplicados (investiga, y verás que es muy fácil)
lista_original=[1,3,6,3,5,2,1,4]
lista_nueva = []
for i in lista_original:
    if i not in lista_nueva:
        lista_nueva.append(i)
print(lista_nueva)
#Escribe un programa que, de forma indefinida, nos permita jugar a piedra, papel, tijera
# (y si te atreves, lagarto, Spock) contra el ordenador.
indefinido=True
while indefinido==True:
    aleatorio=randrange(3)
    lista=["piedra","papel","tijera"]
    print("▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲")
    print("▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼")
    print("Elige")
    print("1=piedra, 2=papel, 3=tijera")
    jugador=int(input())-1
    print("================================")
    print("Jugador VS EnemyRandRange")
    print(lista[jugador]," VS ",lista[aleatorio] )
    if jugador-aleatorio==-1 or jugador-aleatorio==2:
        print("Pierdes")
    elif jugador-aleatorio==-2 or jugador-aleatorio==1:
        print("Ganas")
    elif jugador==aleatorio:
        print("Empate")
