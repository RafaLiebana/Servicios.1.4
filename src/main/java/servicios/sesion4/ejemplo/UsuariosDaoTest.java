package servicios.sesion4.ejemplo;

import java.util.List;

public class UsuariosDaoTest implements UsuariosDaoInterface {
	public List<Usuario> leeUsuarios(){
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario(1,"Usuario Test"));
		lista.add(new Usuario(2,"Usuario Test"));
		lista.add(new Usuario(3,"Usuario Test"));
	}
	
	public String muestraVersion(){
		return "DAO para prop�sitos de Test, sin conexi�n real a base de datos";
	}

}
