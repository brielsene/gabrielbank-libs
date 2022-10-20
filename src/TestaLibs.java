
import br.com.gabrielbank.*;
public class TestaLibs {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123);
		
		c.depositaSaldo(123.0);
		
		
		System.out.println(c.getSaldo());
		

	}

}
