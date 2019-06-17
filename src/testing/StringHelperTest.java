package testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import utility.StringHelper;

public class StringHelperTest {
	// a test always passes until there is at least one test condition that fails

	@Before
	public void before(){ // runs before every single test method
		System.out.println("before");
	}
	@After
	public void after(){ // runs after every single test method
		System.out.println("after");
	}
	/*@BeforeClass
	public static void beforeClass(){ // runs only once for a test class
		System.out.println("beforClass");
	}
	@AfterClass
	public static void afterClass(){ // runs only once for a test class
		System.out.println("afterClass");
	}*/
	
	@Test  // means that this method which we're going to write is a test condition
	public void testTruncateAinFirst2Positions() {
		  System.out.println("testTruncateAinFirst2Positions");
          StringHelper stringHelper = new StringHelper();
          String expectedOutput = "RTAA";
          String actualOutput = stringHelper.truncateAinFirst2Positions("RTAA");
          assertEquals(expectedOutput, actualOutput);
          assertEquals("BB", stringHelper.truncateAinFirst2Positions("AABB"));
          assertEquals("BBB", stringHelper.truncateAinFirst2Positions("BABB"));
	}
	@Test
	public void testAreFirstAndLast2CharTheSame(){
		System.out.println("testAreFirstAndLast2CharTheSame");
		StringHelper stringHelper = new StringHelper();
		assertFalse(stringHelper.areFirstAndLast2CharTheSame(""));
		assertFalse(stringHelper.areFirstAndLast2CharTheSame("A"));
		assertTrue(stringHelper.areFirstAndLast2CharTheSame("AB"));
		assertTrue(stringHelper.areFirstAndLast2CharTheSame("AAA"));
		assertFalse(stringHelper.areFirstAndLast2CharTheSame("AAB"));
	}
	@Test
	public void testArraysSort(){
		int[] numbers = {5, 6, 4, 2, 3, 1};
		Arrays.sort(numbers);
		int[] expectedOutput = {1, 2, 3, 4, 5, 6};
		assertArrayEquals(expectedOutput, numbers);
	}
	@Test(expected=NullPointerException.class) // we use this when we expect an exception inside the code
	public void testArraysSortWithNullCondition(){
		int[] numbers = null;
		Arrays.sort(numbers); // we have exception here !
		
	}
    @Test(timeout=300)
    public void testArraysSortPerformance(){
    	for(int i=0; i < 1000000; i++){
    		int[] numbers = {i, i-1, i+1};
    		Arrays.sort(numbers);
    	}
    }
}
