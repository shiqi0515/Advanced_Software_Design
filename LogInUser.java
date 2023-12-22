import java.util.ArrayList;
import java.util.List;

public class LogInUser {
    private int bankID;
    private int phoneNum;
    private int userID;
    private List<BasicInformation> basicInformationList;

    public LogInUser(int bankID, int phoneNum, int userID) {
        this.bankID = bankID;
        this.phoneNum = phoneNum;
        this.userID = userID;
        this.basicInformationList = new ArrayList<>();
    }

    public int getBankID() {
        return bankID;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public int getUserID() {
        return userID;
    }

    public void addBasicInformation(BasicInformation basicInformation) {
        basicInformationList.add(basicInformation);
    }

    public List<BasicInformation> getBasicInformationList() {
        return basicInformationList;
    }
}
