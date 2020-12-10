class Persona():
    def __init__(self, nombre, apellidos):
        self.nombre=nombre
        self.apellidos=apellidos

class Empleado(Persona):

    def __init__(self, nombre, apellidos, sueldo):
        super().__init__(nombre, apellidos)
        self.sueldo=sueldo

    def __str__(self):
        return f"{self.nombre} {self.apellidos} sueldo: {self.sueldo}"
