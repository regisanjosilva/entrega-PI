package Controller;

import java.util.List;



import Dao.ChamadoDao;
import Modelo.Chamado;



public class ChamadoController {
	
	public void salvar(Chamado chamado) throws Exception {
		if (chamado.getDistanciaPercorrida() == chamado.getDistanciaPercorrida());
            throw new Exception();
	}	
	
	
	public void atualizar(Chamado chamado) throws Exception {
		if (chamado.getDistanciaPercorrida() == chamado.getDistanciaPercorrida()) {
            throw new Exception();
	}
	ChamadoDao.getInstance().atualizar(chamado);
	}
	
	public void excluir(int idChamado) throws Exception {
		if(idChamado == 0 ) {
			throw new Exception();
		}
		ChamadoDao.getInstance().excluir(idChamado);
	}
	public List<Chamado> listar() {
		return ChamadoDao.getInstance().listar();
	}
	

}