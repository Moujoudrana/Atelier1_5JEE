package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

//ces annotations sont des annot jaxb
//xmlaccesooretype pour dire que les annotations de jaxb jaimerai les mettre sur les champs et non pas sur les methodes parce que par defaut il devrait etre sur les getters et setters
//xmlrootelement pour dire que quand je convertit lobjet compte en xml il me donne une balise compte
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compte")
public class Compte {
    private int code;
    private double solde;
    //xmltransient est une annotation de jaxb ca veut dire quand tu convertis cet objet vers xml ignore cette attribut
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
