package com.learning.contact_manager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name="Contact")
public class Contact {

    private String contactName;
    @Id
    private Integer mobileNumber;
    private int age;
    private String gender;
    private String emailId;

    public void setContactName(String contactName){
        this.contactName = contactName;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
