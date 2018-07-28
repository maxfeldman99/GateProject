
public class AndGate extends BinaryGate {

	@Override
	public void setInputs(boolean[] inputs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getOutput() {
		
		return getInputA() && getInputB();
	}



}
