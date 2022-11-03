public class Produit {

    // attributs
    private String titre;
    private String description;
    private int disponibilite;
    private double prixUnitaire;


    //---------------------------------Constructeur---------------------------------


    public Produit(String titre, String description, int disponibilite, double prixUnitaire) {
        this.titre = titre;
        this.description = description;
        this.disponibilite = disponibilite;
        this.prixUnitaire = prixUnitaire;
    }

    //---------------------------------Méthodes---------------------------------
    // ajouter un quantité de produit
    public void ajouterProduit(int quantite) {
        this.disponibilite += quantite;
    }
    // retirer un quantité de produit
    public void retirerProduit(int quantite) {
         if (this.disponibilite >= quantite) {
             this.disponibilite = 0;
         }else {
             this.disponibilite -= quantite;
         }
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
