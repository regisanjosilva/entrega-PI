package view.tebles;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Modelo.Chamado;
import Modelo.Colaboradores;

public class ConsultaChamadoTableModel extends AbstractTableModel {
	
	
	private static final long COL_ = 1;
	private static final long COL_ = 2;
	private static final long COL_ = 3;

	private List<Chamado> valores;

	public ChamadoTableModel(List<Chamado> valores) {
		this.valores = new ArrayList<Chamado>(valores);

	}

	public int getRowCout() {
		return valores.size();
	}

	public int getColumnCout() {
		return 4;

	}

	public String getColumnName(int column) {
		if (column == COL_)	return "";
		if (column == COL_)	return "";
		if (column == COL_)return "";
		return "";
	}

	public Object getValueAT(int row, int column) {

		Chamado chamado = valores.get(row);
		if (column == COL_)
			return chamado.get();
		else
			if (column == COL_)
			return chamado.get();
		

		if (column == COL_)
			return chamado.get();
		else
			if (column == COL_)
			return chamado.get();
		return "";

	}

	public void setValueAT(Object aValue, int rowIndex, int columnIndex) {

		Chamado chamado = valores.get(rowIndex);
		if (columnIndex == COL_)
			chamado.set(aValue.toString());
		else
			if (columnIndex == COL_)
			chamado.set(aValue.toString());

		if (columnIndex == COL_)
			chamado.set(LocalDate.parse(aValue.toString()) );
		else 
			if (columnIndex == COL_)
			chamado.set(aValue.toString());

	}
    
	public Class <?> getColumnClass(int columnIndex) {
		return String.class;
		
	}
	public boolean isCellEditable(int columnIndex) {
		return true;
		
	}
	
	public Chamado get(int row) {
		return valores.get(row);
	}

}



