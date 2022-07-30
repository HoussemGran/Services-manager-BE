package com.dev.process.api;


import com.dev.process.entity.Process;
import com.dev.process.service.ProcessServiceImpl.ProcessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process")
public class ProcessController {

    private final ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }


    @RequestMapping
    public List<Process> getAllProcess(){
        return processService.getAll();
    }


}
