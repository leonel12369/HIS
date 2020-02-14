package com.his.model;
// Generated 14/02/2020 12:38:25 PM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MCie generated by hbm2java
 */
@Entity
@Table(name = "m_cie", catalog = "HIS")
public class MCie implements java.io.Serializable {

	private String codCie;
	private String codCat;
	private String codEnf;
	private String descEnf;

	public MCie() {
	}

	public MCie(String codCie) {
		this.codCie = codCie;
	}

	public MCie(String codCie, String codCat, String codEnf, String descEnf) {
		this.codCie = codCie;
		this.codCat = codCat;
		this.codEnf = codEnf;
		this.descEnf = descEnf;
	}

	@Id

	@Column(name = "cod_cie", unique = true, nullable = false, length = 9)
	public String getCodCie() {
		return this.codCie;
	}

	public void setCodCie(String codCie) {
		this.codCie = codCie;
	}

	@Column(name = "cod_cat", length = 50)
	public String getCodCat() {
		return this.codCat;
	}

	public void setCodCat(String codCat) {
		this.codCat = codCat;
	}

	@Column(name = "cod_enf", length = 50)
	public String getCodEnf() {
		return this.codEnf;
	}

	public void setCodEnf(String codEnf) {
		this.codEnf = codEnf;
	}

	@Column(name = "desc_enf")
	public String getDescEnf() {
		return this.descEnf;
	}

	public void setDescEnf(String descEnf) {
		this.descEnf = descEnf;
	}

}
