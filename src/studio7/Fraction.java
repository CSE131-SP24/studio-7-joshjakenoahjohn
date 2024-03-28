package studio7;

public class Fraction {
     private int numerator;
     private int denominator;
     
     
     public Fraction(int n, int d) {
    	 numerator = n;
    	 denominator = d;
    	 
    
     }
     public int numerator() {
 		return numerator;
 	}
     
     public int denominator() {
 		return denominator;
 	}
     public Fraction Add(Fraction f2) {
    	 Fraction f3 = new Fraction(this.numerator()*f2.denominator(),this.denominator()*f2.denominator());
    	 Fraction f4 = new Fraction(f2.numerator()*this.denominator(),f2.denominator()*this.denominator());
    	 Fraction f5 = new Fraction(f3.numerator() + f4.numerator(), f3.denominator());
    	 
    	 return f5;
     }
     
     public void print() {
    	 System.out.println(numerator + "/" + denominator);
     }
     
     
     public int GCD(int numerator, int denominator) {
    	 while (denominator!=0) {
    		int temp = denominator; 
    		denominator = numerator % denominator;
    		numerator = temp;
    	 }
    	 return numerator;
    	 
    	 
     }
     
     public Fraction Simplify() {
    	 int gcd = GCD(this.numerator,this.denominator);
    	 Fraction f1 = new Fraction(this.numerator/gcd, this.denominator/gcd);
    	 return f1;
    	 
     }
     
     public Fraction Reciprocal() {
    	 
    	 Fraction f1 = new Fraction(this.denominator, this.numerator);
    	 return f1;
    	 
     }
     
    public Fraction Multiply(Fraction f2) {
    	
      Fraction f1 = new Fraction(this.numerator * f2.numerator(), this.denominator * f2.denominator());
   	  return f1;
    	
    }
	public static void main(String[] args) {
		Fraction f1 = new Fraction(5,10);
		Fraction f2 = new Fraction(1,4);
		f1.Add(f2).print();
		f1.Simplify().print();
		f1.Reciprocal().print();
		f1.Multiply(f2).Simplify().print();
	}

}
