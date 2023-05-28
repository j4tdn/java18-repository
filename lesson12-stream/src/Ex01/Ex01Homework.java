package Ex01;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import utils.PrintUtils;

public class Ex01Homework {
	public static void main(String[] args) {
		Set<String > distincolor = new HashSet<>();
		
		List<Apple> inventory = DataModel.getAll().stream().filter(a -> distincolor.add(a.getColor())).collect(Collectors.toList());
		
		//PrintUtils.Print("câu 3", );
		
		// BTVN liệt kê những quả táo( có quốc gia chỉ chứa 1 quả táo duy nhất )
		
		
		//demo với skip và limit
		
		PrintUtils.Print("câu 4", List.of(3,2,7,8,5,7,2,9,8,7).stream().skip(3).limit(2).collect(Collectors.toList()));
		
		
		
		
		
		
	}
	public static <T,R,S extends Collection<T>> Collection<T> distinctBy(Collection<T> col, Function<T, R> func ,Supplier<S> sup){
		Set<R> set = new HashSet<>();
		return col.stream().filter(e -> set.add(func.apply(e))).collect(Collectors.toCollection(sup));
	}
	
}
