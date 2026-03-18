package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "WD_BNK_ACCT_INFO", catalog = "", schema = "DBO")
public class WdBnkAcctInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WD_BNK_INDEX")
    private Integer wdBnkIndex;
    @Basic(optional = false)
    @Column(name = "BT_SRCE_SYS_CD")
    private String btSrceSysCd;
    @Basic(optional = false)
    @Column(name = "CDN_BNK_REF_NBR")
    private String cdnBnkRefNbr;
    @Basic(optional = false)
    @Column(name = "CDN_BNK_ACCT_NBR")
    private String cdnBnkAcctNbr;
    @Basic(optional = false)
    @Column(name = "FTP_URI")
    private String ftpUri;
    @Basic(optional = false)
    @Column(name = "FTP_TRANSFER_MODE")
    private Character ftpTransferMode;
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
    @Basic(optional = false)
    @Column(name = "SRC_NM")
    private String srcNm;
    @Basic(optional = false)
    @Column(name = "GEAC_LOCKBOX")
    private int geacLockbox;
    @Basic(optional = false)
    @Column(name = "LOB_CD")
    private String lobCd;

    public WdBnkAcctInfo() {
    }

    public WdBnkAcctInfo(Integer wdBnkIndex) {
        this.wdBnkIndex = wdBnkIndex;
    }

    public WdBnkAcctInfo(Integer wdBnkIndex, String btSrceSysCd, String cdnBnkRefNbr, String cdnBnkAcctNbr, String ftpUri, Character ftpTransferMode, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String srcNm, int geacLockbox, String lobCd) {
        this.wdBnkIndex = wdBnkIndex;
        this.btSrceSysCd = btSrceSysCd;
        this.cdnBnkRefNbr = cdnBnkRefNbr;
        this.cdnBnkAcctNbr = cdnBnkAcctNbr;
        this.ftpUri = ftpUri;
        this.ftpTransferMode = ftpTransferMode;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.srcNm = srcNm;
        this.geacLockbox = geacLockbox;
        this.lobCd = lobCd;
    }

    public Integer getWdBnkIndex() {
        return wdBnkIndex;
    }

    public void setWdBnkIndex(Integer wdBnkIndex) {
        this.wdBnkIndex = wdBnkIndex;
    }

    public String getBtSrceSysCd() {
        return btSrceSysCd;
    }

    public void setBtSrceSysCd(String btSrceSysCd) {
        this.btSrceSysCd = btSrceSysCd;
    }

    public String getCdnBnkRefNbr() {
        return cdnBnkRefNbr;
    }

    public void setCdnBnkRefNbr(String cdnBnkRefNbr) {
        this.cdnBnkRefNbr = cdnBnkRefNbr;
    }

    public String getCdnBnkAcctNbr() {
        return cdnBnkAcctNbr;
    }

    public void setCdnBnkAcctNbr(String cdnBnkAcctNbr) {
        this.cdnBnkAcctNbr = cdnBnkAcctNbr;
    }

    public String getFtpUri() {
        return ftpUri;
    }

    public void setFtpUri(String ftpUri) {
        this.ftpUri = ftpUri;
    }

    public Character getFtpTransferMode() {
        return ftpTransferMode;
    }

    public void setFtpTransferMode(Character ftpTransferMode) {
        this.ftpTransferMode = ftpTransferMode;
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

    public String getSrcNm() {
        return srcNm;
    }

    public void setSrcNm(String srcNm) {
        this.srcNm = srcNm;
    }

    public int getGeacLockbox() {
        return geacLockbox;
    }

    public void setGeacLockbox(int geacLockbox) {
        this.geacLockbox = geacLockbox;
    }

    public String getLobCd() {
        return lobCd;
    }

    public void setLobCd(String lobCd) {
        this.lobCd = lobCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wdBnkIndex != null ? wdBnkIndex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof WdBnkAcctInfo)) {
            return false;
        }
        WdBnkAcctInfo other = (WdBnkAcctInfo) object;
        if ((this.wdBnkIndex == null && other.wdBnkIndex != null) || (this.wdBnkIndex != null && !this.wdBnkIndex.equals(other.wdBnkIndex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdBnkAcctInfo[ wdBnkIndex=" + wdBnkIndex + " ]";
    }

}
