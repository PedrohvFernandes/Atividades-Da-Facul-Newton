package poo.u8.strategy;

public class Divisao implements Strategy {
int cod;

	@Override
	public int execute(int a, int b) {
		return a / b;
	}   
    

}
