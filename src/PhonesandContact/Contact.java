package PhonesandContact;

import java.util.ArrayList;

public class Contact {
    private int contactId;
    private String name;
    private boolean isFreqContact;
    ArrayList <Phone> phoneArray;
    public Contact(int contactId,String name){
        this.contactId = contactId;
        this.name = name;
        phoneArray = new ArrayList<Phone>(3);
    }
    public ArrayList getPhoneArray() {
        return phoneArray;
    }
    public void addPhonetoContact(Phone aPhone){
        phoneArray.add(aPhone);
        aPhone.setaContact(this);
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
