//Gerente herda atributos de funcion�rio
public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return senha;
	}
	
	//reescrita na classe que herda. Mesma assinatura de m�todo	
	public double getBonificacao(){
		return super.getBonificacao() + super.getSalario();
	}	
}