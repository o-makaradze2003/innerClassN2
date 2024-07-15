package org.example;

public class Store {
    void announceSale() {
        class Sale {
            void printSaleDetails() {
                System.out.println("sold");
            }
        }
        Sale sale = new Sale();
        sale.printSaleDetails();
    }
}
