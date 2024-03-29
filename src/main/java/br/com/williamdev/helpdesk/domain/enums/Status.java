package br.com.williamdev.helpdesk.domain.enums;

public enum Status {

	ABERTO(0, "ROLE_ABERTO"),
	ANDAMENTO(1, "ROLE_ANDAMENTO"),
	ENCERRADO(2, "ROLE_ENCERRADO");
	
	private int codigo;
	private String descricao;
	
	private Status(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Status x : Status.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Status inválido");
		
	}
	
}
