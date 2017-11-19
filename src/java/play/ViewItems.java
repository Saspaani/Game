/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;
 

import java.awt.Button;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.DragDropEvent;
//import org.primefaces.showcase.domain.Item;
//import org.primefaces.showcase.service.CarService;
//import src.main.java.org.primefaces.showcase.domain; 

//Ajout Babu 
import play.Item;
import play.ItemService;

@ManagedBean(name = "ViewItems")
@ViewScoped


/**
 *
 * @author babujhi
 */
public class ViewItems implements Serializable {
  
    @ManagedProperty("#{itemService}")
    private ItemService service;
 
    private List<Item> items;
     
    private List<Item> droppedItems;
     
    private Item selectedItem;
    
    private Mission mission; 
    
    private Item delete;
    
    
    @PostConstruct
    public void init() {
        items = service.createItems(9);
        droppedItems = new ArrayList<Item>();
    }
     
    public void onItemDrop(DragDropEvent ddEvent) {
        Item item = ((Item) ddEvent.getData());
  
        droppedItems.add(item);
        items.remove(item);
    }
     
    public void setService(ItemService service) {
        this.service = service;
    }
 
    public List<Item> getItems() {
        return items;
    }
 
    public List<Item> getDroppedItems() {
        return droppedItems;
    }    
 
    public Item getSelectedItem() {
        return selectedItem;
    }
 
    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public void deleteItem(Item item){
        
        droppedItems.remove(item);
        items.add(item);
    }
    
    // Méthode test
    
    public List<Item> testbabu1(){
        Item it1 = new Item("1", "sword", 2015, "blue");
        List<Item> List1 = new ArrayList<Item>();
        List1.add(it1);
    return List1;
    }
}