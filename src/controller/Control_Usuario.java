package controller;

import Model.Usuario;
import Model.UsuarioDAO;
import Model.Funcionario;
import Model.Cliente;



public class Control_Usuario {
	
	
	private static UsuarioDAO usuDAO=new UsuarioDAO();
		
	public void cadastro( Usuario usu) {
		           
             if (usu instanceof Cliente) {
                Cliente c = (Cliente) usu;
                usuDAO.insertCliente(c);
            } else if (usu instanceof Funcionario) {
                Funcionario f = (Funcionario) usu;
                usuDAO.insertFuncioanrio(f);
            }    
            
        }
	public Usuario return_usuario(int id_usuarios) {
		return usuDAO.return_usuario(id_usuarios);
	}
	public void removeUsuario(int id) {
		usuDAO.removeUsuario(id);
	}
	public void cont_usu() {
		usuDAO.count_usu();
	}
	
	public void atuli_usu(int idUsuario, String coluna, String novoValor) {
		usuDAO.updat_usu(idUsuario, coluna, novoValor);
	}
	
	public void remover(int id){
            usuDAO.removeUsuario(id);
        }
	
	
}
