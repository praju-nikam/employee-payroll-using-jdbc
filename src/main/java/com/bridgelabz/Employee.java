package com.bridgelabz;
public class Employee {
    int empId;
    String empName, phoneNumber, address, empStart,gender;
    double basicPay, deductions, taxablePay, incomeTax, netPay;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        empName = empName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }


    public String getEmpStart() {
        return empStart;
    }

    public void setEmpStart(String empStart) {
        empStart = empStart;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        basicPay = basicPay;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        deductions = deductions;
    }

    public double getTaxablePay() {
        return taxablePay;
    }

    public void setTaxablePay(double taxablePay) {
        taxablePay = taxablePay;
    }


    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        netPay = netPay;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmpId=" + empId + ", EmpName='" + empName + '\'' + ", PhoneNumber='" + phoneNumber + '\''
                + ", Address='" + address + '\'' + ",  EmpStart='" + empStart
                + '\'' + ", Gender='" + gender + '\'' + ", BasicPay=" + basicPay + ", Deductions=" + deductions
                + ", TaxablePay=" + taxablePay + ", NetPay=" + netPay + '}';
    }
}
