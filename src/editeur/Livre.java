package editeur;

public class Livre {
   private String titreLivre;
   private String auteur;
   private Double prix;
   private int nbPages;
   private String isbn;
   private int annee;

    public Livre() {
        super();
    }

    public Livre(String titreLivre, String auteur, Double prix, int nbPages, String isbn, int annee) {
        super();
        this.setTitreLivre(titreLivre);
        this.setNbPages(nbPages);
        this.setIsbn(isbn);
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

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Livre{");
        sb.append("titreLivre='").append(titreLivre).append('\'');
        sb.append(", auteur='").append(auteur).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", nbPages=").append(nbPages);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", annee=").append(annee);
        sb.append('}');
        return sb.toString();
    }
}
