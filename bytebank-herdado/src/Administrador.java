
public class Administrador extends Funcionario implements Autenticavel {

	private int senha = 2222;
	
	public void autentica(Gerente g) {
		boolean autenticou  = g.autentica(this.senha);
		if (autenticou){
			System.out.println("Pode entrar no sistema.");
			} else {
				System.out.println("Não pode entrar no sistema.");
			}
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
