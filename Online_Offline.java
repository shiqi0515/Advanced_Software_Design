import java.util.List;
import java.util.ArrayList;

public enum UserState {
    LoggedIn,
    Online,
    Offline
}

public class User {
    private UserState state;
    private List<LoginUser> loginUsers; // 0-to-many relationship with LoginUser
    private List<OfflineUser> offlineUsers; // 0-to-many relationship with OfflineUser

    // Method to add a LoginUser
    public void addLoginUser(LoginUser loginUser) {
        if (this.loginUsers == null) {
            this.loginUsers = new ArrayList<>();
        }
        this.loginUsers.add(loginUser);
    }

    // Method to add an OfflineUser
    public void addOfflineUser(OfflineUser offlineUser) {
        if (this.offlineUsers == null) {
            this.offlineUsers = new ArrayList<>();
        }
        this.offlineUsers.add(offlineUser);
    }
}


public class OfflineUser extends User {

}

public class LoginUser extends User {
    private int bankID;
    private int phoneNum;
    private Address address;
    private String email;
    
}

public class HealthData {
    private float height;
    private float weight;
    private float bloodPressure;
    private float bodyTemperature;
    private float respiratoryRate;
    private int heartRate;
    
}
