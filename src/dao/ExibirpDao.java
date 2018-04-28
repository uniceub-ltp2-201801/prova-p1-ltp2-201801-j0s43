package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Professor;

public class ExibirpDao {
	//Atributo
	private Connection conexao;
	
	//metodo construtor
	public ExibirpDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	//Listar os professor
	public ArrayList<Professor> getProfessores(int idprofessor){
		
		ArrayList<Professor> resultado = new ArrayList<Professor>(); 
			
			//Instanciar os objetos
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			

	try {
		//Dethalar
			ps = conexao.prepareStatement("SELECT nomeprofessor, datanascprofessor, nomemaeprofessor, titulacaoprofessor FROM prova1.professor");
			
			/*ps.setInt(1, idprofessor);*/
			
			rs = ps.executeQuery();
			while(rs.next()) {
				resultado.add(new Professor(rs.getInt("idprofessor"), rs.getString("nomeprofessor"), rs.getDate("datanascprofessor"), rs.getString("nomemaeprofessor"), rs.getInt("titulacaoprofessor")));
			}
			
			
			rs.close();
			ps.close();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
				
	
	return resultado;
	}
}
