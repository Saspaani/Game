package org.primefaces.showcase.view.data;
 
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
import org.primefaces.showcase.domain.Car;
 
@ManagedBean
public class RingView implements Serializable {
     
    private List<Car> cars;
    private Car selectedCar;
     
    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
         
        cars.add(new Car("+100", "Armor", 1885, "Black"));
        cars.add(new Car("+40", "Shield", 1400, "Orange"));
        cars.add(new Car("+20", "Helm", 1600, "Red"));
        cars.add(new Car("+5", "Gauntlet", 1700, "Yellow"));
        cars.add(new Car("+15", "Cuisses", 1400, "Blue"));
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}