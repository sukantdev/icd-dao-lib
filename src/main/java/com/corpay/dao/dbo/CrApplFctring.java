/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "CR_APPL_FCTRING", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplFctring.findAll", query = "SELECT c FROM CrApplFctring c")})
public class CrApplFctring implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CDN_FL_ACCT_CD")
    private String cdnFlAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_OO")
    private short nbrOo;
    @Basic(optional = false)
    @Column(name = "BANKRUPTCY_IND")
    private Character bankruptcyInd;
    @Basic(optional = false)
    @Column(name = "ASMT_IND")
    private Character asmtInd;
    @Basic(optional = false)
    @Column(name = "RECEIVERSHIP_IND")
    private Character receivershipInd;
    @Basic(optional = false)
    @Column(name = "INSOLVENT_IND")
    private Character insolventInd;
    @Basic(optional = false)
    @Column(name = "LIEN_IND")
    private Character lienInd;
    @Basic(optional = false)
    @Column(name = "LITIGATION_IND")
    private Character litigationInd;
    @Basic(optional = false)
    @Column(name = "EXPLAIN")
    private String explain;
    @Basic(optional = false)
    @Column(name = "CUR_ADV_RT")
    private String curAdvRt;
    @Basic(optional = false)
    @Column(name = "CUR_PROVIDER")
    private String curProvider;
    @Basic(optional = false)
    @Column(name = "PRPSD_ADV_RT")
    private String prpsdAdvRt;
    @Basic(optional = false)
    @Column(name = "PRPSD_FEE")
    private String prpsdFee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ANTICIP_MTHLY_VOL")
    private BigDecimal anticipMthlyVol;
    @Basic(optional = false)
    @Column(name = "YR_STRTD_GNRTG_REV")
    private String yrStrtdGnrtgRev;
    @Basic(optional = false)
    @Column(name = "AVG_INV_SIZE")
    private BigDecimal avgInvSize;
    @Basic(optional = false)
    @Column(name = "ANTICIP_PCT_GROWTH")
    private String anticipPctGrowth;
    @Basic(optional = false)
    @Column(name = "SLS_VOLUMES_30_DY")
    private BigDecimal slsVolumes30Dy;
    @Basic(optional = false)
    @Column(name = "SLS_VOLUME_12_MO")
    private BigDecimal slsVolume12Mo;
    @Basic(optional = false)
    @Column(name = "NBR_CUSTS")
    private int nbrCusts;
    @Basic(optional = false)
    @Column(name = "SLS_REP")
    private String slsRep;
    @Basic(optional = false)
    @Column(name = "NBR_DEDCTD_CUSTS")
    private int nbrDedctdCusts;
    @Basic(optional = false)
    @Column(name = "RESELLER")
    private String reseller;
    @Basic(optional = false)
    @Column(name = "CUR_FEES")
    private String curFees;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public CrApplFctring() {
    }

    public CrApplFctring(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplFctring(String applNbr, String cdnFlAcctCd, short nbrOo, Character bankruptcyInd, Character asmtInd, Character receivershipInd, Character insolventInd, Character lienInd, Character litigationInd, String explain, String curAdvRt, String curProvider, String prpsdAdvRt, String prpsdFee, BigDecimal anticipMthlyVol, String yrStrtdGnrtgRev, BigDecimal avgInvSize, String anticipPctGrowth, BigDecimal slsVolumes30Dy, BigDecimal slsVolume12Mo, int nbrCusts, String slsRep, int nbrDedctdCusts, String reseller, String curFees, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.cdnFlAcctCd = cdnFlAcctCd;
        this.nbrOo = nbrOo;
        this.bankruptcyInd = bankruptcyInd;
        this.asmtInd = asmtInd;
        this.receivershipInd = receivershipInd;
        this.insolventInd = insolventInd;
        this.lienInd = lienInd;
        this.litigationInd = litigationInd;
        this.explain = explain;
        this.curAdvRt = curAdvRt;
        this.curProvider = curProvider;
        this.prpsdAdvRt = prpsdAdvRt;
        this.prpsdFee = prpsdFee;
        this.anticipMthlyVol = anticipMthlyVol;
        this.yrStrtdGnrtgRev = yrStrtdGnrtgRev;
        this.avgInvSize = avgInvSize;
        this.anticipPctGrowth = anticipPctGrowth;
        this.slsVolumes30Dy = slsVolumes30Dy;
        this.slsVolume12Mo = slsVolume12Mo;
        this.nbrCusts = nbrCusts;
        this.slsRep = slsRep;
        this.nbrDedctdCusts = nbrDedctdCusts;
        this.reseller = reseller;
        this.curFees = curFees;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getCdnFlAcctCd() {
        return cdnFlAcctCd;
    }

    public void setCdnFlAcctCd(String cdnFlAcctCd) {
        this.cdnFlAcctCd = cdnFlAcctCd;
    }

    public short getNbrOo() {
        return nbrOo;
    }

    public void setNbrOo(short nbrOo) {
        this.nbrOo = nbrOo;
    }

    public Character getBankruptcyInd() {
        return bankruptcyInd;
    }

    public void setBankruptcyInd(Character bankruptcyInd) {
        this.bankruptcyInd = bankruptcyInd;
    }

    public Character getAsmtInd() {
        return asmtInd;
    }

    public void setAsmtInd(Character asmtInd) {
        this.asmtInd = asmtInd;
    }

    public Character getReceivershipInd() {
        return receivershipInd;
    }

    public void setReceivershipInd(Character receivershipInd) {
        this.receivershipInd = receivershipInd;
    }

    public Character getInsolventInd() {
        return insolventInd;
    }

    public void setInsolventInd(Character insolventInd) {
        this.insolventInd = insolventInd;
    }

    public Character getLienInd() {
        return lienInd;
    }

    public void setLienInd(Character lienInd) {
        this.lienInd = lienInd;
    }

    public Character getLitigationInd() {
        return litigationInd;
    }

    public void setLitigationInd(Character litigationInd) {
        this.litigationInd = litigationInd;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getCurAdvRt() {
        return curAdvRt;
    }

    public void setCurAdvRt(String curAdvRt) {
        this.curAdvRt = curAdvRt;
    }

    public String getCurProvider() {
        return curProvider;
    }

    public void setCurProvider(String curProvider) {
        this.curProvider = curProvider;
    }

    public String getPrpsdAdvRt() {
        return prpsdAdvRt;
    }

    public void setPrpsdAdvRt(String prpsdAdvRt) {
        this.prpsdAdvRt = prpsdAdvRt;
    }

    public String getPrpsdFee() {
        return prpsdFee;
    }

    public void setPrpsdFee(String prpsdFee) {
        this.prpsdFee = prpsdFee;
    }

    public BigDecimal getAnticipMthlyVol() {
        return anticipMthlyVol;
    }

    public void setAnticipMthlyVol(BigDecimal anticipMthlyVol) {
        this.anticipMthlyVol = anticipMthlyVol;
    }

    public String getYrStrtdGnrtgRev() {
        return yrStrtdGnrtgRev;
    }

    public void setYrStrtdGnrtgRev(String yrStrtdGnrtgRev) {
        this.yrStrtdGnrtgRev = yrStrtdGnrtgRev;
    }

    public BigDecimal getAvgInvSize() {
        return avgInvSize;
    }

    public void setAvgInvSize(BigDecimal avgInvSize) {
        this.avgInvSize = avgInvSize;
    }

    public String getAnticipPctGrowth() {
        return anticipPctGrowth;
    }

    public void setAnticipPctGrowth(String anticipPctGrowth) {
        this.anticipPctGrowth = anticipPctGrowth;
    }

    public BigDecimal getSlsVolumes30Dy() {
        return slsVolumes30Dy;
    }

    public void setSlsVolumes30Dy(BigDecimal slsVolumes30Dy) {
        this.slsVolumes30Dy = slsVolumes30Dy;
    }

    public BigDecimal getSlsVolume12Mo() {
        return slsVolume12Mo;
    }

    public void setSlsVolume12Mo(BigDecimal slsVolume12Mo) {
        this.slsVolume12Mo = slsVolume12Mo;
    }

    public int getNbrCusts() {
        return nbrCusts;
    }

    public void setNbrCusts(int nbrCusts) {
        this.nbrCusts = nbrCusts;
    }

    public String getSlsRep() {
        return slsRep;
    }

    public void setSlsRep(String slsRep) {
        this.slsRep = slsRep;
    }

    public int getNbrDedctdCusts() {
        return nbrDedctdCusts;
    }

    public void setNbrDedctdCusts(int nbrDedctdCusts) {
        this.nbrDedctdCusts = nbrDedctdCusts;
    }

    public String getReseller() {
        return reseller;
    }

    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    public String getCurFees() {
        return curFees;
    }

    public void setCurFees(String curFees) {
        this.curFees = curFees;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplFctring)) {
            return false;
        }
        CrApplFctring other = (CrApplFctring) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplFctring[ applNbr=" + applNbr + " ]";
    }
    
}
