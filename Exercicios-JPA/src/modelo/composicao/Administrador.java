package modelo.composicao;

import javax.persistence.Entity;

@Entity
public class Administrador extends Pessoa{
	
	private String log;
	
	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
}
