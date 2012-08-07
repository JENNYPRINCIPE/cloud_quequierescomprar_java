package cloud.quierescomprar.test;


import org.junit.Assert;
import org.junit.Test;


import cloud.quierescomprar.service.OfertaServiceImp;

public class OfertaWebServiceTest {
	
	
	//@Test
	public void testListaOfertasDelDia() {
		OfertaServiceImp servicio= new OfertaServiceImp();
		Assert.assertEquals(2, servicio.listaOfertasDelDia().length);
		
		//IMPRESION DE RESULTADOS EN CONSOLA
		String fila="";
		for(int i=0;i<servicio.listaOfertasDelDia().length;i++){
			fila=servicio.listaOfertasDelDia()[i];
			String[]celdas=fila.split("#");
			for(int j=0;j<celdas.length;j++){
				System.out.println(celdas[j]);
			}
			
		}
	
	}
	
	
	
	//@Test
	public void testRegistroOfertaVenta(){
		
		OfertaServiceImp servicio= new OfertaServiceImp();
		Assert.assertEquals(1, servicio.registroOfertaVenta(1, "1", 1, "orellana@sss.com", "EF"));
		
		
	}
	
	
	@Test
	public void testListaOfertasPorVencer() {
		OfertaServiceImp servicio= new OfertaServiceImp();
		int tamano=servicio.listaOfertasPorVencer(19).length;
		Assert.assertEquals(1, tamano);
		
		//IMPRESION DE RESULTADOS EN CONSOLA
		String fila="";
		for(int i=0;i<tamano;i++){
			fila=servicio.listaOfertasPorVencer(19)[i];
			String[]celdas=fila.split("#");
			for(int j=0;j<celdas.length;j++){
				System.out.println(celdas[j]);
			}
			
		}
	
	}
	
	

	/*
	@Test
	public void testListaOfertasVencer(){
		OfertaServiceImp servicio= new OfertaServiceImp();
		Assert.assertEquals(1, servicio.listaOfertasPorVencer(8).size());
		
		//IMPRESION DE RESULTADOS EN CONSOLA
		for(Oferta objOferta:servicio.listaOfertasPorVencer(8))
		{
			
			System.out.println("EMPRESA "+objOferta.getEmpresa().getRuc()+"-"+objOferta.getEmpresa().getRazonSocial());
			System.out.println("DESCRIPCION OFERTA "+objOferta.getDescripcion());
			System.out.println("PRECIO "+objOferta.getPrecio());
			System.out.println("DESCUENTO "+objOferta.getDescuento());
			System.out.println("PRECIO OFERTA "+(objOferta.getPrecio().doubleValue()*objOferta.getDescuento().doubleValue()));
			
		}
	
	}
	*/
	
}
