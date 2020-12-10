const moment = require("moment");
class Cliente{
    constructor(nombre, apellidos, fechaDeNacimiento, email, matricula){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.email=email;
        this.matricula=matricula;
    }
    get nombre(){
        return this.nombre;
    }
    nombre(nombre){
        this.nombre=nombre;
    }
    get apellidos(){
        return this.apellidos;
    }
    apellidos(apellidos){
        this.apellidos=apellidos;
    }
    get fechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
    fechaDeNacimiento(fechaDeNacimiento){
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
    get email(){
        return this.email;
    }
    email(email){
        this.email=email;
    }
    get matricula(){
        return this.matricula;
    }
    matricula(matricula){
        this.matricula=matricula;
    }
    get edad(){
        return moment().diff(this.fechaDeNacimiento,'y');
    }
}
export{cliente};