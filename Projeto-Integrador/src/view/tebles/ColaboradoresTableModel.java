package view.tebles;

import java.time.LocalDate;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Modelo.Colaboradores;

public class ColaboradoresTableModel {

	public class ColaboradorTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1l;
		private static final long COL_NOME = 0;
		private static final long COL_CPF = 1;
		private static final long COL_DATANASC = 2;
		private static final long COL_HABILITADO = 3;

		private List<Colaboradores> valores;

		public ColaboradorTableModel(List<Colaboradores> valores) {
			this.valores = new ArrayList<Colaboradores>(valores);

		}

		public int getRowCout() {
			return valores.size();
		}

		public int getColumnCout() {
			return 4;

		}

		public String getColumnName(int column) {
			if (column == COL_NOME) return "Nome do Colaborador";
			if (column == COL_CPF)	return "CPF";
			if (column == COL_DATANASC)	return "DataNasc";
			if (column == COL_HABILITADO)return "Habilitado";
			return "";
		}

		public Object getValueAT(int row, int column) {

			Colaboradores colaboradores = valores.get(row);
			if (column == COL_NOME)
				return colaboradores.getNome();
			else
				if (column == COL_CPF)
				return colaboradores.getCpf();
			

			if (column == COL_DATANASC)
				return colaboradores.getDataNasc();
			else
				if (column == COL_HABILITADO)
				return colaboradores.getHabilitado();
			return "";

		}

		public void setValueAT(Object aValue, int rowIndex, int columnIndex) {

			Colaboradores colaboradores = valores.get(rowIndex);
			if (columnIndex == COL_NOME)
				colaboradores.setNome(aValue.toString());
			else
				if (columnIndex == COL_CPF)
				colaboradores.setCpf(aValue.toString());

			if (columnIndex == COL_DATANASC)
				colaboradores.setDataNasc(LocalDate.parse(aValue.toString()) );
			else 
				if (columnIndex == COL_HABILITADO)
				colaboradores.setHabilitado(aValue.toString());

		}
        
		public Class <?> getColumnClass(int columnIndex) {
			return String.class;
			
		}
		public boolean isCellEditable(int columnIndex) {
			return true;
			
		}
		
		public Colaboradores get(int row) {
			return valores.get(row);
		}
	}
}
