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
@Table(name = "PRD_ATM_MAESTRO", catalog = "", schema = "DBO")
public class PrdAtmMaestro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;

    @Basic(optional = false)
    @Column(name = "US_ACS_FEE")
    private BigDecimal usAcsFee;
    @Basic(optional = false)
    @Column(name = "INTL_ACS_FEE")
    private BigDecimal intlAcsFee;
    @Basic(optional = false)
    @Column(name = "BAL_INQRY")
    private BigDecimal balInqry;
    @Basic(optional = false)
    @Column(name = "BAL_DCLN_FEE")
    private BigDecimal balDclnFee;
    @Basic(optional = false)
    @Column(name = "POS_DB")
    private BigDecimal posDb;
    @Basic(optional = false)
    @Column(name = "POS_DCLN_FEE")
    private BigDecimal posDclnFee;
    @Basic(optional = false)
    @Column(name = "POS_INQRY")
    private Character posInqry;
    @Basic(optional = false)
    @Column(name = "POS_USG_OPTIONS")
    private Character posUsgOptions;
    @Basic(optional = false)
    @Column(name = "ATM_ACS")
    private String atmAcs;
    @Basic(optional = false)
    @Column(name = "MAESTRO_POS")
    private Character maestroPos;
    @Basic(optional = false)
    @Column(name = "ATM_POS_DFLT_ACS")
    private Character atmPosDfltAcs;
    @Basic(optional = false)
    @Column(name = "ATM_POS_TRNS_FLG")
    private Character atmPosTrnsFlg;
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

    public PrdAtmMaestro() {
    }

    public PrdAtmMaestro(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdAtmMaestro(String applNbr, BigDecimal usAcsFee, BigDecimal intlAcsFee, BigDecimal balInqry, BigDecimal balDclnFee, BigDecimal posDb, BigDecimal posDclnFee, Character posInqry, Character posUsgOptions, String atmAcs, Character maestroPos, Character atmPosDfltAcs, Character atmPosTrnsFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.usAcsFee = usAcsFee;
        this.intlAcsFee = intlAcsFee;
        this.balInqry = balInqry;
        this.balDclnFee = balDclnFee;
        this.posDb = posDb;
        this.posDclnFee = posDclnFee;
        this.posInqry = posInqry;
        this.posUsgOptions = posUsgOptions;
        this.atmAcs = atmAcs;
        this.maestroPos = maestroPos;
        this.atmPosDfltAcs = atmPosDfltAcs;
        this.atmPosTrnsFlg = atmPosTrnsFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public BigDecimal getUsAcsFee() {
        return usAcsFee;
    }

    public void setUsAcsFee(BigDecimal usAcsFee) {
        this.usAcsFee = usAcsFee;
    }

    public BigDecimal getIntlAcsFee() {
        return intlAcsFee;
    }

    public void setIntlAcsFee(BigDecimal intlAcsFee) {
        this.intlAcsFee = intlAcsFee;
    }

    public BigDecimal getBalInqry() {
        return balInqry;
    }

    public void setBalInqry(BigDecimal balInqry) {
        this.balInqry = balInqry;
    }

    public BigDecimal getBalDclnFee() {
        return balDclnFee;
    }

    public void setBalDclnFee(BigDecimal balDclnFee) {
        this.balDclnFee = balDclnFee;
    }

    public BigDecimal getPosDb() {
        return posDb;
    }

    public void setPosDb(BigDecimal posDb) {
        this.posDb = posDb;
    }

    public BigDecimal getPosDclnFee() {
        return posDclnFee;
    }

    public void setPosDclnFee(BigDecimal posDclnFee) {
        this.posDclnFee = posDclnFee;
    }

    public Character getPosInqry() {
        return posInqry;
    }

    public void setPosInqry(Character posInqry) {
        this.posInqry = posInqry;
    }

    public Character getPosUsgOptions() {
        return posUsgOptions;
    }

    public void setPosUsgOptions(Character posUsgOptions) {
        this.posUsgOptions = posUsgOptions;
    }

    public String getAtmAcs() {
        return atmAcs;
    }

    public void setAtmAcs(String atmAcs) {
        this.atmAcs = atmAcs;
    }

    public Character getMaestroPos() {
        return maestroPos;
    }

    public void setMaestroPos(Character maestroPos) {
        this.maestroPos = maestroPos;
    }

    public Character getAtmPosDfltAcs() {
        return atmPosDfltAcs;
    }

    public void setAtmPosDfltAcs(Character atmPosDfltAcs) {
        this.atmPosDfltAcs = atmPosDfltAcs;
    }

    public Character getAtmPosTrnsFlg() {
        return atmPosTrnsFlg;
    }

    public void setAtmPosTrnsFlg(Character atmPosTrnsFlg) {
        this.atmPosTrnsFlg = atmPosTrnsFlg;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdAtmMaestro)) {
            return false;
        }
        PrdAtmMaestro other = (PrdAtmMaestro) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdAtmMaestro[ applNbr=" + applNbr + " ]";
    }

}
