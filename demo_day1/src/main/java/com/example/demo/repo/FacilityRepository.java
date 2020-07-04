package com.example.demo.repo;


import org.springframework.data.jpa.repository.*;

import com.example.demo.model.Facility;

public interface FacilityRepository extends JpaRepository <Facility, Integer>{

}
