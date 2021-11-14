package com.enteroware.Exam.model;

import javax.persistence.*;

@Entity
@Table
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean valid;
    private String format;
    private String intI_format;
    private String country_code;
    private String country_name;
    private String location;
    private String carrier;
    private String line_type;

    public PhoneNumber() {
    }

    public PhoneNumber(Long id, boolean valid, String local_format, String intI_format, String country_code, String country_name, String location, String carrier, String line_type) {
        this.id = id;
        this.valid = valid;
        this.format = local_format;
        this.intI_format = intI_format;
        this.country_code = country_code;
        this.country_name = country_name;
        this.location = location;
        this.carrier = carrier;
        this.line_type = line_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getLocal_format() {
        return format;
    }

    public void setLocal_format(String local_format) {
        this.format = local_format;
    }

    public String getIntI_format() {
        return intI_format;
    }

    public void setIntI_format(String intI_format) {
        this.intI_format = intI_format;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getLine_type() {
        return line_type;
    }

    public void setLine_type(String line_type) {
        this.line_type = line_type;
    }
}
