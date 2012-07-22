package cloud.quierescomprar.model;

// Generated 22/07/2012 10:45:08 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OfertaVenta generated by hbm2java
 */
@Entity
@Table(name = "oferta_venta", catalog = "bd_quequierescomprar_empresa")
public class OfertaVenta implements java.io.Serializable {

	private OfertaVentaId id;
	private Oferta oferta;
	private Usuario usuario;
	private String codMedioPago;

	public OfertaVenta() {
	}

	public OfertaVenta(OfertaVentaId id, Oferta oferta, Usuario usuario,
			String codMedioPago) {
		this.id = id;
		this.oferta = oferta;
		this.usuario = usuario;
		this.codMedioPago = codMedioPago;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "CEmpresa", column = @Column(name = "C_EMPRESA", nullable = false)),
			@AttributeOverride(name = "COferta", column = @Column(name = "C_OFERTA", nullable = false, length = 6)),
			@AttributeOverride(name = "linea", column = @Column(name = "LINEA", nullable = false)) })
	public OfertaVentaId getId() {
		return this.id;
	}

	public void setId(OfertaVentaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "C_EMPRESA", referencedColumnName = "C_EMPRESA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "C_OFERTA", referencedColumnName = "C_OFERTA", nullable = false, insertable = false, updatable = false) })
	public Oferta getOferta() {
		return this.oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "C_EMPRESA", referencedColumnName = "C_EMPRESA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EMAIL_USUARIO", referencedColumnName = "EMAIL", nullable = false, insertable = false, updatable = false) })
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "COD_MEDIO_PAGO", nullable = false, length = 2)
	public String getCodMedioPago() {
		return this.codMedioPago;
	}

	public void setCodMedioPago(String codMedioPago) {
		this.codMedioPago = codMedioPago;
	}

}
