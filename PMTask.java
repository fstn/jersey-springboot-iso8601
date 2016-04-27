package com.itesoft.pm.rest.data.pm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "PMTask")
@Table(name = "PMTASK")
public class PMTask implements Serializable {

  private static final long serialVersionUID = -4610929284477021204L;

  @EmbeddedId
  @JsonProperty("key")
  private PMTaskPK key;

  @Column(name = "STARTDATE")
  @Temporal(TemporalType.DATE)
  @JsonProperty("startdate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar startDate;

  @Column(name = "ENDDATE")
  @Temporal(TemporalType.DATE)
  @JsonProperty("enddate")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar endDate;

  @MapsId("senderId")
  @OneToOne
  @JoinColumn(name = "SENDERID")
  @JsonProperty("sender")
  private PMSender sender;

  @OneToOne
  @JoinColumn(name = "ORGANISATIONID")
  @JsonProperty("organisation")
  private PMOrganisation organisation;

  // Actual OWNER
  @OneToOne
  @JoinColumn(name = "RESOURCEID")
  @JsonProperty("actualOwner")
  private PMResource actualOwner;

  // PO list
  @OneToMany
  @JsonProperty("potentialOwners")
  @JoinTable(name = "PMASSIGNED", joinColumns = {
      @JoinColumn(name = "TASKKEY", referencedColumnName = "TASKKEY", nullable = false, updatable = false),
      @JoinColumn(name = "SENDERID", referencedColumnName = "SENDERID", nullable = false, updatable = false) })
  private final List<PMAssigned> potentialOwners = new ArrayList<PMAssigned>();

  @OneToOne
  @JoinColumn(name = "ACTIVITYID")
  @JsonProperty("activity")
  private PMActivity activity;

  @Column(name = "PRIORITY")
  @JsonProperty("priority")
  private int priority;

  @Column(name = "STATUSPM")
  @JsonProperty("status")
  private String status;

  @Column(name = "STRVAL01")
  @JsonProperty("strval01")
  private String strval01;

  @Column(name = "STRVAL02")
  @JsonProperty("strval02")
  private String strval02;

  @Column(name = "STRVAL03")
  @JsonProperty("strval03")
  private String strval03;

  @Column(name = "STRVAL04")
  @JsonProperty("strval04")
  private String strval04;

  @Column(name = "STRVAL05")
  @JsonProperty("strval05")
  private String strval05;

  @Column(name = "STRVAL06")
  @JsonProperty("strval06")
  private String strval06;

  @Column(name = "STRVAL07")
  @JsonProperty("strval07")
  private String strval07;

  @Column(name = "STRVAL08")
  @JsonProperty("strval08")
  private String strval08;

  @Column(name = "STRVAL09")
  @JsonProperty("strval09")
  private String strval09;

  @Column(name = "STRVAL10")
  @JsonProperty("strval10")
  private String strval10;

  @Column(name = "BOOLVAL01")
  @JsonProperty("boolval01")
  private Boolean boolval01;

  @Column(name = "BOOLVAL02")
  @JsonProperty("boolval02")
  private Boolean boolval02;

  @Column(name = "BOOLVAL03")
  @JsonProperty("boolval03")
  private Boolean boolval03;

  @Column(name = "BOOLVAL04")
  @JsonProperty("boolval04")
  private Boolean boolval04;

  @Column(name = "BOOLVAL05")
  @JsonProperty("boolval05")
  private Boolean boolval05;

  @Column(name = "BOOLVAL06")
  @JsonProperty("boolval06")
  private Boolean boolval06;

  @Column(name = "BOOLVAL07")
  @JsonProperty("boolval07")
  private Boolean boolval07;

  @Column(name = "BOOLVAL08")
  @JsonProperty("boolval08")
  private Boolean boolval08;

  @Column(name = "BOOLVAL09")
  @JsonProperty("boolval09")
  private Boolean boolval09;

  @Column(name = "BOOLVAL10")
  @JsonProperty("boolval10")
  private Boolean boolval10;

  @Column(name = "INTVAL01")
  @JsonProperty("intval01")
  private Boolean intval01;

  @Column(name = "INTVAL02")
  @JsonProperty("intval02")
  private Boolean intval02;

  @Column(name = "INTVAL03")
  @JsonProperty("intval03")
  private Boolean intval03;

  @Column(name = "INTVAL04")
  @JsonProperty("intval04")
  private Boolean intval04;

  @Column(name = "INTVAL05")
  @JsonProperty("intval05")
  private Boolean intval05;

  @Column(name = "INTVAL06")
  @JsonProperty("intval06")
  private Boolean intval06;

  @Column(name = "INTVAL07")
  @JsonProperty("intval07")
  private Boolean intval07;

  @Column(name = "INTVAL08")
  @JsonProperty("intval08")
  private Boolean intval08;

  @Column(name = "INTVAL09")
  @JsonProperty("intval09")
  private Boolean intval09;

  @Column(name = "INTVAL10")
  @JsonProperty("intval10")
  private Boolean intval10;

  @Column(name = "DECVAL01")
  @JsonProperty("decval01")
  private float decval01;

  @Column(name = "DECVAL02")
  @JsonProperty("decval02")
  private float decval02;

  @Column(name = "DECVAL03")
  @JsonProperty("decval03")
  private float decval03;

  @Column(name = "DECVAL04")
  @JsonProperty("decval04")
  private float decval04;

  @Column(name = "DECVAL05")
  @JsonProperty("decval05")
  private float decval05;

  @Column(name = "DECVAL06")
  @JsonProperty("decval06")
  private float decval06;

  @Column(name = "DECVAL07")
  @JsonProperty("decval07")
  private float decval07;

  @Column(name = "DECVAL08")
  @JsonProperty("decval08")
  private float decval08;

  @Column(name = "DECVAL09")
  @JsonProperty("decval09")
  private float decval09;

  @Column(name = "DECVAL10")
  @JsonProperty("decval10")
  private float decval10;

  @Column(name = "DATVAL01")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval01")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval01;

  @Column(name = "DATVAL02")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval02")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval02;

  @Column(name = "DATVAL03")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval03")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval03;

  @Column(name = "DATVAL04")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval04")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval04;

  @Column(name = "DATVAL05")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval05")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval05;

  @Column(name = "DATVAL06")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval06")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval06;

  @Column(name = "DATVAL07")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval07")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval07;

  @Column(name = "DATVAL08")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval08")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval08;

  @Column(name = "DATVAL09")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval09")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval09;

  @Column(name = "DATVAL10")
  @Temporal(TemporalType.DATE)
  @JsonProperty("datval10")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
  private Calendar datval10;

  public PMTask() {
  }

  public String getTaskKey() {
    return key.getTaskKey();
  }

  public void setTaskKey(String taskKey) {
    this.key.setTaskKey(taskKey);
  }

  public Calendar getStartDate() {
    return startDate;
  }

  public void setStartDate(Calendar startDate) {
    this.startDate = startDate;
  }

  public String getStrVal01() {
    return strval01;
  }

  public void setStrVal01(String strVal01) {
    this.strval01 = strVal01;
  }

  public String getStrVal02() {
    return strval02;
  }

  public void setStrVal02(String strVal02) {
    this.strval02 = strVal02;
  }

  public PMSender getSender() {
    return sender;
  }

  public void setSender(PMSender _sender) {
    this.sender = _sender;
  }

  public PMResource getResource() {
    return actualOwner;
  }

  public String getResourceName() {
    String owner = "";
    if (actualOwner != null) {
      owner = actualOwner.getResourceKey();
    }
    return owner;
  }

  public String getResourceKeyName() {
    String owner = "";
    if (actualOwner != null) {
      owner = actualOwner.getResourceId() + ":" + actualOwner.getResourceKey();
    }
    return owner;
  }

  public void setResource(PMResource resource) {
    this.actualOwner = resource;
  }

  public PMActivity getActivity() {
    return activity;
  }

  public String getActivityName() {
    return activity.getActivityName();
  }

  public void setActivity(PMActivity activity) {
    this.activity = activity;
  }

  public String getProcess() {
    return activity.getProcess().getProcessName();
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public PMOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(PMOrganisation organisation) {
    this.organisation = organisation;
  }

  public String getStrVal03() {
    return strval03;
  }

  public void setStrVal03(String strval03) {
    this.strval03 = strval03;
  }

  public String getStrVal04() {
    return strval04;
  }

  public void setStrVal04(String strval04) {
    this.strval04 = strval04;
  }

  public String getStrVal05() {
    return strval05;
  }

  public void setStrVal05(String strval05) {
    this.strval05 = strval05;
  }

  public String getStrVal06() {
    return strval06;
  }

  public void setStrVal06(String strval06) {
    this.strval06 = strval06;
  }

  public String getStrVal07() {
    return strval07;
  }

  public void setStrVal07(String strval07) {
    this.strval07 = strval07;
  }

  public String getStrVal08() {
    return strval08;
  }

  public void setStrVal08(String strval08) {
    this.strval08 = strval08;
  }

  public String getStrVal09() {
    return strval09;
  }

  public void setStrVal09(String strval09) {
    this.strval09 = strval09;
  }

  public String getStrVal10() {
    return strval10;
  }

  public void setStrVal10(String strval10) {
    this.strval10 = strval10;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Boolean getBoolval01() {
    return boolval01;
  }

  public void setBoolval01(Boolean boolval01) {
    this.boolval01 = boolval01;
  }

  public Boolean getBoolval02() {
    return boolval02;
  }

  public void setBoolval02(Boolean boolval02) {
    this.boolval02 = boolval02;
  }

  public Boolean getBoolval03() {
    return boolval03;
  }

  public void setBoolval03(Boolean boolval03) {
    this.boolval03 = boolval03;
  }

  public Boolean getBoolval04() {
    return boolval04;
  }

  public void setBoolval04(Boolean boolval04) {
    this.boolval04 = boolval04;
  }

  public Boolean getBoolval05() {
    return boolval05;
  }

  public void setBoolval05(Boolean boolval05) {
    this.boolval05 = boolval05;
  }

  public Boolean getBoolval06() {
    return boolval06;
  }

  public void setBoolval06(Boolean boolval06) {
    this.boolval06 = boolval06;
  }

  public Boolean getBoolval07() {
    return boolval07;
  }

  public void setBoolval07(Boolean boolval07) {
    this.boolval07 = boolval07;
  }

  public Boolean getBoolval08() {
    return boolval08;
  }

  public void setBoolval08(Boolean boolval08) {
    this.boolval08 = boolval08;
  }

  public Boolean getBoolval09() {
    return boolval09;
  }

  public void setBoolval09(Boolean boolval09) {
    this.boolval09 = boolval09;
  }

  public Boolean getBoolval10() {
    return boolval10;
  }

  public void setBoolval10(Boolean boolval10) {
    this.boolval10 = boolval10;
  }

  public Boolean getIntval01() {
    return intval01;
  }

  public void setIntval01(Boolean intval01) {
    this.intval01 = intval01;
  }

  public Boolean getIntval02() {
    return intval02;
  }

  public void setIntval02(Boolean intval02) {
    this.intval02 = intval02;
  }

  public Boolean getIntval03() {
    return intval03;
  }

  public void setIntval03(Boolean intval03) {
    this.intval03 = intval03;
  }

  public Boolean getIntval04() {
    return intval04;
  }

  public void setIntval04(Boolean intval04) {
    this.intval04 = intval04;
  }

  public Boolean getIntval05() {
    return intval05;
  }

  public void setIntval05(Boolean intval05) {
    this.intval05 = intval05;
  }

  public Boolean getIntval06() {
    return intval06;
  }

  public void setIntval06(Boolean intval06) {
    this.intval06 = intval06;
  }

  public Boolean getIntval07() {
    return intval07;
  }

  public void setIntval07(Boolean intval07) {
    this.intval07 = intval07;
  }

  public Boolean getIntval08() {
    return intval08;
  }

  public void setIntval08(Boolean intval08) {
    this.intval08 = intval08;
  }

  public Boolean getIntval09() {
    return intval09;
  }

  public void setIntval09(Boolean intval09) {
    this.intval09 = intval09;
  }

  public Boolean getIntval10() {
    return intval10;
  }

  public void setIntval10(Boolean intval10) {
    this.intval10 = intval10;
  }

  public Calendar getDatval01() {
    return datval01;
  }

  public void setDatval01(Calendar datval01) {
    this.datval01 = datval01;
  }

  public Calendar getDatval02() {
    return datval02;
  }

  public void setDatval02(Calendar datval02) {
    this.datval02 = datval02;
  }

  public Calendar getDatval03() {
    return datval03;
  }

  public void setDatval03(Calendar datval03) {
    this.datval03 = datval03;
  }

  public Calendar getDatval04() {
    return datval04;
  }

  public void setDatval04(Calendar datval04) {
    this.datval04 = datval04;
  }

  public Calendar getDatval05() {
    return datval05;
  }

  public void setDatval05(Calendar datval05) {
    this.datval05 = datval05;
  }

  public Calendar getDatval06() {
    return datval06;
  }

  public void setDatval06(Calendar datval06) {
    this.datval06 = datval06;
  }

  public Calendar getDatval07() {
    return datval07;
  }

  public void setDatval07(Calendar datval07) {
    this.datval07 = datval07;
  }

  public Calendar getDatval08() {
    return datval08;
  }

  public void setDatval08(Calendar datval08) {
    this.datval08 = datval08;
  }

  public Calendar getDatval09() {
    return datval09;
  }

  public void setDatval09(Calendar datval09) {
    this.datval09 = datval09;
  }

  public Calendar getDatval10() {
    return datval10;
  }

  public void setDatval10(Calendar datval10) {
    this.datval10 = datval10;
  }

  public Calendar getEndDate() {
    return endDate;
  }

  public void setEndDate(Calendar endDate) {
    this.endDate = endDate;
  }

  public List<PMAssigned> getPotentialOwners() {
    return potentialOwners;
  }

  public String getPotentialOwnersToString() {
    String result = "";
    int cmpt = 1;
    for (PMAssigned pmAssigned : getPotentialOwners()) {
      result += pmAssigned.getResource().getResourceKey();
      if (cmpt < getPotentialOwners().size())
        result += ",";
    }
    return result;
  }

  public float getDecval01() {
    return decval01;
  }

  public void setDecval01(float decval01) {
    this.decval01 = decval01;
  }

  public float getDecval02() {
    return decval02;
  }

  public void setDecval02(float decval02) {
    this.decval02 = decval02;
  }

  public float getDecval03() {
    return decval03;
  }

  public void setDecval03(float decval03) {
    this.decval03 = decval03;
  }

  public float getDecval04() {
    return decval04;
  }

  public void setDecval04(float decval04) {
    this.decval04 = decval04;
  }

  public float getDecval05() {
    return decval05;
  }

  public void setDecval05(float decval05) {
    this.decval05 = decval05;
  }

  public float getDecval06() {
    return decval06;
  }

  public void setDecval06(float decval06) {
    this.decval06 = decval06;
  }

  public float getDecval07() {
    return decval07;
  }

  public void setDecval07(float decval07) {
    this.decval07 = decval07;
  }

  public float getDecval08() {
    return decval08;
  }

  public void setDecval08(float decval08) {
    this.decval08 = decval08;
  }

  public float getDecval09() {
    return decval09;
  }

  public void setDecval09(float decval09) {
    this.decval09 = decval09;
  }

  public String getOrganisationLevel1() {
    return this.organisation.getOrganisationKey1();
  }

  public String getOrganisationLevel2() {
    return this.organisation.getOrganisationKey2();
  }

  public String getOrganisationLevel3() {
    return this.organisation.getOrganisationKey3();
  }

  public String getOrganisationLevel4() {
    return this.organisation.getOrganisationKey4();
  }

}
