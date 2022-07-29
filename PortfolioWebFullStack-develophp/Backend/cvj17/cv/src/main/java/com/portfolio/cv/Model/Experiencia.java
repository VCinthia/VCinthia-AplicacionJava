package com.portfolio.cv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    public Experiencia() {}
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long  id;    
    @NotNull
    private String periodo;
    @NotNull
    private String puesto;
    @NotNull
    @Size(min =1, max = 600, message = "Por favor cumplir con la longitud")
    private String descripcion;

    

    public Experiencia(Long id, String periodo, String puesto, String descripcion) {
        this.id = id;
        this.periodo = periodo;
        this.puesto = puesto;
        this.descripcion = descripcion;
    }   
}