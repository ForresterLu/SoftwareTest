package mocktest;

import org.junit.Test;
import java.util.LinkedList;

import static org.mockito.Mockito.*;

public class MockitoTest {
	
	@Test(expected = RuntimeException.class)
	public void when_thenReturn() {
		LinkedList mockList = mock(LinkedList.class);
		
		when(mockList.get(0)).thenReturn("first");
		when(mockList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockList.get(0));
		System.out.println(mockList.get(1));
		
		
		System.out.println(mockList.get(999));
		
		verify(mockList).get(0);
	}
}
