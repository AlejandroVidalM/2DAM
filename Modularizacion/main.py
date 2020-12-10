from funciones2 import *
import model.entidades
import servicios.service.empleado_service as empleadoServ
saludar("Alejandro")
despedir("Alejandro")

p= model.entidades.Persona("Alejandro", "Vidal Marín")
e= model.entidades.Empleado("Alejandro", "Ramirez", "2000")
es=empleadoServ.Empleado_service()
print(e)
#servicios.service.empleado_service.Empleado_service.calcular_retenciones(e)
print(es.calcular_retenciones(290))

