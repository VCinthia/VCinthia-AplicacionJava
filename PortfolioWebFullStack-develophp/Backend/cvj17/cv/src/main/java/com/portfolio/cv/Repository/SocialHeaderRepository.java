package com.portfolio.cv.Repository;

import com.portfolio.cv.Model.SocialHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialHeaderRepository extends JpaRepository <SocialHeader, Long> {

}
