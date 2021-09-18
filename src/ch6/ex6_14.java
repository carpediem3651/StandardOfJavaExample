package ch6;

class ex6_14 {
	static {
		System.out.println("static { }");
	}
	
	{System.out.println(" { }");
	
	}
	
	public ex6_14() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("ex6_14 bt = new ex6_14(); ");
		ex6_14 bt = new ex6_14();
		
		System.out.println("ex6_14 bt2 = new ex6_14(); ");
		ex6_14 bt2 = new ex6_14();
	}
}
