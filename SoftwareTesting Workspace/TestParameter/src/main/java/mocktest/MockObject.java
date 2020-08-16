package mocktest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

public class MockObject {

	@Test
	public void createMockObject() {

		LinkedList mockedList = mock(LinkedList.class);

		 //Stubbing 模拟mockList行为
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());
	}
	
	@Test
	public void configMockObject() {
	    List mockedList = mock(List.class);

	    // 我们定制了当调用 mockedList.add("one") 时, 返回 true
	    when(mockedList.add("one")).thenReturn(true);
	    // 当调用 mockedList.size() 时, 返回 1
	    when(mockedList.size()).thenReturn(1);

	    Assert.assertTrue(mockedList.add("one"));
	    // 因为我们没有定制 add("two"), 因此返回默认值, 即 false.
	    Assert.assertFalse(mockedList.add("two"));
	    Assert.assertEquals(mockedList.size(), 1);

	    Iterator i = mock(Iterator.class);
	    when(i.next()).thenReturn("Hello,").thenReturn("Mockito!");
	    String result = i.next() + " " + i.next();
	    //assert
	    Assert.assertEquals("Hello, Mockito!", result);
	}
}
