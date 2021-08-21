import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> intList = Arrays.asList(10, 20, 30);
		List<Double> doubleList = Arrays.asList(25.14, 65.78, 125.78);
		List<Object> objList = new ArrayList<>();

		copy(intList, objList);
		copy(doubleList, objList);
		for (Object x : objList) {
			System.out.print(x + ",");
		}
	}

	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for (Number x : origem) {
			destino.add(x);
		}
	}
}
