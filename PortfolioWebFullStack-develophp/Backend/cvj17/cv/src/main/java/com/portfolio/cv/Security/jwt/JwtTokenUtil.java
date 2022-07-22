
package com.portfolio.cv.Security.jwt;

import com.portfolio.cv.Model.UserLogin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Component
//@EnableWebSecurity(debug = true) 

public class JwtTokenUtil {
    private static final Logger LOGGER=LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=12*60*60*1000;//12 horas dura el token
   
    @Value("${app.jwt.secret}")
    private String secretKey;
    
    public String generateAccessToken(UserLogin userLogin){
        return Jwts.builder()
                .setSubject(String.format("%s,%s", userLogin.getId(), userLogin.getEmail()))               
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512,secretKey)
                .compact();        
    }
    public boolean validateAccessToken(String token){
        try{            
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
            } catch (ExpiredJwtException ex){
                LOGGER.error("JWT expired",ex.getMessage());
            } catch (IllegalArgumentException ex){
                LOGGER.error("Token is null, empty or has only white spaces", ex.getMessage());
            } catch (MalformedJwtException ex){
                LOGGER.error("JWT is invalid", ex);
            } catch (UnsupportedJwtException ex){
                LOGGER.error("Signature Validation Failed", ex);
            } catch (SignatureException ex) {
		LOGGER.error("Signature validation failed");
	    }        
        return false;
        }
    public String getSubject(String token){
        return parseClaims(token).getSubject();
    }
    private Claims parseClaims(String token){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
