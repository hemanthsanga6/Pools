package Observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InventoryTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = ((JunitTesting) test.jetSpray).getCount(3);
		assertEquals(3,output);
		
	}

}
