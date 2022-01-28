package com.shritech.gms.dto;

public class CustomerDTO {

    private Long custId;

    private String custName;

    private String custAddrs;

    private Long custMobNo;

    public CustomerDTO(Long custId, String custName, String custAddrs, Long custMobNo) {
        this.custId = custId;
        this.custName = custName;
        this.custAddrs = custAddrs;
        this.custMobNo = custMobNo;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddrs() {
        return custAddrs;
    }

    public void setCustAddrs(String custAddrs) {
        this.custAddrs = custAddrs;
    }

    public Long getCustMobNo() {
        return custMobNo;
    }

    public void setCustMobNo(Long custMobNo) {
        this.custMobNo = custMobNo;
    }
}
