package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MC_PRMPT_DATA", catalog = "", schema = "CXXCOW")
public class McPrmptData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McPrmptDataPK mcPrmptDataPK;
    @Basic(optional = false)
    @Column(name = "PRMPT_ID")
    private String prmptId;
    @Basic(optional = false)
    @Column(name = "PRMPT_VALUE")
    private String prmptValue;
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

    public McPrmptData() {
    }

    public McPrmptData(McPrmptDataPK mcPrmptDataPK) {
        this.mcPrmptDataPK = mcPrmptDataPK;
    }

    public McPrmptData(McPrmptDataPK mcPrmptDataPK, String prmptId, String prmptValue, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcPrmptDataPK = mcPrmptDataPK;
        this.prmptId = prmptId;
        this.prmptValue = prmptValue;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McPrmptData(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short prmptSeqNo) {
        this.mcPrmptDataPK = new McPrmptDataPK(authPan, authUtDt, authApprovCd, authLocalTs, prmptSeqNo);
    }

    public McPrmptDataPK getMcPrmptDataPK() {
        return mcPrmptDataPK;
    }

    public void setMcPrmptDataPK(McPrmptDataPK mcPrmptDataPK) {
        this.mcPrmptDataPK = mcPrmptDataPK;
    }

    public String getPrmptId() {
        return prmptId;
    }

    public void setPrmptId(String prmptId) {
        this.prmptId = prmptId;
    }

    public String getPrmptValue() {
        return prmptValue;
    }

    public void setPrmptValue(String prmptValue) {
        this.prmptValue = prmptValue;
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
        hash += (mcPrmptDataPK != null ? mcPrmptDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McPrmptData)) {
            return false;
        }
        McPrmptData other = (McPrmptData) object;
        if ((this.mcPrmptDataPK == null && other.mcPrmptDataPK != null) || (this.mcPrmptDataPK != null && !this.mcPrmptDataPK.equals(other.mcPrmptDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McPrmptData[ mcPrmptDataPK=" + mcPrmptDataPK + " ]";
    }

}
