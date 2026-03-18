package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRM_HIST_LOADS", catalog = "", schema = "DBO")
public class PrmHistLoads implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrmHistLoadsPK prmHistLoadsPK;
    @Basic(optional = false)
    @Column(name = "PARTITION_ID")
    private short partitionId;
    @Basic(optional = false)
    @Column(name = "SEC_LST_NM")
    private String secLstNm;
    @Basic(optional = false)
    @Column(name = "SEC_FST_NM")
    private Character secFstNm;
    @Basic(optional = false)
    @Column(name = "PLCMNT_DT")
    @Temporal(TemporalType.DATE)
    private Date plcmntDt;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_NBR")
    private String bankAcctNbr;
    @Basic(optional = false)
    @Column(name = "ANCILLARY_DATA")
    private String ancillaryData;
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

    public PrmHistLoads() {
    }

    public PrmHistLoads(PrmHistLoadsPK prmHistLoadsPK) {
        this.prmHistLoadsPK = prmHistLoadsPK;
    }

    public PrmHistLoads(PrmHistLoadsPK prmHistLoadsPK, short partitionId, String secLstNm, Character secFstNm, Date plcmntDt, String bankAcctNbr, String ancillaryData, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prmHistLoadsPK = prmHistLoadsPK;
        this.partitionId = partitionId;
        this.secLstNm = secLstNm;
        this.secFstNm = secFstNm;
        this.plcmntDt = plcmntDt;
        this.bankAcctNbr = bankAcctNbr;
        this.ancillaryData = ancillaryData;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrmHistLoads(Date permHistCrtTs, int refNbr) {
        this.prmHistLoadsPK = new PrmHistLoadsPK(permHistCrtTs, refNbr);
    }

    public PrmHistLoadsPK getPrmHistLoadsPK() {
        return prmHistLoadsPK;
    }

    public void setPrmHistLoadsPK(PrmHistLoadsPK prmHistLoadsPK) {
        this.prmHistLoadsPK = prmHistLoadsPK;
    }

    public short getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(short partitionId) {
        this.partitionId = partitionId;
    }

    public String getSecLstNm() {
        return secLstNm;
    }

    public void setSecLstNm(String secLstNm) {
        this.secLstNm = secLstNm;
    }

    public Character getSecFstNm() {
        return secFstNm;
    }

    public void setSecFstNm(Character secFstNm) {
        this.secFstNm = secFstNm;
    }

    public Date getPlcmntDt() {
        return plcmntDt;
    }

    public void setPlcmntDt(Date plcmntDt) {
        this.plcmntDt = plcmntDt;
    }

    public String getBankAcctNbr() {
        return bankAcctNbr;
    }

    public void setBankAcctNbr(String bankAcctNbr) {
        this.bankAcctNbr = bankAcctNbr;
    }

    public String getAncillaryData() {
        return ancillaryData;
    }

    public void setAncillaryData(String ancillaryData) {
        this.ancillaryData = ancillaryData;
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
        hash += (prmHistLoadsPK != null ? prmHistLoadsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrmHistLoads)) {
            return false;
        }
        PrmHistLoads other = (PrmHistLoads) object;
        if ((this.prmHistLoadsPK == null && other.prmHistLoadsPK != null) || (this.prmHistLoadsPK != null && !this.prmHistLoadsPK.equals(other.prmHistLoadsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHistLoads[ prmHistLoadsPK=" + prmHistLoadsPK + " ]";
    }

}
