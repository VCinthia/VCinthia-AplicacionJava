package com.portfolio.cv.Service;

import com.portfolio.cv.Interface.ISkillsService;
import com.portfolio.cv.Model.Skills;
import com.portfolio.cv.Repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    @Autowired
    public SkillsRepository skillsRepository;
    
    @Override
    public List<Skills> getSkills(){
        return skillsRepository.findAll();
    }
    
    @Override
    public void createSkills(Skills skill){
        skillsRepository.save(skill);
    }
    
    @Override
    public void deleteSkills(Long id){
        skillsRepository.deleteById(id);
    }    
    
    @Override
    public Skills findSkills(Long id){
        return skillsRepository.findById(id).orElse(null);
    }    
    
    @Override
    public void saveSkills(Skills skill){
        skillsRepository.save(skill);
    }
}
