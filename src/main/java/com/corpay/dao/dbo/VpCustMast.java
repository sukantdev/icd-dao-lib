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
@Table(name = "VP_CUST_MAST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpCustMast.findAll", query = "SELECT v FROM VpCustMast v")})
public class VpCustMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_MAST_ID")
    private String custMastId;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CUST_STATUS")
    private Character custStatus;
    @Basic(optional = false)
    @Column(name = "CUST_GRP_ID")
    private String custGrpId;
    @Basic(optional = false)
    @Column(name = "CUST_GRP_NM")
    private String custGrpNm;
    @Basic(optional = false)
    @Column(name = "C_COUNTRY_CD")
    private short cCountryCd;
    @Basic(optional = false)
    @Column(name = "TIN_REQ")
    private short tinReq;
    @Basic(optional = false)
    @Column(name = "INDUSTRY_SEG")
    private String industrySeg;
    @Basic(optional = false)
    @Column(name = "REV_PROJ")
    private String revProj;
    @Basic(optional = false)
    @Column(name = "REBATE_BASIS")
    private String rebateBasis;
    @Basic(optional = false)
    @Column(name = "ACCOUNTING_SYS")
    private String accountingSys;
    @Basic(optional = false)
    @Column(name = "INTEGRATION_TYP")
    private String integrationTyp;
    @Basic(optional = false)
    @Column(name = "C_MISC1")
    private String cMisc1;
    @Basic(optional = false)
    @Column(name = "C_MISC2")
    private String cMisc2;
    @Basic(optional = false)
    @Column(name = "C_MISC3")
    private String cMisc3;
    @Basic(optional = false)
    @Column(name = "C_MISC4")
    private String cMisc4;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CAMP_STAT_CD")
    private String campStatCd;

    public VpCustMast() {
    }

    public VpCustMast(String custMastId) {
        this.custMastId = custMastId;
    }

    public VpCustMast(String custMastId, String acctCd, String acctNm, String custId, String custNm, Character custStatus, String custGrpId, String custGrpNm, short cCountryCd, short tinReq, String industrySeg, String revProj, String rebateBasis, String accountingSys, String integrationTyp, String cMisc1, String cMisc2, String cMisc3, String cMisc4, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String campStatCd) {
        this.custMastId = custMastId;
        this.acctCd = acctCd;
        this.acctNm = acctNm;
        this.custId = custId;
        this.custNm = custNm;
        this.custStatus = custStatus;
        this.custGrpId = custGrpId;
        this.custGrpNm = custGrpNm;
        this.cCountryCd = cCountryCd;
        this.tinReq = tinReq;
        this.industrySeg = industrySeg;
        this.revProj = revProj;
        this.rebateBasis = rebateBasis;
        this.accountingSys = accountingSys;
        this.integrationTyp = integrationTyp;
        this.cMisc1 = cMisc1;
        this.cMisc2 = cMisc2;
        this.cMisc3 = cMisc3;
        this.cMisc4 = cMisc4;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.campStatCd = campStatCd;
    }

    public String getCustMastId() {
        return custMastId;
    }

    public void setCustMastId(String custMastId) {
        this.custMastId = custMastId;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public Character getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(Character custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustGrpId() {
        return custGrpId;
    }

    public void setCustGrpId(String custGrpId) {
        this.custGrpId = custGrpId;
    }

    public String getCustGrpNm() {
        return custGrpNm;
    }

    public void setCustGrpNm(String custGrpNm) {
        this.custGrpNm = custGrpNm;
    }

    public short getCCountryCd() {
        return cCountryCd;
    }

    public void setCCountryCd(short cCountryCd) {
        this.cCountryCd = cCountryCd;
    }

    public short getTinReq() {
        return tinReq;
    }

    public void setTinReq(short tinReq) {
        this.tinReq = tinReq;
    }

    public String getIndustrySeg() {
        return industrySeg;
    }

    public void setIndustrySeg(String industrySeg) {
        this.industrySeg = industrySeg;
    }

    public String getRevProj() {
        return revProj;
    }

    public void setRevProj(String revProj) {
        this.revProj = revProj;
    }

    public String getRebateBasis() {
        return rebateBasis;
    }

    public void setRebateBasis(String rebateBasis) {
        this.rebateBasis = rebateBasis;
    }

    public String getAccountingSys() {
        return accountingSys;
    }

    public void setAccountingSys(String accountingSys) {
        this.accountingSys = accountingSys;
    }

    public String getIntegrationTyp() {
        return integrationTyp;
    }

    public void setIntegrationTyp(String integrationTyp) {
        this.integrationTyp = integrationTyp;
    }

    public String getCMisc1() {
        return cMisc1;
    }

    public void setCMisc1(String cMisc1) {
        this.cMisc1 = cMisc1;
    }

    public String getCMisc2() {
        return cMisc2;
    }

    public void setCMisc2(String cMisc2) {
        this.cMisc2 = cMisc2;
    }

    public String getCMisc3() {
        return cMisc3;
    }

    public void setCMisc3(String cMisc3) {
        this.cMisc3 = cMisc3;
    }

    public String getCMisc4() {
        return cMisc4;
    }

    public void setCMisc4(String cMisc4) {
        this.cMisc4 = cMisc4;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCampStatCd() {
        return campStatCd;
    }

    public void setCampStatCd(String campStatCd) {
        this.campStatCd = campStatCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custMastId != null ? custMastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCustMast)) {
            return false;
        }
        VpCustMast other = (VpCustMast) object;
        if ((this.custMastId == null && other.custMastId != null) || (this.custMastId != null && !this.custMastId.equals(other.custMastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCustMast[ custMastId=" + custMastId + " ]";
    }
    
}
