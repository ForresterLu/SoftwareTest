package automorphiccount;

import java.util.HashMap;
/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * @author 17247
 *
 */
public class SysConvert {
	
	static HashMap<String, String> map = new HashMap<String, String>();
	
	{
		map.put("0", "0");
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		map.put("6", "6");
		map.put("7", "7");
		map.put("8", "8");
		map.put("9", "9");
		map.put("A", "10");
		map.put("B", "11");
		map.put("C", "12");
		map.put("D", "13");
		map.put("E", "14");
		map.put("F", "15");
	}
	
	public long convertHexadecimalToDecimalism(String hexadecimal) {
		long result = 0;
		for(int i = hexadecimal.length() - 1; i > 1; i--) {
			long valueString = Long.valueOf(map.get(String.valueOf(hexadecimal.charAt(i))));
			result = result + valueString * caculateMupli(hexadecimal.length() - 1 - i);
		}
		return result;
	}
	
	
	public static int caculateMupli(int jie) {
		int mupli = 1;
		for(int i = 0; i < jie; i++) {
			mupli = mupli * 16;
		}
		return mupli;
	}
	
	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("0", "0");
//		map.put("1", "1");
//		map.put("2", "2");
//		map.put("3", "3");
//		map.put("4", "4");
//		map.put("5", "5");
//		map.put("6", "6");
//		map.put("7", "7");
//		map.put("8", "8");
//		map.put("9", "9");
//		map.put("A", "10");
//		map.put("B", "11");
//		map.put("C", "12");
//		map.put("D", "13");
//		map.put("E", "14");
//		map.put("F", "15");
		
//		Scanner scanner = new Scanner(System.in);
//		while (scanner.hasNext()) {
//			String input = scanner.nextLine();
//			int result = 0;
//			for(int i = input.length() - 1; i > 1; i--) {
//				int valueString = Integer.valueOf(map.get(String.valueOf(input.charAt(i))));
//				result = result + valueString * caculate(input.length() - 1 - i);
//			}
//			
//			System.out.println(result);
//		}
//		
//		scanner.close();
		
		SysConvert sysConvert = new SysConvert();
		System.out.println(sysConvert.convertHexadecimalToDecimalism("0xADEFEEEE"));
	}
	

}
