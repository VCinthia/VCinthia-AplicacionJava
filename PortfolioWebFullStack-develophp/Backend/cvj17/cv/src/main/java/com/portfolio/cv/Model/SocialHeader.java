package com.portfolio.cv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SocialHeader {
    
    public SocialHeader() {}
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String email;
    private String github;
    private String linkedin;    
    private String cv;    

    public SocialHeader(Long id, String email, String github, String linkedin, String cv ) {
        this.id = id;
        this.email = email;
        this.github = github;
        this.linkedin = linkedin;
        this.cv = cv;
    }
}
