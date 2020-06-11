package com.algaworks.osworks.api.DTO;

import javax.validation.constraints.NotBlank;

public class ComentarioImputDTO {

	@NotBlank
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
