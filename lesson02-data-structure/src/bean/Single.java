package bean;

public class Single {
    public  int value;
    public Single() {

    }
    public Single(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+this.value;
    }
}
