package br.com.cdc.loja.daos;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cdc.loja.models.Product;

@Repository
public class ProductDAO {

	@PersistenceContext
	private EntityManager manager;
	
	public void save(Product product) {
		manager.persist(product);
	}

	public List<Product> list() {
		return manager.createQuery("select distinct(p) from Product p", Product.class).getResultList();
	}

	public Product find(Integer id) {
		return manager.find(Product.class, id);
	}
}
