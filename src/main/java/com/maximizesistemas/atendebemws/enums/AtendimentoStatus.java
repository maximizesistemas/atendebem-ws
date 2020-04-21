package com.maximizesistemas.atendebemws.enums;

public enum AtendimentoStatus {

	ABERTURA(1),
	EMATENDIMENTO(2),
	ENCERRADO(3);
	
	private int code;
	
	private AtendimentoStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static AtendimentoStatus valueOf (int code) {
		for (AtendimentoStatus value : AtendimentoStatus.values()) {
			if (value.getCode() == code) return value;
		}
		throw new IllegalArgumentException("Invalid Atendimento Status Code");
	}
 }
