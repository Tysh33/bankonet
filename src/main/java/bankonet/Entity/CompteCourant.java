package bankonet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class

public class CompteCourant extends Compte {
   /* @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer numero;

    private String intitule;

    private double solde;
*/
    private double decouvert;

   /* @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_client")
    @JsonIgnore*/
   /*@ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="id_client")
   @JsonIgnore
   private Client client;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
*/
    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
/*
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }*/
}
