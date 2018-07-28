import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

	 @org.junit.jupiter.api.Test
	void testAndGate() {
		AndGate andGate = new AndGate();
		
		
		boolean output = andGate.getOutput();
		
//		andGate.setInputA(true);
//		andGate.setInputB(true);
		
		System.out.println("first AndGate input is " +andGate.getInputA());
		System.out.println("second AndGate input is " +andGate.getInputB());
		
		System.out.println("AndGate output is " +andGate.getOutput());
		
		System.out.println("\n");
		
		
		
		
	
		assertEquals(false, output);
		
		
	}
	 
	 @org.junit.jupiter.api.Test
	void testNotGate() {
		NotGate notGate = new NotGate();
		
		boolean output = notGate.getOutput();
		
	
		
		System.out.println("notGate input is " +notGate.getInput());
		System.out.println("notGate input output is " +notGate.getOutput());
		System.out.println("\n");
		
		assertEquals(true, output);
		
		
	}
	 
	 @org.junit.jupiter.api.Test
	void testNandGate() {
		NandGate nandGate = new NandGate();
		
		boolean output =nandGate.getOutput();
		
	
		assertEquals(true, output);
		
		
	}
	
}
