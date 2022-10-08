package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 4.10.2022
 **/
public class Main {
    public static void main(String[] args) {

        // attributes / properties

        //ilk değerleri verme:
        Product product = new Product();

        product.setId(1001);
        product.setName("Laptop");
        product.setModel("MacBook Air");
        product.setPrice(15000);
        product.setStockAmount(3);

        //aşağıdaki ifade ile de ilk değerler verilebilir:
        // Product product = new Product(1001,"Laptop","MacBook Air", 15000,3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("Ürün Modeli : " + product.getModel() );
        System.out.println("Ürün Kodu   : " + product.getProductCode() );
        System.out.println("Ürün Fiyatı : " + product.getPrice() + " TL" );

    }
}
