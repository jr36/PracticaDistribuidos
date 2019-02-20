
public class Profesores extends Empleados{

	String Departamento;
	
	public Profesores(String NumeroRegistro, String Nombre, String Direccion, String Departamento) {
		
		super(NumeroRegistro,Nombre,Direccion);
		this.Departamento = Departamento;
	}

	@Override
	public boolean equals(Object obj) {//Método Equals
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesores other = (Profesores) obj;
		if (Departamento == null) {
			if (other.Departamento != null)
				return false;
		} else if (!Departamento.equals(other.Departamento))
			return false;
		return true;
	}

	@Override
	public String toString() {//Método toString
		return "Profesores [Departamento=" + Departamento + "]";
	}

	//Getters y Setters
	
	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	
	
}
