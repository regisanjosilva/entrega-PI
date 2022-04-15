package Controller;

import java.util.List;



import Dao.VeiculosDao;

import Modelo.Veiculos;

public class VeiculosController {
	
	
	
	public void salvar(Veiculos veiculos) throws Exception {
		if (veiculos.getAno() == veiculos.getAno())
            throw new Exception();

		VeiculosDao.getInstance().salvar(veiculos);
	}	
	
	public void atualizar(Veiculos veiculos) throws Exception {
		if (veiculos.getModelo() ==   veiculos.getModelo()) {
            throw new Exception();
	}
	VeiculosDao.getInstance().atualizar(veiculos);
	}
	
	public void excluir(int idPlaca) throws Exception {
		if(idPlaca == 0 ) {
			throw new Exception();
		}
		VeiculosDao.getInstance().excluir(idPlaca);
	}
	public List<Veiculos> listar() {
		return VeiculosDao.getInstance().listar();
	}
	

}



		