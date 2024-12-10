package com.codinginterviewprep.corejava.oops.immutability;

import java.util.List;
import java.util.Map;

final class Employee{
    private final String empName;
    private final int age;
    private final Address address;
    private final List<String> phoneNumber;
    private final Map<String, String> metadata;

    public Employee(String empName, int age, Address address, List<String> phoneNumber, Map<String, String> metadata) {
        this.empName = empName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.metadata = metadata;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }
}
final class Address{
    private String street;
    private String city;
    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{Street: " + street + ", City: " + city + "}";
    }
}
public class ImmutabilityDemo {

}
