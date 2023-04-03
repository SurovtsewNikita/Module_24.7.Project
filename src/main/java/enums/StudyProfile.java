package enums;

public enum StudyProfile {

    PHYSICS("Физика"),
    COMPUTER_SCIENCE("Информатика"),
    JAVA("JAVA-разработчик"),
    MEDICINE("Медицина"),
    HISTORY("История"),
    MATHEMATICS("Математика");

    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }


    public String getProfileName() {
        return profileName;
    }

    public StudyProfile setProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }
}
