package com.dev.process.service;

import com.dev.process.entity.Process;

import java.util.List;

public interface ProcessServiceInt {

    void save(Process process);
    List<Process> getAll();
    void clear();

}
