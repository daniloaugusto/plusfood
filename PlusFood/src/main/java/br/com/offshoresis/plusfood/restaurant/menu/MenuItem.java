package br.com.offshoresis.plusfood.restaurant.menu;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.NotNull;
import org.jboss.seam.annotations.Name;

import br.com.offshoresis.plusfood.restaurant.Restaurant;
import br.com.offshoresis.plusfood.shoppingcart.item.Item;

@Entity()
@Table(name="tb_menus")
@Name("menu")
public class MenuItem extends Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Restaurant restaurant;
	private String imagePath;
	private String description;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_menu")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@ForeignKey(name="fk_menu_restaurants")
	@JoinColumn(name="id_restaurant")
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	@Column(length=255)
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	@NotNull
	@Column(length=255)
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	@NotNull
	@Column(length=255)	
	public String getName() {
		return super.getName();
	}	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	@NotNull
	public double getPrice() {
		return super.getPrice();
	}
	@Override
	public void setPrice(double price) {
		super.setPrice(price);
	}
	
}
