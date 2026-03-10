/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@Table(name = "ET_AUDIT_LOG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EtAuditLog.findAll", query = "SELECT e FROM EtAuditLog e")})
public class EtAuditLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "RQSTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rqstdTs;
    @Basic(optional = false)
    @Column(name = "SGMT_NM")
    private String sgmtNm;
    @Basic(optional = false)
    @Column(name = "PAYLOAD_SIZE")
    private String payloadSize;
    @Basic(optional = false)
    @Column(name = "EXP_TRK_UPLD_TKN")
    private String expTrkUpldTkn;
    @Basic(optional = false)
    @Column(name = "EXP_TRK_CREATED_FILE_NM")
    private String expTrkCreatedFileNm;
    @Basic(optional = false)
    @Column(name = "EXP_TRK_UPLD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expTrkUpldTs;
    @Basic(optional = false)
    @Column(name = "IS_FULL_EXPORT_FLG")
    private Character isFullExportFlg;
    @Basic(optional = false)
    @Column(name = "RESP_STATUS")
    private String respStatus;
    @Basic(optional = false)
    @Lob
    @Column(name = "PAYLOAD_ERROR")
    private String payloadError;
    @Basic(optional = false)
    @Column(name = "REQUESTED_IP_ADDRESS")
    private String requestedIpAddress;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public EtAuditLog() {
    }

    public EtAuditLog(Long id) {
        this.id = id;
    }

    public EtAuditLog(Long id, String tenantId, Date rqstdTs, String sgmtNm, String payloadSize, String expTrkUpldTkn, String expTrkCreatedFileNm, Date expTrkUpldTs, Character isFullExportFlg, String respStatus, String payloadError, String requestedIpAddress, Date crtTs, String crtUsr, Serializable db2GeneratedRowidForLobs) {
        this.id = id;
        this.tenantId = tenantId;
        this.rqstdTs = rqstdTs;
        this.sgmtNm = sgmtNm;
        this.payloadSize = payloadSize;
        this.expTrkUpldTkn = expTrkUpldTkn;
        this.expTrkCreatedFileNm = expTrkCreatedFileNm;
        this.expTrkUpldTs = expTrkUpldTs;
        this.isFullExportFlg = isFullExportFlg;
        this.respStatus = respStatus;
        this.payloadError = payloadError;
        this.requestedIpAddress = requestedIpAddress;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Date getRqstdTs() {
        return rqstdTs;
    }

    public void setRqstdTs(Date rqstdTs) {
        this.rqstdTs = rqstdTs;
    }

    public String getSgmtNm() {
        return sgmtNm;
    }

    public void setSgmtNm(String sgmtNm) {
        this.sgmtNm = sgmtNm;
    }

    public String getPayloadSize() {
        return payloadSize;
    }

    public void setPayloadSize(String payloadSize) {
        this.payloadSize = payloadSize;
    }

    public String getExpTrkUpldTkn() {
        return expTrkUpldTkn;
    }

    public void setExpTrkUpldTkn(String expTrkUpldTkn) {
        this.expTrkUpldTkn = expTrkUpldTkn;
    }

    public String getExpTrkCreatedFileNm() {
        return expTrkCreatedFileNm;
    }

    public void setExpTrkCreatedFileNm(String expTrkCreatedFileNm) {
        this.expTrkCreatedFileNm = expTrkCreatedFileNm;
    }

    public Date getExpTrkUpldTs() {
        return expTrkUpldTs;
    }

    public void setExpTrkUpldTs(Date expTrkUpldTs) {
        this.expTrkUpldTs = expTrkUpldTs;
    }

    public Character getIsFullExportFlg() {
        return isFullExportFlg;
    }

    public void setIsFullExportFlg(Character isFullExportFlg) {
        this.isFullExportFlg = isFullExportFlg;
    }

    public String getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(String respStatus) {
        this.respStatus = respStatus;
    }

    public String getPayloadError() {
        return payloadError;
    }

    public void setPayloadError(String payloadError) {
        this.payloadError = payloadError;
    }

    public String getRequestedIpAddress() {
        return requestedIpAddress;
    }

    public void setRequestedIpAddress(String requestedIpAddress) {
        this.requestedIpAddress = requestedIpAddress;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtAuditLog)) {
            return false;
        }
        EtAuditLog other = (EtAuditLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtAuditLog[ id=" + id + " ]";
    }
    
}
