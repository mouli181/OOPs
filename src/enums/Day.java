package enums;

public enum Day {
    Sunday, Monday,Tuesday, Wednesday, Thursday,friday,saturday;
}

class Main {
    public static void main(String[] args) {
        Day d = Day.Tuesday;
        System.out.println(d);

        for(Day day : Day.values() ){
            System.out.println(day);
        }
    }
}