package com.dev.process.implementations;

import com.dev.process.enums.Platform;
import com.dev.process.enums.Status;
import com.dev.process.enums.Type;
import com.dev.process.interfaces.ProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class CreateUserProcess implements ProcessInterface {
    @Override
    public String getName() {
        return "CREATE_USER";
    }

    @Override
    public String getDescription() {
        return "Create a user";
    }

    @Override
    public String getType() {
        return Type.CREATE.name();
    }

    @Override
    public String getStatus() {
        return Status.ACTIVE.name();
    }

    @Override
    public String getPlatform() {
        return Platform.WEB.name();
    }
}
