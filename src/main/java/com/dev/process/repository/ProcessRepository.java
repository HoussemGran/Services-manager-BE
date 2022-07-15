package com.dev.process.repository;


import com.dev.process.entity.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends JpaRepository<Process,Long> {


    Boolean findByNameContains(String name);

}
