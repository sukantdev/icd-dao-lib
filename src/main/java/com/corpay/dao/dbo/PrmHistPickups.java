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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRM_HIST_PICKUPS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrmHistPickups.findAll", query = "SELECT p FROM PrmHistPickups p")})
public class PrmHistPickups implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrmHistPickupsPK prmHistPickupsPK;
    @Basic(optional = false)
    @Column(name = "PARTITION_ID")
    private short partitionId;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "ATM_NM")
    private String atmNm;
    @Basic(optional = false)
    @Column(name = "ATM_CTY")
    private String atmCty;
    @Basic(optional = false)
    @Column(name = "ATM_ST")
    private String atmSt;
    @Basic(optional = false)
    @Column(name = "DRAFT_CHK_NBR1")
    private int draftChkNbr1;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DRAFT_AMT1")
    private BigDecimal draftAmt1;
    @Basic(optional = false)
    @Column(name = "DRAFT_CHK_NBR2")
    private int draftChkNbr2;
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
    @Basic(optional = false)
    @Column(name = "SCNDY_CRD")
    private String scndyCrd;

    public PrmHistPickups() {
    }

    public PrmHistPickups(PrmHistPickupsPK prmHistPickupsPK) {
        this.prmHistPickupsPK = prmHistPickupsPK;
    }

    public PrmHistPickups(PrmHistPickupsPK prmHistPickupsPK, short partitionId, String locCd, String atmNm, String atmCty, String atmSt, int draftChkNbr1, BigDecimal draftAmt1, int draftChkNbr2, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String scndyCrd) {
        this.prmHistPickupsPK = prmHistPickupsPK;
        this.partitionId = partitionId;
        this.locCd = locCd;
        this.atmNm = atmNm;
        this.atmCty = atmCty;
        this.atmSt = atmSt;
        this.draftChkNbr1 = draftChkNbr1;
        this.draftAmt1 = draftAmt1;
        this.draftChkNbr2 = draftChkNbr2;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.scndyCrd = scndyCrd;
    }

    public PrmHistPickups(Date permHistCrtTs, int refNbr) {
        this.prmHistPickupsPK = new PrmHistPickupsPK(permHistCrtTs, refNbr);
    }

    public PrmHistPickupsPK getPrmHistPickupsPK() {
        return prmHistPickupsPK;
    }

    public void setPrmHistPickupsPK(PrmHistPickupsPK prmHistPickupsPK) {
        this.prmHistPickupsPK = prmHistPickupsPK;
    }

    public short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(short partitionId) {
        this.partitionId = partitionId;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getAtmNm() {
        return atmNm;
    }

    public void setAtmNm(String atmNm) {
        this.atmNm = atmNm;
    }

    public String getAtmCty() {
        return atmCty;
    }

    public void setAtmCty(String atmCty) {
        this.atmCty = atmCty;
    }

    public String getAtmSt() {
        return atmSt;
    }

    public void setAtmSt(String atmSt) {
        this.atmSt = atmSt;
    }

    public int getDraftChkNbr1() {
        return draftChkNbr1;
    }

    public void setDraftChkNbr1(int draftChkNbr1) {
        this.draftChkNbr1 = draftChkNbr1;
    }

    public BigDecimal getDraftAmt1() {
        return draftAmt1;
    }

    public void setDraftAmt1(BigDecimal draftAmt1) {
        this.draftAmt1 = draftAmt1;
    }

    public int getDraftChkNbr2() {
        return draftChkNbr2;
    }

    public void setDraftChkNbr2(int draftChkNbr2) {
        this.draftChkNbr2 = draftChkNbr2;
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

    public String getScndyCrd() {
        return scndyCrd;
    }

    public void setScndyCrd(String scndyCrd) {
        this.scndyCrd = scndyCrd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmHistPickupsPK != null ? prmHistPickupsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrmHistPickups)) {
            return false;
        }
        PrmHistPickups other = (PrmHistPickups) object;
        if ((this.prmHistPickupsPK == null && other.prmHistPickupsPK != null) || (this.prmHistPickupsPK != null && !this.prmHistPickupsPK.equals(other.prmHistPickupsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHistPickups[ prmHistPickupsPK=" + prmHistPickupsPK + " ]";
    }
    
}
