package bean;

import java.util.Objects;

public class Dish {
	public enum Kind {
		MEAT, FISH, VEGGIE, OTHER
	}

	private String id;
	private String name;
	private double calories;
	private Kind kind;

	public Dish() {
	}

	public Dish(String id, String name, double calories, Kind kind) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCalories());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Dish)) {
			return false;
		}

		Dish dish = (Dish) o;
		return getId() == dish.getId();
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + calories + ", " + kind;
	}
}
