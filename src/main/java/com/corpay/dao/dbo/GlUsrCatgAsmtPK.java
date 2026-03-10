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
public class GlUsrCatgAsmtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CATG_LVL")
    private int catgLvl;
    @Basic(optional = false)
    @Column(name = "CATG_CD")
    private String catgCd;
    @Basic(optional = false)
    @Column(name = "MST_PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mstPrfId;
    @Basic(optional = false)
    @Column(name = "USR_PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrPrfId;

    public GlUsrCatgAsmtPK() {
    }

    public GlUsrCatgAsmtPK(String acctNbr, int catgLvl, String catgCd, Date mstPrfId, Date usrPrfId) {
        this.acctNbr = acctNbr;
        this.catgLvl = catgLvl;
        this.catgCd = catgCd;
        this.mstPrfId = mstPrfId;
        this.usrPrfId = usrPrfId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public int getCatgLvl() {
        return catgLvl;
    }

    public void setCatgLvl(int catgLvl) {
        this.catgLvl = catgLvl;
    }

    public String getCatgCd() {
        return catgCd;
    }

    public void setCatgCd(String catgCd) {
        this.catgCd = catgCd;
    }

    public Date getMstPrfId() {
        return mstPrfId;
    }

    public void setMstPrfId(Date mstPrfId) {
        this.mstPrfId = mstPrfId;
    }

    public Date getUsrPrfId() {
        return usrPrfId;
    }

    public void setUsrPrfId(Date usrPrfId) {
        this.usrPrfId = usrPrfId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (int) catgLvl;
        hash += (catgCd != null ? catgCd.hashCode() : 0);
        hash += (mstPrfId != null ? mstPrfId.hashCode() : 0);
        hash += (usrPrfId != null ? usrPrfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlUsrCatgAsmtPK)) {
            return false;
        }
        GlUsrCatgAsmtPK other = (GlUsrCatgAsmtPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if (this.catgLvl != other.catgLvl) {
            return false;
        }
        if ((this.catgCd == null && other.catgCd != null) || (this.catgCd != null && !this.catgCd.equals(other.catgCd))) {
            return false;
        }
        if ((this.mstPrfId == null && other.mstPrfId != null) || (this.mstPrfId != null && !this.mstPrfId.equals(other.mstPrfId))) {
            return false;
        }
        if ((this.usrPrfId == null && other.usrPrfId != null) || (this.usrPrfId != null && !this.usrPrfId.equals(other.usrPrfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlUsrCatgAsmtPK[ acctNbr=" + acctNbr + ", catgLvl=" + catgLvl + ", catgCd=" + catgCd + ", mstPrfId=" + mstPrfId + ", usrPrfId=" + usrPrfId + " ]";
    }
    
}
