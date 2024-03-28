package studio7;

public class Die {

	private int n;
	public Die (int initSides) {
		n = initSides;
	
	}
	public int Throw () {
		return (int)(Math.random()*n + 1);
	}
	public static void main(String[] args) {
		Die d1 = new Die(10);
		System.out.println(d1.Throw());
		// TODO Auto-generated method stub

	}

}
