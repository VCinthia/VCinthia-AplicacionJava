package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Traer una lista de persona
    public List<Persona> getPersona(); 
    //Crear un objeto del tipo Persona
    public void createPersona(Persona persona); 
    //Guardar un objeto del tipo Persona
    public void savePersona(Persona persona);    
    //Eliminar una persona por ID
    public void deletePersona(Long id);    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
