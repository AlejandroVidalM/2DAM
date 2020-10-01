package com.vidal.ejemploJPA.servicios.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServicioBaseImpl <T, ID, R extends JpaRepository<T, ID>>implements ServicioBase<T, ID>{

    @Autowired
    R repositorio;

    @Override
    public T findById(ID, id){
        return repositorio.findById();
    }
    public List<T> findAll(){
        return repositorio.findByAll();
    }
    public void edit(T, t){
        return; repositorio.save();
    }

}
