
public abstract class UnaryGate implements IGate {

	private static final int INPUT = 0;
	private static final int VALID_NUM_INPUTS = 1;
	
	private boolean input;
	
	
	public UnaryGate() {
		setInput(false);
	}


	@Override
	public void setInputs(boolean[] inputs) {
		if(inputs.length == VALID_NUM_INPUTS) {
			input = inputs[INPUT];
		}
		
	}


	@Override
	public abstract boolean getOutput();


	public boolean isInput() {
		return input;
	}


	public void setInput(boolean input) {
		this.input = input;
	}
	
}

