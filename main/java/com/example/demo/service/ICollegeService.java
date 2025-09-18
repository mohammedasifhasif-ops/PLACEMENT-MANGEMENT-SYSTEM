package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.College;

public interface ICollegeService {

    College saveCollege(College college);

    List<College> getAllColleges();

    College getCollegeById(Long id);

    College updateCollege(Long id, College college);

    void deleteCollege(Long id);
}
