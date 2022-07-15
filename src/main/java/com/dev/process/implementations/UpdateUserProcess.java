package com.dev.process.implementations;

import com.dev.process.enums.Platform;
import com.dev.process.enums.Status;
import com.dev.process.enums.Type;
import com.dev.process.interfaces.ProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserProcess implements ProcessInterface {
    @Override
    public String getName() {
        return "UPDATE_USER";
    }

    @Override
    public String getDescription() {
        return "Update a user";
    }

    @Override
    public String getType() {
        return Type.UPDATE.name();
    }

    @Override
    public String getStatus() {
        return Status.INACTIVE.name();
    }

    @Override
    public String getPlatform() {
        return Platform.TV.name();
    }
}
