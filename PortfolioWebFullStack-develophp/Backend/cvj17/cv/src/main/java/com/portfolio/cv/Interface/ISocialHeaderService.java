package com.portfolio.cv.Interface;

import com.portfolio.cv.Model.SocialHeader;
import java.util.List;

public interface ISocialHeaderService {
    public List<SocialHeader> getSocialHeader();
    
    public void createSocialHeader(SocialHeader socialHeader);    
    public void deleteSocialHeader(Long id);    
    public SocialHeader findSocialHeader(Long id);    
    public void saveSocialHeader(SocialHeader socialHeader);
}
