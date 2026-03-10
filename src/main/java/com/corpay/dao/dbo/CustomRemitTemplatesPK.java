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
public class CustomRemitTemplatesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CSTM_REMIT_TMPLT_NM")
    private String cstmRemitTmpltNm;
    @Basic(optional = false)
    @Column(name = "FIELD_REF_TXT")
    private String fieldRefTxt;
    @Basic(optional = false)
    @Column(name = "SELD_OPT_VAL")
    private Character seldOptVal;

    public CustomRemitTemplatesPK() {
    }

    public CustomRemitTemplatesPK(String acctNbr, String custId, String cstmRemitTmpltNm, String fieldRefTxt, Character seldOptVal) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.cstmRemitTmpltNm = cstmRemitTmpltNm;
        this.fieldRefTxt = fieldRefTxt;
        this.seldOptVal = seldOptVal;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCstmRemitTmpltNm() {
        return cstmRemitTmpltNm;
    }

    public void setCstmRemitTmpltNm(String cstmRemitTmpltNm) {
        this.cstmRemitTmpltNm = cstmRemitTmpltNm;
    }

    public String getFieldRefTxt() {
        return fieldRefTxt;
    }

    public void setFieldRefTxt(String fieldRefTxt) {
        this.fieldRefTxt = fieldRefTxt;
    }

    public Character getSeldOptVal() {
        return seldOptVal;
    }

    public void setSeldOptVal(Character seldOptVal) {
        this.seldOptVal = seldOptVal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (cstmRemitTmpltNm != null ? cstmRemitTmpltNm.hashCode() : 0);
        hash += (fieldRefTxt != null ? fieldRefTxt.hashCode() : 0);
        hash += (seldOptVal != null ? seldOptVal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomRemitTemplatesPK)) {
            return false;
        }
        CustomRemitTemplatesPK other = (CustomRemitTemplatesPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.cstmRemitTmpltNm == null && other.cstmRemitTmpltNm != null) || (this.cstmRemitTmpltNm != null && !this.cstmRemitTmpltNm.equals(other.cstmRemitTmpltNm))) {
            return false;
        }
        if ((this.fieldRefTxt == null && other.fieldRefTxt != null) || (this.fieldRefTxt != null && !this.fieldRefTxt.equals(other.fieldRefTxt))) {
            return false;
        }
        if ((this.seldOptVal == null && other.seldOptVal != null) || (this.seldOptVal != null && !this.seldOptVal.equals(other.seldOptVal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustomRemitTemplatesPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", cstmRemitTmpltNm=" + cstmRemitTmpltNm + ", fieldRefTxt=" + fieldRefTxt + ", seldOptVal=" + seldOptVal + " ]";
    }
    
}
