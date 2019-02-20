
public class PAS extends Empleados{

	String UnidadAdministrativa;
	
	public PAS(String Nombre, String Direccion, String NumeroRegistro, String UnidadAdministrativa) {
		
		super(Nombre,Direccion,NumeroRegistro);
		this.UnidadAdministrativa = UnidadAdministrativa;
		
	}

	@Override
	public boolean equals(Object obj) {//Método Equals
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PAS other = (PAS) obj;
		if (UnidadAdministrativa == null) {
			if (other.UnidadAdministrativa != null)
				return false;
		} else if (!UnidadAdministrativa.equals(other.UnidadAdministrativa))
			return false;
		return true;
	}

	@Override
	public String toString() {//Método toString
		return "PAS [UnidadAdministrativa=" + UnidadAdministrativa + "]";
	}

	//Getters y Setters
	
	public String getUnidadAdministrativa() {
		return UnidadAdministrativa;
	}

	public void setUnidadAdministrativa(String unidadAdministrativa) {
		UnidadAdministrativa = unidadAdministrativa;
	}

	
}
