package lectures.lecture13.exercises;

public class E13_PersonMain {

    final static String LINE_SEPARATOR = "___________";

    public static void main(String[] args) {

        Child childPerson = new Child("9711144090",
                "Madison Byte",
                "female",
                "Catholic",
                "English",
                "",
                "Spanish",
                "USA"
        );

        Bulgarian bulgarianPerson = new Bulgarian("7008036342",
                "Andrey Logov",
                "male",
                "Orthodox",
                "Bulgarian",
                "Rally driver",
                "Bulgarian",
                "Bulgaria"
        );


        American americanPerson = new American("1706047086",
                "Bruce Wayne",
                "male",
                "Islam",
                "English",
                "Pilot",
                "American",
                "USA"
        );


        Italian italianPerson = new Italian("3408261090",
                "Sofia Scriptini",
                "female",
                "Catholic",
                "Italian",
                "Journalist",
                "Italian",
                "Italy"
        );

        // printing all object details
        System.out.println(childPerson);
        System.out.println(bulgarianPerson);
        System.out.println(americanPerson);
        System.out.println(italianPerson);
        System.out.println(LINE_SEPARATOR);

        // greetings of each person
        System.out.println(childPerson.sayHello());
        System.out.println(bulgarianPerson.sayHello());
        System.out.println(italianPerson.sayHello());
        System.out.println(americanPerson.sayHello());
        System.out.println(LINE_SEPARATOR);


        // demonstrate method polymorphism
        childPerson.printPersonsFavouriteFood();
        bulgarianPerson.printPersonsFavouriteFood();
        italianPerson.printPersonsFavouriteFood();
        americanPerson.printPersonsFavouriteFood();
        System.out.println(LINE_SEPARATOR);

        // demonstrate specific class methods
        childPerson.playsVideoGames();
        bulgarianPerson.mountainHikes();
        italianPerson.watchesSports();
        americanPerson.lovesGrilling();

    }
}
