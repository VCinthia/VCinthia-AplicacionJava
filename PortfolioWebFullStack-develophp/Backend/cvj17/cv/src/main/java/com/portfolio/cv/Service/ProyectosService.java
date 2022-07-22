package com.portfolio.cv.Service;

import com.portfolio.cv.Interface.IProyectosService;
import com.portfolio.cv.Model.Proyectos;
import com.portfolio.cv.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{
    @Autowired
    public ProyectosRepository proyectosRepository;
    
    @Override
    public List<Proyectos> getProyectos(){
        return proyectosRepository.findAll();
    }
    
    @Override
    public void createProyectos(Proyectos proyecto){
        proyectosRepository.save(proyecto);
    }
    
    @Override
    public void deleteProyectos(Long id){
        proyectosRepository.deleteById(id);
    }
    
    @Override
    public Proyectos findProyectos(Long id){
        return proyectosRepository.findById(id).orElse(null);
    }
    
    @Override
    public void saveProyectos(Proyectos proyecto){
        proyectosRepository.save(proyecto);
    }
}
