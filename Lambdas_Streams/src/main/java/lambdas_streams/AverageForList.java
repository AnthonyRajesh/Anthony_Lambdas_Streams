package lambdas_streams;
import java.util.*;
import java.util.function.Function;

public class AverageForList {
	public static int average(List<Integer> list) {
		Function<List<Integer>,Integer> sum = s->{int temp=0; for(Integer i:s) temp+=i; return temp;};
		Function<List<Integer>, Integer> function = func->{int y=sum.apply(list); return y/func.size();};
		return function.apply(list);
	}

}
