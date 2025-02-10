package lectures.lecture13.exercises;

public class Italian extends Person {

    public Italian(String EGN,
                   String name,
                   String sex,
                   String religion,
                   String languageSpoken,
                   String job,
                   String nationality,
                   String countryOfResidence) {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void watchesSports() {
        System.out.println("I enjoy watching Sports on TV.");
    }

    @Override
    public void printPersonsFavouriteFood() {
        System.out.println(this.getName() + "'s favourite food is pasta!");
    }


}

