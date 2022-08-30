package com.example.javaaprilmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
public class SampleController {

    @Autowired
    private SampleRepository sampleRepository;

    @PostMapping
    public String saveSample(@RequestBody Sample sample){
        sampleRepository.save(sample);
        return "sample saved";
    }
}
