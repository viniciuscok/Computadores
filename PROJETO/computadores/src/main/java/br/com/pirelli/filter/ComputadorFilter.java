package br.com.pirelli.filter;

import br.com.pirelli.model.Impressora;
import br.com.pirelli.model.Marca;
import br.com.pirelli.model.Modelo;
import br.com.pirelli.model.Setor;
import br.com.pirelli.model.So;
import br.com.pirelli.model.Status;
import br.com.pirelli.model.TipoComputador;
import br.com.pirelli.model.Usuario;

public class ComputadorFilter 
{
	private Long codigo;
	private String nome;
	private TipoComputador tipoComputador;
	private Modelo modelo;
	private So sistemaOperacional;
	private String code;
	private Impressora impressora;
	private Status status;
	private Marca marca;
	private Setor setor;
	private Usuario usuario;

	
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoComputador getTipoComputador() {
		return tipoComputador;
	}

	public void setTipoComputador(TipoComputador tipoComputador) {
		this.tipoComputador = tipoComputador;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public So getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(So sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Impressora getImpressora() {
		return impressora;
	}

	public void setImpressora(Impressora impressora) {
		this.impressora = impressora;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
