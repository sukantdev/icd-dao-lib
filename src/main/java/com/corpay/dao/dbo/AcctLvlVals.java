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
@Table(name = "ACCT_LVL_VALS", catalog = "", schema = "DBO")
public class AcctLvlVals implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctLvlValsPK acctLvlValsPK;
    @Basic(optional = false)
    @Column(name = "LVL_VAL")
    private String lvlVal;
    @Basic(optional = false)
    @Column(name = "LST_UPD")
    @Temporal(TemporalType.DATE)
    private Date lstUpd;
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

    public AcctLvlVals() {
    }

    public AcctLvlVals(AcctLvlValsPK acctLvlValsPK) {
        this.acctLvlValsPK = acctLvlValsPK;
    }

    public AcctLvlVals(AcctLvlValsPK acctLvlValsPK, String lvlVal, Date lstUpd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctLvlValsPK = acctLvlValsPK;
        this.lvlVal = lvlVal;
        this.lstUpd = lstUpd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AcctLvlVals(String acctNbr, short lvlNbr, short lvlValNbr) {
        this.acctLvlValsPK = new AcctLvlValsPK(acctNbr, lvlNbr, lvlValNbr);
    }

    public AcctLvlValsPK getAcctLvlValsPK() {
        return acctLvlValsPK;
    }

    public void setAcctLvlValsPK(AcctLvlValsPK acctLvlValsPK) {
        this.acctLvlValsPK = acctLvlValsPK;
    }

    public String getLvlVal() {
        return lvlVal;
    }

    public void setLvlVal(String lvlVal) {
        this.lvlVal = lvlVal;
    }

    public Date getLstUpd() {
        return lstUpd;
    }

    public void setLstUpd(Date lstUpd) {
        this.lstUpd = lstUpd;
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
        hash += (acctLvlValsPK != null ? acctLvlValsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AcctLvlVals)) {
            return false;
        }
        AcctLvlVals other = (AcctLvlVals) object;
        if ((this.acctLvlValsPK == null && other.acctLvlValsPK != null) || (this.acctLvlValsPK != null && !this.acctLvlValsPK.equals(other.acctLvlValsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctLvlVals[ acctLvlValsPK=" + acctLvlValsPK + " ]";
    }

}
