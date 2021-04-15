package Jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Israel Leite"));
		System.out.println(dao.incluir(sql, "Ruann Yury"));;
		System.out.println(dao.incluir(sql, "Kelvin Lima"));
		System.out.println(dao.incluir(sql, "Pablo Silva"));
		
		dao.close();
	}
}
