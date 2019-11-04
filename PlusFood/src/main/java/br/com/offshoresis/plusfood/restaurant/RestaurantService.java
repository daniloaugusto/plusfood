package br.com.offshoresis.plusfood.restaurant;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.datamodel.DataModel;

@SuppressWarnings("unchecked")
@Name("restaurantService")
@Scope(ScopeType.SESSION)
public class RestaurantService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@In 
	private EntityManager em;
	
	@DataModel
	private List<Restaurant> restaurants;
	
	@Factory("restaurants")
	public void listRestaurants() {
		restaurants = em.createQuery("from Restaurant").getResultList();
	}

}
