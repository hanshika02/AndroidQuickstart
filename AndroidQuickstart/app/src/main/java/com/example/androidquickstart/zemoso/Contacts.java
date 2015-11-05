package com.example.androidquickstart.zemoso;

/**
 * Created by hanshika on 4/11/15.
 */
public class Contacts {
    private Object addresses;
    private Object emailAddresses;
    private Object names;
    private Object phones;
    private String primaryEmail;

    public Object getAddresses() {
        return addresses;
    }

    public void setAddresses(Object addresses) {
        this.addresses = addresses;
    }

    public Object getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(Object emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public Object getNames() {
        return names;
    }

    public void setNames(Object names) {
        this.names = names;
    }

    public Object getPhones() {
        return phones;
    }

    public void setPhones(Object phones) {
        this.phones = phones;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
}
