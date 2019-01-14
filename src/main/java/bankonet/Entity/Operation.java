package bankonet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class

public class Operation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private Integer numeroCompteDebite;

    private Integer numeroCompteCredite;

    private Integer montant;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroCompteDebite() {
        return numeroCompteDebite;
    }

    public void setNumeroCompteDebite(Integer numeroCompteDebite) {
        this.numeroCompteDebite = numeroCompteDebite;
    }

    public Integer getNumeroCompteCredite() {
        return numeroCompteCredite;
    }

    public void setNumeroCompteCredite(Integer numeroCompteCredite) {
        this.numeroCompteCredite = numeroCompteCredite;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }
}
