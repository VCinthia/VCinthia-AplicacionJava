package com.portfolio.cv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    
    public Estudio() {}
    
    @Id 
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String institucion;
    private String  titulo;
    private String periodo;    
    private String descripcion;

    

    public Estudio(Long id, String institucion, String titulo , String periodo, String descripcion) {
        this.id = id;
        this.institucion = institucion;
        this.titulo = titulo;
        this.periodo = periodo;        
        this.descripcion = descripcion;
    }  
}