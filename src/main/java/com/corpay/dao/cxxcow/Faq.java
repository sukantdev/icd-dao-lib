/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FAQ", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Faq.findAll", query = "SELECT f FROM Faq f"),
    @NamedQuery(name = "Faq.findByFqUniqueId", query = "SELECT f FROM Faq f WHERE f.fqUniqueId = :fqUniqueId"),
    @NamedQuery(name = "Faq.findByFqUptDate", query = "SELECT f FROM Faq f WHERE f.fqUptDate = :fqUptDate"),
    @NamedQuery(name = "Faq.findByFqStatusCode", query = "SELECT f FROM Faq f WHERE f.fqStatusCode = :fqStatusCode"),
    @NamedQuery(name = "Faq.findByFqQuestion", query = "SELECT f FROM Faq f WHERE f.fqQuestion = :fqQuestion"),
    @NamedQuery(name = "Faq.findByFqAnswer", query = "SELECT f FROM Faq f WHERE f.fqAnswer = :fqAnswer")})
public class Faq implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FQ_UNIQUE_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fqUniqueId;
    @Basic(optional = false)
    @Column(name = "FQ_UPT_DATE")
    @Temporal(TemporalType.DATE)
    private Date fqUptDate;
    @Basic(optional = false)
    @Column(name = "FQ_STATUS_CODE")
    private Character fqStatusCode;
    @Basic(optional = false)
    @Column(name = "FQ_QUESTION")
    private String fqQuestion;
    @Basic(optional = false)
    @Column(name = "FQ_ANSWER")
    private String fqAnswer;

    public Faq() {
    }

    public Faq(Date fqUniqueId) {
        this.fqUniqueId = fqUniqueId;
    }

    public Faq(Date fqUniqueId, Date fqUptDate, Character fqStatusCode, String fqQuestion, String fqAnswer) {
        this.fqUniqueId = fqUniqueId;
        this.fqUptDate = fqUptDate;
        this.fqStatusCode = fqStatusCode;
        this.fqQuestion = fqQuestion;
        this.fqAnswer = fqAnswer;
    }

    public Date getFqUniqueId() {
        return fqUniqueId;
    }

    public void setFqUniqueId(Date fqUniqueId) {
        this.fqUniqueId = fqUniqueId;
    }

    public Date getFqUptDate() {
        return fqUptDate;
    }

    public void setFqUptDate(Date fqUptDate) {
        this.fqUptDate = fqUptDate;
    }

    public Character getFqStatusCode() {
        return fqStatusCode;
    }

    public void setFqStatusCode(Character fqStatusCode) {
        this.fqStatusCode = fqStatusCode;
    }

    public String getFqQuestion() {
        return fqQuestion;
    }

    public void setFqQuestion(String fqQuestion) {
        this.fqQuestion = fqQuestion;
    }

    public String getFqAnswer() {
        return fqAnswer;
    }

    public void setFqAnswer(String fqAnswer) {
        this.fqAnswer = fqAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fqUniqueId != null ? fqUniqueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faq)) {
            return false;
        }
        Faq other = (Faq) object;
        if ((this.fqUniqueId == null && other.fqUniqueId != null) || (this.fqUniqueId != null && !this.fqUniqueId.equals(other.fqUniqueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Faq[ fqUniqueId=" + fqUniqueId + " ]";
    }
    
}
