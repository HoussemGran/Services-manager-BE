package com.dev.process.scanner;


import com.dev.process.interfaces.ProcessInterface;
import com.dev.process.mapper.ProcessMapper;
import com.dev.process.service.ProcessServiceInt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import java.util.Map;


/**
    This class aim to scan the whole processes that lives in our system and save them to DB
 */


@Component
public class ProcessScanner {

    private final ApplicationContext applicationContext;
    private final ProcessMapper processMapper;
    private final ProcessServiceInt processServiceInt;

    public ProcessScanner(ApplicationContext applicationContext, ProcessMapper processMapper, ProcessServiceInt processServiceInt) {
        this.applicationContext = applicationContext;
        this.processMapper = processMapper;
        this.processServiceInt = processServiceInt;
    }


    @EventListener
    public void scan(ContextRefreshedEvent contextRefreshedEvent){

        processServiceInt.clear();
        Map<String,ProcessInterface> process =  applicationContext.getBeansOfType(ProcessInterface.class);

        for(String key : process.keySet()){
                processMapper.mapProcessToEntityAndSaveToDB( (ProcessInterface) applicationContext.getBean(key));
        }
    }

}
