package com.example.manajeroback.services;


import com.example.manajeroback.entities.Test;
import com.example.manajeroback.repositories.ApiRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class testServiceImp implements ITestService{
    ApiRepository apiRepo;
    @Override
    public Test addTest(Test test) {
        return apiRepo.save(test);
    }

    @Override
    public List<Test> retreiveTest() {
        return apiRepo.findAll();
    }
}
