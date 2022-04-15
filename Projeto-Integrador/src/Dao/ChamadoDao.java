package Dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.Chamado;
import util.ConectionUtil.ConnectionUtil;

public class ChamadoDao {

	private static ChamadoDao instance;
	private List<Chamado> ListaChamado = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();

	public static ChamadoDao getInstance() {
		if (instance == null) {
			instance = new ChamadoDao();

		}
		return instance;
	}

	public void RegistrarChamado(Chamado chamado) {
		try {
			String sql = "insert into chamado ( id, distanciaPercorrida, co2Emitido, idPlaca, idColaboradores ) values (?, ? , ?, , ?)";
			PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, chamado.getId());
			pstmt.setDouble(2, chamado.getDistanciaPercorrida());
			pstmt.setDouble(3, chamado.getCo2Emitido());
			pstmt.setString(4, chamado.getIdPlaca());
			pstmt.setInt(5, 0);
			int key = pstmt.executeUpdate();
			
			if (key > 0) {
				
				ResultSet rs = pstmt.getGeneratedKeys();
				rs.next();
				int idChamado = rs.getInt(2);
		
		
			String itemChamado = " chamado set id = ?, distanciaPercorrida = ?, co2Emitido = ?, idPlaca = ?, idColaboradores ";
			PreparedStatement pstmtItemChamado = con.prepareStatement(itemChamado);
			for (itemChmado intem : chamado.getItemChamado)
			
			pstmt.setInt(1, chamado.getId());
			pstmt.setDouble(2, chamado.getDistanciaPercorrida());
			pstmt.setDouble(3, chamado.getCo2Emitido());
			pstmt.setString(4, chamado.getIdPlaca());
			pstmt.setInt(key, idChamado);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir(int idChamado) {
		try {
			String sql = "Delete from chamado where id =? ";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idChamado);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Chamado> listar() {
		List<Chamado> listaChamado = new ArrayList<>();
		try {
			String sql = "select * from chamado ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				;
			Chamado c = new chamado() {
					
			c.setId(rs.getInt("id"));
			c.setDistanciaPercorrida(rs.getDouble("DistanciaPercorrida"));
			c.setCo2Emitido(rs.getDouble("co2Emitido"));
			listaChamado.add(c);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaChamado;
	}

	public List<Chamado> getListaChamado() {
		return ListaChamado;
	}

	public void setListaChamado(List<Chamado> listaChamado) {
		ListaChamado = listaChamado;
	}

}