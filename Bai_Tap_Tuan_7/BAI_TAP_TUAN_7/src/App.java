import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream; 
import java.util.stream.*;
public class App {
    public static void main(String[] args) throws Exception {
    
      Stream<String> demo= Stream.of("mot","hai");
     demo.map(o->o.toUpperCase()).forEach(System.out::print);
    }
}
// The method map(Function<? super String,? extends R>) in the type Stream<String> is not applicable for the arguments ((String o) -> {})