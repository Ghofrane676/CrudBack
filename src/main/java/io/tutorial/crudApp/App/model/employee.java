package io.tutorial.crudApp.App.model;
import javax.persistence.*;

@Entity
@Table(	name = "employees",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "prenom"),
                @UniqueConstraint(columnNames = "email")
        })
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Number telNumber;

    public employee(){

    }
    public employee(long id,String nom, String prenom, String email, String password, Number telNumber) {
        super();
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Number getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(Number telNumber) {
        this.telNumber = telNumber;
    }
}
