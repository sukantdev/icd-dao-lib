package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "USR_COMP", catalog = "", schema = "DBO")
public class UsrComp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "USR_COMP_NM")
    private String usrCompNm;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_COMP_ID")
    private Integer usrCompId;
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usrCompId", fetch = FetchType.LAZY)
    private FundTransferCounter fundTransferCounter;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "usrCompId", fetch = FetchType.LAZY)
    private FundTransferLimit fundTransferLimit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usrCompId", fetch = FetchType.LAZY)
    private Set<FundAccount> fundAccountSet;

    public UsrComp() {
    }

    public UsrComp(Integer usrCompId) {
        this.usrCompId = usrCompId;
    }

    public UsrComp(Integer usrCompId, String usrCompNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrCompId = usrCompId;
        this.usrCompNm = usrCompNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getUsrCompNm() {
        return usrCompNm;
    }

    public void setUsrCompNm(String usrCompNm) {
        this.usrCompNm = usrCompNm;
    }

    public Integer getUsrCompId() {
        return usrCompId;
    }

    public void setUsrCompId(Integer usrCompId) {
        this.usrCompId = usrCompId;
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

    public FundTransferCounter getFundTransferCounter() {
        return fundTransferCounter;
    }

    public void setFundTransferCounter(FundTransferCounter fundTransferCounter) {
        this.fundTransferCounter = fundTransferCounter;
    }

    public FundTransferLimit getFundTransferLimit() {
        return fundTransferLimit;
    }

    public void setFundTransferLimit(FundTransferLimit fundTransferLimit) {
        this.fundTransferLimit = fundTransferLimit;
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
        hash += (usrCompId != null ? usrCompId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrComp)) {
            return false;
        }
        UsrComp other = (UsrComp) object;
        if ((this.usrCompId == null && other.usrCompId != null) || (this.usrCompId != null && !this.usrCompId.equals(other.usrCompId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrComp[ usrCompId=" + usrCompId + " ]";
    }

}
