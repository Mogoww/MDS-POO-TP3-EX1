import java.util.ArrayList;

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


}
