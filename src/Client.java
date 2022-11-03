import java.util.ArrayList;

public class Client {

    //---------------------------------Attributs---------------------------------
    private int id;
    private String nom;
    private String prenom;
    private ArrayList<Product> panierAchat;

    private static int customerCounter = 0;

    //---------------------------------Constructeur---------------------------------

    public Client(int id, String nom, String prenom) {
        Client.customerCounter++;
        this.id = Client.customerCounter;
        this.nom = nom;
        this.prenom = prenom;
        this.panierAchat = new ArrayList<Product>();
    }


    //---------------------------------Méthodes---------------------------------
    // add a product to the client's cart
    public void addProductToCart(Product product) {
        this.panierAchat.add(new Product(product.getTitre(), product.getDescription(), 1, product.getPrixUnitaire()));
    }

    // clear the client's cart
    public void clearCart() {
        this.panierAchat.clear();
    }

    // update number of products in the client's cart
    public void updateProductInCart(String title, int quantity) {
        for (Product product : this.panierAchat) {
            if (product.getTitre().equals(title)) {
                product.updateDisponibilite(quantity);
            }
        }
    }

    // delete a product in cart by title
    public void deleteProductInCart(String title) {
        for (Product product : this.panierAchat) {
            if (product.getTitre().equals(title)) {
                this.panierAchat.remove(product);
            }
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
