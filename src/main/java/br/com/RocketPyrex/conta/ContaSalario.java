package br.com.RocketPyrex.conta;

@SuppressWarnings("serial")
public class ContaSalario extends ContaBancaria {
	
	public ContaSalario() {
		
	};
	
	public ContaSalario(Integer codConta, Integer t_banco_cod_banco, Integer t_usuario_cod_usuario, String numAgencia,
			String digitoAgencia, String numConta, String digitoConta, Double saldo) {
		super(codConta, t_banco_cod_banco, t_usuario_cod_usuario, numAgencia, digitoAgencia, numConta, digitoConta, saldo);

	}
	
}
