class House {
    private Address address;
    private Owner owner;

    public House(Address address, Owner owner) {
        this.address = address;
        this.owner = owner;
    }

    public Address getAddress() {
        return address;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "House located at " + address + ", owned by " + owner;
    }
}