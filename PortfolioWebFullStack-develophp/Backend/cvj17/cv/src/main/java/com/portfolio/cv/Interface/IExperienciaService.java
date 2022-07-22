package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    
    public void createExperiencia(Experiencia experiencia);    
    public void deleteExperiencia(Long id);    
    public Experiencia findExperiencia(Long id);    
    public void saveExperiencia(Experiencia experiencia);
}
