package enumerations;

public enum Day {
    Mon,Tue,Wed,Thu,Fri,Sat,Sun;
}

class Main{
    public static void main(String[] args) {
        Day d = Day.Mon;
        System.out.println("Staring of the week is " + d);

        for(Day day : Day.values() ){
            System.out.print(day + " ");
        }
    }
}