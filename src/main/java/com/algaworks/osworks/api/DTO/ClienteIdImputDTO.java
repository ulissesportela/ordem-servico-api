package com.algaworks.osworks.api.DTO;

import javax.validation.constraints.NotNull;

public class ClienteIdImputDTO {

	@NotNull
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
