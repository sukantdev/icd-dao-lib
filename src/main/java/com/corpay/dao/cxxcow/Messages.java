/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MESSAGES", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Messages.findAll", query = "SELECT m FROM Messages m"),
    @NamedQuery(name = "Messages.findByMsgId", query = "SELECT m FROM Messages m WHERE m.msgId = :msgId"),
    @NamedQuery(name = "Messages.findByMsgText", query = "SELECT m FROM Messages m WHERE m.msgText = :msgText"),
    @NamedQuery(name = "Messages.findByMsgTitle", query = "SELECT m FROM Messages m WHERE m.msgTitle = :msgTitle"),
    @NamedQuery(name = "Messages.findByMsgTyp", query = "SELECT m FROM Messages m WHERE m.msgTyp = :msgTyp"),
    @NamedQuery(name = "Messages.findByMsgSta", query = "SELECT m FROM Messages m WHERE m.msgSta = :msgSta"),
    @NamedQuery(name = "Messages.findByMsgStp", query = "SELECT m FROM Messages m WHERE m.msgStp = :msgStp"),
    @NamedQuery(name = "Messages.findByCrtTs", query = "SELECT m FROM Messages m WHERE m.crtTs = :crtTs"),
    @NamedQuery(name = "Messages.findByCrtUsr", query = "SELECT m FROM Messages m WHERE m.crtUsr = :crtUsr"),
    @NamedQuery(name = "Messages.findByMdyTs", query = "SELECT m FROM Messages m WHERE m.mdyTs = :mdyTs"),
    @NamedQuery(name = "Messages.findByMdyUsr", query = "SELECT m FROM Messages m WHERE m.mdyUsr = :mdyUsr"),
    @NamedQuery(name = "Messages.findByDb2GeneratedRowidForLobs", query = "SELECT m FROM Messages m WHERE m.db2GeneratedRowidForLobs = :db2GeneratedRowidForLobs")})
public class Messages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MSG_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgId;
    @Basic(optional = false)
    @Column(name = "MSG_TEXT")
    private String msgText;
    @Basic(optional = false)
    @Column(name = "MSG_TITLE")
    private String msgTitle;
    @Basic(optional = false)
    @Column(name = "MSG_TYP")
    private String msgTyp;
    @Basic(optional = false)
    @Column(name = "MSG_STA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgSta;
    @Basic(optional = false)
    @Column(name = "MSG_STP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date msgStp;
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
    @Lob
    @Column(name = "MSG_IMAGE")
    private Serializable msgImage;
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public Messages() {
    }

    public Messages(Date msgId) {
        this.msgId = msgId;
    }

    public Messages(Date msgId, String msgText, String msgTitle, String msgTyp, Date msgSta, Date msgStp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.msgId = msgId;
        this.msgText = msgText;
        this.msgTitle = msgTitle;
        this.msgTyp = msgTyp;
        this.msgSta = msgSta;
        this.msgStp = msgStp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Date getMsgId() {
        return msgId;
    }

    public void setMsgId(Date msgId) {
        this.msgId = msgId;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgTyp() {
        return msgTyp;
    }

    public void setMsgTyp(String msgTyp) {
        this.msgTyp = msgTyp;
    }

    public Date getMsgSta() {
        return msgSta;
    }

    public void setMsgSta(Date msgSta) {
        this.msgSta = msgSta;
    }

    public Date getMsgStp() {
        return msgStp;
    }

    public void setMsgStp(Date msgStp) {
        this.msgStp = msgStp;
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

    public Serializable getMsgImage() {
        return msgImage;
    }

    public void setMsgImage(Serializable msgImage) {
        this.msgImage = msgImage;
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
        hash += (msgId != null ? msgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messages)) {
            return false;
        }
        Messages other = (Messages) object;
        if ((this.msgId == null && other.msgId != null) || (this.msgId != null && !this.msgId.equals(other.msgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Messages[ msgId=" + msgId + " ]";
    }
    
}
