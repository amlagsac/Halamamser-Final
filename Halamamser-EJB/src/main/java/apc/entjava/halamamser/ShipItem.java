package apc.entjava.halamamser;

import javax.persistence.*;

@Entity
@Table(name="ship")
public class ShipItem{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long itemId;

    @Column(name="first name")
    private String firstName;

    @Column(name="middle name")
    private String middleName;

    @Column(name="last name")
    private String lastName;

    @Column(name="house number")
    private String houseNum;

    @Column(name="house street")
    private String houseStreet;

    @Column(name="barangay")
    private String barangay;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    @Column(name="zip code")
    private String zipCode;

    @Column(name="dob")
    private String dob;

    @Column(name="email")
    private String email;

    @Column(name="contact number")
    private String contactNum;

    public ShipItem() {
    }

    public ShipItem(
            String firstName,
            String middleName,
            String lastName,
            String houseNum,
            String houseStreet,
            String barangay,
            String city,
            String country,
            String zipCode,
            String dob,
            String email,
            String contactNum
            ) {
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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getHouseStreet() {
        return houseStreet;
    }

    public void setHouseStreet(String houseStreet) {
        this.houseStreet = houseStreet;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }


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