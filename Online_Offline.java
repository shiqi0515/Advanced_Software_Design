import java.util.List;
import java.util.ArrayList;

public enum UserState {
    LoggedIn,
    Online,
    Offline
}

public class User {
    private UserState state;
    
}


public class OfflineUser extends User {
    private Set<LoginUser> accessibleLoginUsers; // Access to LoginUsers' HealthData
    public OfflineUser() {
        this.accessibleLoginUsers = new HashSet<>();
    }
    
}

public class LoginUser extends User {
    private int bankID;
    private int phoneNum;
    private Address address;
    private String email;

    private List<HealthData> healthData; // List of HealthData
    public LoginUser() {
        this.healthData = new ArrayList<>();
    }
    
}

public class HealthData {
    private float height;
    private float weight;
    private float bloodPressure;
    private float bodyTemperature;
    private float respiratoryRate;
    private int heartRate;
    
}
