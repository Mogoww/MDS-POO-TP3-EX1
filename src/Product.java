public class Product {

    // attributs
    private String titre;
    private String description;
    private int disponibilite;
    private double prixUnitaire;


    //---------------------------------Constructeur---------------------------------


    public Product(String titre, String description, int disponibilite, double prixUnitaire) {
        this.titre = titre;
        this.description = description;
        this.disponibilite = disponibilite;
        this.prixUnitaire = prixUnitaire;
    }

    //---------------------------------Méthodes---------------------------------
    // update disponibilite of a product
    public void updateDisponibilite(int disponibilite) {
        // update disponibilite
        this.disponibilite = disponibilite;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", disponibilite=" + disponibilite +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }

    //--------------------------------------------- Getters and Setters ---------------------------------------------
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
