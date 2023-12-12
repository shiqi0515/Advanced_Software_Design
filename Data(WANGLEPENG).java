import java.util.Date;

enum UserState {
    LOGGED_OUT,
    LOGGED_IN_BANK,
    LOGGED_IN_SMS
}

class User {
    private int bankID;
    private int phoneNum;
    private UserState state;
    private Profile userProfile;

    public User(int bankID, int phoneNum, Profile userProfile) {
        this.bankID = bankID;
        this.phoneNum = phoneNum;
        this.state = UserState.LOGGED_OUT;
        this.userProfile = userProfile;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(Profile userProfile) {
        this.userProfile = userProfile;
    }

    public void logInBankID() {
        // Logic to log in using bank ID
        this.state = UserState.LOGGED_IN_BANK;
    }

    public void logInSMS() {
        // Logic to log in using SMS
        this.state = UserState.LOGGED_IN_SMS;
    }

    // Other user management logic and functionalities
}


class Profile {
    private RecordData recordData;
    private Address address;
    private String email;

    public Profile(RecordData recordData, Address address, String email) {
        this.recordData = recordData;
        this.address = address;
        this.email = email;
    }

    public RecordData getRecordData() {
        return recordData;
    }

    public void setRecordData(RecordData recordData) {
        this.recordData = recordData;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void editData() {
        // Logic to edit profile data
    }

    public void removeData() {
        // Logic to remove profile data
    }

    public void addData() {
        // Logic to add profile data
    }

    public void shareData() {
        // Logic to share profile data
    }

    public void saveData() {
        // Logic to save profile data
    }

    public void importData() {
        // Logic to import profile data
    }

    public void exportData() {
        // Logic to export profile data
    }

    public void backUpData() {
        // Logic to backup profile data
    }
}

class RecordData extends Profile {
    private String healthRecord;
    private float height;
    private float weight;
    private float bloodPressure;
    private float bodyTemperature;
    private float respiratoryRate;
    private int heartRate;

    public RecordData(String healthRecord, float height, float weight, float bloodPressure,
                      float bodyTemperature, float respiratoryRate, int heartRate) {
        super(null, null, null);
        this.healthRecord = healthRecord;
        this.height = height;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.bodyTemperature = bodyTemperature;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
    }

    public String getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(String healthRecord) {
        this.healthRecord = healthRecord;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(float bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void addRecord(String newRecord) {
        // Logic to add a health record
    }

    public void editRecord(String editedRecord) {
        // Logic to edit a health record
    }

    public void removeRecord(String recordToRemove) {
        // Logic to remove a health record
    }
}

enum UserState {
    LOGGED_OUT,
    LOGGED_IN_BANK,
    LOGGED_IN_SMS
}

class User {
    private int bankID;
    private int phoneNum;
    private UserState state;
    private Profile userProfile;

    public User(int bankID, int phoneNum, Profile userProfile) {
        this.bankID = bankID;
        this.phoneNum = phoneNum;
        this.state = UserState.LOGGED_OUT;
        this.userProfile = userProfile;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(Profile userProfile) {
        this.userProfile = userProfile;
    }

    public void logInBankID() {
        // Logic to log in using bank ID
        this.state = UserState.LOGGED_IN_BANK;
    }

    public void logInSMS() {
        // Logic to log in using SMS
        this.state = UserState.LOGGED_IN_SMS;
    }

    // Other user management logic and functionalities
}

class MedicalAppointments {
    private Date scheduleTime;
    private String medicalData;

    public Date getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getMedicalData() {
        return medicalData;
    }

    public void setMedicalData(String medicalData) {
        this.medicalData = medicalData;
    }

    public void editData() {
        // Logic to edit medical data
    }

    public void removeData() {
        // Logic to remove medical data
    }

    public void addData() {
        // Logic to add medical data
    }

    public void saveData() {
        // Logic to save medical data
    }
}

class TimeJudgment {
    public bool Ismore(MedicalAppointments appointments) {
        // Logic to assess appointments based on time
    }
}

class InformationAccess {
    private int relativeBankID;
    private String link;

    public int getRelativeBankID() {
        return relativeBankID;
    }

    public void setRelativeBankID(int relativeBankID) {
        this.relativeBankID = relativeBankID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String shareLink() {
        // Logic to share link
        return link;
    }
}

class EmergencyInformation {
    public void editEmergencyContact(String contact) {
        // Logic to update emergency contact information
    }

    public void enterEmergencyServices() {
        // Logic to enter emergency services
    }
}
