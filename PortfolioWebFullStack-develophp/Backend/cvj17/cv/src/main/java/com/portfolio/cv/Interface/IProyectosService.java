package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.Proyectos;
import java.util.List;

public interface IProyectosService {
    public List<Proyectos> getProyectos();
    
    public void createProyectos(Proyectos proyecto);
    public void deleteProyectos(Long id);
    public Proyectos findProyectos(Long id);
    public void saveProyectos(Proyectos proyecto);
}
