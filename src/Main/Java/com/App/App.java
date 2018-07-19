package Main.Java.com.App;

import Main.Java.com.People;
import Main.Java.com.Role;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args){
        People alex= new People("Алекс",35,1239L,Role.DEVELOPER);
        People ivan= new People("Иван",3,1678L,Role.DEVELOPER);
        People dima= new People("Дмитрий",2,4562L,Role.TESTER);
        People masha= new People("Мария",31,5123L,Role.TESTER);
        People alina= new People("Алина",19,4219L,Role.DEVELOPER);

        List<People> people=Arrays.asList(alex,ivan,dima,masha,alina);

        // sort: age less than 20, developer role
        people.stream()
                .filter(a->a.getAge()>20)
                .filter(a->a.getRole().equals(Role.DEVELOPER))
                .forEach(a->System.out.println(a.getName()));
        System.out.println("====================");

        // find the average age of those over 20
        double ageGen=(double) people
                .stream()
                .mapToInt(People::getAge)
                .filter(a->a>20)
                .reduce((a,b)->a+b)
                .getAsInt();
        long countPeopleAgeLess20=people.stream()
                .filter(a->a.getAge()>20)
                .count();
        System.out.println(ageGen/countPeopleAgeLess20);
        System.out.println("====================");

        // print the first and last name in the list
        long countPeople=people.stream().count();

        people.stream()
                .limit(1)
                .forEach(a->System.out.println(a.getName()));
        people.stream()
                .skip(countPeople-1)
                .forEach(a->System.out.println(a.getName()));
        System.out.println("====================");

        // print in one line the names of those under the age of 18
        String line=people.stream()
                .filter(a->a.getAge()<18)
                .map(a->a.getName())
                .collect(Collectors.joining(" ,"));
        System.out.println(line);

        System.out.println("====================");

        line=people.stream()
                .filter(a->a.getAge()<18)
                .map(a->a.getName())
                .reduce((a,b)->a+" "+b).get();
        System.out.println(line);


    }
}
