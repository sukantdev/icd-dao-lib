package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "AVN_MRCH", catalog = "", schema = "DBO")
public class AvnMrch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "MRCH_TYP_CD")
    private String mrchTypCd;
    @Basic(optional = false)
    @Column(name = "MRCH_NM")
    private String mrchNm;

    @Basic(optional = false)
    @Column(name = "PSTD_AIRFIELD_PRC")
    private BigDecimal pstdAirfieldPrc;
    @Basic(optional = false)
    @Column(name = "PSWD")
    private String pswd;
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
    @Column(name = "ARPT_CD")
    private String arptCd;
    @Basic(optional = false)
    @Column(name = "FBO_CHAIN_CD")
    private String fboChainCd;

    public AvnMrch() {
    }

    public AvnMrch(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public AvnMrch(String mrchCd, String mrchTypCd, String mrchNm, BigDecimal pstdAirfieldPrc, String pswd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String arptCd, String fboChainCd) {
        this.mrchCd = mrchCd;
        this.mrchTypCd = mrchTypCd;
        this.mrchNm = mrchNm;
        this.pstdAirfieldPrc = pstdAirfieldPrc;
        this.pswd = pswd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.arptCd = arptCd;
        this.fboChainCd = fboChainCd;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public String getMrchTypCd() {
        return mrchTypCd;
    }

    public void setMrchTypCd(String mrchTypCd) {
        this.mrchTypCd = mrchTypCd;
    }

    public String getMrchNm() {
        return mrchNm;
    }

    public void setMrchNm(String mrchNm) {
        this.mrchNm = mrchNm;
    }

    public BigDecimal getPstdAirfieldPrc() {
        return pstdAirfieldPrc;
    }

    public void setPstdAirfieldPrc(BigDecimal pstdAirfieldPrc) {
        this.pstdAirfieldPrc = pstdAirfieldPrc;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
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

    public String getArptCd() {
        return arptCd;
    }

    public void setArptCd(String arptCd) {
        this.arptCd = arptCd;
    }

    public String getFboChainCd() {
        return fboChainCd;
    }

    public void setFboChainCd(String fboChainCd) {
        this.fboChainCd = fboChainCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mrchCd != null ? mrchCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AvnMrch)) {
            return false;
        }
        AvnMrch other = (AvnMrch) object;
        if ((this.mrchCd == null && other.mrchCd != null) || (this.mrchCd != null && !this.mrchCd.equals(other.mrchCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnMrch[ mrchCd=" + mrchCd + " ]";
    }

}
