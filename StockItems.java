public class StockItems {
    private int idNum;
    private String name;
    private String desc;
    private double price;
    private int quantity;


    StockItems(String name, String desc, double price, int quantity) {
        this.idNum = 0;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StockItems{" +
                "idNum=" + idNum +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String args[]) {
        // create the stockitems
        StockItems s1 = new StockItems("apples", "Some bullshit apples", 10.0, 10);
        StockItems s2 = new StockItems("oranges", "Some fucking oranges", 9.0, 20);

        // add the object
        StockItems[] stockItemsList = {s1, s2};

        s1.setIdNum(0);
        s2.setIdNum(1);

        // how to set a different price
        s2.setPrice(11.0);

        //print or getting the price
        //System.out.println(s2.getPrice());

        System.out.println(s1);
        System.out.println(s2);
    }
}