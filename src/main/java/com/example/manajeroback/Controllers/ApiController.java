package com.example.manajeroback.Controllers;
import com.example.manajeroback.entities.Test;
import com.example.manajeroback.services.ITestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor

public class ApiController {
      ITestService testService;

    //@CrossOrigin(origins = "*")
    @GetMapping("/getTest")
    List<Test> getTest(){

        return testService.retreiveTest();
    }

    @PostMapping("/addtest")
    Test addtest(@RequestBody Test test){

        return testService.addTest(test);
    }
}




