package editeur;

public class Livre {
    String titreLivre;
    String auteur;
    Double prix;
    int nbPages;
    String isbn;
    String annee;

    public Livre(String titreLivre, String auteur, Double prix, int nbPages, String isbn, String annee) {
        this.titreLivre = titreLivre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.annee = annee;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titreLivre='" + titreLivre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nbPages=" + nbPages +
                ", isbn='" + isbn + '\'' +
                ", annee='" + annee + '\'' +
                '}';
    }
}
