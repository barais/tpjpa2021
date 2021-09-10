package jpa.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Professeur implements Personne{
    private Long id;

    private String name;

    private String email;

    private List<Rdv> rdvs = new ArrayList<Rdv>();

    public Professeur(){
        this.name = "dummy";
    }

    public Professeur(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    @Id
    @GeneratedValue
    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id=id;
    }

    @OneToMany(mappedBy = "professeur")
    public List<Rdv> getRdvs(){
        return this.rdvs;
    }

    public void setRdvs(List<Rdv> rdvs){
        this.rdvs = rdvs;
    }

    public String toString(){
        return "Le professeur " + this.name + " à " + this.rdvs.size() + " rdvs totaux";
    }
}