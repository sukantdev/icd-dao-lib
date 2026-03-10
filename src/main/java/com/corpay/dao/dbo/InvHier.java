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
@Table(name = "INV_HIER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvHier.findAll", query = "SELECT i FROM InvHier i")})
public class InvHier implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvHierPK invHierPK;
    @Basic(optional = false)
    @Column(name = "CORP_NM")
    private String corpNm;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "SUB_ACCT_NM")
    private String subAcctNm;
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
    @Column(name = "LVL_1")
    private String lvl1;
    @Basic(optional = false)
    @Column(name = "LVL_2")
    private String lvl2;
    @Basic(optional = false)
    @Column(name = "LVL_3")
    private String lvl3;
    @Basic(optional = false)
    @Column(name = "LVL_4")
    private String lvl4;
    @Basic(optional = false)
    @Column(name = "LVL_5")
    private String lvl5;
    @Basic(optional = false)
    @Column(name = "LVL_6")
    private String lvl6;
    @Basic(optional = false)
    @Column(name = "LVL_7")
    private String lvl7;
    @Basic(optional = false)
    @Column(name = "LVL_8")
    private String lvl8;
    @Basic(optional = false)
    @Column(name = "LVL_9")
    private String lvl9;
    @Basic(optional = false)
    @Column(name = "LVL_10")
    private String lvl10;
    @Basic(optional = false)
    @Column(name = "LVL_11")
    private String lvl11;
    @Basic(optional = false)
    @Column(name = "LVL_12")
    private String lvl12;
    @Basic(optional = false)
    @Column(name = "LVL_13")
    private String lvl13;
    @Basic(optional = false)
    @Column(name = "LVL_14")
    private String lvl14;
    @Basic(optional = false)
    @Column(name = "LVL_15")
    private String lvl15;

    public InvHier() {
    }

    public InvHier(InvHierPK invHierPK) {
        this.invHierPK = invHierPK;
    }

    public InvHier(InvHierPK invHierPK, String corpNm, String acctNm, String subAcctNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String lvl1, String lvl2, String lvl3, String lvl4, String lvl5, String lvl6, String lvl7, String lvl8, String lvl9, String lvl10, String lvl11, String lvl12, String lvl13, String lvl14, String lvl15) {
        this.invHierPK = invHierPK;
        this.corpNm = corpNm;
        this.acctNm = acctNm;
        this.subAcctNm = subAcctNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.lvl1 = lvl1;
        this.lvl2 = lvl2;
        this.lvl3 = lvl3;
        this.lvl4 = lvl4;
        this.lvl5 = lvl5;
        this.lvl6 = lvl6;
        this.lvl7 = lvl7;
        this.lvl8 = lvl8;
        this.lvl9 = lvl9;
        this.lvl10 = lvl10;
        this.lvl11 = lvl11;
        this.lvl12 = lvl12;
        this.lvl13 = lvl13;
        this.lvl14 = lvl14;
        this.lvl15 = lvl15;
    }

    public InvHier(Date hierTs, short seqNbr) {
        this.invHierPK = new InvHierPK(hierTs, seqNbr);
    }

    public InvHierPK getInvHierPK() {
        return invHierPK;
    }

    public void setInvHierPK(InvHierPK invHierPK) {
        this.invHierPK = invHierPK;
    }

    public String getCorpNm() {
        return corpNm;
    }

    public void setCorpNm(String corpNm) {
        this.corpNm = corpNm;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getSubAcctNm() {
        return subAcctNm;
    }

    public void setSubAcctNm(String subAcctNm) {
        this.subAcctNm = subAcctNm;
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

    public String getLvl1() {
        return lvl1;
    }

    public void setLvl1(String lvl1) {
        this.lvl1 = lvl1;
    }

    public String getLvl2() {
        return lvl2;
    }

    public void setLvl2(String lvl2) {
        this.lvl2 = lvl2;
    }

    public String getLvl3() {
        return lvl3;
    }

    public void setLvl3(String lvl3) {
        this.lvl3 = lvl3;
    }

    public String getLvl4() {
        return lvl4;
    }

    public void setLvl4(String lvl4) {
        this.lvl4 = lvl4;
    }

    public String getLvl5() {
        return lvl5;
    }

    public void setLvl5(String lvl5) {
        this.lvl5 = lvl5;
    }

    public String getLvl6() {
        return lvl6;
    }

    public void setLvl6(String lvl6) {
        this.lvl6 = lvl6;
    }

    public String getLvl7() {
        return lvl7;
    }

    public void setLvl7(String lvl7) {
        this.lvl7 = lvl7;
    }

    public String getLvl8() {
        return lvl8;
    }

    public void setLvl8(String lvl8) {
        this.lvl8 = lvl8;
    }

    public String getLvl9() {
        return lvl9;
    }

    public void setLvl9(String lvl9) {
        this.lvl9 = lvl9;
    }

    public String getLvl10() {
        return lvl10;
    }

    public void setLvl10(String lvl10) {
        this.lvl10 = lvl10;
    }

    public String getLvl11() {
        return lvl11;
    }

    public void setLvl11(String lvl11) {
        this.lvl11 = lvl11;
    }

    public String getLvl12() {
        return lvl12;
    }

    public void setLvl12(String lvl12) {
        this.lvl12 = lvl12;
    }

    public String getLvl13() {
        return lvl13;
    }

    public void setLvl13(String lvl13) {
        this.lvl13 = lvl13;
    }

    public String getLvl14() {
        return lvl14;
    }

    public void setLvl14(String lvl14) {
        this.lvl14 = lvl14;
    }

    public String getLvl15() {
        return lvl15;
    }

    public void setLvl15(String lvl15) {
        this.lvl15 = lvl15;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invHierPK != null ? invHierPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvHier)) {
            return false;
        }
        InvHier other = (InvHier) object;
        if ((this.invHierPK == null && other.invHierPK != null) || (this.invHierPK != null && !this.invHierPK.equals(other.invHierPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvHier[ invHierPK=" + invHierPK + " ]";
    }
    
}
