package reports;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Conexao.Conexao;


public class RelatoriosUsu {

public String[] vw_ClienteComp() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM vw_relatorio_cliente";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM CLIENTES CADASTRADOS");
            return new String[0];
        }

        System.out.println("------------- RELATÓRIO DE CLIENTES -------------");

        while (rs.next()) {

            list.add(
                "ID: " + rs.getInt("ID_USUARIOS")
                + " | NOME: " + rs.getString("NOME")
                + " | CPF: " + rs.getString("CPF")
                + " | TELEFONE: " + rs.getString("TELEFONE")
                + " | MOTO: " + rs.getString("MOTO_MODELO")
                + " | ANO: " + rs.getString("MOTO_ANO")
                + " | PLACA: " + rs.getString("MOTO_PLACA")
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR A VIEW: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}

public String[] vw_Cliente() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM vw_relatorio_cliente";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM CLIENTES CADASTRADOS");
            return new String[0];
        }

        System.out.println("------------- RELATÓRIO DE CLIENTES -------------");

        while (rs.next()) {

            list.add(
                "ID: " + rs.getInt("ID_USUARIOS")
                + " | NOME: " + rs.getString("NOME")
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR A VIEW: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}






public String[] vw_usuarios() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM usuarios";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            
            return new String[0];
        }

       

        while (rs.next()) {

            list.add(
                "ID: " + rs.getInt("ID_USUARIOS")
                + " | NOME: " + rs.getString("NOME")              
                + " | TIPO: " + rs.getString("TIPO")

            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR A VIEW: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}
public String[] vw_Relatorio_Funcionario() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM relatorio_funcionario";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM FUNCIONÁRIOS CADASTRADOS");
            return new String[0];
        }

        System.out.println("------------- RELATÓRIO DE FUNCIONÁRIOS -------------");

        while (rs.next()) {

            list.add(
                "ID: "     + rs.getInt("ID_USUARIOS") +
                " | NOME: " + rs.getString("NOME") +
                " | CPF: "  + rs.getString("CPF") +
                " | TELEFONE: " + rs.getString("TELEFONE") +
                " | SALÁRIO: " + rs.getFloat("SALARIO") 

                
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR A VIEW: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}
public String[] vw_Funcionario() {

    ArrayList<String> list = new ArrayList<>();
    String sql = "SELECT * FROM relatorio_funcionario";

    try (Connection conexao = Conexao.getConnection();
         PreparedStatement stmt = conexao.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        if (!rs.isBeforeFirst()) {
            System.out.println("SEM FUNCIONÁRIOS CADASTRADOS");
            return new String[0];
        }

        System.out.println("------------- RELATÓRIO DE FUNCIONÁRIOS -------------");

        while (rs.next()) {

            list.add(
                "ID: "     + rs.getInt("ID_USUARIOS") +
                " | NOME: " + rs.getString("NOME") 
                
            );
        }

    } catch (SQLException e) {
        System.out.println("ERRO AO CONSULTAR A VIEW: " + e.getMessage());
    }

    return list.toArray(new String[0]);
}

}
