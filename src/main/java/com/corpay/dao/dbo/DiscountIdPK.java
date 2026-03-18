package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DiscountIdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DISC_ID")
    private String discId;
    @Basic(optional = false)
    @Column(name = "DISC_SUB_ID")
    private short discSubId;
    @Basic(optional = false)
    @Column(name = "DISC_SEQ_NBR")
    private short discSeqNbr;

    public DiscountIdPK() {
    }

    public DiscountIdPK(String discId, short discSubId, short discSeqNbr) {
        this.discId = discId;
        this.discSubId = discSubId;
        this.discSeqNbr = discSeqNbr;
    }

    public String getDiscId() {
        return discId;
    }

    public void setDiscId(String discId) {
        this.discId = discId;
    }

    public short getDiscSubId() {
        return discSubId;
    }

    public void setDiscSubId(short discSubId) {
        this.discSubId = discSubId;
    }

    public short getDiscSeqNbr() {
        return discSeqNbr;
    }

    public void setDiscSeqNbr(short discSeqNbr) {
        this.discSeqNbr = discSeqNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (discId != null ? discId.hashCode() : 0);
        hash += (int) discSubId;
        hash += (int) discSeqNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DiscountIdPK)) {
            return false;
        }
        DiscountIdPK other = (DiscountIdPK) object;
        if ((this.discId == null && other.discId != null) || (this.discId != null && !this.discId.equals(other.discId))) {
            return false;
        }
        if (this.discSubId != other.discSubId) {
            return false;
        }
        if (this.discSeqNbr != other.discSeqNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DiscountIdPK[ discId=" + discId + ", discSubId=" + discSubId + ", discSeqNbr=" + discSeqNbr + " ]";
    }

}
