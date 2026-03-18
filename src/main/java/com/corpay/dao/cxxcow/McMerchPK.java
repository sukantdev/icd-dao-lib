package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class McMerchPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "D43S1_CRD_ACP_NM")
    private String d43s1CrdAcpNm;
    @Basic(optional = false)
    @Column(name = "D43S2_CRD_ACP_STR")
    private String d43s2CrdAcpStr;
    @Basic(optional = false)
    @Column(name = "D43S3_CRD_ACP_CTY")
    private String d43s3CrdAcpCty;
    @Basic(optional = false)
    @Column(name = "D43S4_CRD_ACP_ZIP")
    private String d43s4CrdAcpZip;
    @Basic(optional = false)
    @Column(name = "D43S5_CRD_ACP_ST")
    private String d43s5CrdAcpSt;
    @Basic(optional = false)
    @Column(name = "D43S6_CRD_ACP_CTRY")
    private String d43s6CrdAcpCtry;

    public McMerchPK() {
    }

    public McMerchPK(String d43s1CrdAcpNm, String d43s2CrdAcpStr, String d43s3CrdAcpCty, String d43s4CrdAcpZip, String d43s5CrdAcpSt, String d43s6CrdAcpCtry) {
        this.d43s1CrdAcpNm = d43s1CrdAcpNm;
        this.d43s2CrdAcpStr = d43s2CrdAcpStr;
        this.d43s3CrdAcpCty = d43s3CrdAcpCty;
        this.d43s4CrdAcpZip = d43s4CrdAcpZip;
        this.d43s5CrdAcpSt = d43s5CrdAcpSt;
        this.d43s6CrdAcpCtry = d43s6CrdAcpCtry;
    }

    public String getD43s1CrdAcpNm() {
        return d43s1CrdAcpNm;
    }

    public void setD43s1CrdAcpNm(String d43s1CrdAcpNm) {
        this.d43s1CrdAcpNm = d43s1CrdAcpNm;
    }

    public String getD43s2CrdAcpStr() {
        return d43s2CrdAcpStr;
    }

    public void setD43s2CrdAcpStr(String d43s2CrdAcpStr) {
        this.d43s2CrdAcpStr = d43s2CrdAcpStr;
    }

    public String getD43s3CrdAcpCty() {
        return d43s3CrdAcpCty;
    }

    public void setD43s3CrdAcpCty(String d43s3CrdAcpCty) {
        this.d43s3CrdAcpCty = d43s3CrdAcpCty;
    }

    public String getD43s4CrdAcpZip() {
        return d43s4CrdAcpZip;
    }

    public void setD43s4CrdAcpZip(String d43s4CrdAcpZip) {
        this.d43s4CrdAcpZip = d43s4CrdAcpZip;
    }

    public String getD43s5CrdAcpSt() {
        return d43s5CrdAcpSt;
    }

    public void setD43s5CrdAcpSt(String d43s5CrdAcpSt) {
        this.d43s5CrdAcpSt = d43s5CrdAcpSt;
    }

    public String getD43s6CrdAcpCtry() {
        return d43s6CrdAcpCtry;
    }

    public void setD43s6CrdAcpCtry(String d43s6CrdAcpCtry) {
        this.d43s6CrdAcpCtry = d43s6CrdAcpCtry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (d43s1CrdAcpNm != null ? d43s1CrdAcpNm.hashCode() : 0);
        hash += (d43s2CrdAcpStr != null ? d43s2CrdAcpStr.hashCode() : 0);
        hash += (d43s3CrdAcpCty != null ? d43s3CrdAcpCty.hashCode() : 0);
        hash += (d43s4CrdAcpZip != null ? d43s4CrdAcpZip.hashCode() : 0);
        hash += (d43s5CrdAcpSt != null ? d43s5CrdAcpSt.hashCode() : 0);
        hash += (d43s6CrdAcpCtry != null ? d43s6CrdAcpCtry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMerchPK)) {
            return false;
        }
        McMerchPK other = (McMerchPK) object;
        if ((this.d43s1CrdAcpNm == null && other.d43s1CrdAcpNm != null) || (this.d43s1CrdAcpNm != null && !this.d43s1CrdAcpNm.equals(other.d43s1CrdAcpNm))) {
            return false;
        }
        if ((this.d43s2CrdAcpStr == null && other.d43s2CrdAcpStr != null) || (this.d43s2CrdAcpStr != null && !this.d43s2CrdAcpStr.equals(other.d43s2CrdAcpStr))) {
            return false;
        }
        if ((this.d43s3CrdAcpCty == null && other.d43s3CrdAcpCty != null) || (this.d43s3CrdAcpCty != null && !this.d43s3CrdAcpCty.equals(other.d43s3CrdAcpCty))) {
            return false;
        }
        if ((this.d43s4CrdAcpZip == null && other.d43s4CrdAcpZip != null) || (this.d43s4CrdAcpZip != null && !this.d43s4CrdAcpZip.equals(other.d43s4CrdAcpZip))) {
            return false;
        }
        if ((this.d43s5CrdAcpSt == null && other.d43s5CrdAcpSt != null) || (this.d43s5CrdAcpSt != null && !this.d43s5CrdAcpSt.equals(other.d43s5CrdAcpSt))) {
            return false;
        }
        if ((this.d43s6CrdAcpCtry == null && other.d43s6CrdAcpCtry != null) || (this.d43s6CrdAcpCtry != null && !this.d43s6CrdAcpCtry.equals(other.d43s6CrdAcpCtry))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMerchPK[ d43s1CrdAcpNm=" + d43s1CrdAcpNm + ", d43s2CrdAcpStr=" + d43s2CrdAcpStr + ", d43s3CrdAcpCty=" + d43s3CrdAcpCty + ", d43s4CrdAcpZip=" + d43s4CrdAcpZip + ", d43s5CrdAcpSt=" + d43s5CrdAcpSt + ", d43s6CrdAcpCtry=" + d43s6CrdAcpCtry + " ]";
    }

}
