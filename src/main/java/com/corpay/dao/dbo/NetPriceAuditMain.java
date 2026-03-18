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
@Table(name = "NET_PRICE_AUDIT_MAIN", catalog = "", schema = "DBO")
public class NetPriceAuditMain implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NetPriceAuditMainPK netPriceAuditMainPK;
    @Basic(optional = false)
    @Column(name = "NET_OPIS_RCK_CTY_NBR")
    private String netOpisRckCtyNbr;
    @Basic(optional = false)
    @Column(name = "CHAIN_CD")
    private String chainCd;
    @Basic(optional = false)
    @Column(name = "XTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xtnTs;
    @Basic(optional = false)
    @Column(name = "MSG_TXT")
    private String msgTxt;
    @Basic(optional = false)
    @Column(name = "PROCESSING_ID")
    private Character processingId;

    public NetPriceAuditMain() {
    }

    public NetPriceAuditMain(NetPriceAuditMainPK netPriceAuditMainPK) {
        this.netPriceAuditMainPK = netPriceAuditMainPK;
    }

    public NetPriceAuditMain(NetPriceAuditMainPK netPriceAuditMainPK, String netOpisRckCtyNbr, String chainCd, Date xtnTs, String msgTxt, Character processingId) {
        this.netPriceAuditMainPK = netPriceAuditMainPK;
        this.netOpisRckCtyNbr = netOpisRckCtyNbr;
        this.chainCd = chainCd;
        this.xtnTs = xtnTs;
        this.msgTxt = msgTxt;
        this.processingId = processingId;
    }

    public NetPriceAuditMain(String acctNbr, Date effctvTs, String pfidCd, String locCd, String prdCd, String custId, String netPrdGrp, Character fndngRltnshpCd) {
        this.netPriceAuditMainPK = new NetPriceAuditMainPK(acctNbr, effctvTs, pfidCd, locCd, prdCd, custId, netPrdGrp, fndngRltnshpCd);
    }

    public NetPriceAuditMainPK getNetPriceAuditMainPK() {
        return netPriceAuditMainPK;
    }

    public void setNetPriceAuditMainPK(NetPriceAuditMainPK netPriceAuditMainPK) {
        this.netPriceAuditMainPK = netPriceAuditMainPK;
    }

    public String getNetOpisRckCtyNbr() {
        return netOpisRckCtyNbr;
    }

    public void setNetOpisRckCtyNbr(String netOpisRckCtyNbr) {
        this.netOpisRckCtyNbr = netOpisRckCtyNbr;
    }

    public String getChainCd() {
        return chainCd;
    }

    public void setChainCd(String chainCd) {
        this.chainCd = chainCd;
    }

    public Date getXtnTs() {
        return xtnTs;
    }

    public void setXtnTs(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public String getMsgTxt() {
        return msgTxt;
    }

    public void setMsgTxt(String msgTxt) {
        this.msgTxt = msgTxt;
    }

    public Character getProcessingId() {
        return processingId;
    }

    public void setProcessingId(Character processingId) {
        this.processingId = processingId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (netPriceAuditMainPK != null ? netPriceAuditMainPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NetPriceAuditMain)) {
            return false;
        }
        NetPriceAuditMain other = (NetPriceAuditMain) object;
        if ((this.netPriceAuditMainPK == null && other.netPriceAuditMainPK != null) || (this.netPriceAuditMainPK != null && !this.netPriceAuditMainPK.equals(other.netPriceAuditMainPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NetPriceAuditMain[ netPriceAuditMainPK=" + netPriceAuditMainPK + " ]";
    }

}
