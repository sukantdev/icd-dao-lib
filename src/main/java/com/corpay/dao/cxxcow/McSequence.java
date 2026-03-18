package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MC_SEQUENCE", catalog = "", schema = "CXXCOW")
public class McSequence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEQ_KEY")
    private String seqKey;
    @Basic(optional = false)
    @Column(name = "SEQ_VALUE")
    private int seqValue;
    @Basic(optional = false)
    @Column(name = "SEQ_SVALUE")
    private String seqSvalue;
    @Basic(optional = false)
    @Column(name = "SEQ_APP_MTR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date seqAppMtrTs;

    public McSequence() {
    }

    public McSequence(String seqKey) {
        this.seqKey = seqKey;
    }

    public McSequence(String seqKey, int seqValue, String seqSvalue, Date seqAppMtrTs) {
        this.seqKey = seqKey;
        this.seqValue = seqValue;
        this.seqSvalue = seqSvalue;
        this.seqAppMtrTs = seqAppMtrTs;
    }

    public String getSeqKey() {
        return seqKey;
    }

    public void setSeqKey(String seqKey) {
        this.seqKey = seqKey;
    }

    public int getSeqValue() {
        return seqValue;
    }

    public void setSeqValue(int seqValue) {
        this.seqValue = seqValue;
    }

    public String getSeqSvalue() {
        return seqSvalue;
    }

    public void setSeqSvalue(String seqSvalue) {
        this.seqSvalue = seqSvalue;
    }

    public Date getSeqAppMtrTs() {
        return seqAppMtrTs;
    }

    public void setSeqAppMtrTs(Date seqAppMtrTs) {
        this.seqAppMtrTs = seqAppMtrTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seqKey != null ? seqKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McSequence)) {
            return false;
        }
        McSequence other = (McSequence) object;
        if ((this.seqKey == null && other.seqKey != null) || (this.seqKey != null && !this.seqKey.equals(other.seqKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McSequence[ seqKey=" + seqKey + " ]";
    }

}
