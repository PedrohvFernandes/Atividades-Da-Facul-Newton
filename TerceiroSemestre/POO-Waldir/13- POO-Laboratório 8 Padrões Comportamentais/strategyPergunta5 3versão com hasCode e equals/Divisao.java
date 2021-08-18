package poo.u8.strategy;

public class Divisao implements Strategy {
int cod;

	@Override
	public int execute(int a, int b) {
		return a / b;
	}
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cod;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Divisao other = (Divisao) obj;
        if (cod != other.cod)
            return false;
        return true;
    }
    
    

}
