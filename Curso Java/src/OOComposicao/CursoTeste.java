package OOComposicao;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Yuri");
		Aluno a2 = new Aluno("Raquel");
		Aluno a3 = new Aluno("Juju");
		
		Curso c1 = new Curso("Java Completo");
		Curso c2 = new Curso("Web Completo");
		Curso c3 = new Curso("Python Completo");
		
		c1.addAluno(a1);
		c1.addAluno(a2);
		
		c2.addAluno(a1);
		c2.addAluno(a3);
		
		a1.addCurso(c3);
		a2.addCurso(c3);
		a3.addCurso(c3);
		
		for(Aluno aluno: c3.alunos) {
			System.out.println("Estou matriculado no curso "+c3.nome);
			System.out.println("e o meu nome é "+aluno.nome);
			System.out.println();
		}
		
		System.out.println(a1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = a1.getCurso("Java Completo");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
