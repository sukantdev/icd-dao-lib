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
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MOTCM2", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Motcm2.findAll", query = "SELECT m FROM Motcm2 m")})
public class Motcm2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Motcm2PK motcm2PK;
    @Basic(optional = false)
    @Column(name = "GROUP_ID1")
    private String groupId1;
    @Basic(optional = false)
    @Column(name = "GROUP_ID2")
    private String groupId2;
    @Basic(optional = false)
    @Column(name = "GROUP_ID3")
    private String groupId3;
    @Basic(optional = false)
    @Column(name = "GROUP_ID4")
    private String groupId4;
    @Basic(optional = false)
    @Column(name = "GROUP_ID5")
    private String groupId5;
    @Basic(optional = false)
    @Column(name = "TNM_INDICATOR")
    private Character tnmIndicator;

    public Motcm2() {
    }

    public Motcm2(Motcm2PK motcm2PK) {
        this.motcm2PK = motcm2PK;
    }

    public Motcm2(Motcm2PK motcm2PK, String groupId1, String groupId2, String groupId3, String groupId4, String groupId5, Character tnmIndicator) {
        this.motcm2PK = motcm2PK;
        this.groupId1 = groupId1;
        this.groupId2 = groupId2;
        this.groupId3 = groupId3;
        this.groupId4 = groupId4;
        this.groupId5 = groupId5;
        this.tnmIndicator = tnmIndicator;
    }

    public Motcm2(String accountCode, String system, String rptno) {
        this.motcm2PK = new Motcm2PK(accountCode, system, rptno);
    }

    public Motcm2PK getMotcm2PK() {
        return motcm2PK;
    }

    public void setMotcm2PK(Motcm2PK motcm2PK) {
        this.motcm2PK = motcm2PK;
    }

    public String getGroupId1() {
        return groupId1;
    }

    public void setGroupId1(String groupId1) {
        this.groupId1 = groupId1;
    }

    public String getGroupId2() {
        return groupId2;
    }

    public void setGroupId2(String groupId2) {
        this.groupId2 = groupId2;
    }

    public String getGroupId3() {
        return groupId3;
    }

    public void setGroupId3(String groupId3) {
        this.groupId3 = groupId3;
    }

    public String getGroupId4() {
        return groupId4;
    }

    public void setGroupId4(String groupId4) {
        this.groupId4 = groupId4;
    }

    public String getGroupId5() {
        return groupId5;
    }

    public void setGroupId5(String groupId5) {
        this.groupId5 = groupId5;
    }

    public Character getTnmIndicator() {
        return tnmIndicator;
    }

    public void setTnmIndicator(Character tnmIndicator) {
        this.tnmIndicator = tnmIndicator;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motcm2PK != null ? motcm2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motcm2)) {
            return false;
        }
        Motcm2 other = (Motcm2) object;
        if ((this.motcm2PK == null && other.motcm2PK != null) || (this.motcm2PK != null && !this.motcm2PK.equals(other.motcm2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Motcm2[ motcm2PK=" + motcm2PK + " ]";
    }
    
}
