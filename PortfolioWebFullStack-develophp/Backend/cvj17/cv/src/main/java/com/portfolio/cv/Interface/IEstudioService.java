package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.Estudio;
import java.util.List;

public interface IEstudioService {
    public List<Estudio> getEstudio();
    
    public void createEstudio(Estudio estudio);    
    public void deleteEstudio(Long id);    
    public Estudio findEstudio(Long id);    
    public void saveEstudio(Estudio estudio);
}
