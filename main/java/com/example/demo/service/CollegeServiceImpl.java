package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.ICollegeRepository;

@Service
public class CollegeServiceImpl implements ICollegeService {

    @Autowired
    private ICollegeRepository collegeRepository;

    @Override
    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @Override
    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    @Override
    public College updateCollege(Long id, College college) {
        Optional<College> existing = collegeRepository.findById(id);
        if (existing.isPresent()) {
            College collegeToUpdate = existing.get();
            collegeToUpdate.setCollegeName(college.getCollegeName());
            collegeToUpdate.setLocation(college.getLocation());
            return collegeRepository.save(collegeToUpdate);
        } else {
            throw new RuntimeException("College not found with id: " + id);
        }
    }

    @Override
    public void deleteCollege(Long id) {
        if (collegeRepository.existsById(id)) {
            collegeRepository.deleteById(id);
        } else {
            throw new RuntimeException("College not found with id: " + id);
        }
    }
}
