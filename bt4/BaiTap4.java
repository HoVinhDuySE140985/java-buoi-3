import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaiTap4 {
    public static class Product{
        String pName;
        Double quantity;
        Double price;
        
        public Product() {
        }
        public Product(String pName, Double quantity, Double price) {
            this.pName = pName;
            this.quantity = quantity;
            this.price = price;
        }
        public String getpName() {
            return pName;
        }
        public void setpName(String pName) {
            this.pName = pName;
        }
        public Double getQuantity() {
            return quantity;
        }
        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }
        public Double getPrice() {
            return price;
        }
        public void setPrice(Double price) {
            this.price = price;
        }
    }
    public static class Order{
        String orderId;
        String cusName;
        LocalDate orderDate;
        public Order() {
        }
        public Order(String orderId, String cusName, LocalDate orderDate) {
            this.orderId = orderId;
            this.cusName = cusName;
            this.orderDate = orderDate;
        }
        public String getOrderId() {
            return orderId;
        }
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
        public String getCusName() {
            return cusName;
        }
        public void setCusName(String cusName) {
            this.cusName = cusName;
        }
        public LocalDate getOrderDate() {
            return orderDate;
        }
        public void setOrderDate(LocalDate orderDate) {
            this.orderDate = orderDate;
        }
    }

    public static Product inputInfoProduct(Scanner input){
        Product p = new Product();
        System.out.println("Nhap Ten Hang :");
        p.setpName(input.next());
        System.out.println("Nhap So Luong :");
        p.setQuantity(input.nextDouble());
        System.out.println("Nhap Gia Hang Hoa :");
        p.setPrice(input.nextDouble());
        return p;
    }

    public static void displayProduct(Product p){
        Double thanhTien = 0.0;
        thanhTien = p.getPrice()*p.getQuantity();
        System.out.printf("%-15s%-15s%-15s%-15s\n",p.getpName(),p.getQuantity(),p.getPrice(),thanhTien);
    } 

    public static Map<Order,List<Product>> inputInfoOrder(Scanner input){
        Map<Order,List<Product>> map = new HashMap<>();
        Order o = new Order();
        System.out.println("---------------Nhap Thong Tin Don Hang---------------");
        System.out.println("Nhap So Hoa Don :");
        o.setOrderId(input.next());
        System.out.println("Nhap Ho Va Ten Khach Hang :");
        o.setCusName(input.next());
        System.out.println("Nhap Ngay Mua :");
        o.setOrderDate(LocalDate.parse(input.next()));
        List<Product> products = new ArrayList<>();
        for(int i=1;i<=5;i++){
            System.out.println("---------------NHap THong Tin Cua Hang Hoa"+i+"---------------");
            Product p = inputInfoProduct(input);
            products.add(p);
        }
        map.put(o, products);
        return map;
    }

    public static void displayOrder(Map<Order,List<Product>> map){
        Double totalPrice = 0.0;
        for (Order o : map.keySet()) {
            List<Product> products = map.get(o);
            for (Product p : products) {
                System.out.printf("%-15s%-20s%-15s",o.getOrderId(),o.getCusName(),o.getOrderDate());
                displayProduct(p);
                totalPrice +=  p.getPrice()*p.getQuantity();
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.printf("%104.2f",totalPrice+totalPrice*0.1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Order,List<Product>> map = inputInfoOrder(input);
        System.out.printf("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n","Ma Don hang","Ho Ten Khach Hang","Ngay Mua","Ten Hang","So Luong","Gia","Thanh Tien");
        displayOrder(map);
    }
}
