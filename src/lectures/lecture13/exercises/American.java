package lectures.lecture13.exercises;

public class American extends Person {

    public American(String EGN,
                    String name,
                    String sex,
                    String religion,
                    String languageSpoken,
                    String job,
                    String nationality,
                    String countryOfResidence) {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void lovesGrilling() {
        System.out.println("I like to grill on the weekends.");
    }

    @Override
    public void printPersonsFavouriteFood() {
        System.out.println(this.getName() + "'s favourite food is barbecue!");
    }

}

