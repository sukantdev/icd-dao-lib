package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "FUND_INSTITUTION", catalog = "", schema = "DBO")
public class FundInstitution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FND_INSTTN_ID")
    private String fndInsttnId;
    @Basic(optional = false)
    @Column(name = "FND_INSTTN_NM")
    private String fndInsttnNm;
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fndInsttnId", fetch = FetchType.LAZY)
    private Set<FundAccount> fundAccountSet;

    public FundInstitution() {
    }

    public FundInstitution(String fndInsttnId) {
        this.fndInsttnId = fndInsttnId;
    }

    public FundInstitution(String fndInsttnId, String fndInsttnNm, String cntryCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fndInsttnId = fndInsttnId;
        this.fndInsttnNm = fndInsttnNm;
        this.cntryCd = cntryCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFndInsttnId() {
        return fndInsttnId;
    }

    public void setFndInsttnId(String fndInsttnId) {
        this.fndInsttnId = fndInsttnId;
    }

    public String getFndInsttnNm() {
        return fndInsttnNm;
    }

    public void setFndInsttnNm(String fndInsttnNm) {
        this.fndInsttnNm = fndInsttnNm;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
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

    public Set<FundAccount> getFundAccountSet() {
        return fundAccountSet;
    }

    public void setFundAccountSet(Set<FundAccount> fundAccountSet) {
        this.fundAccountSet = fundAccountSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fndInsttnId != null ? fndInsttnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FundInstitution)) {
            return false;
        }
        FundInstitution other = (FundInstitution) object;
        if ((this.fndInsttnId == null && other.fndInsttnId != null) || (this.fndInsttnId != null && !this.fndInsttnId.equals(other.fndInsttnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FundInstitution[ fndInsttnId=" + fndInsttnId + " ]";
    }

}
