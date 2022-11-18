package br.com.RocketPyrex.conta;

public class TipoTransacao {
	
	private Integer cod_tp_transacao;
	private String ds_tp_transacao;
	
	public TipoTransacao() {};
	
	public TipoTransacao(Integer cod_tp_transacao, String ds_tp_dransacao) {
		super();
		this.cod_tp_transacao = cod_tp_transacao;
		this.ds_tp_transacao = ds_tp_dransacao;
	}

	public Integer getCod_tp_transacao() {
		return cod_tp_transacao;
	}

	public void setCod_tp_transacao(Integer cod_tp_transacao) {
		this.cod_tp_transacao = cod_tp_transacao;
	}

	public String getDs_tp_transacao() {
		return ds_tp_transacao;
	}

	public void setDs_tp_transacao(String ds_tp_transacao) {
		this.ds_tp_transacao = ds_tp_transacao;
	}

	@Override
	public String toString() {
		return "TipoTransacao [cod_tp_transacao = " + cod_tp_transacao + ", ds_tp_transacao = " + ds_tp_transacao + "]";
	}

	
}
