package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PricingXtnWrkPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "XWR_TI_P105S1_FILE_TY")
    private short xwrTiP105s1FileTy;
    @Basic(optional = false)
    @Column(name = "XWR_TI_P105S2_FILE_R_DT")
    private int xwrTiP105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "XWR_TI_P105S3_PROC_ID")
    private long xwrTiP105s3ProcId;
    @Basic(optional = false)
    @Column(name = "XWR_TI_P105S4_FILE_SEQ_NO")
    private int xwrTiP105s4FileSeqNo;
    @Basic(optional = false)
    @Column(name = "XWR_TI_D71_MSG_NO")
    private int xwrTiD71MsgNo;
    @Basic(optional = false)
    @Column(name = "XWR_RECORD_TYPE")
    private String xwrRecordType;
    @Basic(optional = false)
    @Column(name = "XWR_RECORD_OCC_IND")
    private int xwrRecordOccInd;

    public PricingXtnWrkPK() {
    }

    public PricingXtnWrkPK(short xwrTiP105s1FileTy, int xwrTiP105s2FileRDt, long xwrTiP105s3ProcId, int xwrTiP105s4FileSeqNo, int xwrTiD71MsgNo, String xwrRecordType, int xwrRecordOccInd) {
        this.xwrTiP105s1FileTy = xwrTiP105s1FileTy;
        this.xwrTiP105s2FileRDt = xwrTiP105s2FileRDt;
        this.xwrTiP105s3ProcId = xwrTiP105s3ProcId;
        this.xwrTiP105s4FileSeqNo = xwrTiP105s4FileSeqNo;
        this.xwrTiD71MsgNo = xwrTiD71MsgNo;
        this.xwrRecordType = xwrRecordType;
        this.xwrRecordOccInd = xwrRecordOccInd;
    }

    public short getXwrTiP105s1FileTy() {
        return xwrTiP105s1FileTy;
    }

    public void setXwrTiP105s1FileTy(short xwrTiP105s1FileTy) {
        this.xwrTiP105s1FileTy = xwrTiP105s1FileTy;
    }

    public int getXwrTiP105s2FileRDt() {
        return xwrTiP105s2FileRDt;
    }

    public void setXwrTiP105s2FileRDt(int xwrTiP105s2FileRDt) {
        this.xwrTiP105s2FileRDt = xwrTiP105s2FileRDt;
    }

    public long getXwrTiP105s3ProcId() {
        return xwrTiP105s3ProcId;
    }

    public void setXwrTiP105s3ProcId(long xwrTiP105s3ProcId) {
        this.xwrTiP105s3ProcId = xwrTiP105s3ProcId;
    }

    public int getXwrTiP105s4FileSeqNo() {
        return xwrTiP105s4FileSeqNo;
    }

    public void setXwrTiP105s4FileSeqNo(int xwrTiP105s4FileSeqNo) {
        this.xwrTiP105s4FileSeqNo = xwrTiP105s4FileSeqNo;
    }

    public int getXwrTiD71MsgNo() {
        return xwrTiD71MsgNo;
    }

    public void setXwrTiD71MsgNo(int xwrTiD71MsgNo) {
        this.xwrTiD71MsgNo = xwrTiD71MsgNo;
    }

    public String getXwrRecordType() {
        return xwrRecordType;
    }

    public void setXwrRecordType(String xwrRecordType) {
        this.xwrRecordType = xwrRecordType;
    }

    public int getXwrRecordOccInd() {
        return xwrRecordOccInd;
    }

    public void setXwrRecordOccInd(int xwrRecordOccInd) {
        this.xwrRecordOccInd = xwrRecordOccInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) xwrTiP105s1FileTy;
        hash += (int) xwrTiP105s2FileRDt;
        hash += (int) xwrTiP105s3ProcId;
        hash += (int) xwrTiP105s4FileSeqNo;
        hash += (int) xwrTiD71MsgNo;
        hash += (xwrRecordType != null ? xwrRecordType.hashCode() : 0);
        hash += (int) xwrRecordOccInd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PricingXtnWrkPK)) {
            return false;
        }
        PricingXtnWrkPK other = (PricingXtnWrkPK) object;
        if (this.xwrTiP105s1FileTy != other.xwrTiP105s1FileTy) {
            return false;
        }
        if (this.xwrTiP105s2FileRDt != other.xwrTiP105s2FileRDt) {
            return false;
        }
        if (this.xwrTiP105s3ProcId != other.xwrTiP105s3ProcId) {
            return false;
        }
        if (this.xwrTiP105s4FileSeqNo != other.xwrTiP105s4FileSeqNo) {
            return false;
        }
        if (this.xwrTiD71MsgNo != other.xwrTiD71MsgNo) {
            return false;
        }
        if ((this.xwrRecordType == null && other.xwrRecordType != null) || (this.xwrRecordType != null && !this.xwrRecordType.equals(other.xwrRecordType))) {
            return false;
        }
        if (this.xwrRecordOccInd != other.xwrRecordOccInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PricingXtnWrkPK[ xwrTiP105s1FileTy=" + xwrTiP105s1FileTy + ", xwrTiP105s2FileRDt=" + xwrTiP105s2FileRDt + ", xwrTiP105s3ProcId=" + xwrTiP105s3ProcId + ", xwrTiP105s4FileSeqNo=" + xwrTiP105s4FileSeqNo + ", xwrTiD71MsgNo=" + xwrTiD71MsgNo + ", xwrRecordType=" + xwrRecordType + ", xwrRecordOccInd=" + xwrRecordOccInd + " ]";
    }

}
