/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class McXtnDiscPK implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "P501S4_MSG_NO")
    private int p501s4MsgNo;
    @Basic(optional = false)
    @Column(name = "P501S3_OCC_IND")
    private short p501s3OccInd;
    @Basic(optional = false)
    @Column(name = "CNTRL_NBR")
    private int cntrlNbr;
    @Basic(optional = false)
    @Column(name = "DISC_REB_IND")
    private Character discRebInd;
    @Basic(optional = false)
    @Column(name = "CF_CL_IND")
    private Character cfClInd;

    public McXtnDiscPK() {
    }

    public McXtnDiscPK(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int p501s4MsgNo, short p501s3OccInd, int cntrlNbr, Character discRebInd, Character cfClInd) {
        this.p105s1FileTy = p105s1FileTy;
        this.p105s2FileRDt = p105s2FileRDt;
        this.p105s3ProcId = p105s3ProcId;
        this.p105s4FileSeqNo = p105s4FileSeqNo;
        this.p501s4MsgNo = p501s4MsgNo;
        this.p501s3OccInd = p501s3OccInd;
        this.cntrlNbr = cntrlNbr;
        this.discRebInd = discRebInd;
        this.cfClInd = cfClInd;
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

    public int getP501s4MsgNo() {
        return p501s4MsgNo;
    }

    public void setP501s4MsgNo(int p501s4MsgNo) {
        this.p501s4MsgNo = p501s4MsgNo;
    }

    public short getP501s3OccInd() {
        return p501s3OccInd;
    }

    public void setP501s3OccInd(short p501s3OccInd) {
        this.p501s3OccInd = p501s3OccInd;
    }

    public int getCntrlNbr() {
        return cntrlNbr;
    }

    public void setCntrlNbr(int cntrlNbr) {
        this.cntrlNbr = cntrlNbr;
    }

    public Character getDiscRebInd() {
        return discRebInd;
    }

    public void setDiscRebInd(Character discRebInd) {
        this.discRebInd = discRebInd;
    }

    public Character getCfClInd() {
        return cfClInd;
    }

    public void setCfClInd(Character cfClInd) {
        this.cfClInd = cfClInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) p105s1FileTy;
        hash += (int) p105s2FileRDt;
        hash += (int) p105s3ProcId;
        hash += (int) p105s4FileSeqNo;
        hash += (int) p501s4MsgNo;
        hash += (int) p501s3OccInd;
        hash += (int) cntrlNbr;
        hash += (discRebInd != null ? discRebInd.hashCode() : 0);
        hash += (cfClInd != null ? cfClInd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McXtnDiscPK)) {
            return false;
        }
        McXtnDiscPK other = (McXtnDiscPK) object;
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
        if (this.p501s4MsgNo != other.p501s4MsgNo) {
            return false;
        }
        if (this.p501s3OccInd != other.p501s3OccInd) {
            return false;
        }
        if (this.cntrlNbr != other.cntrlNbr) {
            return false;
        }
        if ((this.discRebInd == null && other.discRebInd != null) || (this.discRebInd != null && !this.discRebInd.equals(other.discRebInd))) {
            return false;
        }
        if ((this.cfClInd == null && other.cfClInd != null) || (this.cfClInd != null && !this.cfClInd.equals(other.cfClInd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McXtnDiscPK[ p105s1FileTy=" + p105s1FileTy + ", p105s2FileRDt=" + p105s2FileRDt + ", p105s3ProcId=" + p105s3ProcId + ", p105s4FileSeqNo=" + p105s4FileSeqNo + ", p501s4MsgNo=" + p501s4MsgNo + ", p501s3OccInd=" + p501s3OccInd + ", cntrlNbr=" + cntrlNbr + ", discRebInd=" + discRebInd + ", cfClInd=" + cfClInd + " ]";
    }
    
}
