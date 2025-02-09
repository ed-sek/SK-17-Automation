package lectures.lecture13.exercises;

import java.time.Year;

public abstract class Person {
    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private final String nationality;
    private final String EGN;
    private final String dateOfBirth;
    private final int age;
    private String countryOfResidence;

    protected Person(String EGN,
                     String name,
                     String sex,
                     String religion,
                     String languageSpoken,
                     String job,
                     String nationality,
                     String countryOfResidence) {

        validateEGN(EGN);
        this.EGN = EGN;
        this.name = name;
        validateSex(sex);
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.dateOfBirth = getDateOfBirthFromEGN(EGN);
        this.age = getAgeFromEGN(EGN);
        this.countryOfResidence = countryOfResidence;
    }

    private void validateEGN(String EGN) throws IllegalArgumentException {
        if (EGN == null || EGN.length() != 10) {
            throw new IllegalArgumentException("Number of digits in EGN is not 10");
        }

        try {
            Long.parseLong(EGN);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("The Provided EGN: " + EGN + " is invalid. The ENG must contain only digits.", e);
        }
    }

    private void validateSex(String sex) throws IllegalArgumentException {
        try {
            if (!("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex))) {
                throw new IllegalArgumentException("The provided sex is not valid. Please enter either 'male' or 'female'. The program continues.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }

    private String getDateOfBirthFromEGN(String EGN) {
        return EGN.substring(0, 6); // get age in String format YYMMDD
    }

    private int getAgeFromEGN(String EGN) {
        int fullBirthYear = Integer.parseInt("19" + EGN.substring(0, 2)); // separate the first two digits from EGN and add 19 in front
        int currentYear = Year.now().getValue(); // Get the current year
        return currentYear - fullBirthYear;
    }

    public String sayHello() {
        switch (this.languageSpoken.toLowerCase()) {
            case "bulgarian":
                return "Zdraveyte!";
            case "italian":
                return "Ciao!";
            case "english":
            default:
                return "Hello!";
        }
    }

    public boolean celebrateEaster() {
        switch (this.religion.toLowerCase()) {
            case "orthodox", "catholic":
                return true;
            default:
                return false;
        }
    }

    public boolean isAdult() {
        switch (this.countryOfResidence.toLowerCase()) {
            case "bulgaria", "italy":
                if (isAdultVerification(18))
                    return true;
            case "usa", "u.s.a.":
                if (isAdultVerification(21))
                    return true;
            default:
                System.out.println("Can not be determined if" + this.name + " is adult in: " + this.countryOfResidence);
                return false;
        }
    }

    private boolean isAdultVerification(int adultAge) {
        if (this.age >= adultAge) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canTakeLoan() {
        return this.job != null && !this.job.isEmpty();
    }

    public void printPersonsFavouriteFood() {
        System.out.println("I like to eat everything!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", languageSpoken='" + languageSpoken + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", EGN='" + EGN + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                ", greeting='" + this.sayHello() + '\'' +
                ", celebratesEaster?=" + this.celebrateEaster() +
                ", isAdult?=" + this.isAdult() +
                ", canTakeALoan?=" + this.canTakeLoan();
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getName() {
        return this.name;
    }

    public String getSex() {
        return this.sex;
    }

    public String getReligion() {
        return this.religion;
    }

    public String getLanguageSpoken() {
        return this.languageSpoken;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getEGN() {
        return this.EGN;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
}



