package com.tricol.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "fournisseurs")
public class Fournisseur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String societe;

    private String adresse;
    private String contact;

    @Email
    private String email;

    private String telephone;
    private String ville;
    private String ice;


    public Fournisseur() {}
    public Fournisseur(String societe, String adresse, String contact,
                       String email, String telephone, String ville, String ice) {
        this.societe = societe;
        this.adresse = adresse;
        this.contact = contact;
        this.email = email;
        this.telephone = telephone;
        this.ville = ville;
        this.ice = ice;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSociete() { return societe; }
    public void setSociete(String societe) { this.societe = societe; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public String getIce() { return ice; }
    public void setIce(String ice) { this.ice = ice; }
}
