class student
{
    private String name;
    private int Id;
    private String address;
    //Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getters
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

public class setter {
    public static void main(String[] args) {
        student obj = new student();
        obj.setName("Afzal");
        obj.setAddress("Mal Mandro");
        obj.setId(017);

        System.out.println("ID is ::" + obj.getId());
        System.out.println("Name is ::" + obj.getName());
        System.out.println("Address is ::"+ obj.getAddress());
    }
}
