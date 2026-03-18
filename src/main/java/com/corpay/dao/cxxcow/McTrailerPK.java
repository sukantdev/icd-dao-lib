package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class McTrailerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "P105S1_FILE_TY")
    private short p105s1FileTy;
    @Basic(optional = false)
    @Column(name = "P105S2_FILE_R_DT")
    private int p105s2FileRDt;
    @Basic(optional = false)
    @Column(name = "P105S3_PROC_ID")
    private long p105s3ProcId;
    @Basic(optional = false)
    @Column(name = "P105S4_FILE_SEQ_NO")
    private int p105s4FileSeqNo;

    public McTrailerPK() {
    }

    public McTrailerPK(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo) {
        this.p105s1FileTy = p105s1FileTy;
        this.p105s2FileRDt = p105s2FileRDt;
        this.p105s3ProcId = p105s3ProcId;
        this.p105s4FileSeqNo = p105s4FileSeqNo;
    }

    public short getP105s1FileTy() {
        return p105s1FileTy;
    }

    public void setP105s1FileTy(short p105s1FileTy) {
        this.p105s1FileTy = p105s1FileTy;
    }

    public int getP105s2FileRDt() {
        return p105s2FileRDt;
    }

    public void setP105s2FileRDt(int p105s2FileRDt) {
        this.p105s2FileRDt = p105s2FileRDt;
    }

    public long getP105s3ProcId() {
        return p105s3ProcId;
    }

    public void setP105s3ProcId(long p105s3ProcId) {
        this.p105s3ProcId = p105s3ProcId;
    }

    public int getP105s4FileSeqNo() {
        return p105s4FileSeqNo;
    }

    public void setP105s4FileSeqNo(int p105s4FileSeqNo) {
        this.p105s4FileSeqNo = p105s4FileSeqNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) p105s1FileTy;
        hash += (int) p105s2FileRDt;
        hash += (int) p105s3ProcId;
        hash += (int) p105s4FileSeqNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McTrailerPK)) {
            return false;
        }
        McTrailerPK other = (McTrailerPK) object;
        if (this.p105s1FileTy != other.p105s1FileTy) {
            return false;
        }
        if (this.p105s2FileRDt != other.p105s2FileRDt) {
            return false;
        }
        if (this.p105s3ProcId != other.p105s3ProcId) {
            return false;
        }
        if (this.p105s4FileSeqNo != other.p105s4FileSeqNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McTrailerPK[ p105s1FileTy=" + p105s1FileTy + ", p105s2FileRDt=" + p105s2FileRDt + ", p105s3ProcId=" + p105s3ProcId + ", p105s4FileSeqNo=" + p105s4FileSeqNo + " ]";
    }

}
