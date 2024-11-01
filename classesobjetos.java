//CODIGO NAO FUNCIONAL
//APENAS PARA INTRODUZIR CLASSES E OBJETOS



package aula04;
public class Principal3 {
	public static void main(String[] args) {
		
		
		//PRIVATE = ACESSAR SOMENTE NA CLASSE E OBJETO
		//PUBLIC = ACESSAR FORA DA CLASSE
		
		//CRIAR CLASSE
		public class Aluno{
			private String nome;
			private String cpf;
			private String rg;
			private String ra;
			//ATRIBUTO STATIC = PERTENCE SOMENTE A CLASSES
			public static boolean temAula;
			
			//CRIAR METODO CONSTRUTOR
			public Aluno(String nome, String ra) {
				this.nome = nome;
				this.ra = ra;
			}
	
			//METODO DE ADICIONAR ALUNO
			public String getNome() {
				return this.nome;
			}
			
			//METODO DE ALTERAR ALUNO
			public void setNome() {
				this.nome = nome;
			}
			
	}
		
		//CRIAR OBJETO
		Aluno aluno1 = new Aluno();

		//CRIAR OBJETO USANDO CONSTRUTOR
		Aluno aluno1 = new Aluno("paulo", "04723-027");
		
		Aluno.temAula = true;
		
		//DETERMINANDO ATRIBUTOS
		aluno1.nome = "Paulo";
		aluno1.cpf = "123534556";
		aluno1.rg = "146676767";
		aluno1.ra = "04723-027";
		
		//DETERMINANDO ATRIBUTOS POR METODOS DE ALTERAR ALUNO
		aluno1.setNome("Paulo");
		aluno1.setCpf("123534556");
		aluno1.setRg("146676767");
		aluno1.setRa("04723-027");
		
	}
}
