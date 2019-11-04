package br.com.offshoresis.plusfood.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.RaiseEvent;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.log.Log;

import br.com.offshoresis.plusfood.shoppingcart.item.Item;

@Name("shoppingcart")
@Scope(ScopeType.CONVERSATION)
public class Shoppingcart {
	public static final String EV_CONFIRM_NAME = "orderConfirmed";
	public static final String EV_CANCEL_NAME = "orderCanceled";
	
	@In 
	private EntityManager em;
	
	@Logger 
	private Log log;
	
	private List<Item> itens = new ArrayList<>();	

	public List<Item> getItens() {
		return itens;
	}
	
	public void setItens(List<Item> itens) {
		throw new IllegalArgumentException();
	}	

	public void addItem(Item item) {}
	
	public void removeItem(Item item) {}
	
	@RaiseEvent(EV_CONFIRM_NAME)
	public String confirmarPedido() {
		log.debug("#{vendor} - pedido confirmado");
		return EV_CONFIRM_NAME;
	}

	@RaiseEvent(EV_CANCEL_NAME)
	public String cancelarPedido() {
		itens.clear();
		log.debug("#{vendor} - pedido cancelado");
		return EV_CANCEL_NAME;
	}

}
