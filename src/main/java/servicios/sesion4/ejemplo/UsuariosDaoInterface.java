package servicios.sesion4.ejemplo;

import java.util.List;

public interface UsuariosDaoInterface {
	public String muestraVersion();
	public void creaTabla();
	public void insertaUsuarios(Usuario usuario);
	public int List<Usuario> leeUsuarios();
	public Usuario buscaUsuario (int id);
}
