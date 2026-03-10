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
public class EvCdrCostSegmentsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CDR_REQUEST_ID")
    private String cdrRequestId;
    @Basic(optional = false)
    @Column(name = "ITEM_SESSION_ID")
    private String itemSessionId;
    @Basic(optional = false)
    @Column(name = "ITEM_COST_SGMNT_TYPE")
    private String itemCostSgmntType;

    public EvCdrCostSegmentsPK() {
    }

    public EvCdrCostSegmentsPK(String cdrRequestId, String itemSessionId, String itemCostSgmntType) {
        this.cdrRequestId = cdrRequestId;
        this.itemSessionId = itemSessionId;
        this.itemCostSgmntType = itemCostSgmntType;
    }

    public String getCdrRequestId() {
        return cdrRequestId;
    }

    public void setCdrRequestId(String cdrRequestId) {
        this.cdrRequestId = cdrRequestId;
    }

    public String getItemSessionId() {
        return itemSessionId;
    }

    public void setItemSessionId(String itemSessionId) {
        this.itemSessionId = itemSessionId;
    }

    public String getItemCostSgmntType() {
        return itemCostSgmntType;
    }

    public void setItemCostSgmntType(String itemCostSgmntType) {
        this.itemCostSgmntType = itemCostSgmntType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdrRequestId != null ? cdrRequestId.hashCode() : 0);
        hash += (itemSessionId != null ? itemSessionId.hashCode() : 0);
        hash += (itemCostSgmntType != null ? itemCostSgmntType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvCdrCostSegmentsPK)) {
            return false;
        }
        EvCdrCostSegmentsPK other = (EvCdrCostSegmentsPK) object;
        if ((this.cdrRequestId == null && other.cdrRequestId != null) || (this.cdrRequestId != null && !this.cdrRequestId.equals(other.cdrRequestId))) {
            return false;
        }
        if ((this.itemSessionId == null && other.itemSessionId != null) || (this.itemSessionId != null && !this.itemSessionId.equals(other.itemSessionId))) {
            return false;
        }
        if ((this.itemCostSgmntType == null && other.itemCostSgmntType != null) || (this.itemCostSgmntType != null && !this.itemCostSgmntType.equals(other.itemCostSgmntType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EvCdrCostSegmentsPK[ cdrRequestId=" + cdrRequestId + ", itemSessionId=" + itemSessionId + ", itemCostSgmntType=" + itemCostSgmntType + " ]";
    }
    
}
