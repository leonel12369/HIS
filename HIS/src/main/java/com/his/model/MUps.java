package com.his.model;
// Generated 22/02/2020 10:57:18 AM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MUps generated by hbm2java
 */
@Entity
@Table(name = "m_ups")
public class MUps implements java.io.Serializable {

	private String codUps;

	public MUps() {
	}

	public MUps(String codUps) {
		this.codUps = codUps;
	}

	@Id

	@Column(name = "cod_ups", unique = true, nullable = false, length = 6)
	public String getCodUps() {
		return this.codUps;
	}

	public void setCodUps(String codUps) {
		this.codUps = codUps;
	}

}
