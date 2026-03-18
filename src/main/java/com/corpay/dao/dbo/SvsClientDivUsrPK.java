package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SvsClientDivUsrPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CLIENT_ID")
    private String clientId;
    @Basic(optional = false)
    @Column(name = "DIV")
    private String div;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;

    public SvsClientDivUsrPK() {
    }

    public SvsClientDivUsrPK(String clientId, String div, String usrId) {
        this.clientId = clientId;
        this.div = div;
        this.usrId = usrId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientId != null ? clientId.hashCode() : 0);
        hash += (div != null ? div.hashCode() : 0);
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SvsClientDivUsrPK)) {
            return false;
        }
        SvsClientDivUsrPK other = (SvsClientDivUsrPK) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        if ((this.div == null && other.div != null) || (this.div != null && !this.div.equals(other.div))) {
            return false;
        }
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SvsClientDivUsrPK[ clientId=" + clientId + ", div=" + div + ", usrId=" + usrId + " ]";
    }

}
