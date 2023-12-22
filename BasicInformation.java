public class BasicInformation {
    private int userID;
    private Integer age;
    private String gender;

    public BasicInformation(int userID, Integer age, String gender) {
        this.userID = userID;
        this.age = age;
        this.gender = gender;
    }

    public int getUserID() {
        return userID;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

