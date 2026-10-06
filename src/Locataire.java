public class Locataire {

    private String nom;
    private String telephone;
    private String email;

    /**
     * Construit un locataire complet.
     *
     * @param nom
     * @param telephone
     * @param email
     * @throws IllegalArgumentException
     */
    public Locataire(String nom, String telephone, String email) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom du locataire ne peut pas être vide.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("L'email doit contenir au moins un '@'.");
        }
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
    }

    /**
     * Constructeur surchargé : crée un locataire sans téléphone renseigné.
     *
     * @param nom nom du locataire, non vide
     * @param email adresse email, doit contenir '@'
     */
    public Locataire(String nom, String email) {
        this(nom, "", email);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom du locataire ne peut pas être vide.");
        }
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("L'email doit contenir au moins un '@'.");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Locataire{nom='" + nom + "', telephone='" + telephone + "', email='" + email + "'}";
    }
}