import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest
{
	private GradeBook book1, book2;

	@BeforeEach
	void setUp() throws Exception
	{
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(77);
		book1.addScore(95);
	
		book2.addScore(68);
		book2.addScore(92);
	}

	@AfterEach
	void tearDown() throws Exception
	{
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore()
	{
		assertTrue(book1.toString().equals("77.0 95.0 "));
		assertTrue(book2.toString().equals("68.0 92.0 "));
		assertEquals(book1.getScoresSize(), 2);
		assertEquals(book2.getScoresSize(), 2);
	}

	@Test
	void testSum()
	{
		assertEquals(book1.sum(), 172);
		assertEquals(book2.sum(), 160);
	}

	@Test
	void testMinimum()
	{
		assertEquals(book1.minimum(), 77);
		assertEquals(book2.minimum(), 68);
	}

	@Test
	void testFinalScore()
	{
		assertEquals(book1.finalScore(), 95);
		assertEquals(book2.finalScore(), 92);
	}
}
