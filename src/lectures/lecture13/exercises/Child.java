package lectures.lecture13.exercises;

public class Child extends Person {

    public Child(String EGN,
                 String name,
                 String sex,
                 String religion,
                 String languageSpoken,
                 String job,
                 String nationality,
                 String countryOfResidence) {
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void playsVideoGames() {
        System.out.println("I love playing all kinds of video games.");
    }

    @Override
    public void printPersonsFavouriteFood() {
        System.out.println(this.getName() + "'s favourite food is nesquick!");
    }
}
