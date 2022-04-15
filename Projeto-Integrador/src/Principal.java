
import Controller.ColaboradoresController;
import Modelo.Colaboradores;

public class Principal {
	
	public static void main(String[] args) {
		
		Colaboradores c1 = new Colaboradores(0, null, null, null, null);
		c1.setId(1);
		c1.setNome("Pedro");
		c1.setCpf("12345678901");
		c1.setHabilitado("sim");
		
	
		Colaboradores c2 = new Colaboradores(0, null, null, null, null);
		c2.setId(2);
		c2.setNome("Paulo");
		c2.setCpf("09876543211");
		c2.setHabilitado("nao");
		
		
		ColaboradoresController  controller = new ColaboradoresController();
		
		try {
		controller.salvar(c1);
		controller.salvar(c2);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		for(Colaboradores c : controller.listar()) {
		
			System.out.println( c.toString());
		}
	
	
	}
	
	
	
	
}	
		
		
		
			
		