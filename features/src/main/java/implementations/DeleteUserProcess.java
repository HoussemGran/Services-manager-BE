package implementations;

import com.dev.process.enums.Platform;
import com.dev.process.enums.Status;
import com.dev.process.enums.Type;
import com.dev.process.interfaces.ProcessInterface;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserProcess implements ProcessInterface {
    @Override
    public String getName() {
        return "DELETE_USER";
    }

    @Override
    public String getDescription() {
        return "Delete a user";
    }

    @Override
    public String getType() {
        return Type.DELETE.name();
    }

    @Override
    public String getStatus() {
        return Status.ACTIVE.name();
    }

    @Override
    public String getPlatform() {
        return Platform.MOBILE.name();
    }
}
