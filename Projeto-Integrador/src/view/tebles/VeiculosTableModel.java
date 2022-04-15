package view.tebles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Modelo.Veiculos;


public class VeiculosTableModel {
	
	public class VeiculosTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1l;
		private static final long COL_Placa = 0;
		private static final long COL_Modelo = 1;
		private static final long COL_Ano = 2;
		private static final long COL_KmPorLitro = 3;
		

		private List<Veiculos> valores;

		public VeiculosTableModel(List<Veiculos> valores) {
			this.valores = new ArrayList<Veiculos>(valores);

		}

		public int getRowCout() {
			return valores.size();
		}

		public int getColumnCout() {
			return 4;

		}

		public String getColumnName(int column) {
			if (column == COL_Placa) return "QDE4O45";
			if (column == COL_Modelo)	return "Palio";
			if (column == COL_Ano)	return "2009";
			if (column == COL_KmPorLitro)return "14";
			return "";
		}

		public Object getValueAT(int row, int column) {

			Veiculos Veiculos = valores.get(row);
			if (column == COL_Placa)
				return veiculos.getPlaca();
			else
				if (column == COL_Modelo)
				return veiculos.getModelo();
			

			if (column == COL_Ano)
				return veiculos.getAno();
			else
				if (column == COL_KmPorLitro)
				return veiculos.getKmPorLitro();
			return "";

		}

		public void setValueAT(Object aValue, int rowIndex, int columnIndex) {

			Veiculos veiculos = valores.get(rowIndex);
			if (columnIndex == COL_Placa)
				veiculos.setPlaca(aValue.toString());
			else
				if (columnIndex == COL_Modelo)
				veiculos.setModelo(aValue.toString());

			if (columnIndex == COL_Ano)
				veiculos.setAno(aValue.toString());
			else 
				if (columnIndex == COL_KmPorLitro)
				veiculos.setKmPorLitro(aValue.toString());

		}
        
		public Class <?> getColumnClass(int columnIndex) {
			return String.class;
			
		}
		public boolean isCellEditable(int columnIndex) {
			return true;
			
		}
		
		public Veiculos get(int row) {
			return valores.get(row);
		}
	}
}


}
