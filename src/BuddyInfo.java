public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // 3-argument constructor
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Default constructor
    public BuddyInfo() {
        this("Unknown", "Unknown", "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}