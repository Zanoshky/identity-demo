package com.mysugr.example.identitydemo.dto;

import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
public class UserCreation {

    @XmlElement
    private String email;

    @XmlElement
    private String identity;

    @XmlElement
    private String phoneNumber;

    @XmlElement
    private String password;

}

