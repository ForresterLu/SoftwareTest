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

		 //Stubbing ģ��mockList��Ϊ
		 when(mockedList.get(0)).thenReturn("first");
		 when(mockedList.get(1)).thenThrow(new RuntimeException());
	}
	
	@Test
	public void configMockObject() {
	    List mockedList = mock(List.class);

	    // ���Ƕ����˵����� mockedList.add("one") ʱ, ���� true
	    when(mockedList.add("one")).thenReturn(true);
	    // ������ mockedList.size() ʱ, ���� 1
	    when(mockedList.size()).thenReturn(1);

	    Assert.assertTrue(mockedList.add("one"));
	    // ��Ϊ����û�ж��� add("two"), ��˷���Ĭ��ֵ, �� false.
	    Assert.assertFalse(mockedList.add("two"));
	    Assert.assertEquals(mockedList.size(), 1);

	    Iterator i = mock(Iterator.class);
	    when(i.next()).thenReturn("Hello,").thenReturn("Mockito!");
	    String result = i.next() + " " + i.next();
	    //assert
	    Assert.assertEquals("Hello, Mockito!", result);
	}
}
