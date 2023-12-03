package com.sistematizacao.entregadores.models;

import java.io.Serializable; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ENTREGADOR")
public class EntregadorModel implements Serializable{ 
private static final long serialVersionUID = 1L;  

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Integer cpf;
	private String nome;
	private String capacidade;
	public Integer getId() {
		return id;
	}
	public void setIdEntregador(Integer id) {
		this.id = id;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setAno(String nome) {
		this.nome = nome;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	
}

