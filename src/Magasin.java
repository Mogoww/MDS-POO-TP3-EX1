import java.util.ArrayList;
import java.util.UUID;

public class Magasin {

    //---------------------------------Attributs---------------------------------
    private ArrayList<Product> products;
    private ArrayList<Client> clients;
    private ArrayList<Commande> commandes;

    //---------------------------------Constructeur---------------------------------
    public Magasin() {
        this.products = new ArrayList<Product>();
        this.clients = new ArrayList<Client>();
        this.commandes = new ArrayList<Commande>();
    }

    //---------------------------------Méthodes---------------------------------
    // add a product to the store
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // display all products
    public void displayProducts() {
        for (Product product : this.products) {
            System.out.println(product);
        }
    }

    // display products by title
    public void displayProductsByTitle(String title) {
        for (Product product : this.products) {
            if (product.getTitre().equals(title)) {
                System.out.println(product);
            }
        }
    }

    // update disponibilite of a product by title
    public void updateDisponibilite(String title, int disponibilite) {
        for (Product product : this.products) {
            if (product.getTitre().equals(title)) {
                product.updateDisponibilite(disponibilite);
            }
        }
    }

    // add a new client to the store
    public void addClient(Client client) {
        this.clients.add(client);
    }

    // display all clients
    public void displayClients() {
        for (Client client : this.clients) {
            System.out.println(client);
        }
    }

    // return a client by uuid or by name
    public Client getClient(int id, String nom) {
        for (Client client : this.clients) {
            if (client.getId() == id || client.getNom().equals(nom)) {
                return client;
            }
        }
        return null;
    }

    // return a command by id
    public Commande getCommande(int id) {
        for (Commande commande : this.commandes) {
            if (commande.getId() == id) {
                return commande;
            }
        }
        return null;
    }

    // add product to cart
    public void addProductToCart(String name, int id, Product product) {
        Client client = this.getClient(id, name);
        if (client != null) {
            client.addProductToCart(product);
        }
    }

    // delete product from cart
    public void deleteProductFromCart(String name, int id, Product product){
       Client client = this.getClient(id, name);
         if (client != null) {
              client.deleteProductInCart(product.getTitre());
         }
    }

    // update product in cart
    public void updateProductInCart(String name, int id, Product product, int quantity){
        Client client = this.getClient(id, name);
        if (client != null) {
            client.updateProductInCart(product.getTitre(), quantity);
//            this.products
        }
    }

    // validate command
    public void validateCommand(String name, int id) {
        Client client = this.getClient(id, name);
        if (client != null) {
            Commande commande = new Commande(client, client.getPanierAchat());
            this.commandes.add(commande);
            client.clearCart();
        }
    }

    // update status of a command
    public void updateStatusCommand(String name, int id, String status, int idCommande) {
        Commande commande = this.getCommande(idCommande);
        Client client = this.getClient(id, name);
        if (client != null && commande != null) {
            commande.setStatus(Commande.Status.LIVREE);
        }
    }





    // display all commands of a client
    public void displayCommands(String name, int id) {
        Client client = this.getClient(id, name);
        if (client != null) {
            for (Commande commande : this.commandes) {
                if (commande.getClient().equals(client)) {
                    System.out.println(commande);
                }
            }
        }
    }

}
