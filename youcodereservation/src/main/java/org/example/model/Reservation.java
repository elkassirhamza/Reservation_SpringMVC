package org.example.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
//import java.util.Date;

@Entity
public class Reservation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date dateReservation;
    private boolean confirmation = false;
    @OneToMany(mappedBy = "reservation")
    private Collection<NbrPlace> nbrPlacetablesByIdReservation;
    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Apprenant apprenant;

    private String typeReservation;



    public Reservation() {
    }

    public Reservation(Date dateReservation, boolean confirmation, String typeReservation, Apprenant apprenant) {
        super();
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.typeReservation = typeReservation;
        this.apprenant = apprenant;
    }

    public Reservation(Date dateReservation, boolean confirmation, Apprenant apprenant) {
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.apprenant = apprenant;
    }

    public Reservation(Long idReservation, Date dateReservation, boolean confirmation, Apprenant apprenant) {
        this.idReservation = idReservation;
        this.dateReservation = dateReservation;
        this.confirmation = confirmation;
        this.apprenant = apprenant;
    }

    public Reservation(Date dateReservation, Apprenant apprenant) {
        this.dateReservation = dateReservation;
        this.apprenant = apprenant;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public Collection<NbrPlace> getNbrPlacetablesByIdReservation() {
        return nbrPlacetablesByIdReservation;
    }

    public void setNbrPlacetablesByIdReservation(Collection<NbrPlace> nbrPlacetablesByIdReservation) {
        this.nbrPlacetablesByIdReservation = nbrPlacetablesByIdReservation;
    }
    public String getTypeReservation() {
        return typeReservation;
    }

    public void setTypeReservation(String typeReservation) {
        this.typeReservation = typeReservation;
    }
    public Apprenant getApprenant() {
        return apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + idReservation +
                ", dateReservation=" + dateReservation +
                ", confirmation=" + confirmation +
                '}';
    }
}
