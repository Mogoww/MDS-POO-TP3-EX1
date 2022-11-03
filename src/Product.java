public class Product {

    //------------------------ Attributes ------------------------
    private int id;
    private String titre;
    private String description;
    private int disponibilite;
    private double prixUnitaire;

    private static int productCounter = 0;



    //---------------------------------Constructeur---------------------------------


    public Product(String titre, String description, int disponibilite, double prixUnitaire) {
        Product.productCounter++;
        this.id = productCounter;
        this.titre = titre;
        this.description = description;
        this.disponibilite = disponibilite;
        this.prixUnitaire = prixUnitaire;
    }

    //---------------------------------Méthodes---------------------------------
    // add disponibilite
    public void addDisponibilite(int quantity) {
        this.disponibilite += quantity;
    }

    // subtract disponibilite
    public void subtractDisponibilite(int quantity) {
        if (this.disponibilite >= quantity) {
            this.disponibilite -= quantity;
        }else{
            this.disponibilite = 0;
        }
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", disponibilite=" + disponibilite +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }

    //--------------------------------------------- Getters and Setters ---------------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
