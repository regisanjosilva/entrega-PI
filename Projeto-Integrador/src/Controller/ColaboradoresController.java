package Controller;

import java.util.List;





import Dao.ColaboradoresDao;
import Modelo.Colaboradores;

public class ColaboradoresController {
	
	public void salvar(Colaboradores colaboradores) throws Exception {
		if (colaboradores.getNome() == null || colaboradores.getNome().length() <3)
            throw new Exception();

		ColaboradoresDao.getInstance().salvar(colaboradores);
	}	
	
	public void atualizar(Colaboradores colaboradores) throws Exception {
		if (colaboradores.getNome() == null || colaboradores.getNome().length() <3) {
            throw new Exception();
	}
	ColaboradoresDao.getInstance().atualizar(colaboradores);
	}
	
	public void excluir(int idColaboradores) throws Exception {
		if(idColaboradores == 0 ) {
			throw new Exception();
		}
		ColaboradoresDao.getInstance().excluir(idColaboradores);
	}
	public List<Colaboradores> listar() {
		return ColaboradoresDao.getInstance().listar();
	}
	

}
