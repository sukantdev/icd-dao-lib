package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FnHeaderPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FILE_DT")
    @Temporal(TemporalType.DATE)
    private Date fileDt;
    @Basic(optional = false)
    @Column(name = "FILE_SEQ")
    private short fileSeq;

    public FnHeaderPK() {
    }

    public FnHeaderPK(Date fileDt, short fileSeq) {
        this.fileDt = fileDt;
        this.fileSeq = fileSeq;
    }

    public Date getFileDt() {
        return fileDt;
    }

    public void setFileDt(Date fileDt) {
        this.fileDt = fileDt;
    }

    public short getFileSeq() {
        return fileSeq;
    }

    public void setFileSeq(short fileSeq) {
        this.fileSeq = fileSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileDt != null ? fileDt.hashCode() : 0);
        hash += (int) fileSeq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnHeaderPK)) {
            return false;
        }
        FnHeaderPK other = (FnHeaderPK) object;
        if ((this.fileDt == null && other.fileDt != null) || (this.fileDt != null && !this.fileDt.equals(other.fileDt))) {
            return false;
        }
        if (this.fileSeq != other.fileSeq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnHeaderPK[ fileDt=" + fileDt + ", fileSeq=" + fileSeq + " ]";
    }

}
