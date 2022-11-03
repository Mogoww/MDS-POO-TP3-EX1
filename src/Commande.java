import java.util.ArrayList;

public class Commande {
    private static int commandCounter = 0;
    //------------------------ Attributs ------------------------
    private int id;
    private Client client;
    private ArrayList<Product> products;
    private Status status;

    public enum Status {
        EN_COURS,
        LIVREE
    }

    //------------------------ Constructeur ------------------------
    public Commande(Client client, ArrayList<Product> products) {
        Commande.commandCounter++;
        this.id = Commande.commandCounter;
        this.client = client;
        this.products = products;
        this.status = Status.EN_COURS;

    }

    //------------------------ Méthodes ------------------------
    // display all informations
    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                "client=" + client +
                ", products=" + products +
                ", status='" + status + '\'' +
                '}';
    }

    //------------------------ Getters/Setters ------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
