package com.portfolio.cv.Repository;

import com.portfolio.cv.Model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository <Estudio, Long> {
    
}
