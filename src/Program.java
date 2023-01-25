import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String>list = new ArrayList<>();

        list.add("RAUL");
        list.add("EVERTON");
        list.add("EVANDRO");
        list.add("CARLOS");
        list.add(2, "JOSE");

        System.out.println(list.size());
        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-------------------------");
        list.removeIf(x -> x.charAt(0) == 'R');
        for (String x: list){
            System.out.println(x);
        }

        System.out.println("----------------------");
        System.out.println("Index of EVANDRO: " + list.indexOf("EVANDRO"));
        System.out.println("Index of JOSE: " + list.indexOf("JOSE"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x: result){
            System.out.println(x);
        }
        System.out.println("-----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name);

    }
}
