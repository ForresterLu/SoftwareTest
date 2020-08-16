package junittest;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

import automorphiccount.SysConvert;
import junit.framework.TestCase;


import org.junit.Test;

class SysConvertTest extends TestCase{

	@Test
	public void testcaculateMupli1() {
		System.out.println("@Test caculateMupli_1");
		assertEquals(SysConvert.caculateMupli(0), 1);
	}
	
	@Test
	public void testcaculateMupli2() {
		System.out.println("@Test caculateMupli_2");
		assertEquals(SysConvert.caculateMupli(3), 4096);
	}
	
	@Test
	public void testcaculateMupli3() {
		System.out.println("@Test caculateMupli_3");
		assertEquals(SysConvert.caculateMupli(6), 16777216);
	}
	
	@Test
	public void testconvertHexadecimalToDecimalism1() {
		System.out.println("@Test convertHexadecimalToDecimalism_1");
		SysConvert sysConvert = new SysConvert();
		assertEquals(sysConvert.convertHexadecimalToDecimalism("0xA"), 10);
	}
	
	@Test
	public void testconvertHexadecimalToDecimalism2() {
		System.out.println("@Test convertHexadecimalToDecimalism_2");
		SysConvert sysConvert = new SysConvert();
//		System.out.println(sysConvert.convertHexadecimalToDecimalism("0xAB"));
		assertEquals(sysConvert.convertHexadecimalToDecimalism("0xAB"), 171);
	}
	
	@Test
	public void testconvertHexadecimalToDecimalism3() {
		System.out.println("@Test convertHexadecimalToDecimalism_3");
		SysConvert sysConvert = new SysConvert();
//		System.out.println(sysConvert.convertHexadecimalToDecimalism("0x12"));
		assertEquals(sysConvert.convertHexadecimalToDecimalism("0x12"), 18);
	}
	
	@Test
	void testconvertHexadecimalToDecimalism4() {
		System.out.println("@Test convertHexadecimalToDecimalism_4");
		SysConvert sysConvert = new SysConvert();
//		System.out.println(sysConvert.convertHexadecimalToDecimalism("0xFFFFFFFF"));
//		System.out.println(Long.MAX_VALUE);
		assertEquals(sysConvert.convertHexadecimalToDecimalism("0xFFFFFFFF"), Long.MAX_VALUE);
	}
	
//	@Test
//	void test() {
//		assertEquals(1, 0);
//	}


}
