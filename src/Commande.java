import java.util.ArrayList;

public class Commande {

    //------------------------ Attributs ------------------------
    private Client client;
    private ArrayList<Product> products;
    private String status;

    //------------------------ Constructeur ------------------------
    public Commande(Client client, ArrayList<Product> products) {
        this.client = client;
        this.products = products;
        this.status = "En cours";
    }

    //------------------------ Méthodes ------------------------
    // display all informations
    @Override
    public String toString() {
        return "Commande{" +
                "client=" + client +
                ", products=" + products +
                ", status='" + status + '\'' +
                '}';
    }

    //------------------------ Getters/Setters ------------------------

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        // if the status is "En cours", "En attente" or "Terminé" then we can update the status
        if (status.equals("En cours") || status.equals("En attente") || status.equals("Terminé")) {
            this.status = status;
        }
    }
}
