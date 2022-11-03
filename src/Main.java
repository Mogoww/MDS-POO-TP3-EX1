public class Main {
    public static void main(String[] args) {

        // create products
        Product product1 = new Product("Livre", "Livre de Java", 10, 20.0);
        Product product2 = new Product("Cahier", "Cahier de Java", 10, 10.0);
        // display products
//        System.out.println(product1);
//        System.out.println(product2);
//
//        // update product1 disponibilite
//        product1.addDisponibilite(5);
//        // display product1
//        System.out.println(product1);
//        // subtract product2 disponibilite
//        product2.subtractDisponibilite(15);
//        // display product2
//        System.out.println(product2);



        // Create client
        Client  client1 = new Client("Dupont", "Jean");
        Client  client2 = new Client("Durand", "Pierre");
        // display client
//        System.out.println(client1);
////        System.out.println(client2);
//
//        // add product1 to client1's cart
//        client1.addProductToCart(product1);
//        // display client1
//        System.out.println(client1);
//
//        // update product1 disponibilite
//        client1.addQuantityProductInCart( "Livre", 3);
//        // display client1
//        System.out.println(client1);
//        // subtract product1 disponibilite
//        client1.subtractQuantityProductInCart( "Livre", 1);
//        // display client1
//        System.out.println(client1);
//        // delete product1 from client1's cart
//        client1.deleteProductInCart("Livre");
//        // display client1
//        System.out.println(client1);


         // Create store
        Magasin magasin = new Magasin("Magasin de Java");
        // display store
        System.out.println(magasin);

        magasin.addProduct(product1);
        magasin.addProduct(product2);

        magasin.displayProducts();




    }
}