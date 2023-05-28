package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import bean.Apple;
import model.DataModel;

public class Ex01exam {
	public static void main(String[] args) {
		List<Apple> apples = DataModel.getAll();
		apples.forEach(new Consumer<Apple>() {

			@Override
			public void accept(Apple t) {
				System.out.println(t);
				
			}
		});
		
	}
}
