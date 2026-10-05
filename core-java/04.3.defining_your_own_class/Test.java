public class Test {
	public static void main(String [] args) {
		var finalVar = new FinalVar();
		System.out.println("str " + finalVar.getStr().toString() + " num " + finalVar.getNum());
		
//		finalVar.setNum(10);
//		finalVar.setString(new StringBuilder());
		finalVar.addString("hello");
//		finalVar.addNum(5);
		System.out.println("str " + finalVar.getStr().toString() + " num " + finalVar.getNum());
		
		// objects are mutable breaks encapsulation!
		var str1 = finalVar.getStr();
		str1.append(" Rakesh!");
		System.out.println("str " + finalVar.getStr().toString() + " num " + finalVar.getNum());
		
		
		// safe version
		var str2 = finalVar.getStrSafe();
		str2.append(" World!");
		System.out.println("str " + finalVar.getStr().toString() + " num " + finalVar.getNum());

		
	}
}


class FinalVar {
	final StringBuilder str;
	final Integer num;
	
	FinalVar() {
		str = new StringBuilder();
		num = -1;
	}
	
	// objects are mutable breaks encapsulation!
	public StringBuilder getStr() {
		return this.str;
	}
	
	// copy the object
	public StringBuilder getStrSafe() {
		return new StringBuilder(this.str); 
	}
	
	public Integer getNum() {
		return this.num;
	}
	
	// error: cannot assign a value to final variable
//	public void setNum(Integer n) {
//		this.num = n;
//	}
	
	// error: cannot assign a value to final variable
//	public void setString(StringBuilder s) {
//		str = s;
//	}
	
	public void addString(String s) {
		str.append(s);
	}
	
	// error: cannot assign a value to final variable
//	public void addNum(int n) {
//		this.num += n;
//	}
	
}