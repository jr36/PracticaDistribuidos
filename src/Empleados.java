
public class Empleados extends Universitarios{

	String NumeroRegistro;
	
	public Empleados(String Nombre, String Direccion, String NumeroRegistro) {
		
		super(Nombre,Direccion);
		this.NumeroRegistro = NumeroRegistro;
	}

	@Override
	public boolean equals(Object obj) {//Método Equals
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		if (NumeroRegistro == null) {
			if (other.NumeroRegistro != null)
				return false;
		} else if (!NumeroRegistro.equals(other.NumeroRegistro))
			return false;
		return true;
	}
	
	@Override
	public String toString() {//Método toString
		return "Empleados [NumeroRegistro=" + NumeroRegistro + "]";
	}

	//Getters y Setters
	
	public String getNumeroRegistro() {
		return NumeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		NumeroRegistro = numeroRegistro;
	}

}
