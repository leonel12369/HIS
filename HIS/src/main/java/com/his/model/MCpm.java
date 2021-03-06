package com.his.model;
// Generated 22/02/2020 10:57:18 AM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MCpm generated by hbm2java
 */
@Entity
@Table(name = "m_cpm")
public class MCpm implements java.io.Serializable {

	private String codCpm;
	private Double codigo;
	private String descCpm;

	public MCpm() {
	}

	public MCpm(String codCpm) {
		this.codCpm = codCpm;
	}

	public MCpm(String codCpm, Double codigo, String descCpm) {
		this.codCpm = codCpm;
		this.codigo = codigo;
		this.descCpm = descCpm;
	}

	@Id

	@Column(name = "cod_cpm", unique = true, nullable = false, length = 15)
	public String getCodCpm() {
		return this.codCpm;
	}

	public void setCodCpm(String codCpm) {
		this.codCpm = codCpm;
	}

	@Column(name = "codigo", precision = 53, scale = 0)
	public Double getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Double codigo) {
		this.codigo = codigo;
	}

	@Column(name = "desc_cpm")
	public String getDescCpm() {
		return this.descCpm;
	}

	public void setDescCpm(String descCpm) {
		this.descCpm = descCpm;
	}

}
