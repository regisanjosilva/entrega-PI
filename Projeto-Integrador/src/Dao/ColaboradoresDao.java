package Dao;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import Modelo.Colaboradores;
import util.ConectionUtil.ConnectionUtil;

public class ColaboradoresDao {
	
	private static ColaboradoresDao instance;
	private List<Colaboradores> ListaColaboradores = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static ColaboradoresDao getInstance() {
		if(instance == null) {
			instance = new ColaboradoresDao();
			
		}
		 return instance;
	}

	public void salvar(Colaboradores colaboradores) {
		try {
			String sql = "insert into colaboradores(cpf, nome, dataNasc, habilitado) values(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaboradores.getCpf());
			pstmt.setString(2, colaboradores.getNome());
			pstmt.setDate(3, java.sql.Date.valueOf(colaboradores.getDataNasc()));
			pstmt.setString(4, colaboradores.getHabilitado());
			pstmt.execute();
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				 
	}	
	
	public void atualizar(Colaboradores colaboradores) {
		try {
			String sql = "update colaboradores set cpf = ?, nome = ?, dataNasc = ?, habilitado = ?, were id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaboradores.getCpf());
			pstmt.setString(2, colaboradores.getNome());
			pstmt.setDate(3, java.sql.Date.valueOf(colaboradores.getDataNasc()));
			pstmt.setInt(5,colaboradores.getId());
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void excluir(int idColaboradores) {
		try {
			String sql = "Delate from colaboradores were id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idColaboradores);
				
			pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Colaboradores> listar() {
		List<Colaboradores> listaColaboradores = new ArrayList<>();
			
		try {
			String sql = "select * from colaboradores ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Colaboradores c = new Colaboradores(0, sql, sql, null, sql);
				c.setCpf(rs.getString("cpf"));
				c.setNome(rs.getString("nome"));
				c.setDataNasc(null);
				c.setHabilitado(rs.getString("habilitado"));
				listaColaboradores.add(c);
					  
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaColaboradores;
	}

	public List<Colaboradores> getListaColaboradores() {
		return ListaColaboradores;
	}

	public void setListaColaboradores(List<Colaboradores> listaColaboradores) {
		ListaColaboradores = listaColaboradores;
	}
}
	
	
	


