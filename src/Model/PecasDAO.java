package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Conexao.Conexao;

public class PecasDAO {
    public  void insertPecas(ArrayList<Pecas> pecas) {
    	
        String sql = "INSERT INTO PECAS(NOME, VALOR_PECAS, UNIDADE, QUANTIDADE, VALOR_UNIDADE, TIPO_ELEMENTO, CARACT_ELEMENTO)VALUES(?,?,?,?,?,?,?)";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
        	for (Pecas pc : pecas) {

        	    
        	    stmt.setString(1, pc.getNomePeca());
        	    stmt.setFloat(2, pc.getValorPecas());
        	    stmt.setString(3, pc.getUnid());
        	    stmt.setInt(4, pc.getQuat_Pecas());
        	    stmt.setFloat(5, pc.getValor_unid());
        	    stmt.setString(6, pc.getTipo_elemento());

        	    
        	    if (pc instanceof PecasEletricas) {
        	        PecasEletricas pe = (PecasEletricas) pc;
        	        stmt.setString(7, pe.getVoltagem());
        	    } else if (pc instanceof PecasMecanica) {
        	        PecasMecanica pm = (PecasMecanica) pc;
        	        stmt.setString(7, pm.getMaterial());
        	        
        	    }
            stmt.executeUpdate();
        	}       	        	
        	stmt.close();	
        }      	
        	catch (SQLException e) {
            System.out.println("ERRO NO CADASTRO" + e.getMessage());
        	}    	
    }
  
    public  void insertPecasUsadas(int id_os,int id_pecas,int quant_pecas) {
        String sql = "INSERT INTO PECAS_USADAS (NUM_OS, ID_PECAS,QUANT_PECAS) VALUES (?,?,?)";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1,id_os);
            stmt.setInt(2,id_pecas); 
            stmt.setInt(3, quant_pecas); 
 
            stmt.executeUpdate();
            System.out.println("EXECUTADO O REGISTRO NA OS "+id_os);
        } catch (SQLException e) {
            System.out.println("ERRO AO REGISTRAR " + e.getMessage());
        }
    } 
    public void proc_RemovePecas(int id_peca) {
        String sql = "CALL REMOVER_PECAS(?)";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id_peca);

            try (ResultSet rs = stmt.executeQuery()) {
            	
             System.out.println("PEÇA REMOVIDA COM SUCESSO!!");
                                        
            }

        } catch (SQLException e) {
            System.out.println("Erro no login: " + e.getMessage());
            
        }
       
    }
    
   
    public void removePecaUsada(int numOS, int idPeca,int quant) {
	    String sql = "DELETE FROM pecas_usadas WHERE NUM_OS = ? AND ID_PECAS = ? AND QUANT_PEÇAS=?";
	    
	    try (Connection conexao = Conexao.getConnection();
	             PreparedStatement stmt = conexao.prepareStatement(sql)) {
	        
	        stmt.setInt(1, numOS);
	        stmt.setInt(2, idPeca);
	        stmt.setInt(3, quant);
	        int linhasAfetadas = stmt.executeUpdate();
	        
	        if(linhasAfetadas > 0) {
	        	System.out.println("PEÇA USADA REMOVIDA COM SUCESSO");
	        }else if(linhasAfetadas == 0) {
	        	System.out.println("INSUMO NÃO ENCONTRADO");
	        }
	        
	    } catch (SQLException e) {
	        System.out.println("Erro ao remover peça usada: " + e.getMessage());
	        
	    }
	}
    public void count_pecas() {
        String sql = "SELECT COUNT(1) AS PECAS FROM PECAS";
        try (Connection conexao = Conexao.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) { 
                int cont = rs.getInt("pecas");
                System.out.println("TOTAL DE PEÇAS: " + cont);
            } else {
                System.out.println("TOTAL DE PEÇAS: 0");
            }

        } catch (SQLException e) {
            System.out.println("ERRO NA BUSCA: " + e.getMessage());
        }
    }
    public void atualizarPeca(int idPeca, String coluna, String novoValor) {

        String sql = "UPDATE pecas SET " + coluna + " = ? WHERE ID_PECAS = ?";

        try (Connection conexao = Conexao.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, novoValor);
            stmt.setInt(2, idPeca);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("✅ Peça atualizada com sucesso!");
            } else {
                System.out.println("⚠️ Nenhuma peça encontrada com esse ID.");
            }

        } catch (SQLException e) {
            System.out.println("ERRO AO ATUALIZAR PEÇA: " + e.getMessage());
        }
    }
    
    
    
}
