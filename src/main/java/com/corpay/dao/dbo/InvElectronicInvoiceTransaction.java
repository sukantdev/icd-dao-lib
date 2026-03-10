/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "INV_ELECTRONIC_INVOICE_TRANSACTION", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvElectronicInvoiceTransaction.findAll", query = "SELECT i FROM InvElectronicInvoiceTransaction i")})
public class InvElectronicInvoiceTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvElectronicInvoiceTransactionPK invElectronicInvoiceTransactionPK;
    @Basic(optional = false)
    @Column(name = "INV_NO")
    private String invNo;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    private String invDt;
    @Basic(optional = false)
    @Column(name = "INV_CRT_DT")
    private int invCrtDt;
    @Basic(optional = false)
    @Column(name = "INV_CRT_TM")
    private int invCrtTm;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_1")
    private String sdata1Desc1;
    @Basic(optional = false)
    @Column(name = "SDATA1_1")
    private String sdata11;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_1")
    private String sdata1Cd1;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_2")
    private String sdata1Desc2;
    @Basic(optional = false)
    @Column(name = "SDATA1_2")
    private String sdata12;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_2")
    private String sdata1Cd2;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_3")
    private String sdata1Desc3;
    @Basic(optional = false)
    @Column(name = "SDATA1_3")
    private String sdata13;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_3")
    private String sdata1Cd3;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_4")
    private String sdata1Desc4;
    @Basic(optional = false)
    @Column(name = "SDATA1_4")
    private String sdata14;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_4")
    private String sdata1Cd4;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_5")
    private String sdata1Desc5;
    @Basic(optional = false)
    @Column(name = "SDATA1_5")
    private String sdata15;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_5")
    private String sdata1Cd5;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_6")
    private String sdata1Desc6;
    @Basic(optional = false)
    @Column(name = "SDATA1_6")
    private String sdata16;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_6")
    private String sdata1Cd6;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_7")
    private String sdata1Desc7;
    @Basic(optional = false)
    @Column(name = "SDATA1_7")
    private String sdata17;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_7")
    private String sdata1Cd7;
    @Basic(optional = false)
    @Column(name = "SDATA1_DESC_8")
    private String sdata1Desc8;
    @Basic(optional = false)
    @Column(name = "SDATA1_8")
    private String sdata18;
    @Basic(optional = false)
    @Column(name = "SDATA1_CD_8")
    private String sdata1Cd8;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_1")
    private String sdata2Desc1;
    @Basic(optional = false)
    @Column(name = "SDATA2_1")
    private String sdata21;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_1")
    private String sdata2Cd1;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_2")
    private String sdata2Desc2;
    @Basic(optional = false)
    @Column(name = "SDATA2_2")
    private String sdata22;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_2")
    private String sdata2Cd2;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_3")
    private String sdata2Desc3;
    @Basic(optional = false)
    @Column(name = "SDATA2_3")
    private String sdata23;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_3")
    private String sdata2Cd3;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_4")
    private String sdata2Desc4;
    @Basic(optional = false)
    @Column(name = "SDATA2_4")
    private String sdata24;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_4")
    private String sdata2Cd4;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_5")
    private String sdata2Desc5;
    @Basic(optional = false)
    @Column(name = "SDATA2_5")
    private String sdata25;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_5")
    private String sdata2Cd5;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_6")
    private String sdata2Desc6;
    @Basic(optional = false)
    @Column(name = "SDATA2_6")
    private String sdata26;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_6")
    private String sdata2Cd6;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_7")
    private String sdata2Desc7;
    @Basic(optional = false)
    @Column(name = "SDATA2_7")
    private String sdata27;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_7")
    private String sdata2Cd7;
    @Basic(optional = false)
    @Column(name = "SDATA2_DESC_8")
    private String sdata2Desc8;
    @Basic(optional = false)
    @Column(name = "SDATA2_8")
    private String sdata28;
    @Basic(optional = false)
    @Column(name = "SDATA2_CD_8")
    private String sdata2Cd8;
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

    public InvElectronicInvoiceTransaction() {
    }

    public InvElectronicInvoiceTransaction(InvElectronicInvoiceTransactionPK invElectronicInvoiceTransactionPK) {
        this.invElectronicInvoiceTransactionPK = invElectronicInvoiceTransactionPK;
    }

    public InvElectronicInvoiceTransaction(InvElectronicInvoiceTransactionPK invElectronicInvoiceTransactionPK, String invNo, String invDt, int invCrtDt, int invCrtTm, String sdata1Desc1, String sdata11, String sdata1Cd1, String sdata1Desc2, String sdata12, String sdata1Cd2, String sdata1Desc3, String sdata13, String sdata1Cd3, String sdata1Desc4, String sdata14, String sdata1Cd4, String sdata1Desc5, String sdata15, String sdata1Cd5, String sdata1Desc6, String sdata16, String sdata1Cd6, String sdata1Desc7, String sdata17, String sdata1Cd7, String sdata1Desc8, String sdata18, String sdata1Cd8, String sdata2Desc1, String sdata21, String sdata2Cd1, String sdata2Desc2, String sdata22, String sdata2Cd2, String sdata2Desc3, String sdata23, String sdata2Cd3, String sdata2Desc4, String sdata24, String sdata2Cd4, String sdata2Desc5, String sdata25, String sdata2Cd5, String sdata2Desc6, String sdata26, String sdata2Cd6, String sdata2Desc7, String sdata27, String sdata2Cd7, String sdata2Desc8, String sdata28, String sdata2Cd8, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invElectronicInvoiceTransactionPK = invElectronicInvoiceTransactionPK;
        this.invNo = invNo;
        this.invDt = invDt;
        this.invCrtDt = invCrtDt;
        this.invCrtTm = invCrtTm;
        this.sdata1Desc1 = sdata1Desc1;
        this.sdata11 = sdata11;
        this.sdata1Cd1 = sdata1Cd1;
        this.sdata1Desc2 = sdata1Desc2;
        this.sdata12 = sdata12;
        this.sdata1Cd2 = sdata1Cd2;
        this.sdata1Desc3 = sdata1Desc3;
        this.sdata13 = sdata13;
        this.sdata1Cd3 = sdata1Cd3;
        this.sdata1Desc4 = sdata1Desc4;
        this.sdata14 = sdata14;
        this.sdata1Cd4 = sdata1Cd4;
        this.sdata1Desc5 = sdata1Desc5;
        this.sdata15 = sdata15;
        this.sdata1Cd5 = sdata1Cd5;
        this.sdata1Desc6 = sdata1Desc6;
        this.sdata16 = sdata16;
        this.sdata1Cd6 = sdata1Cd6;
        this.sdata1Desc7 = sdata1Desc7;
        this.sdata17 = sdata17;
        this.sdata1Cd7 = sdata1Cd7;
        this.sdata1Desc8 = sdata1Desc8;
        this.sdata18 = sdata18;
        this.sdata1Cd8 = sdata1Cd8;
        this.sdata2Desc1 = sdata2Desc1;
        this.sdata21 = sdata21;
        this.sdata2Cd1 = sdata2Cd1;
        this.sdata2Desc2 = sdata2Desc2;
        this.sdata22 = sdata22;
        this.sdata2Cd2 = sdata2Cd2;
        this.sdata2Desc3 = sdata2Desc3;
        this.sdata23 = sdata23;
        this.sdata2Cd3 = sdata2Cd3;
        this.sdata2Desc4 = sdata2Desc4;
        this.sdata24 = sdata24;
        this.sdata2Cd4 = sdata2Cd4;
        this.sdata2Desc5 = sdata2Desc5;
        this.sdata25 = sdata25;
        this.sdata2Cd5 = sdata2Cd5;
        this.sdata2Desc6 = sdata2Desc6;
        this.sdata26 = sdata26;
        this.sdata2Cd6 = sdata2Cd6;
        this.sdata2Desc7 = sdata2Desc7;
        this.sdata27 = sdata27;
        this.sdata2Cd7 = sdata2Cd7;
        this.sdata2Desc8 = sdata2Desc8;
        this.sdata28 = sdata28;
        this.sdata2Cd8 = sdata2Cd8;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvElectronicInvoiceTransaction(Date pstdDt, int trnsId, short seqNo) {
        this.invElectronicInvoiceTransactionPK = new InvElectronicInvoiceTransactionPK(pstdDt, trnsId, seqNo);
    }

    public InvElectronicInvoiceTransactionPK getInvElectronicInvoiceTransactionPK() {
        return invElectronicInvoiceTransactionPK;
    }

    public void setInvElectronicInvoiceTransactionPK(InvElectronicInvoiceTransactionPK invElectronicInvoiceTransactionPK) {
        this.invElectronicInvoiceTransactionPK = invElectronicInvoiceTransactionPK;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public String getInvDt() {
        return invDt;
    }

    public void setInvDt(String invDt) {
        this.invDt = invDt;
    }

    public int getInvCrtDt() {
        return invCrtDt;
    }

    public void setInvCrtDt(int invCrtDt) {
        this.invCrtDt = invCrtDt;
    }

    public int getInvCrtTm() {
        return invCrtTm;
    }

    public void setInvCrtTm(int invCrtTm) {
        this.invCrtTm = invCrtTm;
    }

    public String getSdata1Desc1() {
        return sdata1Desc1;
    }

    public void setSdata1Desc1(String sdata1Desc1) {
        this.sdata1Desc1 = sdata1Desc1;
    }

    public String getSdata11() {
        return sdata11;
    }

    public void setSdata11(String sdata11) {
        this.sdata11 = sdata11;
    }

    public String getSdata1Cd1() {
        return sdata1Cd1;
    }

    public void setSdata1Cd1(String sdata1Cd1) {
        this.sdata1Cd1 = sdata1Cd1;
    }

    public String getSdata1Desc2() {
        return sdata1Desc2;
    }

    public void setSdata1Desc2(String sdata1Desc2) {
        this.sdata1Desc2 = sdata1Desc2;
    }

    public String getSdata12() {
        return sdata12;
    }

    public void setSdata12(String sdata12) {
        this.sdata12 = sdata12;
    }

    public String getSdata1Cd2() {
        return sdata1Cd2;
    }

    public void setSdata1Cd2(String sdata1Cd2) {
        this.sdata1Cd2 = sdata1Cd2;
    }

    public String getSdata1Desc3() {
        return sdata1Desc3;
    }

    public void setSdata1Desc3(String sdata1Desc3) {
        this.sdata1Desc3 = sdata1Desc3;
    }

    public String getSdata13() {
        return sdata13;
    }

    public void setSdata13(String sdata13) {
        this.sdata13 = sdata13;
    }

    public String getSdata1Cd3() {
        return sdata1Cd3;
    }

    public void setSdata1Cd3(String sdata1Cd3) {
        this.sdata1Cd3 = sdata1Cd3;
    }

    public String getSdata1Desc4() {
        return sdata1Desc4;
    }

    public void setSdata1Desc4(String sdata1Desc4) {
        this.sdata1Desc4 = sdata1Desc4;
    }

    public String getSdata14() {
        return sdata14;
    }

    public void setSdata14(String sdata14) {
        this.sdata14 = sdata14;
    }

    public String getSdata1Cd4() {
        return sdata1Cd4;
    }

    public void setSdata1Cd4(String sdata1Cd4) {
        this.sdata1Cd4 = sdata1Cd4;
    }

    public String getSdata1Desc5() {
        return sdata1Desc5;
    }

    public void setSdata1Desc5(String sdata1Desc5) {
        this.sdata1Desc5 = sdata1Desc5;
    }

    public String getSdata15() {
        return sdata15;
    }

    public void setSdata15(String sdata15) {
        this.sdata15 = sdata15;
    }

    public String getSdata1Cd5() {
        return sdata1Cd5;
    }

    public void setSdata1Cd5(String sdata1Cd5) {
        this.sdata1Cd5 = sdata1Cd5;
    }

    public String getSdata1Desc6() {
        return sdata1Desc6;
    }

    public void setSdata1Desc6(String sdata1Desc6) {
        this.sdata1Desc6 = sdata1Desc6;
    }

    public String getSdata16() {
        return sdata16;
    }

    public void setSdata16(String sdata16) {
        this.sdata16 = sdata16;
    }

    public String getSdata1Cd6() {
        return sdata1Cd6;
    }

    public void setSdata1Cd6(String sdata1Cd6) {
        this.sdata1Cd6 = sdata1Cd6;
    }

    public String getSdata1Desc7() {
        return sdata1Desc7;
    }

    public void setSdata1Desc7(String sdata1Desc7) {
        this.sdata1Desc7 = sdata1Desc7;
    }

    public String getSdata17() {
        return sdata17;
    }

    public void setSdata17(String sdata17) {
        this.sdata17 = sdata17;
    }

    public String getSdata1Cd7() {
        return sdata1Cd7;
    }

    public void setSdata1Cd7(String sdata1Cd7) {
        this.sdata1Cd7 = sdata1Cd7;
    }

    public String getSdata1Desc8() {
        return sdata1Desc8;
    }

    public void setSdata1Desc8(String sdata1Desc8) {
        this.sdata1Desc8 = sdata1Desc8;
    }

    public String getSdata18() {
        return sdata18;
    }

    public void setSdata18(String sdata18) {
        this.sdata18 = sdata18;
    }

    public String getSdata1Cd8() {
        return sdata1Cd8;
    }

    public void setSdata1Cd8(String sdata1Cd8) {
        this.sdata1Cd8 = sdata1Cd8;
    }

    public String getSdata2Desc1() {
        return sdata2Desc1;
    }

    public void setSdata2Desc1(String sdata2Desc1) {
        this.sdata2Desc1 = sdata2Desc1;
    }

    public String getSdata21() {
        return sdata21;
    }

    public void setSdata21(String sdata21) {
        this.sdata21 = sdata21;
    }

    public String getSdata2Cd1() {
        return sdata2Cd1;
    }

    public void setSdata2Cd1(String sdata2Cd1) {
        this.sdata2Cd1 = sdata2Cd1;
    }

    public String getSdata2Desc2() {
        return sdata2Desc2;
    }

    public void setSdata2Desc2(String sdata2Desc2) {
        this.sdata2Desc2 = sdata2Desc2;
    }

    public String getSdata22() {
        return sdata22;
    }

    public void setSdata22(String sdata22) {
        this.sdata22 = sdata22;
    }

    public String getSdata2Cd2() {
        return sdata2Cd2;
    }

    public void setSdata2Cd2(String sdata2Cd2) {
        this.sdata2Cd2 = sdata2Cd2;
    }

    public String getSdata2Desc3() {
        return sdata2Desc3;
    }

    public void setSdata2Desc3(String sdata2Desc3) {
        this.sdata2Desc3 = sdata2Desc3;
    }

    public String getSdata23() {
        return sdata23;
    }

    public void setSdata23(String sdata23) {
        this.sdata23 = sdata23;
    }

    public String getSdata2Cd3() {
        return sdata2Cd3;
    }

    public void setSdata2Cd3(String sdata2Cd3) {
        this.sdata2Cd3 = sdata2Cd3;
    }

    public String getSdata2Desc4() {
        return sdata2Desc4;
    }

    public void setSdata2Desc4(String sdata2Desc4) {
        this.sdata2Desc4 = sdata2Desc4;
    }

    public String getSdata24() {
        return sdata24;
    }

    public void setSdata24(String sdata24) {
        this.sdata24 = sdata24;
    }

    public String getSdata2Cd4() {
        return sdata2Cd4;
    }

    public void setSdata2Cd4(String sdata2Cd4) {
        this.sdata2Cd4 = sdata2Cd4;
    }

    public String getSdata2Desc5() {
        return sdata2Desc5;
    }

    public void setSdata2Desc5(String sdata2Desc5) {
        this.sdata2Desc5 = sdata2Desc5;
    }

    public String getSdata25() {
        return sdata25;
    }

    public void setSdata25(String sdata25) {
        this.sdata25 = sdata25;
    }

    public String getSdata2Cd5() {
        return sdata2Cd5;
    }

    public void setSdata2Cd5(String sdata2Cd5) {
        this.sdata2Cd5 = sdata2Cd5;
    }

    public String getSdata2Desc6() {
        return sdata2Desc6;
    }

    public void setSdata2Desc6(String sdata2Desc6) {
        this.sdata2Desc6 = sdata2Desc6;
    }

    public String getSdata26() {
        return sdata26;
    }

    public void setSdata26(String sdata26) {
        this.sdata26 = sdata26;
    }

    public String getSdata2Cd6() {
        return sdata2Cd6;
    }

    public void setSdata2Cd6(String sdata2Cd6) {
        this.sdata2Cd6 = sdata2Cd6;
    }

    public String getSdata2Desc7() {
        return sdata2Desc7;
    }

    public void setSdata2Desc7(String sdata2Desc7) {
        this.sdata2Desc7 = sdata2Desc7;
    }

    public String getSdata27() {
        return sdata27;
    }

    public void setSdata27(String sdata27) {
        this.sdata27 = sdata27;
    }

    public String getSdata2Cd7() {
        return sdata2Cd7;
    }

    public void setSdata2Cd7(String sdata2Cd7) {
        this.sdata2Cd7 = sdata2Cd7;
    }

    public String getSdata2Desc8() {
        return sdata2Desc8;
    }

    public void setSdata2Desc8(String sdata2Desc8) {
        this.sdata2Desc8 = sdata2Desc8;
    }

    public String getSdata28() {
        return sdata28;
    }

    public void setSdata28(String sdata28) {
        this.sdata28 = sdata28;
    }

    public String getSdata2Cd8() {
        return sdata2Cd8;
    }

    public void setSdata2Cd8(String sdata2Cd8) {
        this.sdata2Cd8 = sdata2Cd8;
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
        hash += (invElectronicInvoiceTransactionPK != null ? invElectronicInvoiceTransactionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvElectronicInvoiceTransaction)) {
            return false;
        }
        InvElectronicInvoiceTransaction other = (InvElectronicInvoiceTransaction) object;
        if ((this.invElectronicInvoiceTransactionPK == null && other.invElectronicInvoiceTransactionPK != null) || (this.invElectronicInvoiceTransactionPK != null && !this.invElectronicInvoiceTransactionPK.equals(other.invElectronicInvoiceTransactionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvElectronicInvoiceTransaction[ invElectronicInvoiceTransactionPK=" + invElectronicInvoiceTransactionPK + " ]";
    }
    
}
