package access.ex;

public class Item {
    private String itemName;
    private int price;
    private int count;

    public Item(String itemName, int price, int count){
        this.itemName = itemName;
        this.count = count;
        this.price = price;
    }

    public String getItemName(){
        return itemName;
    }

    public int getTotalPrice(){
        return price * count;
    }
}

