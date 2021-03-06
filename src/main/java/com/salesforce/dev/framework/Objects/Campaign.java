package com.salesforce.dev.framework.Objects;

/**
 * Created by Veronica Prado on 8/27/2015.
 */
public class Campaign {
    private String campaignName;
    private String campaignType;
    private String campaignStatus;
    private String startDate;
    private String endDate;
    private String expectedRevenue;
    private String budgetedCost;
    private String actualCost;
    private String expectedResponse;
    private String numSent;
    private String parentCampaign;
    public Campaign(){}

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setExpectedRevenue(String expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public void setBudgetedCost(String budgetedCost) {
        this.budgetedCost = budgetedCost;
    }

    public void setActualCost(String actualCost) {
        this.actualCost = actualCost;
    }

    public void setExpectedResponse(String expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    public void setNumSent(String numSent) {
        this.numSent = numSent;
    }

    public void setParentCampaign(String parentCampaign) {
        this.parentCampaign = parentCampaign;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getCampaignType() {
        return campaignType;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getExpectedRevenue() {
        return expectedRevenue;
    }

    public String getBudgetedCost() {
        return budgetedCost;
    }

    public String getActualCost() {
        return actualCost;
    }

    public String getExpectedResponse() {
        return expectedResponse;
    }

    public String getNumSent() {
        return numSent;
    }

    public String getParentCampaign() {
        return parentCampaign;
    }
}
