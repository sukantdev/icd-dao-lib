package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdPromptPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "PROMPT_ID")
    private String promptId;

    public CrdPromptPK() {
    }

    public CrdPromptPK(String crdTknNbr, String promptId) {
        this.crdTknNbr = crdTknNbr;
        this.promptId = promptId;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getPromptId() {
        return promptId;
    }

    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTknNbr != null ? crdTknNbr.hashCode() : 0);
        hash += (promptId != null ? promptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdPromptPK)) {
            return false;
        }
        CrdPromptPK other = (CrdPromptPK) object;
        if ((this.crdTknNbr == null && other.crdTknNbr != null) || (this.crdTknNbr != null && !this.crdTknNbr.equals(other.crdTknNbr))) {
            return false;
        }
        if ((this.promptId == null && other.promptId != null) || (this.promptId != null && !this.promptId.equals(other.promptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdPromptPK[ crdTknNbr=" + crdTknNbr + ", promptId=" + promptId + " ]";
    }

}
