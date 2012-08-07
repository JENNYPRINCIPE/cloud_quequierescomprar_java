package cloud.quierescomprar.service;

import java.util.List;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cloud.quierescomprar.model.Oferta;
import cloud.quierescomprar.model.OfertaVenta;




@WebService
public interface OfertaService {
	
	//M�todo del servicio que lista las ofertas del d�a.
	@WebResult(name="ofertasDelDia")
	public String[] listaOfertasDelDia();
	
	//M�todo del servicio que registra una oferta venta en la base de datos.
	public int registroOfertaVenta(@WebParam(name="codEmpresa")int codEmpresa,@WebParam(name="codOferta")String codOferta,
			@WebParam(name="codLinea")int codLinea,@WebParam(name="email")String email,
			@WebParam(name="codMedioPago")String codMedioPago);
	
	// Codigo Kid Rivera
	public String[] listaOfertasPorVencer(@WebParam(name="dias") int dias);
	
	
}
