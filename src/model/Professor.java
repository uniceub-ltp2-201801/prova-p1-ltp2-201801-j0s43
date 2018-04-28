package model;

import java.sql.Date;

public class Professor {
	private int idprofessor;
	private String nomeprofessor;
	private Date datanascprofessor;
	private String nomemaeprofessor;
	private int titulacaoprofessor;
	
	
	public Professor(int idprofessor, String nomeprofessor, Date datanascprofessor, String nomemaeprofessor,
			int titulacaoprofessor) {
		super();
		this.idprofessor = idprofessor;
		this.nomeprofessor = nomeprofessor;
		this.datanascprofessor = datanascprofessor;
		this.nomemaeprofessor = nomemaeprofessor;
		this.titulacaoprofessor = titulacaoprofessor;
	}

	public int getIdprofessor() {
		return idprofessor;
	}
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}
	public String getNomeprofessor() {
		return nomeprofessor;
	}
	public void setNomeprofessor(String nomeprofessor) {
		this.nomeprofessor = nomeprofessor;
	}
	public Date getDatanascprofessor() {
		return datanascprofessor;
	}
	public void setDatanascprofessor(Date datanascprofessor) {
		this.datanascprofessor = datanascprofessor;
	}
	public String getNomemaeprofessor() {
		return nomemaeprofessor;
	}
	public void setNomemaeprofessor(String nomemaeprofessor) {
		this.nomemaeprofessor = nomemaeprofessor;
	}
	public int getTitulacaoprofessor() {
		return titulacaoprofessor;
	}
	public void setTitulacaoprofessor(int titulacaoprofessor) {
		this.titulacaoprofessor = titulacaoprofessor;
	}
	

}
