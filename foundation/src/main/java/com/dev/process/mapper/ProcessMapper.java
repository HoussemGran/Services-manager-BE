package com.dev.process.mapper;


import com.dev.process.entity.Process;
import com.dev.process.interfaces.ProcessInterface;
import com.dev.process.service.ProcessServiceInt;
import org.springframework.stereotype.Component;

@Component
public class ProcessMapper {

    private final ProcessServiceInt processServiceInt;

    public ProcessMapper(ProcessServiceInt processServiceInt) {
        this.processServiceInt = processServiceInt;
    }

    public void mapProcessToEntityAndSaveToDB(ProcessInterface processInterface){

            Process process = new Process();
            process.setName(processInterface.getName());
            process.setDescription(processInterface.getDescription());
            process.setType(processInterface.getType());
            process.setStatus(processInterface.getStatus());
            process.setPlatform(processInterface.getPlatform());

            processServiceInt.save(process);
        }

}
