package br.com.pirelli.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "impressora")
@DiscriminatorValue("IMPRESSORA")
public class Impressora extends Equipamento
{

	private static final long serialVersionUID = 1L;
	private String nomeRede;
	private String email;
	private String numeroDeSerie;
	private String enderecoIP;
	private TipoImpressora tipoImpressora;
	private CategoriaImpressora categoriaImpressora;
	private Toner toner;
	
	@NotBlank(message="Fila de impressão ou WK deve ser informado")
	@Column(name="nome_rede", nullable=false, unique=false)
	public String getNomeRede() {
		return nomeRede;
	}
	public void setNomeRede(String nomeRede) {
		this.nomeRede = nomeRede;
	}
	
	@Email(message="E-mail inválido")
	@Column(name="email", nullable=true, unique=false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotBlank(message="O número de série deve ser informado")
	@Column(name="numero_serie", nullable = false, unique=false)
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	
	@Column(name="endereco_ip", nullable=true, unique=false)
	public String getEnderecoIP() {
		return enderecoIP;
	}
	public void setEnderecoIP(String enderecoIP) {
		this.enderecoIP = enderecoIP;
	}
	
	@Enumerated(EnumType.STRING)
	public TipoImpressora getTipoImpressora() {
		return tipoImpressora;
	}
	public void setTipoImpressora(TipoImpressora tipoImpressora) {
		this.tipoImpressora = tipoImpressora;
	}
	
	@NotNull(message="A categoria da Impressora deve ser informada")
	@Enumerated(EnumType.STRING)
	@Column(name="categoria_impressora", nullable=false, unique=false)
	public CategoriaImpressora getCategoriaImpressora() {
		return categoriaImpressora;
	}
	public void setCategoriaImpressora(CategoriaImpressora categoriaImpressora) {
		this.categoriaImpressora = categoriaImpressora;
	}
	@NotNull(message="Toner ou Ribon deve ser informado")
	@ManyToOne
	@JoinColumn(name="codigo_toner", nullable=false, unique=false)
	public Toner getToner() {
		return toner;
	}
	public void setToner(Toner toner) {
		this.toner = toner;
	}
	
	@Transient
	public boolean isNova()
	{
		return this.getCodigo() == null;
	}
	
}
