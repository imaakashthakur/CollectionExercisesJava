package collectiondemo.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private static String collegeName = "SRM";
    private String address;
    private String contactNo;

    public Student(int id, String firstName, String lastName, String address, String contactNo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}' + "\n";
    }
}