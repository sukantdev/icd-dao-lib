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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PROD_CD_PARM", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ProdCdParm.findAll", query = "SELECT p FROM ProdCdParm p")})
public class ProdCdParm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private Integer prodCd;
    @Basic(optional = false)
    @Column(name = "CYC_BILL_PROD_FLG")
    private Character cycBillProdFlg;
    @Basic(optional = false)
    @Column(name = "STD_SJ_FLG")
    private Character stdSjFlg;
    @Basic(optional = false)
    @Column(name = "FEE_PROC_SJ_FLG")
    private Character feeProcSjFlg;
    @Basic(optional = false)
    @Column(name = "AR_AT_ACCT_FLG")
    private Character arAtAcctFlg;
    @Basic(optional = false)
    @Column(name = "AR_DESC_FROM_SUBX_FLG")
    private Character arDescFromSubxFlg;
    @Basic(optional = false)
    @Column(name = "ACH_PROD_FLG")
    private Character achProdFlg;
    @Basic(optional = false)
    @Column(name = "CNTL_SEQ_CHK_FLG")
    private Character cntlSeqChkFlg;
    @Basic(optional = false)
    @Column(name = "PROC_INV_RECS_FLG")
    private Character procInvRecsFlg;
    @Basic(optional = false)
    @Column(name = "MISC_FLG")
    private Character miscFlg;
    @Basic(optional = false)
    @Column(name = "USE_SUBX_FOR_RVNU_FLG")
    private Character useSubxForRvnuFlg;
    @Basic(optional = false)
    @Column(name = "TAX_SUBSYS_ID")
    private String taxSubsysId;
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

    public ProdCdParm() {
    }

    public ProdCdParm(Integer prodCd) {
        this.prodCd = prodCd;
    }

    public ProdCdParm(Integer prodCd, Character cycBillProdFlg, Character stdSjFlg, Character feeProcSjFlg, Character arAtAcctFlg, Character arDescFromSubxFlg, Character achProdFlg, Character cntlSeqChkFlg, Character procInvRecsFlg, Character miscFlg, Character useSubxForRvnuFlg, String taxSubsysId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prodCd = prodCd;
        this.cycBillProdFlg = cycBillProdFlg;
        this.stdSjFlg = stdSjFlg;
        this.feeProcSjFlg = feeProcSjFlg;
        this.arAtAcctFlg = arAtAcctFlg;
        this.arDescFromSubxFlg = arDescFromSubxFlg;
        this.achProdFlg = achProdFlg;
        this.cntlSeqChkFlg = cntlSeqChkFlg;
        this.procInvRecsFlg = procInvRecsFlg;
        this.miscFlg = miscFlg;
        this.useSubxForRvnuFlg = useSubxForRvnuFlg;
        this.taxSubsysId = taxSubsysId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getProdCd() {
        return prodCd;
    }

    public void setProdCd(Integer prodCd) {
        this.prodCd = prodCd;
    }

    public Character getCycBillProdFlg() {
        return cycBillProdFlg;
    }

    public void setCycBillProdFlg(Character cycBillProdFlg) {
        this.cycBillProdFlg = cycBillProdFlg;
    }

    public Character getStdSjFlg() {
        return stdSjFlg;
    }

    public void setStdSjFlg(Character stdSjFlg) {
        this.stdSjFlg = stdSjFlg;
    }

    public Character getFeeProcSjFlg() {
        return feeProcSjFlg;
    }

    public void setFeeProcSjFlg(Character feeProcSjFlg) {
        this.feeProcSjFlg = feeProcSjFlg;
    }

    public Character getArAtAcctFlg() {
        return arAtAcctFlg;
    }

    public void setArAtAcctFlg(Character arAtAcctFlg) {
        this.arAtAcctFlg = arAtAcctFlg;
    }

    public Character getArDescFromSubxFlg() {
        return arDescFromSubxFlg;
    }

    public void setArDescFromSubxFlg(Character arDescFromSubxFlg) {
        this.arDescFromSubxFlg = arDescFromSubxFlg;
    }

    public Character getAchProdFlg() {
        return achProdFlg;
    }

    public void setAchProdFlg(Character achProdFlg) {
        this.achProdFlg = achProdFlg;
    }

    public Character getCntlSeqChkFlg() {
        return cntlSeqChkFlg;
    }

    public void setCntlSeqChkFlg(Character cntlSeqChkFlg) {
        this.cntlSeqChkFlg = cntlSeqChkFlg;
    }

    public Character getProcInvRecsFlg() {
        return procInvRecsFlg;
    }

    public void setProcInvRecsFlg(Character procInvRecsFlg) {
        this.procInvRecsFlg = procInvRecsFlg;
    }

    public Character getMiscFlg() {
        return miscFlg;
    }

    public void setMiscFlg(Character miscFlg) {
        this.miscFlg = miscFlg;
    }

    public Character getUseSubxForRvnuFlg() {
        return useSubxForRvnuFlg;
    }

    public void setUseSubxForRvnuFlg(Character useSubxForRvnuFlg) {
        this.useSubxForRvnuFlg = useSubxForRvnuFlg;
    }

    public String getTaxSubsysId() {
        return taxSubsysId;
    }

    public void setTaxSubsysId(String taxSubsysId) {
        this.taxSubsysId = taxSubsysId;
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
        hash += (prodCd != null ? prodCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdCdParm)) {
            return false;
        }
        ProdCdParm other = (ProdCdParm) object;
        if ((this.prodCd == null && other.prodCd != null) || (this.prodCd != null && !this.prodCd.equals(other.prodCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ProdCdParm[ prodCd=" + prodCd + " ]";
    }
    
}
