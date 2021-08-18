
public class String2 {
	public static void main(String[] args) {
		
		String strings = "CHUPA MEU PINTO RSRSRSR";
		
		System.out.println(strings);
		
        for (int i = 0; i < strings.length (); i ++ ) {
        	int tabelaAscii = (int) strings.charAt (i);
        	System.out.print (tabelaAscii + " "); 
        }
	}
}
