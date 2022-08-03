import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    //Используется интерфейс Function, который реализует словарь
    //Логика формирования словаря оформлена в монадой
    public final static Function<String, List<String>> getDictionary = (val) -> Arrays.stream(val.split(" "))
            .sorted(Comparator.naturalOrder())
            .distinct()
            .toList();

    public static void main(String[] args) {

        final String text = "sdfadfe dsafdsf cvcveeww dddvvefwer fadsfdasf gfdadsjf asdfdsaf asdfdsfgfdgb vcsdfds dfdd"
                + "dfsdfd aaaasd bpeeed";


        getDictionary.apply(text).forEach(System.out::println);
    }


}
