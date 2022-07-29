package com.portfolio.cv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    public Proyectos() {}
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String imagen;
    private String url;
    @Size(min =1, max = 600, message = "Por favor cumplir con la longitud")
    private String descripcion;    

    public Proyectos(Long id, String nombre, String imagen, String url, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.url = url;
        this.descripcion = descripcion;
    }    
}