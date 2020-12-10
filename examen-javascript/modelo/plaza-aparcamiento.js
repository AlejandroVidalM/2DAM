class PlazaAparcamiento{
    constructor(numeroPlaza,estaLibre,cliente,fecha){
        this.numeroPlaza=numeroPlaza;
        this.estaLibre=estaLibre;
        this.cliente=cliente;
        this.fecha=fecha;
    }
    get numeroPlaza(){
        return this.numeroPlaza;
    }
    numeroPlaza(numeroPlaza){
        this.numeroPlaza=this.numeroPlaza;
    }
    get estaLibre(){
        return this.estaLibre;
    }
    estaLibre(estaLibre){
        this.estaLibre=this.estaLibre;
    }
    get cliente(){
        return this.cliente;
    }
    cliente(cliente){
        this.cliente=this.cliente;
    }
    get fecha(){
        return this.fecha;
    }
    fecha(fecha){
        this.fecha=this.fecha;
    }
    ocupar(cliente){
        if(this.estaLibre){
            this.cliente=cliente;
            return true;
        }else{
            return false;
        }
    }
    liberar(){
        if(this.estaLibre){
            return false;
        }else{
            this.cliente=null;
            return true;
        }
    }
}