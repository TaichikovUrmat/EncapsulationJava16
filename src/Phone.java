import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private int price;
    private String phonesUserName;
    private Contact[] contacts;

    public Phone() {
    }

    public Phone(String brand, String model, int price, String phonesUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUserName = phonesUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public String getPhonesUserName() {
        return phonesUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhonesUserName(String phonesUserName) {
        this.phonesUserName = phonesUserName;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }


    public void getInfo() {
        System.out.printf("""
                brand: %s
                model: %s
                price : %d
                phonesUserName : %s
               
                """, brand, model, price, phonesUserName);
    }


    public void getContactCount() {

        getInfo();
        System.out.println("Phone : " + phonesUserName);
        for (Contact contact : contacts) {
            System.out.println("contactName : " + contact.getContactName() + " phoneNumber : " + contact.getPhoneNumber());

        }


    }


}
