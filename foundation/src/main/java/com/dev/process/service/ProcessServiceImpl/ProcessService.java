package com.dev.process.service.ProcessServiceImpl;

import com.dev.process.entity.Process;
import com.dev.process.repository.ProcessRepository;
import com.dev.process.service.ProcessServiceInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessService implements ProcessServiceInt {

    private final ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }

    @Override
    public void save(Process process) {
        processRepository.save(process);
    }

    @Override
    public List<Process> getAll() {
        return processRepository.findAll();
    }

    @Override
    public void clear() {
        processRepository.deleteAll();
    }
}
