package com.portfolio.cv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    public Skills() {}
    
    @Id 
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private byte porcentaje;
    private String nombre;
    

    public Skills(Long id, byte porcentaje, String nombre) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.nombre = nombre;
    }    
}
