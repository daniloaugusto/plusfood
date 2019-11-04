package br.com.offshoresis.plusfood.restaurant;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.End;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.international.StatusMessages;

@Name("restaurantManager")
@Scope(ScopeType.CONVERSATION)
public class RestaurantManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@In
	private EntityManager em;
	
	@Out
	private Restaurant restaurant;
	
	@Begin
	public void showRestaurantDetails(Restaurant restaurant) {
		this.restaurant = em.merge(restaurant);
	}
	
	@End
	@Observer("orderCanceled")
	public void pedidoCancelado() {
		StatusMessages.instance().add("Pedido cancelado");
		StatusMessages.instance().add("Esperamos a sua próxima visita!");
	}
	
	@End
	@Observer("orderConfirmed")
	public void pedidoConfirmado() {}

}