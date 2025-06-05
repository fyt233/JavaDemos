package PhonesandContact;



public class Phone {
    private String phoneNumber;
    private String Type;
    private Contact aContact;


    public Phone(String phoneNumber,String type,Contact aContact){
        this.phoneNumber=phoneNumber;
        this.Type=type;

        setaContact(aContact);
        aContact.addPhonetoContact(this);

    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public Contact getaContact() {
        return aContact;
    }

    public void setaContact(Contact aContact) {
        this.aContact = aContact;
    }
}
