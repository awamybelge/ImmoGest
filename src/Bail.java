import java.time.LocalDate;
public class Bail {

    private Bien bien;
    private Locataire locataire;
    private Gestionnaire gestionnaire;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    /**
     * Construit un bail.
     *
     * @param bien bien loué (agrégation : existe indépendamment du bail)
     * @param locataire locataire signataire (agrégation)
     * @param gestionnaire gestionnaire responsable
     * @param dateDebut date de début du bail
     * @param dateFin date de fin, strictement postérieure à dateDebut
     * @throws IllegalArgumentException si dateFin n'est pas strictement après dateDebut
     */
    public Bail(Bien bien, Locataire locataire, Gestionnaire gestionnaire,
                LocalDate dateDebut, LocalDate dateFin) {
        if (dateDebut == null || dateFin == null || !dateFin.isAfter(dateDebut)) {
            throw new IllegalArgumentException(
                    "La date de fin doit être strictement postérieure à la date de début.");
        }
        this.bien = bien;
        this.locataire = locataire;
        this.gestionnaire = gestionnaire;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    /**
     * Modifie les dates du bail en revalidant l'invariant.
     *
     * @param dateDebut nouvelle date de début
     * @param dateFin nouvelle date de fin, strictement postérieure à dateDebut
     * @throws IllegalArgumentException si l'invariant n'est pas respecté
     */
    public void setDates(LocalDate dateDebut, LocalDate dateFin) {
        if (dateDebut == null || dateFin == null || !dateFin.isAfter(dateDebut)) {
            throw new IllegalArgumentException(
                    "La date de fin doit être strictement postérieure à la date de début.");
        }
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Bail{bien=" + bien + ", locataire=" + locataire
                + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "}";
    }
}