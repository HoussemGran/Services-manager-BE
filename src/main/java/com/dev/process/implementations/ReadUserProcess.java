package com.dev.process.implementations;

import com.dev.process.enums.Platform;
import com.dev.process.enums.Status;
import com.dev.process.enums.Type;
import com.dev.process.interfaces.ProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class ReadUserProcess implements ProcessInterface {
    @Override
    public String getName() {
        return "READ_USER";
    }

    @Override
    public String getDescription() {
        return "Read a user";
    }

    @Override
    public String getType() {
        return Type.READ.name();
    }

    @Override
    public String getStatus() {
        return Status.INACTIVE.name();
    }

    @Override
    public String getPlatform() {
        return Platform.WEB.name();
    }
}
