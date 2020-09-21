package prog;

class Produto{
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int desconto;
	
	
	public Produto(String nome, String desc, double unitario, int desconto) {
		this.setNome(nome);
		this.setDescricao(desc);
		this.setPrecoUnitario(unitario);
		this.setDesconto(desconto);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String desc) {
		this.descricao = desc;
	}
	
	public void setPrecoUnitario(double unitario) {
		this.precoUnitario = unitario;
	}
	
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
}


public class exercio2 {

}
