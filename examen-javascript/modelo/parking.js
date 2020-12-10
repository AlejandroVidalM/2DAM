import { ClienteFrecuente } from "./cliente-frecuente";

class Parking{
    constructor(plazasTotales){
        this.listaPLazas=[];
        this.crearListaPlazas(plazasTotales);
        this.plazasTotales=plazasTotales;
        this.plazasDisponible=plazasTotales;
    }
    crearListaPlazas(plazasTotales){
        for(let i = 0; i<this.plazasTotales; i++){
            this.listaPLazas.push(new PlazaAparcamiento(i+1,true));
        }
    }
    get listaPLazas(){
        return this.listaPLazas;
    }
    listaPLazas(listaPLazas){
        this.listaPLazas=listaPLazas;
    }
    get plazasTotales(){
        return this.plazasTotales;
    }
    plazasTotales(plazasTotales){
        this.plazasTotales=plazasTotales;
    }
    get plazasDisponible(){
        return this.plazasDisponible;
    }
    plazasDisponible(plazasDisponible){
        this.plazasDisponible=plazasDisponible;
    }
    aparcar(cliente){
        for(let i of this.listaPLazas){
            let continuar=true;
            if(i.estaLibre() && continuar){
                continuar=false;
                i.cliente=cliente;
                i.estaLibre=false;
                if(typeof(cliente)==ClienteFrecuente){
                    cliente.addAparcamiento();
                }
            }
        }
    }
    desaparacar(numeroPLaza, cliente){
        if(this.listaPLazas[numeroPLaza].estaLibre){
            
        }
    }
}