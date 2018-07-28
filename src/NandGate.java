
public class NandGate extends BinaryGate {
	
	private AndGate andGateVal;
	private NotGate notGateVal;

	public NandGate() {
		andGateVal = new AndGate();
		notGateVal = new NotGate();
	}
	
	@Override
	public void setInputs(boolean[] inputs) {
		super.setInputs(inputs);

		
		andGateVal.setInputA(this.getInputA());
		andGateVal.setInputB(this.getInputB());
		notGateVal.setInput(this.getOutput());
		
		
	}
	
	
	@Override
	public boolean getOutput() {
			
	return notGateVal.getOutput();	
	}


	
	
	

	
}
