package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.conectar();
		
		System.out.println("Conexao efetuada com sucesso!");
		conexao.close();
	}
}
