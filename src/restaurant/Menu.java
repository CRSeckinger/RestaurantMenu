package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items, Date lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        for (int i = 0; i < items.size(); i++) {
            this.items.remove(items.indexOf(i));
        } return this.items;
    }

    public Date lastUpdated () {
        return this.lastUpdated;
    }

    public String toString () {
        return "Menu Items: " + this.items + " Last Updated: " + this.lastUpdated;
    }


}



