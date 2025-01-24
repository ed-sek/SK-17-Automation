package lectures.lecture2.exercises;

public class E1_StoreNameAndPrint {

    public static void main(String[] args) {
        fullName();
    }

    // store name in 3 vars and pint
    public static void fullName() {
        String nameFirst = "Ed";
        String nameSecond = "Edd";
        String nameThird = "Eddy";
        String fullName = nameFirst + " " + nameSecond + " " + nameThird;
        System.out.println(fullName);
    }
}
