package cloud.quierescomprar.model;

// Generated 22/07/2012 10:45:08 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuarioId generated by hbm2java
 */
@Embeddable
public class UsuarioId implements java.io.Serializable {

	private short CEmpresa;
	private String email;

	public UsuarioId() {
	}

	public UsuarioId(short CEmpresa, String email) {
		this.CEmpresa = CEmpresa;
		this.email = email;
	}

	@Column(name = "C_EMPRESA", nullable = false)
	public short getCEmpresa() {
		return this.CEmpresa;
	}

	public void setCEmpresa(short CEmpresa) {
		this.CEmpresa = CEmpresa;
	}

	@Column(name = "EMAIL", nullable = false, length = 40)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsuarioId))
			return false;
		UsuarioId castOther = (UsuarioId) other;

		return (this.getCEmpresa() == castOther.getCEmpresa())
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCEmpresa();
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		return result;
	}

}
