package bankonet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class

public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private String prenom;

   /* @OneToOne(fetch = FetchType.LAZY,
              cascade = CascadeType.ALL,
              mappedBy = "client")*/
    //@JsonIgnoreProperties("compteCourant")
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "client")
    private List<CompteCourant> comptesCourants;

   /* @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "client")*/
    //@JsonIgnoreProperties("client")
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "client")
    private List<CompteEpargne> comptesEpargnes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<CompteCourant> getComptesCourants() {
        return comptesCourants;
    }

    public void setComptesCourants(List<CompteCourant> comptesCourants) {
        this.comptesCourants = comptesCourants;
    }

    public List<CompteEpargne> getComptesEpargnes() {
        return comptesEpargnes;
    }

    public void setComptesEpargnes(List<CompteEpargne> comptesEpargnes) {
        this.comptesEpargnes = comptesEpargnes;
    }
}