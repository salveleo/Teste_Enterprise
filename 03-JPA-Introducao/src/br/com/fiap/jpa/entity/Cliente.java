package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name = "cliente", sequenceName="SQ_TB_CLIENTE")
public class Cliente {
	
	@Id
	@Column(name= "CD_CLIENTE")
	@GeneratedValue(generator="cliente", strategy=GenerationType.SEQUENCE)
	private int id;
	
	
	@Column(name="DS_NOME", length=150, nullable=false)
	private String nome;
	
	@Column(name="DT_NASCIMENTO", nullable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	
	@Column(name="CD_CARTAO_FIDELIDADE")
	private int codigoCartaoFidelidade;
	
	@Column(name="DS_SEXO")
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_STATUS",nullable=false)
	private Status status;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setdataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getCodigoCartaoFidelidade() {
		return codigoCartaoFidelidade;
	}
	public void setCodigoCartaoFidelidade(int codigoCartaoFidelidade) {
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Cliente(String nome, Calendar dataNascimento, int codigoCartaoFidelidade, Sexo sexo, byte[] foto,
			Status status) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.codigoCartaoFidelidade = codigoCartaoFidelidade;
		this.sexo = sexo;
		this.foto = foto;
		this.status = status;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
