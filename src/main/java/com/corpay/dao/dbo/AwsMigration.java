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
@Table(name = "AWS_MIGRATION", catalog = "", schema = "DBO")
public class AwsMigration implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AwsMigrationPK awsMigrationPK;
    @Basic(optional = false)
    @Column(name = "AWSM_INC_EXC_CD")
    private Character awsmIncExcCd;
    @Basic(optional = false)
    @Column(name = "AWSM_MIGR_TYP")
    private Character awsmMigrTyp;
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

    public AwsMigration() {
    }

    public AwsMigration(AwsMigrationPK awsMigrationPK) {
        this.awsMigrationPK = awsMigrationPK;
    }

    public AwsMigration(AwsMigrationPK awsMigrationPK, Character awsmIncExcCd, Character awsmMigrTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.awsMigrationPK = awsMigrationPK;
        this.awsmIncExcCd = awsmIncExcCd;
        this.awsmMigrTyp = awsmMigrTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AwsMigration(String awsmSvcCd, Character awsmRecdTyp, String awsmValue) {
        this.awsMigrationPK = new AwsMigrationPK(awsmSvcCd, awsmRecdTyp, awsmValue);
    }

    public AwsMigrationPK getAwsMigrationPK() {
        return awsMigrationPK;
    }

    public void setAwsMigrationPK(AwsMigrationPK awsMigrationPK) {
        this.awsMigrationPK = awsMigrationPK;
    }

    public Character getAwsmIncExcCd() {
        return awsmIncExcCd;
    }

    public void setAwsmIncExcCd(Character awsmIncExcCd) {
        this.awsmIncExcCd = awsmIncExcCd;
    }

    public Character getAwsmMigrTyp() {
        return awsmMigrTyp;
    }

    public void setAwsmMigrTyp(Character awsmMigrTyp) {
        this.awsmMigrTyp = awsmMigrTyp;
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
        hash += (awsMigrationPK != null ? awsMigrationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AwsMigration)) {
            return false;
        }
        AwsMigration other = (AwsMigration) object;
        if ((this.awsMigrationPK == null && other.awsMigrationPK != null) || (this.awsMigrationPK != null && !this.awsMigrationPK.equals(other.awsMigrationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AwsMigration[ awsMigrationPK=" + awsMigrationPK + " ]";
    }

}
