package cloud.quierescomprar.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import cloud.quierescomprar.model.OfertaVenta;
import cloud.quierescomprar.util.HibernateUtil;

public class OfertaVentaDaoImpl implements OfertaVentaDao {

public List<OfertaVenta> listaOfertaVentaxUsuario() {
		
		Session sesion = HibernateUtil.getSessionFactory();
		
		
		List<OfertaVenta> listaOfertasxUsuario=null;
		Query q= null;
		q=sesion.createQuery("from usuario u join fetch u.ofertaventa o where :nomusuario= u.email");
	    String newString = new String();
		//Date newDate=new Date();
		q.setString("nomusuario", newString);
		listaOfertasxUsuario=q.list();
		
		return listaOfertasxUsuario;		
	}

	public int registroOfertaVenta(OfertaVenta objOfertaVenta) {
		Session sesion = HibernateUtil.getSessionFactory();
		
		int retorno=0;
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			sesion.save(objOfertaVenta);
		
			tx.commit();
			retorno = 1;
		} catch (Exception ex) {
			tx.rollback();
			System.out.println(ex.toString());
			retorno = 0;
		} finally {
			sesion.close();
		}
		
		return retorno;
		
	}

	public List<OfertaVenta> listaOfertasTotalxUsuario() {
		Session sesion = HibernateUtil.getSessionFactory();
		
		
		List<OfertaVenta> listaOfertas=null;
		Query q= null;
		q=sesion.createQuery("from usuario u join fetch u.ofertaventa o");
	   
		listaOfertas=q.list();
		
		return listaOfertas;
	}	
	
	
}
