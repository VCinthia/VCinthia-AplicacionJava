package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.Skills;
import java.util.List;

public interface ISkillsService {
    public List<Skills> getSkills();
    
    public void createSkills(Skills skill);    
    public void deleteSkills(Long id);    
    public Skills findSkills(Long id);    
    public void saveSkills(Skills skill);
}
