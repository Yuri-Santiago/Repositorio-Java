package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioUpdate {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.conectar();
		
		System.out.print("Informe o ID para atualização: ");
		int id = entrada.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			
			System.out.println("O nome atual é: "+ p.getNome());
			entrada.nextLine();
			
			System.out.print("Informe o nome para atualização: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);
			
			stmt.execute();
			
			System.out.println("Atualizado com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
