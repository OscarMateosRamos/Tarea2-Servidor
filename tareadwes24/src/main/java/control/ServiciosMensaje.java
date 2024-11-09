package control;

import java.util.Collection;

import dao.MensajeDAO;
import modelo.Mensaje;
import utils.ConexBD;

public class ServiciosMensaje {
	private ConexBD con;
	private MensajeDAO mensajeDAO;

	public ServiciosMensaje() {
		con = ConexBD.getInstance();
		mensajeDAO = (MensajeDAO) con.getMensajeDAO();
	}

	public long insertarMensaje(Mensaje m) {
		return mensajeDAO.insertar(m);

	}

	public Collection<Mensaje> verMensajeIdPersona(long identificador) {
		return mensajeDAO.buscarPorIdPersona(identificador);

	}

	public Collection<Mensaje> verMensajeIdEjemplar(long identificador) {
		return mensajeDAO.buscarPorIdEjemplar(identificador);

	}
	
	public Collection<Mensaje> vertodosMensajes() {
		return mensajeDAO.verTodas();

	}

}
