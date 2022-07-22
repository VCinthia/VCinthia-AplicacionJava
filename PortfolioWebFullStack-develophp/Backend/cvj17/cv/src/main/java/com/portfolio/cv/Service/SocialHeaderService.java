package com.portfolio.cv.Service;

import com.portfolio.cv.Interface.ISocialHeaderService;
import com.portfolio.cv.Model.SocialHeader;
import com.portfolio.cv.Repository.SocialHeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialHeaderService implements ISocialHeaderService {
    @Autowired
    public SocialHeaderRepository socialHeaderRepository;
    
    @Override
    public List<SocialHeader> getSocialHeader(){
        return socialHeaderRepository.findAll();
    }
    
    @Override
    public void createSocialHeader(SocialHeader socialHeader){
       socialHeaderRepository.save(socialHeader);
    }

    @Override
    public void deleteSocialHeader(Long id){
        socialHeaderRepository.deleteById(id);
    }   
    
    @Override
    public SocialHeader findSocialHeader(Long id){
        return socialHeaderRepository.findById(id).orElse(null);
    }    
    
    @Override
    public void saveSocialHeader(SocialHeader socialHeader){
        socialHeaderRepository.save(socialHeader);
    }
}