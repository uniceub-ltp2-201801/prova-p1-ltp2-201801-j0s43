package model;

public class Disciplina {
	private int iddisciplina;
	private int idprofessor;
	private String nomedisciplina;
	private String cursodisciplina;
	private int cargahorariadisciplina;
	
	public Disciplina(int iddisciplina, int idprofessor, String nomedisciplina, String cursodisciplina,
			int cargahorariadisciplina) {
		super();
		this.iddisciplina = iddisciplina;
		this.idprofessor = idprofessor;
		this.nomedisciplina = nomedisciplina;
		this.cursodisciplina = cursodisciplina;
		this.cargahorariadisciplina = cargahorariadisciplina;
	}

	public int getIddisciplina() {
		return iddisciplina;
	}
	public void setIddisciplina(int iddisciplina) {
		this.iddisciplina = iddisciplina;
	}
	public int getIdprofessor() {
		return idprofessor;
	}
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}
	public String getNomedisciplina() {
		return nomedisciplina;
	}
	public void setNomedisciplina(String nomedisciplina) {
		this.nomedisciplina = nomedisciplina;
	}
	public String getCursodisciplina() {
		return cursodisciplina;
	}
	public void setCursodisciplina(String cursodisciplina) {
		this.cursodisciplina = cursodisciplina;
	}
	public int getCargahorariadisciplina() {
		return cargahorariadisciplina;
	}
	public void setCargahorariadisciplina(int cargahorariadisciplina) {
		this.cargahorariadisciplina = cargahorariadisciplina;
	}

	

}
