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
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    @Autowired IEstudioService iestudioService;
    @Autowired IExperienciaService iexperienciaService;
    @Autowired IProyectosService iproyectosService;
    @Autowired ISkillsService iskillsService;
    @Autowired ISocialHeaderService isocialheaderService;
    
    
// Modelo: persona -----------------------------------
    
    @GetMapping("/api/portfolio/personas/traer")
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
    
    @GetMapping("/api/portfolio/personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
// Modelo: Estudio ---------------------------------------
    
    @PostMapping("/estudio/crear")
    public void createEstudio(@RequestBody Estudio estudio ){
        iestudioService.createEstudio(estudio);
    } 
    //falta ver estudio por Id
    @GetMapping("/estudio/ver")//para ver todos los estudios
    @ResponseBody    
    public List<Estudio> getEstudio(){
        return iestudioService.getEstudio();
    }
    @DeleteMapping ("/estudio/delete/{id}")
    public void deleteEstudio ( @PathVariable Long id){
        iestudioService.deleteEstudio(id);
    }
    @PostMapping("/estudio/save")
    public void saveEstudio(@RequestBody Estudio estudio ){
        iestudioService.saveEstudio(estudio);
    } 
    
// Modelo: Experiencia -----------------------------------
    //falta ver experiencia por Id
    @PostMapping("/experiencia/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia ){
        iexperienciaService.createExperiencia(experiencia);
    } 
    @GetMapping("/experiencia/ver")
    @ResponseBody    
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    @DeleteMapping ("/experiencia/delete/{id}")
    public void deleteExperiencias ( @PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
    }
    @PostMapping("/experiencia/save")
    public void saveExperiencias(@RequestBody Experiencia experiencia ){
        iexperienciaService.saveExperiencia(experiencia);
    }
// Modelo: Proyectos -------------------------------------
    //falta ver proyectos por Id
    @PostMapping("/proyectos/crear")
    public void createProyectos(@RequestBody Proyectos proyectos ){
        iproyectosService.createProyectos(proyectos);
    }
    @GetMapping("/proyectos/ver")
    @ResponseBody    
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    @DeleteMapping ("/proyectos/delete/{id}")
    public void deleteProyectos ( @PathVariable Long id){
        iproyectosService.deleteProyectos(id);
    }
    @PostMapping("/proyectos/save")
    public void saveProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
    } 
    
// Modelo: Skills ----------------------------------------
    //falta ver skills por Id
    @PostMapping("/skill/crear")
    public void createSkills(@RequestBody Skills skill ){
        iskillsService.createSkills(skill);
    } 
    @GetMapping("/skill/ver")
    @ResponseBody    
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    @DeleteMapping ("/skill/delete/{id}")
    public void deleteSkills ( @PathVariable Long id){
        iskillsService.deleteSkills(id);
    }
    @PostMapping("/skill/save")
    public void saveSkills(@RequestBody Skills skill ){
        iskillsService.saveSkills(skill);
    }
    
// Modelo: SocialHeader ----------------------------------
    //falta ver social header por Id
    @PostMapping("/header/crear")
    public void createSocialHeader(@RequestBody SocialHeader socialHeader ){
        isocialheaderService.createSocialHeader(socialHeader);
    } 
    @GetMapping("/header/ver")
    @ResponseBody    
    public List<SocialHeader> verHeader(){
        return isocialheaderService.getSocialHeader();
    }
    @DeleteMapping ("/header/delete/{id}")
    public void deleteSocialHeader ( @PathVariable Long id){
        isocialheaderService.deleteSocialHeader(id);
    }
    @PostMapping("/header/save")
    public void saveSocialHeader(@RequestBody SocialHeader socialHeader ){
        isocialheaderService.saveSocialHeader(socialHeader);
    } 
    
// Modelo: UserLogin -------------------------------------
    
}


