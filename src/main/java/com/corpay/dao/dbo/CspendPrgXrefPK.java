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
public class CspendPrgXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "XREF_TABLE_NM")
    private String xrefTableNm;
    @Basic(optional = false)
    @Column(name = "XREF_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xrefTs;
    @Basic(optional = false)
    @Column(name = "XREF_SEQ_NBR")
    private short xrefSeqNbr;
    @Basic(optional = false)
    @Column(name = "XREF_PSTD_DT_YYYYM")
    private int xrefPstdDtYyyym;

    public CspendPrgXrefPK() {
    }

    public CspendPrgXrefPK(String xrefTableNm, Date xrefTs, short xrefSeqNbr, int xrefPstdDtYyyym) {
        this.xrefTableNm = xrefTableNm;
        this.xrefTs = xrefTs;
        this.xrefSeqNbr = xrefSeqNbr;
        this.xrefPstdDtYyyym = xrefPstdDtYyyym;
    }

    public String getXrefTableNm() {
        return xrefTableNm;
    }

    public void setXrefTableNm(String xrefTableNm) {
        this.xrefTableNm = xrefTableNm;
    }

    public Date getXrefTs() {
        return xrefTs;
    }

    public void setXrefTs(Date xrefTs) {
        this.xrefTs = xrefTs;
    }

    public short getXrefSeqNbr() {
        return xrefSeqNbr;
    }

    public void setXrefSeqNbr(short xrefSeqNbr) {
        this.xrefSeqNbr = xrefSeqNbr;
    }

    public int getXrefPstdDtYyyym() {
        return xrefPstdDtYyyym;
    }

    public void setXrefPstdDtYyyym(int xrefPstdDtYyyym) {
        this.xrefPstdDtYyyym = xrefPstdDtYyyym;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (xrefTableNm != null ? xrefTableNm.hashCode() : 0);
        hash += (xrefTs != null ? xrefTs.hashCode() : 0);
        hash += (int) xrefSeqNbr;
        hash += (int) xrefPstdDtYyyym;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CspendPrgXrefPK)) {
            return false;
        }
        CspendPrgXrefPK other = (CspendPrgXrefPK) object;
        if ((this.xrefTableNm == null && other.xrefTableNm != null) || (this.xrefTableNm != null && !this.xrefTableNm.equals(other.xrefTableNm))) {
            return false;
        }
        if ((this.xrefTs == null && other.xrefTs != null) || (this.xrefTs != null && !this.xrefTs.equals(other.xrefTs))) {
            return false;
        }
        if (this.xrefSeqNbr != other.xrefSeqNbr) {
            return false;
        }
        if (this.xrefPstdDtYyyym != other.xrefPstdDtYyyym) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CspendPrgXrefPK[ xrefTableNm=" + xrefTableNm + ", xrefTs=" + xrefTs + ", xrefSeqNbr=" + xrefSeqNbr + ", xrefPstdDtYyyym=" + xrefPstdDtYyyym + " ]";
    }
    
}
