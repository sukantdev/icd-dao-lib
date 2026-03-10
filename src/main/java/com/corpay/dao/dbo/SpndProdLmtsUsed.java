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
@Table(name = "SPND_PROD_LMTS_USED", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "SpndProdLmtsUsed.findAll", query = "SELECT s FROM SpndProdLmtsUsed s")})
public class SpndProdLmtsUsed implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpndProdLmtsUsedPK spndProdLmtsUsedPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_AMT_USED")
    private BigDecimal spndPrduDayAmtUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_AMT_OVRR_USED")
    private BigDecimal spndPrduDayAmtOvrrUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_XTNS_USED")
    private int spndPrduDayXtnsUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_XTNS_OVRR_USED")
    private int spndPrduDayXtnsOvrrUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_AMT_USED")
    private BigDecimal spndPrduCycAmtUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_AMT_OVRR_USED")
    private BigDecimal spndPrduCycAmtOvrrUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_XTNS_USED")
    private int spndPrduCycXtnsUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_XTNS_OVRR_USED")
    private int spndPrduCycXtnsOvrrUsed;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_AMT_HOLD")
    private BigDecimal spndPrduDayAmtHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_AMT_OVRR_HOLD")
    private BigDecimal spndPrduDayAmtOvrrHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_XTNS_HOLD")
    private int spndPrduDayXtnsHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_DAY_XTNS_OVRR_HOLD")
    private int spndPrduDayXtnsOvrrHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_AMT_HOLD")
    private BigDecimal spndPrduCycAmtHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_AMT_OVRR_HOLD")
    private BigDecimal spndPrduCycAmtOvrrHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_XTNS_HOLD")
    private int spndPrduCycXtnsHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_CYC_XTNS_OVRR_HOLD")
    private int spndPrduCycXtnsOvrrHold;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_LAST_XTN_DATE")
    @Temporal(TemporalType.DATE)
    private Date spndPrduLastXtnDate;
    @Basic(optional = false)
    @Column(name = "SPND_PRDU_LAST_RES_DATE")
    @Temporal(TemporalType.DATE)
    private Date spndPrduLastResDate;
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

    public SpndProdLmtsUsed() {
    }

    public SpndProdLmtsUsed(SpndProdLmtsUsedPK spndProdLmtsUsedPK) {
        this.spndProdLmtsUsedPK = spndProdLmtsUsedPK;
    }

    public SpndProdLmtsUsed(SpndProdLmtsUsedPK spndProdLmtsUsedPK, BigDecimal spndPrduDayAmtUsed, BigDecimal spndPrduDayAmtOvrrUsed, int spndPrduDayXtnsUsed, int spndPrduDayXtnsOvrrUsed, BigDecimal spndPrduCycAmtUsed, BigDecimal spndPrduCycAmtOvrrUsed, int spndPrduCycXtnsUsed, int spndPrduCycXtnsOvrrUsed, BigDecimal spndPrduDayAmtHold, BigDecimal spndPrduDayAmtOvrrHold, int spndPrduDayXtnsHold, int spndPrduDayXtnsOvrrHold, BigDecimal spndPrduCycAmtHold, BigDecimal spndPrduCycAmtOvrrHold, int spndPrduCycXtnsHold, int spndPrduCycXtnsOvrrHold, Date spndPrduLastXtnDate, Date spndPrduLastResDate, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.spndProdLmtsUsedPK = spndProdLmtsUsedPK;
        this.spndPrduDayAmtUsed = spndPrduDayAmtUsed;
        this.spndPrduDayAmtOvrrUsed = spndPrduDayAmtOvrrUsed;
        this.spndPrduDayXtnsUsed = spndPrduDayXtnsUsed;
        this.spndPrduDayXtnsOvrrUsed = spndPrduDayXtnsOvrrUsed;
        this.spndPrduCycAmtUsed = spndPrduCycAmtUsed;
        this.spndPrduCycAmtOvrrUsed = spndPrduCycAmtOvrrUsed;
        this.spndPrduCycXtnsUsed = spndPrduCycXtnsUsed;
        this.spndPrduCycXtnsOvrrUsed = spndPrduCycXtnsOvrrUsed;
        this.spndPrduDayAmtHold = spndPrduDayAmtHold;
        this.spndPrduDayAmtOvrrHold = spndPrduDayAmtOvrrHold;
        this.spndPrduDayXtnsHold = spndPrduDayXtnsHold;
        this.spndPrduDayXtnsOvrrHold = spndPrduDayXtnsOvrrHold;
        this.spndPrduCycAmtHold = spndPrduCycAmtHold;
        this.spndPrduCycAmtOvrrHold = spndPrduCycAmtOvrrHold;
        this.spndPrduCycXtnsHold = spndPrduCycXtnsHold;
        this.spndPrduCycXtnsOvrrHold = spndPrduCycXtnsOvrrHold;
        this.spndPrduLastXtnDate = spndPrduLastXtnDate;
        this.spndPrduLastResDate = spndPrduLastResDate;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SpndProdLmtsUsed(String spndPrduAcctNbr, String spndProdcId) {
        this.spndProdLmtsUsedPK = new SpndProdLmtsUsedPK(spndPrduAcctNbr, spndProdcId);
    }

    public SpndProdLmtsUsedPK getSpndProdLmtsUsedPK() {
        return spndProdLmtsUsedPK;
    }

    public void setSpndProdLmtsUsedPK(SpndProdLmtsUsedPK spndProdLmtsUsedPK) {
        this.spndProdLmtsUsedPK = spndProdLmtsUsedPK;
    }

    public BigDecimal getSpndPrduDayAmtUsed() {
        return spndPrduDayAmtUsed;
    }

    public void setSpndPrduDayAmtUsed(BigDecimal spndPrduDayAmtUsed) {
        this.spndPrduDayAmtUsed = spndPrduDayAmtUsed;
    }

    public BigDecimal getSpndPrduDayAmtOvrrUsed() {
        return spndPrduDayAmtOvrrUsed;
    }

    public void setSpndPrduDayAmtOvrrUsed(BigDecimal spndPrduDayAmtOvrrUsed) {
        this.spndPrduDayAmtOvrrUsed = spndPrduDayAmtOvrrUsed;
    }

    public int getSpndPrduDayXtnsUsed() {
        return spndPrduDayXtnsUsed;
    }

    public void setSpndPrduDayXtnsUsed(int spndPrduDayXtnsUsed) {
        this.spndPrduDayXtnsUsed = spndPrduDayXtnsUsed;
    }

    public int getSpndPrduDayXtnsOvrrUsed() {
        return spndPrduDayXtnsOvrrUsed;
    }

    public void setSpndPrduDayXtnsOvrrUsed(int spndPrduDayXtnsOvrrUsed) {
        this.spndPrduDayXtnsOvrrUsed = spndPrduDayXtnsOvrrUsed;
    }

    public BigDecimal getSpndPrduCycAmtUsed() {
        return spndPrduCycAmtUsed;
    }

    public void setSpndPrduCycAmtUsed(BigDecimal spndPrduCycAmtUsed) {
        this.spndPrduCycAmtUsed = spndPrduCycAmtUsed;
    }

    public BigDecimal getSpndPrduCycAmtOvrrUsed() {
        return spndPrduCycAmtOvrrUsed;
    }

    public void setSpndPrduCycAmtOvrrUsed(BigDecimal spndPrduCycAmtOvrrUsed) {
        this.spndPrduCycAmtOvrrUsed = spndPrduCycAmtOvrrUsed;
    }

    public int getSpndPrduCycXtnsUsed() {
        return spndPrduCycXtnsUsed;
    }

    public void setSpndPrduCycXtnsUsed(int spndPrduCycXtnsUsed) {
        this.spndPrduCycXtnsUsed = spndPrduCycXtnsUsed;
    }

    public int getSpndPrduCycXtnsOvrrUsed() {
        return spndPrduCycXtnsOvrrUsed;
    }

    public void setSpndPrduCycXtnsOvrrUsed(int spndPrduCycXtnsOvrrUsed) {
        this.spndPrduCycXtnsOvrrUsed = spndPrduCycXtnsOvrrUsed;
    }

    public BigDecimal getSpndPrduDayAmtHold() {
        return spndPrduDayAmtHold;
    }

    public void setSpndPrduDayAmtHold(BigDecimal spndPrduDayAmtHold) {
        this.spndPrduDayAmtHold = spndPrduDayAmtHold;
    }

    public BigDecimal getSpndPrduDayAmtOvrrHold() {
        return spndPrduDayAmtOvrrHold;
    }

    public void setSpndPrduDayAmtOvrrHold(BigDecimal spndPrduDayAmtOvrrHold) {
        this.spndPrduDayAmtOvrrHold = spndPrduDayAmtOvrrHold;
    }

    public int getSpndPrduDayXtnsHold() {
        return spndPrduDayXtnsHold;
    }

    public void setSpndPrduDayXtnsHold(int spndPrduDayXtnsHold) {
        this.spndPrduDayXtnsHold = spndPrduDayXtnsHold;
    }

    public int getSpndPrduDayXtnsOvrrHold() {
        return spndPrduDayXtnsOvrrHold;
    }

    public void setSpndPrduDayXtnsOvrrHold(int spndPrduDayXtnsOvrrHold) {
        this.spndPrduDayXtnsOvrrHold = spndPrduDayXtnsOvrrHold;
    }

    public BigDecimal getSpndPrduCycAmtHold() {
        return spndPrduCycAmtHold;
    }

    public void setSpndPrduCycAmtHold(BigDecimal spndPrduCycAmtHold) {
        this.spndPrduCycAmtHold = spndPrduCycAmtHold;
    }

    public BigDecimal getSpndPrduCycAmtOvrrHold() {
        return spndPrduCycAmtOvrrHold;
    }

    public void setSpndPrduCycAmtOvrrHold(BigDecimal spndPrduCycAmtOvrrHold) {
        this.spndPrduCycAmtOvrrHold = spndPrduCycAmtOvrrHold;
    }

    public int getSpndPrduCycXtnsHold() {
        return spndPrduCycXtnsHold;
    }

    public void setSpndPrduCycXtnsHold(int spndPrduCycXtnsHold) {
        this.spndPrduCycXtnsHold = spndPrduCycXtnsHold;
    }

    public int getSpndPrduCycXtnsOvrrHold() {
        return spndPrduCycXtnsOvrrHold;
    }

    public void setSpndPrduCycXtnsOvrrHold(int spndPrduCycXtnsOvrrHold) {
        this.spndPrduCycXtnsOvrrHold = spndPrduCycXtnsOvrrHold;
    }

    public Date getSpndPrduLastXtnDate() {
        return spndPrduLastXtnDate;
    }

    public void setSpndPrduLastXtnDate(Date spndPrduLastXtnDate) {
        this.spndPrduLastXtnDate = spndPrduLastXtnDate;
    }

    public Date getSpndPrduLastResDate() {
        return spndPrduLastResDate;
    }

    public void setSpndPrduLastResDate(Date spndPrduLastResDate) {
        this.spndPrduLastResDate = spndPrduLastResDate;
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
        hash += (spndProdLmtsUsedPK != null ? spndProdLmtsUsedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpndProdLmtsUsed)) {
            return false;
        }
        SpndProdLmtsUsed other = (SpndProdLmtsUsed) object;
        if ((this.spndProdLmtsUsedPK == null && other.spndProdLmtsUsedPK != null) || (this.spndProdLmtsUsedPK != null && !this.spndProdLmtsUsedPK.equals(other.spndProdLmtsUsedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SpndProdLmtsUsed[ spndProdLmtsUsedPK=" + spndProdLmtsUsedPK + " ]";
    }
    
}
