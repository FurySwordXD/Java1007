import java.util.*;

class Collections
{
    public static void main(String args[])
    {
        ArrayList<String> listDays = new ArrayList<String>();

        listDays.add("Monday");
        listDays.add("Tuesday");
        listDays.add("Thursday");
        listDays.add("Friday");

        System.out.println("--- FOR EACH ---");
        for (String day : listDays)
            System.out.println(day);
        System.out.println("");

        System.out.println("--- FOR ---");
        for (int i = 0; i < listDays.size(); i++)
            System.out.println(listDays.get(i));
        System.out.println("");

        System.out.println("--- LAMBDA ---");
        listDays.forEach((day)-> System.out.println(day));
        System.out.println("");

        listDays.add(0, "Sunday");
        listDays.add("Saturday");
        listDays.add(listDays.indexOf("Tuesday") + 1, "Wednesday");
        listDays.forEach((day)-> System.out.println(day));
        System.out.println("");

        listDays.set(listDays.indexOf("Sunday"), "Holiday");
        listDays.set(listDays.indexOf("Saturday"), "Holiday");
        listDays.forEach((day)-> System.out.println(day));
        System.out.println("");
        
        if (listDays.indexOf("Holiday") > -1)
            System.out.println("Holiday is present in the list");

        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.addAll(listDays);

        weekDays.sort((s1, s2) -> s1.compareTo(s2));
        weekDays.forEach((day)-> System.out.println(day));
    }
}