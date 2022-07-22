package com.portfolio.cv.Service;

import com.portfolio.cv.Interface.IExperienciaService;
import com.portfolio.cv.Model.Experiencia;
import com.portfolio.cv.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public void createExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        return experienciaRepository.getById(id);
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
}
