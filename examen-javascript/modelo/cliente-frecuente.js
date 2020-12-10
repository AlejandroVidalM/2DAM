
const moment = require("moment");
console.log(moment());
class ClienteFrecuente{
    constructor(cliente, listaFechas){
        this.cliente=cliente;
        this.listaFechas=fechas;
    }
    get cliente(){
        return this.cliente;
    }
    cliente(cliente){
        this.cliente=cliente;
    }
    get listaFechas(){
        return this.listaFechas;
    }
    listaFechas(listaFechas){
        this.listaFechas=listaFechas;
    }
    getNumAparcamientosEnBono(){
        return this.listaFechas.length;
    }
    addAparcamiento(){
        if(this.getNumAparcamientosEnBono<10){
            this.listaFechas.push(moment());
            return true;
        }else{
            return false;
        }
    }
    tieneAparcamientoGratis(){
        if(this.getNumAparcamientosEnBono>10){
            return true;
        }
        else{
            return false;
        }
    }
    usarAparcamientoGratis(){
        if(this.tieneAparcamientoGratis){
            this.listaFechas.slide(0,10);
        }
    }
}
export{ClienteFrecuente};