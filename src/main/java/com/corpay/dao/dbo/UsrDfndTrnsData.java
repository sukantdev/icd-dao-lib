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
@Table(name = "USR_DFND_TRNS_DATA", catalog = "", schema = "DBO")
public class UsrDfndTrnsData implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrDfndTrnsDataPK usrDfndTrnsDataPK;
    @Basic(optional = false)
    @Column(name = "USR_PCHS_ORD_NBR")
    private String usrPchsOrdNbr;
    @Basic(optional = false)
    @Column(name = "USR_MRCH_NBR")
    private String usrMrchNbr;
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

    public UsrDfndTrnsData() {
    }

    public UsrDfndTrnsData(UsrDfndTrnsDataPK usrDfndTrnsDataPK) {
        this.usrDfndTrnsDataPK = usrDfndTrnsDataPK;
    }

    public UsrDfndTrnsData(UsrDfndTrnsDataPK usrDfndTrnsDataPK, String usrPchsOrdNbr, String usrMrchNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrDfndTrnsDataPK = usrDfndTrnsDataPK;
        this.usrPchsOrdNbr = usrPchsOrdNbr;
        this.usrMrchNbr = usrMrchNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrDfndTrnsData(Date pstdDt, int trnsId) {
        this.usrDfndTrnsDataPK = new UsrDfndTrnsDataPK(pstdDt, trnsId);
    }

    public UsrDfndTrnsDataPK getUsrDfndTrnsDataPK() {
        return usrDfndTrnsDataPK;
    }

    public void setUsrDfndTrnsDataPK(UsrDfndTrnsDataPK usrDfndTrnsDataPK) {
        this.usrDfndTrnsDataPK = usrDfndTrnsDataPK;
    }

    public String getUsrPchsOrdNbr() {
        return usrPchsOrdNbr;
    }

    public void setUsrPchsOrdNbr(String usrPchsOrdNbr) {
        this.usrPchsOrdNbr = usrPchsOrdNbr;
    }

    public String getUsrMrchNbr() {
        return usrMrchNbr;
    }

    public void setUsrMrchNbr(String usrMrchNbr) {
        this.usrMrchNbr = usrMrchNbr;
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
        hash += (usrDfndTrnsDataPK != null ? usrDfndTrnsDataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrDfndTrnsData)) {
            return false;
        }
        UsrDfndTrnsData other = (UsrDfndTrnsData) object;
        if ((this.usrDfndTrnsDataPK == null && other.usrDfndTrnsDataPK != null) || (this.usrDfndTrnsDataPK != null && !this.usrDfndTrnsDataPK.equals(other.usrDfndTrnsDataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrDfndTrnsData[ usrDfndTrnsDataPK=" + usrDfndTrnsDataPK + " ]";
    }

}
