package ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List <Corredor> corredores = new ArrayList<Corredor>();
		
		
		
		
		
		
		corredores.add(new Corredor(4,1.43,"Mario"));
		
		corredores.add(new Corredor(3,1.50,"Raúl"));
		
		corredores.add(new Corredor(8,1.70,"Ángel"));
		
		Collections.sort(corredores);
		
		
		
		
	for(Corredor c : corredores) {
				
				System.out.println(c);
			}
			
			
		//La clase POJO implements la clase comparable y usa sus métodos
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
