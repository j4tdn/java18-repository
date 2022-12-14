package inheritance.multiple.interfaces;
// interface Transport
//      void transfer();

// interface plane
//      void move();
public class Boeing implements Transport, Plane {

	@Override
	public void transfer() {
		
	}
      
      public static void main(String[] args) {
		
	}
      @Override
    public void move() {
    	
    }
      @Override
    public void getMaxWeight() {
    	System.out.println("Max weight --> 747");
    }

      
}
