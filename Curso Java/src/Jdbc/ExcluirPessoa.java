package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.conectar();

		System.out.println("Informe o id: ");
		int codigo = entrada.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		if(contador > 0) {
			System.out.println("Pessoa excluída com sucesso!");
			System.out.println("Linhas afetadas: "+ contador);
		} else {
			System.out.println("ID não existe!");
		}
		
		conexao.close();
		entrada.close();
	}
}
