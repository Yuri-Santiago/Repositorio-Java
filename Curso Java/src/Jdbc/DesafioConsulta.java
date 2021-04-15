package Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsulta {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.conectar();
		
		System.out.print("Informe a parte para pesquisa: ");
		String parte = entrada.nextLine();
		
		String sql = "SELECT * FROM pessoas WHERE nome like ?";		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+parte+"%");
		
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo()+" ==> "+p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}
}
