/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "MC_HELP", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McHelp.findAll", query = "SELECT m FROM McHelp m"),
    @NamedQuery(name = "McHelp.findByU0000FieldNr", query = "SELECT m FROM McHelp m WHERE m.mcHelpPK.u0000FieldNr = :u0000FieldNr"),
    @NamedQuery(name = "McHelp.findByU0001FieldType", query = "SELECT m FROM McHelp m WHERE m.mcHelpPK.u0001FieldType = :u0001FieldType"),
    @NamedQuery(name = "McHelp.findByU0002FieldDesc", query = "SELECT m FROM McHelp m WHERE m.mcHelpPK.u0002FieldDesc = :u0002FieldDesc")})
public class McHelp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McHelpPK mcHelpPK;

    public McHelp() {
    }

    public McHelp(McHelpPK mcHelpPK) {
        this.mcHelpPK = mcHelpPK;
    }

    public McHelp(int u0000FieldNr, Character u0001FieldType, String u0002FieldDesc) {
        this.mcHelpPK = new McHelpPK(u0000FieldNr, u0001FieldType, u0002FieldDesc);
    }

    public McHelpPK getMcHelpPK() {
        return mcHelpPK;
    }

    public void setMcHelpPK(McHelpPK mcHelpPK) {
        this.mcHelpPK = mcHelpPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcHelpPK != null ? mcHelpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McHelp)) {
            return false;
        }
        McHelp other = (McHelp) object;
        if ((this.mcHelpPK == null && other.mcHelpPK != null) || (this.mcHelpPK != null && !this.mcHelpPK.equals(other.mcHelpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McHelp[ mcHelpPK=" + mcHelpPK + " ]";
    }
    
}
