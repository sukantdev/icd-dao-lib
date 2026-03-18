package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PARTITION_KEY", catalog = "", schema = "CXXCOW")
public class PartitionKey implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartitionKeyPK partitionKeyPK;
    @Basic(optional = false)
    @Column(name = "PART_USE_NO")
    private short partUseNo;

    public PartitionKey() {
    }

    public PartitionKey(PartitionKeyPK partitionKeyPK) {
        this.partitionKeyPK = partitionKeyPK;
    }

    public PartitionKey(PartitionKeyPK partitionKeyPK, short partUseNo) {
        this.partitionKeyPK = partitionKeyPK;
        this.partUseNo = partUseNo;
    }

    public PartitionKey(short partNo, int partDt) {
        this.partitionKeyPK = new PartitionKeyPK(partNo, partDt);
    }

    public PartitionKeyPK getPartitionKeyPK() {
        return partitionKeyPK;
    }

    public void setPartitionKeyPK(PartitionKeyPK partitionKeyPK) {
        this.partitionKeyPK = partitionKeyPK;
    }

    public short getPartUseNo() {
        return partUseNo;
    }

    public void setPartUseNo(short partUseNo) {
        this.partUseNo = partUseNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partitionKeyPK != null ? partitionKeyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PartitionKey)) {
            return false;
        }
        PartitionKey other = (PartitionKey) object;
        if ((this.partitionKeyPK == null && other.partitionKeyPK != null) || (this.partitionKeyPK != null && !this.partitionKeyPK.equals(other.partitionKeyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PartitionKey[ partitionKeyPK=" + partitionKeyPK + " ]";
    }

}
