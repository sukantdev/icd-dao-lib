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
public class AwsMigrationPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AWSM_SVC_CD")
    private String awsmSvcCd;
    @Basic(optional = false)
    @Column(name = "AWSM_RECD_TYP")
    private Character awsmRecdTyp;
    @Basic(optional = false)
    @Column(name = "AWSM_VALUE")
    private String awsmValue;

    public AwsMigrationPK() {
    }

    public AwsMigrationPK(String awsmSvcCd, Character awsmRecdTyp, String awsmValue) {
        this.awsmSvcCd = awsmSvcCd;
        this.awsmRecdTyp = awsmRecdTyp;
        this.awsmValue = awsmValue;
    }

    public String getAwsmSvcCd() {
        return awsmSvcCd;
    }

    public void setAwsmSvcCd(String awsmSvcCd) {
        this.awsmSvcCd = awsmSvcCd;
    }

    public Character getAwsmRecdTyp() {
        return awsmRecdTyp;
    }

    public void setAwsmRecdTyp(Character awsmRecdTyp) {
        this.awsmRecdTyp = awsmRecdTyp;
    }

    public String getAwsmValue() {
        return awsmValue;
    }

    public void setAwsmValue(String awsmValue) {
        this.awsmValue = awsmValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (awsmSvcCd != null ? awsmSvcCd.hashCode() : 0);
        hash += (awsmRecdTyp != null ? awsmRecdTyp.hashCode() : 0);
        hash += (awsmValue != null ? awsmValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AwsMigrationPK)) {
            return false;
        }
        AwsMigrationPK other = (AwsMigrationPK) object;
        if ((this.awsmSvcCd == null && other.awsmSvcCd != null) || (this.awsmSvcCd != null && !this.awsmSvcCd.equals(other.awsmSvcCd))) {
            return false;
        }
        if ((this.awsmRecdTyp == null && other.awsmRecdTyp != null) || (this.awsmRecdTyp != null && !this.awsmRecdTyp.equals(other.awsmRecdTyp))) {
            return false;
        }
        if ((this.awsmValue == null && other.awsmValue != null) || (this.awsmValue != null && !this.awsmValue.equals(other.awsmValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AwsMigrationPK[ awsmSvcCd=" + awsmSvcCd + ", awsmRecdTyp=" + awsmRecdTyp + ", awsmValue=" + awsmValue + " ]";
    }
    
}
