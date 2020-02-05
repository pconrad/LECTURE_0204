public class Dog {
    
    private static Dog bestInShow = null;
    private String name;
	private Dog friend;

	public void setFriend(Dog friend) {
		this.friend = friend;
	}
	
	
	public static Dog d7; // NEVER DO THIS
	
    public static void setBestInShow(Dog b) {
		bestInShow = b;
    }
    
    public static Dog getBestInShow() {
		return bestInShow;
    }
    
    public Dog(String name) { this.name = name;}
    
    public static void main(String [] args) {
	
		Dog d1 = new Dog("Fido");
    	Dog d2 = new Dog("Ginger");
		Dog d3 = new Dog("Harry");
		Dog d4 = new Dog("Izzy");
		Dog d5 = new Dog("Jack");
		Dog d6 = d1;
		d7 = new Dog("Phill");
		Dog d8 = new Dog("Bread");
		Dog d9 = d8;
		
		
		setBestInShow(d3);   
		d1 = d4;             
		d3 = d6;             
		d1 = null;           
		d2 = null;           
		d3 = null;           
		d4 = null;           
		d5 = null;           
		d6 = null;           
		// setBestInShow(null);

		Main.main(null);
	
    }

	@Override
	public String toString() {
		return name;
	}

	public static void friendDemo() {
		Dog d1 = new Dog("Andrew");
		Dog d2 = new Dog("Surya");

		d1.setFriend(d2);
		d2.setFriend(d1);
		
	}
	
}
