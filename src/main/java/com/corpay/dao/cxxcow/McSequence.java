/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MC_SEQUENCE", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McSequence.findAll", query = "SELECT m FROM McSequence m"),
    @NamedQuery(name = "McSequence.findBySeqKey", query = "SELECT m FROM McSequence m WHERE m.seqKey = :seqKey"),
    @NamedQuery(name = "McSequence.findBySeqValue", query = "SELECT m FROM McSequence m WHERE m.seqValue = :seqValue"),
    @NamedQuery(name = "McSequence.findBySeqSvalue", query = "SELECT m FROM McSequence m WHERE m.seqSvalue = :seqSvalue"),
    @NamedQuery(name = "McSequence.findBySeqAppMtrTs", query = "SELECT m FROM McSequence m WHERE m.seqAppMtrTs = :seqAppMtrTs")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
