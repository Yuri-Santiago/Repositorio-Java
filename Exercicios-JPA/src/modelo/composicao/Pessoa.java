package modelo.composicao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {

   @Id  
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id; 

   private String nome;
 
   private String login;

   private String senha;
   
   public Pessoa() {

   }

   public Pessoa(String nome, String login, String senha) {
	   super();
	   this.nome = nome;
	   this.login = login;
	   this.senha = senha;
	   }
	
   public Integer getId() {
	   return id;
   }
	
   public void setId(Integer id) {
	   this.id = id;
   }
	
   public String getNome() {
	   return nome;
   }
	
   public void setNome(String nome) {
	   this.nome = nome;
   }
	
   public String getLogin() {
	   return login;
   }
	
   public void setLogin(String login) {		
	   this.login = login;
   }
   
   public String getSenha() {
	   return senha;	
   }
	
   public void setSenha(String senha) {
	   this.senha = senha;
   }   
}