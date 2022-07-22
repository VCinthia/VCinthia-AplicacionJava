package com.portfolio.cv.Service;

import com.portfolio.cv.Interface.IEstudioService;
import com.portfolio.cv.Model.Estudio;
import com.portfolio.cv.Repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class EstudioService implements IEstudioService {
    @Autowired
    public EstudioRepository estudioRepository;

    @Override
    public List<Estudio> getEstudio() {
        return estudioRepository.findAll();
    }

    @Override
    public void createEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }

    @Override
    public void deleteEstudio(Long id) {
        estudioRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
        return estudioRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }    
}
