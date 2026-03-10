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
@Table(name = "CHAIN_DISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ChainDisc.findAll", query = "SELECT c FROM ChainDisc c")})
public class ChainDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHAIN_CD")
    private String chainCd;
    @Basic(optional = false)
    @Column(name = "MARGIN_DISC_FLG")
    private Character marginDiscFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MARGIN_PCT")
    private BigDecimal marginPct;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT_1")
    private int truckCnt1;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG_1")
    private Character useMarginFlg1;
    @Basic(optional = false)
    @Column(name = "SC_FEE_1")
    private BigDecimal scFee1;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT_2")
    private int truckCnt2;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG_2")
    private Character useMarginFlg2;
    @Basic(optional = false)
    @Column(name = "SC_FEE_2")
    private BigDecimal scFee2;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT_3")
    private int truckCnt3;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG_3")
    private Character useMarginFlg3;
    @Basic(optional = false)
    @Column(name = "SC_FEE_3")
    private BigDecimal scFee3;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT_4")
    private int truckCnt4;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG_4")
    private Character useMarginFlg4;
    @Basic(optional = false)
    @Column(name = "SC_FEE_4")
    private BigDecimal scFee4;
    @Basic(optional = false)
    @Column(name = "TRUCK_CNT_5")
    private int truckCnt5;
    @Basic(optional = false)
    @Column(name = "USE_MARGIN_FLG_5")
    private Character useMarginFlg5;
    @Basic(optional = false)
    @Column(name = "SC_FEE_5")
    private BigDecimal scFee5;
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

    public ChainDisc() {
    }

    public ChainDisc(String chainCd) {
        this.chainCd = chainCd;
    }

    public ChainDisc(String chainCd, Character marginDiscFlg, BigDecimal marginPct, BigDecimal discAmt, int truckCnt1, Character useMarginFlg1, BigDecimal scFee1, int truckCnt2, Character useMarginFlg2, BigDecimal scFee2, int truckCnt3, Character useMarginFlg3, BigDecimal scFee3, int truckCnt4, Character useMarginFlg4, BigDecimal scFee4, int truckCnt5, Character useMarginFlg5, BigDecimal scFee5, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.chainCd = chainCd;
        this.marginDiscFlg = marginDiscFlg;
        this.marginPct = marginPct;
        this.discAmt = discAmt;
        this.truckCnt1 = truckCnt1;
        this.useMarginFlg1 = useMarginFlg1;
        this.scFee1 = scFee1;
        this.truckCnt2 = truckCnt2;
        this.useMarginFlg2 = useMarginFlg2;
        this.scFee2 = scFee2;
        this.truckCnt3 = truckCnt3;
        this.useMarginFlg3 = useMarginFlg3;
        this.scFee3 = scFee3;
        this.truckCnt4 = truckCnt4;
        this.useMarginFlg4 = useMarginFlg4;
        this.scFee4 = scFee4;
        this.truckCnt5 = truckCnt5;
        this.useMarginFlg5 = useMarginFlg5;
        this.scFee5 = scFee5;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getChainCd() {
        return chainCd;
    }

    public void setChainCd(String chainCd) {
        this.chainCd = chainCd;
    }

    public Character getMarginDiscFlg() {
        return marginDiscFlg;
    }

    public void setMarginDiscFlg(Character marginDiscFlg) {
        this.marginDiscFlg = marginDiscFlg;
    }

    public BigDecimal getMarginPct() {
        return marginPct;
    }

    public void setMarginPct(BigDecimal marginPct) {
        this.marginPct = marginPct;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public int getTruckCnt1() {
        return truckCnt1;
    }

    public void setTruckCnt1(int truckCnt1) {
        this.truckCnt1 = truckCnt1;
    }

    public Character getUseMarginFlg1() {
        return useMarginFlg1;
    }

    public void setUseMarginFlg1(Character useMarginFlg1) {
        this.useMarginFlg1 = useMarginFlg1;
    }

    public BigDecimal getScFee1() {
        return scFee1;
    }

    public void setScFee1(BigDecimal scFee1) {
        this.scFee1 = scFee1;
    }

    public int getTruckCnt2() {
        return truckCnt2;
    }

    public void setTruckCnt2(int truckCnt2) {
        this.truckCnt2 = truckCnt2;
    }

    public Character getUseMarginFlg2() {
        return useMarginFlg2;
    }

    public void setUseMarginFlg2(Character useMarginFlg2) {
        this.useMarginFlg2 = useMarginFlg2;
    }

    public BigDecimal getScFee2() {
        return scFee2;
    }

    public void setScFee2(BigDecimal scFee2) {
        this.scFee2 = scFee2;
    }

    public int getTruckCnt3() {
        return truckCnt3;
    }

    public void setTruckCnt3(int truckCnt3) {
        this.truckCnt3 = truckCnt3;
    }

    public Character getUseMarginFlg3() {
        return useMarginFlg3;
    }

    public void setUseMarginFlg3(Character useMarginFlg3) {
        this.useMarginFlg3 = useMarginFlg3;
    }

    public BigDecimal getScFee3() {
        return scFee3;
    }

    public void setScFee3(BigDecimal scFee3) {
        this.scFee3 = scFee3;
    }

    public int getTruckCnt4() {
        return truckCnt4;
    }

    public void setTruckCnt4(int truckCnt4) {
        this.truckCnt4 = truckCnt4;
    }

    public Character getUseMarginFlg4() {
        return useMarginFlg4;
    }

    public void setUseMarginFlg4(Character useMarginFlg4) {
        this.useMarginFlg4 = useMarginFlg4;
    }

    public BigDecimal getScFee4() {
        return scFee4;
    }

    public void setScFee4(BigDecimal scFee4) {
        this.scFee4 = scFee4;
    }

    public int getTruckCnt5() {
        return truckCnt5;
    }

    public void setTruckCnt5(int truckCnt5) {
        this.truckCnt5 = truckCnt5;
    }

    public Character getUseMarginFlg5() {
        return useMarginFlg5;
    }

    public void setUseMarginFlg5(Character useMarginFlg5) {
        this.useMarginFlg5 = useMarginFlg5;
    }

    public BigDecimal getScFee5() {
        return scFee5;
    }

    public void setScFee5(BigDecimal scFee5) {
        this.scFee5 = scFee5;
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
        hash += (chainCd != null ? chainCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChainDisc)) {
            return false;
        }
        ChainDisc other = (ChainDisc) object;
        if ((this.chainCd == null && other.chainCd != null) || (this.chainCd != null && !this.chainCd.equals(other.chainCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ChainDisc[ chainCd=" + chainCd + " ]";
    }
    
}
