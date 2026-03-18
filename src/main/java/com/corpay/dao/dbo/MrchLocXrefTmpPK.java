package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MrchLocXrefTmpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACQ_INST_ID_CD")
    private long acqInstIdCd;
    @Basic(optional = false)
    @Column(name = "ACPT_ID")
    private String acptId;
    @Basic(optional = false)
    @Column(name = "TERM_ID")
    private String termId;
    @Basic(optional = false)
    @Column(name = "XREF_TYPE")
    private Character xrefType;

    public MrchLocXrefTmpPK() {
    }

    public MrchLocXrefTmpPK(long acqInstIdCd, String acptId, String termId, Character xrefType) {
        this.acqInstIdCd = acqInstIdCd;
        this.acptId = acptId;
        this.termId = termId;
        this.xrefType = xrefType;
    }

    public long getAcqInstIdCd() {
        return acqInstIdCd;
    }

    public void setAcqInstIdCd(long acqInstIdCd) {
        this.acqInstIdCd = acqInstIdCd;
    }

    public String getAcptId() {
        return acptId;
    }

    public void setAcptId(String acptId) {
        this.acptId = acptId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public Character getXrefType() {
        return xrefType;
    }

    public void setXrefType(Character xrefType) {
        this.xrefType = xrefType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) acqInstIdCd;
        hash += (acptId != null ? acptId.hashCode() : 0);
        hash += (termId != null ? termId.hashCode() : 0);
        hash += (xrefType != null ? xrefType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocXrefTmpPK)) {
            return false;
        }
        MrchLocXrefTmpPK other = (MrchLocXrefTmpPK) object;
        if (this.acqInstIdCd != other.acqInstIdCd) {
            return false;
        }
        if ((this.acptId == null && other.acptId != null) || (this.acptId != null && !this.acptId.equals(other.acptId))) {
            return false;
        }
        if ((this.termId == null && other.termId != null) || (this.termId != null && !this.termId.equals(other.termId))) {
            return false;
        }
        if ((this.xrefType == null && other.xrefType != null) || (this.xrefType != null && !this.xrefType.equals(other.xrefType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocXrefTmpPK[ acqInstIdCd=" + acqInstIdCd + ", acptId=" + acptId + ", termId=" + termId + ", xrefType=" + xrefType + " ]";
    }

}
