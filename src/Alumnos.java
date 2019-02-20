	
public class Alumnos extends Universitarios{
	
	String Centro;
	
	public Alumnos(String Nombre, String Direccion, String Centro) {
		
		super(Nombre,Direccion);
		this.Centro = Centro;
	}
	
	@Override
	public boolean equals(Object obj) {//Método Equals
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumnos other = (Alumnos) obj;
		if (Centro == null) {
			if (other.Centro != null)
				return false;
		} else if (!Centro.equals(other.Centro))
			return false;
		return true;
	}

	@Override
	public String toString() {//Método toString
		return "Alumnos [Centro=" + Centro + "]";
	}
	
	//Getters y Setters
	
	public String getCentro() {
		return Centro;
	}

	public void setCentro(String centro) {
		Centro = centro;
	}

}
