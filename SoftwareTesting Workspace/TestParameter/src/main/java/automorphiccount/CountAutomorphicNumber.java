package automorphiccount;

public class CountAutomorphicNumber {
	
	public int countAutomorphicNumber(String hexadecimal) {
		SysConvert sysConvert = new SysConvert();
		AutomorphicNumber automorphicNumber = new AutomorphicNumber();
		long decimalism = sysConvert.convertHexadecimalToDecimalism(hexadecimal);
		int automorphicCount = automorphicNumber.calcAutomorphicNumbers(decimalism);
		return automorphicCount;
	}
	
	
	public static void main(String[] args) {
		CountAutomorphicNumber countAutomorphicNumber = new CountAutomorphicNumber();
		System.out.println(countAutomorphicNumber.countAutomorphicNumber("0xADEFEEEE"));
	}
}