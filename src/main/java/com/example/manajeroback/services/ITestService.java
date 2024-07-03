package com.example.manajeroback.services;

import com.example.manajeroback.entities.Test;

import java.util.List;


public interface ITestService{
    Test addTest(Test test);
    List<Test> retreiveTest () ;


}


