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
@Table(name = "PRD_SMRTLCK_CRDLCK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdSmrtlckCrdlck.findAll", query = "SELECT p FROM PrdSmrtlckCrdlck p")})
public class PrdSmrtlckCrdlck implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdSmrtlckCrdlckPK prdSmrtlckCrdlckPK;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private int nbrUnits;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT_CD")
    private String cdnAcctCd;
    @Basic(optional = false)
    @Column(name = "PAC_PRIDE_ID")
    private String pacPrideId;
    @Basic(optional = false)
    @Column(name = "TRNDR_CD")
    private String trndrCd;
    @Basic(optional = false)
    @Column(name = "VSAT_CD")
    private String vsatCd;
    @Basic(optional = false)
    @Column(name = "INSTALL_FLGS")
    private short installFlgs;
    @Basic(optional = false)
    @Column(name = "TS_NM")
    private String tsNm;
    @Basic(optional = false)
    @Column(name = "SHP_DT")
    @Temporal(TemporalType.DATE)
    private Date shpDt;
    @Basic(optional = false)
    @Column(name = "INSTALL_DT")
    @Temporal(TemporalType.DATE)
    private Date installDt;
    @Basic(optional = false)
    @Column(name = "OPER_HRS_FLGS")
    private short operHrsFlgs;
    @Basic(optional = false)
    @Column(name = "CPU_FLG")
    private Character cpuFlg;
    @Basic(optional = false)
    @Column(name = "KBRD_FLG")
    private Character kbrdFlg;
    @Basic(optional = false)
    @Column(name = "BTRY_UPS_FLG")
    private Character btryUpsFlg;
    @Basic(optional = false)
    @Column(name = "MNTR_FLG")
    private Character mntrFlg;
    @Basic(optional = false)
    @Column(name = "COMM_FLG")
    private Character commFlg;
    @Basic(optional = false)
    @Column(name = "PETROVEND_FLGS")
    private int petrovendFlgs;
    @Basic(optional = false)
    @Column(name = "ELTRN_PUMP_MNFTR")
    private String eltrnPumpMnftr;
    @Basic(optional = false)
    @Column(name = "ELTRN_PUMP_MODEL")
    private String eltrnPumpModel;
    @Basic(optional = false)
    @Column(name = "UPGD_FLGS")
    private short upgdFlgs;
    @Basic(optional = false)
    @Column(name = "UPGD_DESC")
    private String upgdDesc;
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

    public PrdSmrtlckCrdlck() {
    }

    public PrdSmrtlckCrdlck(PrdSmrtlckCrdlckPK prdSmrtlckCrdlckPK) {
        this.prdSmrtlckCrdlckPK = prdSmrtlckCrdlckPK;
    }

    public PrdSmrtlckCrdlck(PrdSmrtlckCrdlckPK prdSmrtlckCrdlckPK, int nbrUnits, String cdnAcctCd, String pacPrideId, String trndrCd, String vsatCd, short installFlgs, String tsNm, Date shpDt, Date installDt, short operHrsFlgs, Character cpuFlg, Character kbrdFlg, Character btryUpsFlg, Character mntrFlg, Character commFlg, int petrovendFlgs, String eltrnPumpMnftr, String eltrnPumpModel, short upgdFlgs, String upgdDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdSmrtlckCrdlckPK = prdSmrtlckCrdlckPK;
        this.nbrUnits = nbrUnits;
        this.cdnAcctCd = cdnAcctCd;
        this.pacPrideId = pacPrideId;
        this.trndrCd = trndrCd;
        this.vsatCd = vsatCd;
        this.installFlgs = installFlgs;
        this.tsNm = tsNm;
        this.shpDt = shpDt;
        this.installDt = installDt;
        this.operHrsFlgs = operHrsFlgs;
        this.cpuFlg = cpuFlg;
        this.kbrdFlg = kbrdFlg;
        this.btryUpsFlg = btryUpsFlg;
        this.mntrFlg = mntrFlg;
        this.commFlg = commFlg;
        this.petrovendFlgs = petrovendFlgs;
        this.eltrnPumpMnftr = eltrnPumpMnftr;
        this.eltrnPumpModel = eltrnPumpModel;
        this.upgdFlgs = upgdFlgs;
        this.upgdDesc = upgdDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdSmrtlckCrdlck(String applNbr, String childTyp) {
        this.prdSmrtlckCrdlckPK = new PrdSmrtlckCrdlckPK(applNbr, childTyp);
    }

    public PrdSmrtlckCrdlckPK getPrdSmrtlckCrdlckPK() {
        return prdSmrtlckCrdlckPK;
    }

    public void setPrdSmrtlckCrdlckPK(PrdSmrtlckCrdlckPK prdSmrtlckCrdlckPK) {
        this.prdSmrtlckCrdlckPK = prdSmrtlckCrdlckPK;
    }

    public int getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(int nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public String getCdnAcctCd() {
        return cdnAcctCd;
    }

    public void setCdnAcctCd(String cdnAcctCd) {
        this.cdnAcctCd = cdnAcctCd;
    }

    public String getPacPrideId() {
        return pacPrideId;
    }

    public void setPacPrideId(String pacPrideId) {
        this.pacPrideId = pacPrideId;
    }

    public String getTrndrCd() {
        return trndrCd;
    }

    public void setTrndrCd(String trndrCd) {
        this.trndrCd = trndrCd;
    }

    public String getVsatCd() {
        return vsatCd;
    }

    public void setVsatCd(String vsatCd) {
        this.vsatCd = vsatCd;
    }

    public short getInstallFlgs() {
        return installFlgs;
    }

    public void setInstallFlgs(short installFlgs) {
        this.installFlgs = installFlgs;
    }

    public String getTsNm() {
        return tsNm;
    }

    public void setTsNm(String tsNm) {
        this.tsNm = tsNm;
    }

    public Date getShpDt() {
        return shpDt;
    }

    public void setShpDt(Date shpDt) {
        this.shpDt = shpDt;
    }

    public Date getInstallDt() {
        return installDt;
    }

    public void setInstallDt(Date installDt) {
        this.installDt = installDt;
    }

    public short getOperHrsFlgs() {
        return operHrsFlgs;
    }

    public void setOperHrsFlgs(short operHrsFlgs) {
        this.operHrsFlgs = operHrsFlgs;
    }

    public Character getCpuFlg() {
        return cpuFlg;
    }

    public void setCpuFlg(Character cpuFlg) {
        this.cpuFlg = cpuFlg;
    }

    public Character getKbrdFlg() {
        return kbrdFlg;
    }

    public void setKbrdFlg(Character kbrdFlg) {
        this.kbrdFlg = kbrdFlg;
    }

    public Character getBtryUpsFlg() {
        return btryUpsFlg;
    }

    public void setBtryUpsFlg(Character btryUpsFlg) {
        this.btryUpsFlg = btryUpsFlg;
    }

    public Character getMntrFlg() {
        return mntrFlg;
    }

    public void setMntrFlg(Character mntrFlg) {
        this.mntrFlg = mntrFlg;
    }

    public Character getCommFlg() {
        return commFlg;
    }

    public void setCommFlg(Character commFlg) {
        this.commFlg = commFlg;
    }

    public int getPetrovendFlgs() {
        return petrovendFlgs;
    }

    public void setPetrovendFlgs(int petrovendFlgs) {
        this.petrovendFlgs = petrovendFlgs;
    }

    public String getEltrnPumpMnftr() {
        return eltrnPumpMnftr;
    }

    public void setEltrnPumpMnftr(String eltrnPumpMnftr) {
        this.eltrnPumpMnftr = eltrnPumpMnftr;
    }

    public String getEltrnPumpModel() {
        return eltrnPumpModel;
    }

    public void setEltrnPumpModel(String eltrnPumpModel) {
        this.eltrnPumpModel = eltrnPumpModel;
    }

    public short getUpgdFlgs() {
        return upgdFlgs;
    }

    public void setUpgdFlgs(short upgdFlgs) {
        this.upgdFlgs = upgdFlgs;
    }

    public String getUpgdDesc() {
        return upgdDesc;
    }

    public void setUpgdDesc(String upgdDesc) {
        this.upgdDesc = upgdDesc;
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
        hash += (prdSmrtlckCrdlckPK != null ? prdSmrtlckCrdlckPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdSmrtlckCrdlck)) {
            return false;
        }
        PrdSmrtlckCrdlck other = (PrdSmrtlckCrdlck) object;
        if ((this.prdSmrtlckCrdlckPK == null && other.prdSmrtlckCrdlckPK != null) || (this.prdSmrtlckCrdlckPK != null && !this.prdSmrtlckCrdlckPK.equals(other.prdSmrtlckCrdlckPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdSmrtlckCrdlck[ prdSmrtlckCrdlckPK=" + prdSmrtlckCrdlckPK + " ]";
    }
    
}
