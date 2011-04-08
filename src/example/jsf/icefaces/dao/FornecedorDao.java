package example.jsf.icefaces.dao;

import org.hibernate.Session;

import example.jsf.icefaces.modelo.Fornecedor;


public class FornecedorDao extends Dao<Fornecedor> {

	public FornecedorDao(Session session) {
		super(session, Fornecedor.class);
	}
}
