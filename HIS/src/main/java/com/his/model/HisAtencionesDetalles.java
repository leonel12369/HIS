package com.his.model;
// Generated 22/02/2020 10:57:18 AM by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HisAtencionesDetalles generated by hbm2java
 */
@Entity
@Table(name = "his_atenciones_detalles")
public class HisAtencionesDetalles implements java.io.Serializable {

	private long id;
	private HisAtenciones hisAtenciones;
	private Integer anio;
	private Integer mes;
	private String codigoItem;
	private String tipoDiagnostico;
	private String valorLab;

	public HisAtencionesDetalles() {
	}

	public HisAtencionesDetalles(long id) {
		this.id = id;
	}

	public HisAtencionesDetalles(long id, HisAtenciones hisAtenciones, Integer anio, Integer mes, String codigoItem,
			String tipoDiagnostico, String valorLab) {
		this.id = id;
		this.hisAtenciones = hisAtenciones;
		this.anio = anio;
		this.mes = mes;
		this.codigoItem = codigoItem;
		this.tipoDiagnostico = tipoDiagnostico;
		this.valorLab = valorLab;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cita")
	public HisAtenciones getHisAtenciones() {
		return this.hisAtenciones;
	}

	public void setHisAtenciones(HisAtenciones hisAtenciones) {
		this.hisAtenciones = hisAtenciones;
	}

	@Column(name = "anio")
	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	@Column(name = "mes")
	public Integer getMes() {
		return this.mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	@Column(name = "codigo_item", length = 9)
	public String getCodigoItem() {
		return this.codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	@Column(name = "tipo_diagnostico", length = 1)
	public String getTipoDiagnostico() {
		return this.tipoDiagnostico;
	}

	public void setTipoDiagnostico(String tipoDiagnostico) {
		this.tipoDiagnostico = tipoDiagnostico;
	}

	@Column(name = "valor_lab", length = 4)
	public String getValorLab() {
		return this.valorLab;
	}

	public void setValorLab(String valorLab) {
		this.valorLab = valorLab;
	}

}
