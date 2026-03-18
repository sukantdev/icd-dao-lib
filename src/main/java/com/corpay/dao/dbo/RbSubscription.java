package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_SUBSCRIPTION", catalog = "", schema = "DBO")
public class RbSubscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_ID")
    private Long subId;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_VAL")
    private String orgLvlVal;
    @Basic(optional = false)
    @Column(name = "INCL_EXCL_CHILD")
    private Character inclExclChild;
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
    @Column(name = "BILL_TO_ACCT")
    private String billToAcct;
    @JoinColumn(name = "MOD_ID", referencedColumnName = "MOD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbAppMod modId;
    @JoinColumn(name = "ORG_LVL_TYP_ID", referencedColumnName = "ORG_LVL_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbOrgLvlTyp orgLvlTypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subId", fetch = FetchType.LAZY)
    private Set<RbSubsPhase> rbSubsPhaseSet;

    public RbSubscription() {
    }

    public RbSubscription(Long subId) {
        this.subId = subId;
    }

    public RbSubscription(Long subId, String orgLvlVal, Character inclExclChild, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subId = subId;
        this.orgLvlVal = orgLvlVal;
        this.inclExclChild = inclExclChild;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getOrgLvlVal() {
        return orgLvlVal;
    }

    public void setOrgLvlVal(String orgLvlVal) {
        this.orgLvlVal = orgLvlVal;
    }

    public Character getInclExclChild() {
        return inclExclChild;
    }

    public void setInclExclChild(Character inclExclChild) {
        this.inclExclChild = inclExclChild;
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

    public String getBillToAcct() {
        return billToAcct;
    }

    public void setBillToAcct(String billToAcct) {
        this.billToAcct = billToAcct;
    }

    public RbAppMod getModId() {
        return modId;
    }

    public void setModId(RbAppMod modId) {
        this.modId = modId;
    }

    public RbOrgLvlTyp getOrgLvlTypId() {
        return orgLvlTypId;
    }

    public void setOrgLvlTypId(RbOrgLvlTyp orgLvlTypId) {
        this.orgLvlTypId = orgLvlTypId;
    }

    public Set<RbSubsPhase> getRbSubsPhaseSet() {
        return rbSubsPhaseSet;
    }

    public void setRbSubsPhaseSet(Set<RbSubsPhase> rbSubsPhaseSet) {
        this.rbSubsPhaseSet = rbSubsPhaseSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subId != null ? subId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbSubscription)) {
            return false;
        }
        RbSubscription other = (RbSubscription) object;
        if ((this.subId == null && other.subId != null) || (this.subId != null && !this.subId.equals(other.subId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbSubscription[ subId=" + subId + " ]";
    }

}
