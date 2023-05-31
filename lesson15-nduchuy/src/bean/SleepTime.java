package bean;

import java.util.Arrays;

public class SleepTime {
	private String person;
	private int[] age;
	private int sleepTime;
	public SleepTime() {
		// TODO Auto-generated constructor stub
	}
	public SleepTime(String person, int[] age, int sleepTime) {
		this.person = person;
		this.age = age;
		this.sleepTime = sleepTime;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public int[] getAge() {
		return age;
	}
	public void setAge(int[] age) {
		this.age = age;
	}
	public int getSleepTime() {
		return sleepTime;
	}
	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	@Override
	public String toString() {
		return "SleepTime [person=" + person + ", age=" + Arrays.toString(age) + ", sleepTime=" + sleepTime + "]";
	}

}
