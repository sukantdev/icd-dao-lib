package com.corpay.dao.cxxcow;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_HELP", catalog = "", schema = "CXXCOW")
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
