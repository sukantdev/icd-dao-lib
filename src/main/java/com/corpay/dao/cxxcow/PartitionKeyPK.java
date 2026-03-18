package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PartitionKeyPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PART_NO")
    private short partNo;
    @Basic(optional = false)
    @Column(name = "PART_DT")
    private int partDt;

    public PartitionKeyPK() {
    }

    public PartitionKeyPK(short partNo, int partDt) {
        this.partNo = partNo;
        this.partDt = partDt;
    }

    public short getPartNo() {
        return partNo;
    }

    public void setPartNo(short partNo) {
        this.partNo = partNo;
    }

    public int getPartDt() {
        return partDt;
    }

    public void setPartDt(int partDt) {
        this.partDt = partDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) partNo;
        hash += (int) partDt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PartitionKeyPK)) {
            return false;
        }
        PartitionKeyPK other = (PartitionKeyPK) object;
        if (this.partNo != other.partNo) {
            return false;
        }
        if (this.partDt != other.partDt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PartitionKeyPK[ partNo=" + partNo + ", partDt=" + partDt + " ]";
    }

}
