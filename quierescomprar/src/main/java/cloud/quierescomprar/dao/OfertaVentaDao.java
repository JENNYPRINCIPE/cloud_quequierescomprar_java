package cloud.quierescomprar.dao;

import java.util.List;

import cloud.quierescomprar.model.OfertaVenta;

public interface OfertaVentaDao {

	public List<OfertaVenta> listaOfertaVentaxUsuario();
	public int registroOfertaVenta(OfertaVenta objOfertaVenta);
	public List<OfertaVenta> listaOfertasTotalxUsuario();	
}

