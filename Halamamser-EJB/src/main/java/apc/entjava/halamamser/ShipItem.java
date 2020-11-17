package apc.entjava.halamamser;

//Initialization of imports
import javax.persistence.*;

//Declaration for JPA and Table Name
@Entity
@Table(name="ship")
public class ShipItem{

    //Creating of Column id with auto increment
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    //Creating of Column first_name in table ship
    @Column(name="first_name")
    private String firstName;

    //Creating of Column middle_name in table ship
    @Column(name="middle_name")
    private String middleName;

    //Creating of Column last_name in table ship
    @Column(name="last_name")
    private String lastName;

    //Creating of Column house_number in table ship
    @Column(name="house_number")
    private long houseNum;

    //Creating of Column house_street in table ship
    @Column(name="house_street")
    private String houseStreet;

    //Creating of Column barangay in table ship
    @Column(name="barangay")
    private String barangay;

    //Creating of Column city in table ship
    @Column(name="city")
    private String city;

    //Creating of Column country in table ship
    @Column(name="country")
    private String country;

    //Creating of Column zip_code in table ship
    @Column(name="zip_code")
    private long zipCode;

    //Creating of Column dob or date of birth in table ship
    @Column(name="dob")
    private String dob;

    //Creating of Column email in table ship
    @Column(name="email")
    private String email;

    //Creating of Column contact_number in table ship
    @Column(name="contact_number")
    private long contactNum;

    //Creating of function CartItem with firstName, middleName, lastName, houseNum, houseStreet, barangay, city, country, zipCode, dob, contactNum, and email parameter
    public ShipItem(String firstName, String middleName, String lastName, long houseNum, String houseStreet, String barangay, String city, String country, long zipCode, String dob, long contactNum, String email) {
        super();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.houseNum = houseNum;
        this.houseStreet = houseStreet;
        this.barangay = barangay;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.dob = dob;
        this.email = email;
        this.contactNum = contactNum;
    }

    public ShipItem() {
    }

    //Getter for itemId
    public Long getItemId() {
        return itemId;
    }

    //Setter for itemId
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    //Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    //Setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter for middleName
    public String getMiddleName() {
        return middleName;
    }
    //Setter for middleName
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    //Getter for lastName
    public String getLastName() {
        return lastName;
    }
    //Setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Getter for houseNum
    public Long getHouseNum() {
        return houseNum;
    }
    //Setter for houseNum
    public void setHouseNum(Long houseNum) {
        this.houseNum = houseNum;
    }
    //Getter for houseStreet
    public String getHouseStreet() {
        return houseStreet;
    }
    //Getter for houseStreet
    public void setHouseStreet(String houseStreet) {
        this.houseStreet = houseStreet;
    }
    //Getter for barangay
    public String getBarangay() {
        return barangay;
    }
    //Setter for barangay
    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }
    //Getter for city
    public String getCity() {
        return city;
    }
    //Setter for city
    public void setCity(String city) {
        this.city = city;
    }
    //Getter for country
    public String getCountry() {
        return country;
    }
    //Setter for country
    public void setCountry(String country) {
        this.country = country;
    }
    //Getter for zipCode
    public Long getZipCode() {
        return zipCode;
    }
    //Setter for zipCode
    public void setZipCode(Long zipCode) {
        this.zipCode = zipCode;
    }
    //Getter for dob
    public String getDob() {
        return dob;
    }
    //Setter for dob
    public void setDob(String dob) {
        this.dob = dob;
    }
    //Getter for email
    public String getEmail() {
        return email;
    }
    //Setter for email
    public void setEmail(String email) {
        this.email = email;
    }
    //Getter for contactNum
    public long getContactNum() {
        return contactNum;
    }
    //Setter for contactNum
    public void setContactNum(long contactNum) {
        this.contactNum = contactNum;
    }

    //Function that outputs the values in itemId, name, and price
    public String toString() {
        return "ShipItem [itemId=" + this.itemId +
                ", first name=" + this.firstName +
                ", middle name=" + this.middleName +
                ", last name=" + this.lastName +
                ", house number=" + this.houseNum +
                ", house street=" + this.houseStreet +
                ", barangay=" + this.barangay +
                ", city=" + this.city +
                ", country=" + this.lastName +
                ", zip code=" + this.zipCode +
                ", dob=" + this.dob +
                ", email=" + this.email +
                ", contact number=" + this.contactNum +
                "]";

    }

}