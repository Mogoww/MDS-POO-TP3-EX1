import java.util.ArrayList;

public class Client {

    //---------------------------------Attributs---------------------------------
    private int id;
    private String nom;
    private String prenom;
    private ArrayList<Product> panierAchat;

    private static int customerCounter = 0;

    //---------------------------------Constructeur---------------------------------

    public Client(String nom, String prenom) {
        Client.customerCounter++;
        this.id = Client.customerCounter;
        this.nom = nom;
        this.prenom = prenom;
        this.panierAchat = new ArrayList<Product>();
    }


    //---------------------------------Méthodes---------------------------------

    // clear the client's cart
    public void clearCart() {
        this.panierAchat.clear();
    }

    // get product by name
    public Product getProductByName(String name) {
        for (Product product : this.panierAchat) {
            if (product.getTitre().equals(name)) {
                return product;
            }
        }
        return null;
    }

    // add number of products in the client's cart
    public void addQuantityProductInCart(String name, int quantity) {
        Product product = getProductByName(name);
        if (product != null) {
            product.addDisponibilite(quantity);
        }
    }

    // subtract number of products in the client's cart
    public void subtractQuantityProductInCart(String name, int quantity) {
        Product product = getProductByName(name);
        if (product != null) {
            product.subtractDisponibilite(quantity);
        }
    }

    // add a product to the client's cart
    public void addProductToCart(String name) {
        Product product = getProductByName(name);
        if (product != null) {
            this.panierAchat.add(new Product(product.getTitre(),product.getDescription(),  1, product.getPrixUnitaire()));
        }
    }

    // delete a product in cart by title
    public void deleteProductInCart(String name) {
        Product product = getProductByName(name);
        if (product != null) {
            this.panierAchat.remove(product);
        }
    }

    // display the client's attributes and content of his cart
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", panierAchat=" + panierAchat +
                '}';
    }


    //---------------------------------Getters and Setters---------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<Product> getPanierAchat() {
        return panierAchat;
    }

    public void setPanierAchat(ArrayList<Product> panierAchat) {
        this.panierAchat = panierAchat;
    }
}
