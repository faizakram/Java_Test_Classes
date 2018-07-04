
interface I{
	
	int j=10;
	default Integer sum()
	{
		return 1+2;
	}
}

public class Test implements I{
	
	@Override
	 public Integer sum() {
		return 0;
		
	}
	
	public static void main(String[] args) {
		I t1 = new Test();
		System.err.println(I.j);
	}

}
