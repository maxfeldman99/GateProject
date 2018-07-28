
public abstract class BinaryGate implements IGate {

	private static final int INPUT_FIRST = 1;
	private static final int INPUT_SECOND = 0;
	private static final int VALID_NUM_INPUTS = 2;
	
	private boolean inputA;
	private boolean inputB;
	
	public BinaryGate(){
		this.inputA = false; // default is false
		this.inputB = false;
	}

	@Override
	public void setInputs(boolean[] inputs) {
		if(inputs.length == VALID_NUM_INPUTS) {
			inputA = inputs[INPUT_FIRST];
			inputB = inputs[INPUT_SECOND];
		}
		
	}



	public boolean getInputA() {
		return inputA;
	}

	public void setInputA(boolean inputA) {
		this.inputA = inputA;
	}

	public boolean getInputB() {
		return inputB;
	}

	public void setInputB(boolean inputB) {
		this.inputB = inputB;
	}

	@Override
	public abstract boolean getOutput();
}
