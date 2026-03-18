package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrApplAttachmentPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "FILE_ID")
    private int fileId;

    public CrApplAttachmentPK() {
    }

    public CrApplAttachmentPK(String applNbr, int fileId) {
        this.applNbr = applNbr;
        this.fileId = fileId;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (int) fileId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplAttachmentPK)) {
            return false;
        }
        CrApplAttachmentPK other = (CrApplAttachmentPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if (this.fileId != other.fileId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAttachmentPK[ applNbr=" + applNbr + ", fileId=" + fileId + " ]";
    }

}
