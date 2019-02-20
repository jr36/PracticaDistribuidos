
public class Universitarios {

	String Nombre, Direccion;
	
	public Universitarios(String Nombre, String Direccion) {
		
		this.Nombre = Nombre;	
		this.Direccion = Direccion;
	}

	@Override
	public boolean equals(Object obj) { //Método Equals();
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Universitarios other = (Universitarios) obj;
		if (Direccion == null) {
			if (other.Direccion != null)
				return false;
		} else if (!Direccion.equals(other.Direccion))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {//Método toString();
		return "Universitarios [Nombre=" + Nombre + ", Direccion=" + Direccion + "]";
	}

	//Getters y Setters
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	

}
