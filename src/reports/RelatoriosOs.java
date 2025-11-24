package reports;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexao.Conexao;

public class RelatoriosOs {
	
	 public String[] relat_OsCompleto() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM ORDEM_DE_SERVICOS";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM OS !!!");
            return new String[0];
        }

        System.out.println("------------- ORDEM DE SERVIÇOS CADASTRADAS -------------");

        while (rs.next()) {
            list.add(
                "ID: " + rs.getInt(1) +
                " | CLIENTE: " + rs.getString(3) +
                " | MODELO MOTO: " + rs.getString(3) + " " + rs.getString(4) +
                " | PLACA: " + rs.getString(5) +
                " | VALOR PEÇAS: " + rs.getFloat(6) +
                " | VALOR MÃO DE OBRA: " + rs.getFloat(7) +
                " | VALOR TOTAL: " + rs.getFloat(8)
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR OS: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}

         
         
   	 public String[] relat_OsSimp() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM RELATORIO_ORÇAMENTO";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM OS !!!");
            return new String[0];
        }

        System.out.println("------------- ORDEM DE SERVIÇOS CADASTRADAS -------------");

        while (rs.next()) {
            list.add(
                "ID: " + rs.getInt(1) +
                " | CLIENTE: " + rs.getString(4)
          
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR OS: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}      
         
         public String[] relat_orcaGeral() {

    ArrayList<String> list = new ArrayList<>();

    String sql = "SELECT  "
            + " OS.ID_OS, "
            + " USU.NOME, "
            + " USU.MOTO_MODELO, "
            + " USU.MOTO_ANO, "
            + " USU.MOTO_PLACA, "
            + " OS.VALOR_PECAS, "
            + " OS.VALOR_HH, "
            + " OS.VALOR_TOTAL "
            + "FROM ORDEM_DE_SERVICOS OS "
            + "INNER JOIN USUARIOS USU ON OS.ID_CLIENTE = USU.ID_USUARIOS";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM OS NA LISTA!");
            return new String[0];
        }

        while (rs.next()) {
            list.add(
                "ID: " + rs.getInt(1) +
                " | CLIENTE: " + rs.getString(2) +
                " | MODELO: " + rs.getString(3) + " " + rs.getString(4) +
                " | PLACA: " + rs.getString(5) +
                " | VALOR PEÇAS: " + rs.getFloat(6) +
                " | VALOR MÃO DE OBRA: " + rs.getFloat(7) +
                " | TOTAL: " + rs.getFloat(8)
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO NA BUSCA: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}
}
