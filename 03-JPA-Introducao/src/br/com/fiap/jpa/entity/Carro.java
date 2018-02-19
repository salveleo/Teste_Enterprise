package br.com.fiap.jpa.entity;

import java.io.Serializable;
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
import javax.persistence.Transient;

import oracle.jdbc.logging.annotations.Log;


@Entity
@Table(name="TB_CARRO")
@SequenceGenerator(name="carro",sequenceName="SQ_TB_CARRO")
public class Carro implements Serializable{

	@Id
	@Column(name="CD_CARRO")
	@GeneratedValue(generator = "carro" ,strategy = GenerationType.SEQUENCE)
	private int id;

	@Column(name="DS_MODELO",nullable=false,length=100)
	private String modelo;

	//Classe wrapper(Integer) para valores nulos
	@Column(name="NR_ANO",nullable=false)
	private Integer ano;

	@Column(name="DS_MOTOR",length=50)
	private String motor;

	@Column(name="DS_PLACA",length=8)
	private String placa;

	@Column(name="DS_MONTADORA",length=100)
	private String montadora;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_FABRICACAO")
	private Calendar dataFabricacao;

	@Column(name="FG_COLECIONADOR")
	private boolean colecionador;

	@Transient //Nao será mapeado para uma coluna no banco 
	private boolean pagaIPVA;

	@Lob //gravar arquivo no banco de dados (BLOB)
	@Column(name="FL_FOTO")
	private byte[] fotos;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TRANSMISSAO")
	private Transmissao transmissao;

	public Carro(String modelo, Integer ano, String motor, String placa, String montadora, Calendar dataFabricacao,
			boolean colecionador, boolean pagaIPVA, byte[] fotos, Transmissao transmissao) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.motor = motor;
		this.placa = placa;
		this.montadora = montadora;
		this.dataFabricacao = dataFabricacao;
		this.colecionador = colecionador;
		this.pagaIPVA = pagaIPVA;
		this.fotos = fotos;
		this.transmissao = transmissao;
	}

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	











}
