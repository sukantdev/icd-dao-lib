/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "INV_CRD_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvCrdAddr.findAll", query = "SELECT i FROM InvCrdAddr i")})
public class InvCrdAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvCrdAddrPK invCrdAddrPK;
    @Basic(optional = false)
    @Column(name = "MLNG_ADDR1")
    private String mlngAddr1;
    @Basic(optional = false)
    @Column(name = "MLNG_ADDR2")
    private String mlngAddr2;
    @Basic(optional = false)
    @Column(name = "MLNG_CITY")
    private String mlngCity;
    @Basic(optional = false)
    @Column(name = "MLNG_ST")
    private String mlngSt;
    @Basic(optional = false)
    @Column(name = "MLNG_POST_CD")
    private String mlngPostCd;
    @Basic(optional = false)
    @Column(name = "MLNG_CRTY")
    private String mlngCrty;
    @Basic(optional = false)
    @Column(name = "MLNG_NM")
    private String mlngNm;
    @Basic(optional = false)
    @Column(name = "MLNG_ATTN_TO")
    private String mlngAttnTo;
    @Basic(optional = false)
    @Column(name = "EC_MISC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ecMiscTs;
    @Basic(optional = false)
    @Column(name = "EC_MISC_SEQ_NBR")
    private short ecMiscSeqNbr;
    @Column(name = "CS_MISC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date csMiscTs;
    @Basic(optional = false)
    @Column(name = "CS_MISC_SEQ_NBR")
    private short csMiscSeqNbr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public InvCrdAddr() {
    }

    public InvCrdAddr(InvCrdAddrPK invCrdAddrPK) {
        this.invCrdAddrPK = invCrdAddrPK;
    }

    public InvCrdAddr(InvCrdAddrPK invCrdAddrPK, String mlngAddr1, String mlngAddr2, String mlngCity, String mlngSt, String mlngPostCd, String mlngCrty, String mlngNm, String mlngAttnTo, Date ecMiscTs, short ecMiscSeqNbr, short csMiscSeqNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invCrdAddrPK = invCrdAddrPK;
        this.mlngAddr1 = mlngAddr1;
        this.mlngAddr2 = mlngAddr2;
        this.mlngCity = mlngCity;
        this.mlngSt = mlngSt;
        this.mlngPostCd = mlngPostCd;
        this.mlngCrty = mlngCrty;
        this.mlngNm = mlngNm;
        this.mlngAttnTo = mlngAttnTo;
        this.ecMiscTs = ecMiscTs;
        this.ecMiscSeqNbr = ecMiscSeqNbr;
        this.csMiscSeqNbr = csMiscSeqNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvCrdAddr(Date crdAddrTs, short crdAddrSeqNbr) {
        this.invCrdAddrPK = new InvCrdAddrPK(crdAddrTs, crdAddrSeqNbr);
    }

    public InvCrdAddrPK getInvCrdAddrPK() {
        return invCrdAddrPK;
    }

    public void setInvCrdAddrPK(InvCrdAddrPK invCrdAddrPK) {
        this.invCrdAddrPK = invCrdAddrPK;
    }

    public String getMlngAddr1() {
        return mlngAddr1;
    }

    public void setMlngAddr1(String mlngAddr1) {
        this.mlngAddr1 = mlngAddr1;
    }

    public String getMlngAddr2() {
        return mlngAddr2;
    }

    public void setMlngAddr2(String mlngAddr2) {
        this.mlngAddr2 = mlngAddr2;
    }

    public String getMlngCity() {
        return mlngCity;
    }

    public void setMlngCity(String mlngCity) {
        this.mlngCity = mlngCity;
    }

    public String getMlngSt() {
        return mlngSt;
    }

    public void setMlngSt(String mlngSt) {
        this.mlngSt = mlngSt;
    }

    public String getMlngPostCd() {
        return mlngPostCd;
    }

    public void setMlngPostCd(String mlngPostCd) {
        this.mlngPostCd = mlngPostCd;
    }

    public String getMlngCrty() {
        return mlngCrty;
    }

    public void setMlngCrty(String mlngCrty) {
        this.mlngCrty = mlngCrty;
    }

    public String getMlngNm() {
        return mlngNm;
    }

    public void setMlngNm(String mlngNm) {
        this.mlngNm = mlngNm;
    }

    public String getMlngAttnTo() {
        return mlngAttnTo;
    }

    public void setMlngAttnTo(String mlngAttnTo) {
        this.mlngAttnTo = mlngAttnTo;
    }

    public Date getEcMiscTs() {
        return ecMiscTs;
    }

    public void setEcMiscTs(Date ecMiscTs) {
        this.ecMiscTs = ecMiscTs;
    }

    public short getEcMiscSeqNbr() {
        return ecMiscSeqNbr;
    }

    public void setEcMiscSeqNbr(short ecMiscSeqNbr) {
        this.ecMiscSeqNbr = ecMiscSeqNbr;
    }

    public Date getCsMiscTs() {
        return csMiscTs;
    }

    public void setCsMiscTs(Date csMiscTs) {
        this.csMiscTs = csMiscTs;
    }

    public short getCsMiscSeqNbr() {
        return csMiscSeqNbr;
    }

    public void setCsMiscSeqNbr(short csMiscSeqNbr) {
        this.csMiscSeqNbr = csMiscSeqNbr;
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

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invCrdAddrPK != null ? invCrdAddrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvCrdAddr)) {
            return false;
        }
        InvCrdAddr other = (InvCrdAddr) object;
        if ((this.invCrdAddrPK == null && other.invCrdAddrPK != null) || (this.invCrdAddrPK != null && !this.invCrdAddrPK.equals(other.invCrdAddrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCrdAddr[ invCrdAddrPK=" + invCrdAddrPK + " ]";
    }
    
}
