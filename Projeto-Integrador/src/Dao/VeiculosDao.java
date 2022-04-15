package Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Veiculos;
import util.ConectionUtil.ConnectionUtil;

public class VeiculosDao {
	
	private static VeiculosDao instance;
	private List<Veiculos> ListaVeiculos = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static VeiculosDao getInstance() {
		if(instance == null) {
			instance = new VeiculosDao();
			
		}
		 return instance;
	}

	public void salvar(Veiculos veiculos) {
		try {
			String sql = "insert into Veiculos(Placa, Modelo, Ano, Cor, KmPorLitro) values(?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, veiculos.getPlaca());
			pstmt.setString(2, veiculos.getModelo());
			pstmt.setInt(3, veiculos.getAno()); 
			pstmt.setString(4, veiculos.getCor());
			pstmt.setString(5, veiculos.getKmPorLitro());
			pstmt.execute();
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				 
	}	
	
	public void atualizar(Veiculos veiculos) {
		try {
			String sql = "update colaboradores set Placa = ?, Modelo = ?, Ano = ?, Ano = ?, KmPorLitro = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, veiculos.getPlaca());
			pstmt.setString(2, veiculos.getModelo());
			pstmt.setInt(3, veiculos.getAno());
			pstmt.setString(5,veiculos.getKmPorLitro());
			
			
			pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void excluir(int idVeiculos) {
		try {
			String sql = "Delate from Veiculos were id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVeiculos);
				
			pstmt.executeUpdate();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Veiculos> listar() {
		List<Veiculos> listaVeiculos = new ArrayList<>();
			
		try {
			String sql = "select * from colaboradores ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Veiculos v = new Veiculos(0, sql, 0, sql, sql);
				v.setPlaca(rs.getInt("Placa"));
				v.setModelo(rs.getString("Modelo"));
				v.setAno(rs.getInt("Ano"));
				v.setCor(rs.getString("Cor"));
				v.setKmPorLitro(rs.getString("KmPorLitro"));
				listaVeiculos.add(v);
					  
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaVeiculos;
	}

	public List<Veiculos> getListaVeiculos() {
		return ListaVeiculos;
	}

	public void setListaVeiculos(List<Veiculos> listaVeiculos) {
		ListaVeiculos = listaVeiculos;
	}
}
	
	


