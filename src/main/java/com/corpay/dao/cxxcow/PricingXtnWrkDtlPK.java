package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PricingXtnWrkDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "XWD_TI_P105S1_FILE_TY")
    private short xwdTiP105s1FileTy;
    @Basic(optional = false)
    @Column(name = "XWD_TI_P105S2_FILE_R_DT")
    private int xwdTiP105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "XWD_TI_P105S3_PROC_ID")
    private long xwdTiP105s3ProcId;
    @Basic(optional = false)
    @Column(name = "XWD_TI_P105S4_FILE_SEQ_NO")
    private int xwdTiP105s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "XWD_TI_D71_MSG_NO")
    private int xwdTiD71MsgNo;
    @Basic(optional = false)
    @Column(name = "XWD_RECORD_TYPE")
    private String xwdRecordType;
    @Basic(optional = false)
    @Column(name = "XWD_RECORD_OCC_IND")
    private int xwdRecordOccInd;

    public PricingXtnWrkDtlPK() {
    }

    public PricingXtnWrkDtlPK(short xwdTiP105s1FileTy, int xwdTiP105s2FileRDt, long xwdTiP105s3ProcId, int xwdTiP105s4FileSeqNo, int xwdTiD71MsgNo, String xwdRecordType, int xwdRecordOccInd) {
        this.xwdTiP105s1FileTy = xwdTiP105s1FileTy;
        this.xwdTiP105s2FileRDt = xwdTiP105s2FileRDt;
        this.xwdTiP105s3ProcId = xwdTiP105s3ProcId;
        this.xwdTiP105s4FileSeqNo = xwdTiP105s4FileSeqNo;
        this.xwdTiD71MsgNo = xwdTiD71MsgNo;
        this.xwdRecordType = xwdRecordType;
        this.xwdRecordOccInd = xwdRecordOccInd;
    }

    public short getXwdTiP105s1FileTy() {
        return xwdTiP105s1FileTy;
    }

    public void setXwdTiP105s1FileTy(short xwdTiP105s1FileTy) {
        this.xwdTiP105s1FileTy = xwdTiP105s1FileTy;
    }

    public int getXwdTiP105s2FileRDt() {
        return xwdTiP105s2FileRDt;
    }

    public void setXwdTiP105s2FileRDt(int xwdTiP105s2FileRDt) {
        this.xwdTiP105s2FileRDt = xwdTiP105s2FileRDt;
    }

    public long getXwdTiP105s3ProcId() {
        return xwdTiP105s3ProcId;
    }

    public void setXwdTiP105s3ProcId(long xwdTiP105s3ProcId) {
        this.xwdTiP105s3ProcId = xwdTiP105s3ProcId;
    }

    public int getXwdTiP105s4FileSeqNo() {
        return xwdTiP105s4FileSeqNo;
    }

    public void setXwdTiP105s4FileSeqNo(int xwdTiP105s4FileSeqNo) {
        this.xwdTiP105s4FileSeqNo = xwdTiP105s4FileSeqNo;
    }

    public int getXwdTiD71MsgNo() {
        return xwdTiD71MsgNo;
    }

    public void setXwdTiD71MsgNo(int xwdTiD71MsgNo) {
        this.xwdTiD71MsgNo = xwdTiD71MsgNo;
    }

    public String getXwdRecordType() {
        return xwdRecordType;
    }

    public void setXwdRecordType(String xwdRecordType) {
        this.xwdRecordType = xwdRecordType;
    }

    public int getXwdRecordOccInd() {
        return xwdRecordOccInd;
    }

    public void setXwdRecordOccInd(int xwdRecordOccInd) {
        this.xwdRecordOccInd = xwdRecordOccInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) xwdTiP105s1FileTy;
        hash += (int) xwdTiP105s2FileRDt;
        hash += (int) xwdTiP105s3ProcId;
        hash += (int) xwdTiP105s4FileSeqNo;
        hash += (int) xwdTiD71MsgNo;
        hash += (xwdRecordType != null ? xwdRecordType.hashCode() : 0);
        hash += (int) xwdRecordOccInd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PricingXtnWrkDtlPK)) {
            return false;
        }
        PricingXtnWrkDtlPK other = (PricingXtnWrkDtlPK) object;
        if (this.xwdTiP105s1FileTy != other.xwdTiP105s1FileTy) {
            return false;
        }
        if (this.xwdTiP105s2FileRDt != other.xwdTiP105s2FileRDt) {
            return false;
        }
        if (this.xwdTiP105s3ProcId != other.xwdTiP105s3ProcId) {
            return false;
        }
        if (this.xwdTiP105s4FileSeqNo != other.xwdTiP105s4FileSeqNo) {
            return false;
        }
        if (this.xwdTiD71MsgNo != other.xwdTiD71MsgNo) {
            return false;
        }
        if ((this.xwdRecordType == null && other.xwdRecordType != null) || (this.xwdRecordType != null && !this.xwdRecordType.equals(other.xwdRecordType))) {
            return false;
        }
        if (this.xwdRecordOccInd != other.xwdRecordOccInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PricingXtnWrkDtlPK[ xwdTiP105s1FileTy=" + xwdTiP105s1FileTy + ", xwdTiP105s2FileRDt=" + xwdTiP105s2FileRDt + ", xwdTiP105s3ProcId=" + xwdTiP105s3ProcId + ", xwdTiP105s4FileSeqNo=" + xwdTiP105s4FileSeqNo + ", xwdTiD71MsgNo=" + xwdTiD71MsgNo + ", xwdRecordType=" + xwdRecordType + ", xwdRecordOccInd=" + xwdRecordOccInd + " ]";
    }

}
