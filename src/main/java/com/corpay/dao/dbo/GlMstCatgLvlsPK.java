/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class GlMstCatgLvlsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "MST_PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mstPrfId;
    @Basic(optional = false)
    @Column(name = "CATG_LVL")
    private int catgLvl;

    public GlMstCatgLvlsPK() {
    }

    public GlMstCatgLvlsPK(String acctNbr, Date mstPrfId, int catgLvl) {
        this.acctNbr = acctNbr;
        this.mstPrfId = mstPrfId;
        this.catgLvl = catgLvl;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getMstPrfId() {
        return mstPrfId;
    }

    public void setMstPrfId(Date mstPrfId) {
        this.mstPrfId = mstPrfId;
    }

    public int getCatgLvl() {
        return catgLvl;
    }

    public void setCatgLvl(int catgLvl) {
        this.catgLvl = catgLvl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (mstPrfId != null ? mstPrfId.hashCode() : 0);
        hash += (int) catgLvl;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlMstCatgLvlsPK)) {
            return false;
        }
        GlMstCatgLvlsPK other = (GlMstCatgLvlsPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.mstPrfId == null && other.mstPrfId != null) || (this.mstPrfId != null && !this.mstPrfId.equals(other.mstPrfId))) {
            return false;
        }
        if (this.catgLvl != other.catgLvl) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlMstCatgLvlsPK[ acctNbr=" + acctNbr + ", mstPrfId=" + mstPrfId + ", catgLvl=" + catgLvl + " ]";
    }
    
}
