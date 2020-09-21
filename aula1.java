package prog;

class Pessoa {
	//Atributos
	private String nome;
	private char sexo;
	private String dataNasc;
	private String estadoCivil; // outra forma de inicializar seria private String estadoCivil = "Solteiro"
	
	//Metodos
	public Pessoa(String nome, char sexo, String data) {
		this.nome = nome;
		this.setSexo(sexo); // Fica um unico de verificacao, pois ele so puxa dos outros metodos abaixo. Aqui so e chamado o ponto do setSexo
		this.dataNasc = data;
		this.estadoCivil = "Solteiro";
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		if (sexo == 'F' || sexo == 'M') {
			this.sexo = sexo;
		}
	}
}

public class aula1 {

}
