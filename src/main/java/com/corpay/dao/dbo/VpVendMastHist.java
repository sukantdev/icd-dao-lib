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
@Table(name = "VP_VEND_MAST_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpVendMastHist.findAll", query = "SELECT v FROM VpVendMastHist v")})
public class VpVendMastHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpVendMastHistPK vpVendMastHistPK;
    @Basic(optional = false)
    @Column(name = "VEND_NM")
    private String vendNm;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL")
    private String remitEmail;
    @Basic(optional = false)
    @Column(name = "REMIT_TYPE_CD")
    private Character remitTypeCd;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "PFU_IND")
    private Character pfuInd;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD_CD")
    private String pmtMthdCd;
    @Basic(optional = false)
    @Column(name = "FULL_CARD_ON_REMITTANCE_FLG")
    private String fullCardOnRemittanceFlg;
    @Basic(optional = false)
    @Column(name = "VEND_ACPT_DBT_ONLY_FLG")
    private Character vendAcptDbtOnlyFlg;

    public VpVendMastHist() {
    }

    public VpVendMastHist(VpVendMastHistPK vpVendMastHistPK) {
        this.vpVendMastHistPK = vpVendMastHistPK;
    }

    public VpVendMastHist(VpVendMastHistPK vpVendMastHistPK, String vendNm, String taxId, String remitEmail, Character remitTypeCd, String mdyUsr, Date mdyTs, String crtUsr, Character pfuInd, String pmtMthdCd, String fullCardOnRemittanceFlg, Character vendAcptDbtOnlyFlg) {
        this.vpVendMastHistPK = vpVendMastHistPK;
        this.vendNm = vendNm;
        this.taxId = taxId;
        this.remitEmail = remitEmail;
        this.remitTypeCd = remitTypeCd;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.pfuInd = pfuInd;
        this.pmtMthdCd = pmtMthdCd;
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
        this.vendAcptDbtOnlyFlg = vendAcptDbtOnlyFlg;
    }

    public VpVendMastHist(String vendMastId, Date crtTs) {
        this.vpVendMastHistPK = new VpVendMastHistPK(vendMastId, crtTs);
    }

    public VpVendMastHistPK getVpVendMastHistPK() {
        return vpVendMastHistPK;
    }

    public void setVpVendMastHistPK(VpVendMastHistPK vpVendMastHistPK) {
        this.vpVendMastHistPK = vpVendMastHistPK;
    }

    public String getVendNm() {
        return vendNm;
    }

    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getRemitEmail() {
        return remitEmail;
    }

    public void setRemitEmail(String remitEmail) {
        this.remitEmail = remitEmail;
    }

    public Character getRemitTypeCd() {
        return remitTypeCd;
    }

    public void setRemitTypeCd(Character remitTypeCd) {
        this.remitTypeCd = remitTypeCd;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Character getPfuInd() {
        return pfuInd;
    }

    public void setPfuInd(Character pfuInd) {
        this.pfuInd = pfuInd;
    }

    public String getPmtMthdCd() {
        return pmtMthdCd;
    }

    public void setPmtMthdCd(String pmtMthdCd) {
        this.pmtMthdCd = pmtMthdCd;
    }

    public String getFullCardOnRemittanceFlg() {
        return fullCardOnRemittanceFlg;
    }

    public void setFullCardOnRemittanceFlg(String fullCardOnRemittanceFlg) {
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
    }

    public Character getVendAcptDbtOnlyFlg() {
        return vendAcptDbtOnlyFlg;
    }

    public void setVendAcptDbtOnlyFlg(Character vendAcptDbtOnlyFlg) {
        this.vendAcptDbtOnlyFlg = vendAcptDbtOnlyFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpVendMastHistPK != null ? vpVendMastHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendMastHist)) {
            return false;
        }
        VpVendMastHist other = (VpVendMastHist) object;
        if ((this.vpVendMastHistPK == null && other.vpVendMastHistPK != null) || (this.vpVendMastHistPK != null && !this.vpVendMastHistPK.equals(other.vpVendMastHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendMastHist[ vpVendMastHistPK=" + vpVendMastHistPK + " ]";
    }
    
}
