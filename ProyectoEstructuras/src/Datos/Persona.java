package Datos;

public abstract class Persona {
	
	public static int contador = 1;
	public int id;
	public String nombre;
	public int cedula;
	public String usuario;
	public String correo;
	public String celular;
	public String rol;
	public String direccion;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Persona(String nombre, int cedula, String usuario, String correo, String celular,
			String direccion) {
		super();
		this.id = contador++;
		this.nombre = nombre;
		this.cedula = cedula;
		this.usuario = usuario;
		this.correo = correo;
		this.celular = celular;;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", usuario=" + usuario + ", correo="
				+ correo + ", celular=" + celular + ", rol=" + rol + ", direccion=" + direccion + "]";
	}

}
