package vn.edu.iuh.fit.models;

import org.springframework.data.annotation.Id;

public class Candidate {
   @Id
    private long can_id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Candidate(long can_id, String name, String email, String phone, String address) {
        this.can_id = can_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Candidate(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Candidate() {
    }

    public long getCan_id() {
        return can_id;
    }

    public void setCan_id(long can_id) {
        this.can_id = can_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "can_id=" + can_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}