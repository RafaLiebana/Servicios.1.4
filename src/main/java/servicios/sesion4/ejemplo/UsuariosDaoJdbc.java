package servicios.sesion4.ejemplo;

import java.util.List;

public class UsuariosDaoJdbc implements UsuariosDaoInterface {
	public List<Usuario> leeUsuarios(){
		String sql = "select * from usuarios";
		UsuarioMapper mapper = new UsuarioMapper();
		List<Usuario> usuarios = this.jdbcTemplate.query(sql,mapper);
		return usuarios;
	}
	
	public String muestraVersion(){
		return "Conexión a base de datos usando JDBCTemplate";
	}
	
}
