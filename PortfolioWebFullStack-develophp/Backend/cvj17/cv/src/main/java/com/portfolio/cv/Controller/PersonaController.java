package com.portfolio.cv.Controller;

import com.portfolio.cv.Interface.IEstudioService;
import com.portfolio.cv.Interface.IExperienciaService;
import com.portfolio.cv.Model.Persona;
import com.portfolio.cv.Interface.IPersonaService;
import com.portfolio.cv.Interface.IProyectosService;
import com.portfolio.cv.Interface.ISkillsService;
import com.portfolio.cv.Interface.ISocialHeaderService;
import com.portfolio.cv.Model.Estudio;
import com.portfolio.cv.Model.Experiencia;
import com.portfolio.cv.Model.Proyectos;
import com.portfolio.cv.Model.Skills;
import com.portfolio.cv.Model.SocialHeader;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
@CrossOrigin(origins="*")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    @Autowired IEstudioService iestudioService;
    @Autowired IExperienciaService iexperienciaService;
    @Autowired IProyectosService iproyectosService;
    @Autowired ISkillsService iskillsService;
    @Autowired ISocialHeaderService isocialheaderService;
    
    
// Modelo: persona -----------------------------------
    
    @GetMapping("/api/portfolio/personas/ver")
    public List<Persona> getPersona () {
        return ipersonaService.getPersona();
    }
    
    @PostMapping ("/api/portfolio/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue cargada correctamente";
    }
    
    @DeleteMapping("/api/portfolio/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    //URL: puerto/persona/editar/
    @PutMapping ("/api/portfolio/personas/editar/{id}")
    public Persona editPersona(
            @PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("img") String nuevoImg,
            @RequestParam("rol") String nuevoRol,
            @RequestParam("sobremi") String nuevoSobremi){
        Persona persona = ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        persona.setRol(nuevoRol);
        persona.setSobremi(nuevoSobremi);
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/api/portfolio/personas/ver/perfil/{id}")
    public Persona findPersona(@PathVariable Long id){
        return ipersonaService.findPersona(/*(long)1*/id);
    }
// Modelo: Estudio ---------------------------------------
    
    @PostMapping("/api/portfolio/estudio/crear")
    @ResponseBody
    public String createEstudio(@RequestBody Estudio estudio ){
        iestudioService.createEstudio(estudio);
        return "El estudio fue cargado correctamente";
    }     
    @GetMapping("/api/portfolio/estudio/ver")//para ver todos los estudios
    @ResponseBody    
    public List<Estudio> getEstudio(){
        return iestudioService.getEstudio();
    }
    @DeleteMapping ("/api/portfolio/estudio/delete/{id}")
    public void deleteEstudio ( @PathVariable Long id){
        iestudioService.deleteEstudio(id);
    }
    @PutMapping("/api/portfolio/estudio/save")
    public String saveEstudio(@RequestBody Estudio estudio ){
        iestudioService.saveEstudio(estudio);
        return "El estudio fue guardado correctamente";
    } 
    //Editar por Id
    @PutMapping ("/api/portfolio/estudio/editar/{id}")
    public Estudio editEstudio(
            @PathVariable Long id,
            @RequestParam("institucion") String nuevoInstitucion,
            @RequestParam("titulo") String nuevoTitulo,            
            @RequestParam("periodo") String nuevoPeriodo,
            @RequestParam("descripcion") String nuevoDescripcion){
        Estudio estudio = iestudioService.findEstudio(id);
        estudio.setInstitucion(nuevoInstitucion);
        estudio.setTitulo(nuevoTitulo);
        estudio.setPeriodo(nuevoPeriodo);
        estudio.setDescripcion(nuevoDescripcion);
        iestudioService.saveEstudio(estudio);
        return estudio;
    }
    
// Modelo: Experiencia -----------------------------------
    //falta ver experiencia por Id
    @PostMapping("/api/portfolio/experiencia/crear")
    @ResponseBody
    public String createExperiencia(@RequestBody Experiencia experiencia ){
        iexperienciaService.createExperiencia(experiencia);
        return "La experiencia fue cargada correctamente";
    } 
    @GetMapping("/api/portfolio/experiencia/ver")
    @ResponseBody    
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    @DeleteMapping ("/api/portfolio/experiencia/delete/{id}")
    public void deleteExperiencias ( @PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
    }
    @PutMapping("/api/portfolio/experiencia/save")
    public String saveExperiencias(@RequestBody Experiencia experiencia ){
        iexperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue guardada correctamente";
    }
// Modelo: Proyectos -------------------------------------
    //falta ver proyectos por Id
    @PostMapping("/api/portfolio/proyectos/crear")
    @ResponseBody
    public String createProyectos(@RequestBody Proyectos proyectos ){
        iproyectosService.createProyectos(proyectos);
        return "El proyecto fue cargado correctamente";
    }
    @GetMapping("/api/portfolio/proyectos/ver")
    @ResponseBody    
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    @DeleteMapping ("/api/portfolio/proyectos/delete/{id}")
    public void deleteProyectos ( @PathVariable Long id){
        iproyectosService.deleteProyectos(id);
    }
    @PutMapping("/api/portfolio/proyectos/save")
    public String saveProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return "El proyecto fue guardado correctamente";
    } 
    
// Modelo: Skills ----------------------------------------
    //falta ver skills por Id
    @PostMapping("/api/portfolio/skill/crear")
    @ResponseBody
    public String createSkills(@RequestBody Skills skill ){
        iskillsService.createSkills(skill);
        return "La skill fue cargada correctamente";
    } 
    @GetMapping("/api/portfolio/skill/ver")
    @ResponseBody    
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    @DeleteMapping ("/api/portfolio/skill/delete/{id}")
    public void deleteSkills ( @PathVariable Long id){
        iskillsService.deleteSkills(id);
    }
    @PutMapping("/api/portfolio/skill/save")
    public String saveSkills(@RequestBody Skills skill ){
        iskillsService.saveSkills(skill);
        return "La skill fue guardada correctamente";
    }
    
// Modelo: SocialHeader ----------------------------------
    //falta ver social header por Id
    @PostMapping("/api/portfolio/header/crear")
    @ResponseBody
    public String createSocialHeader(@RequestBody SocialHeader socialHeader ){
        isocialheaderService.createSocialHeader(socialHeader);
        return "El header fue cargado correctamente";
    } 
    @GetMapping("/api/portfolio/header/ver")
    @ResponseBody    
    public List<SocialHeader> verHeader(){
        return isocialheaderService.getSocialHeader();
    }
    @DeleteMapping ("/api/portfolio/header/delete/{id}")
    public void deleteSocialHeader ( @PathVariable Long id){
        isocialheaderService.deleteSocialHeader(id);
    }
    @PutMapping("/api/portfolio/header/save")
    public String saveSocialHeader(@RequestBody SocialHeader socialHeader ){
        isocialheaderService.saveSocialHeader(socialHeader);
        return "El header fue cargado correctamente";
    } 
    
// Modelo: UserLogin -------------------------------------
    
}


