/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
@Table(name = "CARD_HISTORY_RESEARCH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CardHistoryResearch.findAll", query = "SELECT c FROM CardHistoryResearch c")})
public class CardHistoryResearch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NEW_CARD_NBR")
    private Long newCardNbr;
    @Basic(optional = false)
    @Column(name = "OLD_CARD_NBR")
    private long oldCardNbr;
    @Basic(optional = false)
    @Column(name = "NEW_CARD_ACTV_DT")
    @Temporal(TemporalType.DATE)
    private Date newCardActvDt;
    @Basic(optional = false)
    @Column(name = "TRANS_ID")
    private String transId;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public CardHistoryResearch() {
    }

    public CardHistoryResearch(Long newCardNbr) {
        this.newCardNbr = newCardNbr;
    }

    public CardHistoryResearch(Long newCardNbr, long oldCardNbr, Date newCardActvDt, String transId, Date crtTs, String crtUsr) {
        this.newCardNbr = newCardNbr;
        this.oldCardNbr = oldCardNbr;
        this.newCardActvDt = newCardActvDt;
        this.transId = transId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public Long getNewCardNbr() {
        return newCardNbr;
    }

    public void setNewCardNbr(Long newCardNbr) {
        this.newCardNbr = newCardNbr;
    }

    public long getOldCardNbr() {
        return oldCardNbr;
    }

    public void setOldCardNbr(long oldCardNbr) {
        this.oldCardNbr = oldCardNbr;
    }

    public Date getNewCardActvDt() {
        return newCardActvDt;
    }

    public void setNewCardActvDt(Date newCardActvDt) {
        this.newCardActvDt = newCardActvDt;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newCardNbr != null ? newCardNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardHistoryResearch)) {
            return false;
        }
        CardHistoryResearch other = (CardHistoryResearch) object;
        if ((this.newCardNbr == null && other.newCardNbr != null) || (this.newCardNbr != null && !this.newCardNbr.equals(other.newCardNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CardHistoryResearch[ newCardNbr=" + newCardNbr + " ]";
    }
    
}
