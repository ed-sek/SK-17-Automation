package lectures.lecture13.exercises;

public class Bulgarian extends Person{

    public Bulgarian(String EGN,
                    String name,
                    String sex,
                    String religion,
                    String languageSpoken,
                    String job,
                    String nationality,
                    String countryOfResidence){
        super(EGN, name, sex, religion, languageSpoken, job, nationality, countryOfResidence);
    }

    public void mountainHikes() {
        System.out.println("I enjoy hiking in Vitosha mountain.");
    }

    @Override
    public void printPersonsFavouriteFood() {
        System.out.println(this.getName() + "'s favourite food is 'shopska salata'!");
    }
}

