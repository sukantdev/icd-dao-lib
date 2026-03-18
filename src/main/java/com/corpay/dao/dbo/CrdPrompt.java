package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_PROMPT", catalog = "", schema = "DBO")
public class CrdPrompt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdPromptPK crdPromptPK;
    @Basic(optional = false)
    @Column(name = "PROMPT_DATA")
    private String promptData;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public CrdPrompt() {
    }

    public CrdPrompt(CrdPromptPK crdPromptPK) {
        this.crdPromptPK = crdPromptPK;
    }

    public CrdPrompt(CrdPromptPK crdPromptPK, String promptData, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdPromptPK = crdPromptPK;
        this.promptData = promptData;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdPrompt(String crdTknNbr, String promptId) {
        this.crdPromptPK = new CrdPromptPK(crdTknNbr, promptId);
    }

    public CrdPromptPK getCrdPromptPK() {
        return crdPromptPK;
    }

    public void setCrdPromptPK(CrdPromptPK crdPromptPK) {
        this.crdPromptPK = crdPromptPK;
    }

    public String getPromptData() {
        return promptData;
    }

    public void setPromptData(String promptData) {
        this.promptData = promptData;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdPromptPK != null ? crdPromptPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdPrompt)) {
            return false;
        }
        CrdPrompt other = (CrdPrompt) object;
        if ((this.crdPromptPK == null && other.crdPromptPK != null) || (this.crdPromptPK != null && !this.crdPromptPK.equals(other.crdPromptPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdPrompt[ crdPromptPK=" + crdPromptPK + " ]";
    }

}
