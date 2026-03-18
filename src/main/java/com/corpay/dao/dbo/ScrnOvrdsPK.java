package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ScrnOvrdsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_ID")
    private String applId;
    @Basic(optional = false)
    @Column(name = "PAGE_NM")
    private String pageNm;
    @Basic(optional = false)
    @Column(name = "FIELD_NM")
    private String fieldNm;
    @Basic(optional = false)
    @Column(name = "ASMT_LVL")
    private String asmtLvl;
    @Basic(optional = false)
    @Column(name = "ASMT_VAL")
    private String asmtVal;

    public ScrnOvrdsPK() {
    }

    public ScrnOvrdsPK(String applId, String pageNm, String fieldNm, String asmtLvl, String asmtVal) {
        this.applId = applId;
        this.pageNm = pageNm;
        this.fieldNm = fieldNm;
        this.asmtLvl = asmtLvl;
        this.asmtVal = asmtVal;
    }

    public String getApplId() {
        return applId;
    }

    public void setApplId(String applId) {
        this.applId = applId;
    }

    public String getPageNm() {
        return pageNm;
    }

    public void setPageNm(String pageNm) {
        this.pageNm = pageNm;
    }

    public String getFieldNm() {
        return fieldNm;
    }

    public void setFieldNm(String fieldNm) {
        this.fieldNm = fieldNm;
    }

    public String getAsmtLvl() {
        return asmtLvl;
    }

    public void setAsmtLvl(String asmtLvl) {
        this.asmtLvl = asmtLvl;
    }

    public String getAsmtVal() {
        return asmtVal;
    }

    public void setAsmtVal(String asmtVal) {
        this.asmtVal = asmtVal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applId != null ? applId.hashCode() : 0);
        hash += (pageNm != null ? pageNm.hashCode() : 0);
        hash += (fieldNm != null ? fieldNm.hashCode() : 0);
        hash += (asmtLvl != null ? asmtLvl.hashCode() : 0);
        hash += (asmtVal != null ? asmtVal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ScrnOvrdsPK)) {
            return false;
        }
        ScrnOvrdsPK other = (ScrnOvrdsPK) object;
        if ((this.applId == null && other.applId != null) || (this.applId != null && !this.applId.equals(other.applId))) {
            return false;
        }
        if ((this.pageNm == null && other.pageNm != null) || (this.pageNm != null && !this.pageNm.equals(other.pageNm))) {
            return false;
        }
        if ((this.fieldNm == null && other.fieldNm != null) || (this.fieldNm != null && !this.fieldNm.equals(other.fieldNm))) {
            return false;
        }
        if ((this.asmtLvl == null && other.asmtLvl != null) || (this.asmtLvl != null && !this.asmtLvl.equals(other.asmtLvl))) {
            return false;
        }
        if ((this.asmtVal == null && other.asmtVal != null) || (this.asmtVal != null && !this.asmtVal.equals(other.asmtVal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScrnOvrdsPK[ applId=" + applId + ", pageNm=" + pageNm + ", fieldNm=" + fieldNm + ", asmtLvl=" + asmtLvl + ", asmtVal=" + asmtVal + " ]";
    }

}
