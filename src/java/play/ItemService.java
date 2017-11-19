/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

import java.util.List;

/**
 *
 * @author babujhi
 */

//package org.primefaces.showcase.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import org.primefaces.showcase.domain.Car;

@ManagedBean(name = "itemService")
@ApplicationScoped
        
        
public class ItemService {
    
    private final static String[] colors;
	
	private final static String[] brands;
    
    static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";
		
		brands = new String[10];
		brands[0] = "Swords";
		brands[1] = "Pistol";
		brands[2] = "Bow";
		brands[3] = "Trowing knives";
		brands[4] = "Musket";
		brands[5] = "Revolver";
		brands[6] = "Axe";
		brands[7] = "Guisarme";
		brands[8] = "Broadsword";
		brands[9] = "Pitchforks";
	}
    
    public List<Item> createItems(int size) {
        List<Item> list = new ArrayList<Item>();
		for(int i = 0 ; i < size ; i++) {
			list.add(new Item(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
        }
        
        return list;
    }
    
    private String getRandomId() {
		return UUID.randomUUID().toString().substring(0, 8);
	}
    
    
    private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}
	
	private String getRandomColor() {
		return colors[(int) (Math.random() * 10)];
	}
	
	private String getRandomBrand() {
		return brands[(int) (Math.random() * 10)];
	}
    
    private int getRandomPrice() {
		return (int) (Math.random() * 100000);
	}
    
    private boolean getRandomSoldState() {
		return (Math.random() > 0.5) ? true: false;
	}
    
    public List<String> getColors() {
        return Arrays.asList(colors);
    }
    
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}
