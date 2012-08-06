package cloud.quierescomprar.service;

import java.util.List;

import javax.jws.WebService;

import cloud.quierescomprar.dao.OfertaVentaDao;
import cloud.quierescomprar.dao.OfertaVentaDaoImpl;
import cloud.quierescomprar.model.OfertaVenta;

@WebService(endpointInterface="cloud.quierescomprar.service.OfertaVentaService")
public class OfertaVentaServiceImpl implements OfertaVentaService {

	OfertaVentaDao dao= new OfertaVentaDaoImpl();
	
	public List<OfertaVenta> listaOfertaVentaxUsuario() {
		// TODO Auto-generated method stub
		return dao.listaOfertaVentaxUsuario();
	}

	public int registroOfertaVenta(OfertaVenta objOfertaVenta) {
		// TODO Auto-generated method stub
		return dao.registroOfertaVenta(objOfertaVenta);
	}
}