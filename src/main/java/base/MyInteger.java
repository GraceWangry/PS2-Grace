package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if (iValue % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(){
		if (iValue>2){
			for(int factor=2;factor<=iValue/2;factor++ ){
				if (iValue % factor == 0) {
					return false;
				} 
			}
		} return true;
		
	}
	
	public static boolean isEven(int i){
		if (i % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int i){
		if (i % 2 != 0 ){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(int i){
			for (int factor = 2; factor <= i/2; factor++){
				if (i % factor == 0){
					return false;
				}
			}
		return true;
	}
	
	public static boolean isEven(MyInteger i){
		return i.isEven(); 
	}
	public static boolean isOdd(MyInteger i){
		return i.isOdd();
	}
	public static boolean isPrime(MyInteger i){
		return i.isPrime();
	}
	
	public boolean equals(int i){
		if (iValue == i){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger i){
		return i.equals(iValue);
	}

}
