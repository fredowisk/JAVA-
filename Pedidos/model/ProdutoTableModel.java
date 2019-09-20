
package model;

//Imports.
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fredaum
 */
// Criando o JTABLE NA RAÇA E NA UNHA.
public class ProdutoTableModel extends AbstractTableModel {

    //Criando uma list dados que só recebe Produto.
    private List<Produto> dados = new ArrayList<>();
    //Variavel colunas, com nome valor e quantidade.
    private String[] colunas = {"Nome", "Valor", "Quantidade"};

    //Metodo do Jtable que recebe o nome da coluna.
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    //Quantidade de linhas.
    @Override
    public int getRowCount() {
        return dados.size();
    }
    //Quantidade de colunas.
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    //Metodo que recebe os valores informados na view e os retorna pra JTABLE.
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0:
                return dados.get(linha).getNome();
            case 1:  
                return dados.get(linha).getValor();
            case 2:
                return dados.get(linha).getQtd();
        }
        
        return null;
        
    }
    //Metodo que adiciona a linha com o produto ja informado.
    public void addRow(Produto p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    //metodo que remove todos os produtos da JTABLE.
    public void removeRow(){
        this.dados.removeAll(dados);
        this.fireTableDataChanged();
    }
    
}
