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
@Table(name = "PRD_CMST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdCmst.findAll", query = "SELECT p FROM PrdCmst p")})
public class PrdCmst implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdCmstPK prdCmstPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TL_AMT_SILVER")
    private BigDecimal tlAmtSilver;
    @Basic(optional = false)
    @Column(name = "TL_AMT_K800")
    private BigDecimal tlAmtK800;
    @Basic(optional = false)
    @Column(name = "TL_AMT_COPT")
    private BigDecimal tlAmtCopt;
    @Basic(optional = false)
    @Column(name = "TL_AMT_GOLD")
    private BigDecimal tlAmtGold;
    @Basic(optional = false)
    @Column(name = "CUST_FEE_FLG")
    private Character custFeeFlg;
    @Basic(optional = false)
    @Column(name = "PMT_FREQ_FLG")
    private Character pmtFreqFlg;
    @Basic(optional = false)
    @Column(name = "NBR_SITES")
    private int nbrSites;
    @Basic(optional = false)
    @Column(name = "TL_SITES")
    private BigDecimal tlSites;
    @Basic(optional = false)
    @Column(name = "INVTRY_DATA_RETRIE")
    private Character invtryDataRetrie;
    @Basic(optional = false)
    @Column(name = "GOLD_SYS_CHA_FLG")
    private Character goldSysChaFlg;
    @Basic(optional = false)
    @Column(name = "XTND_WRTY_FLG")
    private Character xtndWrtyFlg;
    @Basic(optional = false)
    @Column(name = "XTND_WRTY_YEARS_FL")
    private Character xtndWrtyYearsFl;
    @Basic(optional = false)
    @Column(name = "CMCHK_CRD_FEE")
    private BigDecimal cmchkCrdFee;
    @Basic(optional = false)
    @Column(name = "FLT_PCHSG_FEE")
    private BigDecimal fltPchsgFee;
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
    @Column(name = "HRDWR_MAINT_FLG")
    private Character hrdwrMaintFlg;

    public PrdCmst() {
    }

    public PrdCmst(PrdCmstPK prdCmstPK) {
        this.prdCmstPK = prdCmstPK;
    }

    public PrdCmst(PrdCmstPK prdCmstPK, BigDecimal tlAmtSilver, BigDecimal tlAmtK800, BigDecimal tlAmtCopt, BigDecimal tlAmtGold, Character custFeeFlg, Character pmtFreqFlg, int nbrSites, BigDecimal tlSites, Character invtryDataRetrie, Character goldSysChaFlg, Character xtndWrtyFlg, Character xtndWrtyYearsFl, BigDecimal cmchkCrdFee, BigDecimal fltPchsgFee, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character hrdwrMaintFlg) {
        this.prdCmstPK = prdCmstPK;
        this.tlAmtSilver = tlAmtSilver;
        this.tlAmtK800 = tlAmtK800;
        this.tlAmtCopt = tlAmtCopt;
        this.tlAmtGold = tlAmtGold;
        this.custFeeFlg = custFeeFlg;
        this.pmtFreqFlg = pmtFreqFlg;
        this.nbrSites = nbrSites;
        this.tlSites = tlSites;
        this.invtryDataRetrie = invtryDataRetrie;
        this.goldSysChaFlg = goldSysChaFlg;
        this.xtndWrtyFlg = xtndWrtyFlg;
        this.xtndWrtyYearsFl = xtndWrtyYearsFl;
        this.cmchkCrdFee = cmchkCrdFee;
        this.fltPchsgFee = fltPchsgFee;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.hrdwrMaintFlg = hrdwrMaintFlg;
    }

    public PrdCmst(String applNbr, String childTyp) {
        this.prdCmstPK = new PrdCmstPK(applNbr, childTyp);
    }

    public PrdCmstPK getPrdCmstPK() {
        return prdCmstPK;
    }

    public void setPrdCmstPK(PrdCmstPK prdCmstPK) {
        this.prdCmstPK = prdCmstPK;
    }

    public BigDecimal getTlAmtSilver() {
        return tlAmtSilver;
    }

    public void setTlAmtSilver(BigDecimal tlAmtSilver) {
        this.tlAmtSilver = tlAmtSilver;
    }

    public BigDecimal getTlAmtK800() {
        return tlAmtK800;
    }

    public void setTlAmtK800(BigDecimal tlAmtK800) {
        this.tlAmtK800 = tlAmtK800;
    }

    public BigDecimal getTlAmtCopt() {
        return tlAmtCopt;
    }

    public void setTlAmtCopt(BigDecimal tlAmtCopt) {
        this.tlAmtCopt = tlAmtCopt;
    }

    public BigDecimal getTlAmtGold() {
        return tlAmtGold;
    }

    public void setTlAmtGold(BigDecimal tlAmtGold) {
        this.tlAmtGold = tlAmtGold;
    }

    public Character getCustFeeFlg() {
        return custFeeFlg;
    }

    public void setCustFeeFlg(Character custFeeFlg) {
        this.custFeeFlg = custFeeFlg;
    }

    public Character getPmtFreqFlg() {
        return pmtFreqFlg;
    }

    public void setPmtFreqFlg(Character pmtFreqFlg) {
        this.pmtFreqFlg = pmtFreqFlg;
    }

    public int getNbrSites() {
        return nbrSites;
    }

    public void setNbrSites(int nbrSites) {
        this.nbrSites = nbrSites;
    }

    public BigDecimal getTlSites() {
        return tlSites;
    }

    public void setTlSites(BigDecimal tlSites) {
        this.tlSites = tlSites;
    }

    public Character getInvtryDataRetrie() {
        return invtryDataRetrie;
    }

    public void setInvtryDataRetrie(Character invtryDataRetrie) {
        this.invtryDataRetrie = invtryDataRetrie;
    }

    public Character getGoldSysChaFlg() {
        return goldSysChaFlg;
    }

    public void setGoldSysChaFlg(Character goldSysChaFlg) {
        this.goldSysChaFlg = goldSysChaFlg;
    }

    public Character getXtndWrtyFlg() {
        return xtndWrtyFlg;
    }

    public void setXtndWrtyFlg(Character xtndWrtyFlg) {
        this.xtndWrtyFlg = xtndWrtyFlg;
    }

    public Character getXtndWrtyYearsFl() {
        return xtndWrtyYearsFl;
    }

    public void setXtndWrtyYearsFl(Character xtndWrtyYearsFl) {
        this.xtndWrtyYearsFl = xtndWrtyYearsFl;
    }

    public BigDecimal getCmchkCrdFee() {
        return cmchkCrdFee;
    }

    public void setCmchkCrdFee(BigDecimal cmchkCrdFee) {
        this.cmchkCrdFee = cmchkCrdFee;
    }

    public BigDecimal getFltPchsgFee() {
        return fltPchsgFee;
    }

    public void setFltPchsgFee(BigDecimal fltPchsgFee) {
        this.fltPchsgFee = fltPchsgFee;
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

    public Character getHrdwrMaintFlg() {
        return hrdwrMaintFlg;
    }

    public void setHrdwrMaintFlg(Character hrdwrMaintFlg) {
        this.hrdwrMaintFlg = hrdwrMaintFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdCmstPK != null ? prdCmstPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdCmst)) {
            return false;
        }
        PrdCmst other = (PrdCmst) object;
        if ((this.prdCmstPK == null && other.prdCmstPK != null) || (this.prdCmstPK != null && !this.prdCmstPK.equals(other.prdCmstPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCmst[ prdCmstPK=" + prdCmstPK + " ]";
    }
    
}
