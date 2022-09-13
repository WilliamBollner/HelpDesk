package br.com.williamdev.helpdesk.domain.enums;

public enum Prioridade {
	
	BAIXA(0, "ROLE_BAIXA"),
	MEDIA(1, "ROLE_MEDIA"),
	ALTA(2, "ROLE_ALTA");
	
	private int codigo;
	private String descricao;
	
	private Prioridade(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Prioridade x : Prioridade.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade inválida");
		
	}

}
