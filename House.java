import java.util.ArrayList;

/**
 * Represents a House, a specific type of Building where people can reside.
 * The House keeps track of its residents and whether it has a dining room.
 *
 * Inherits common building properties from the Building superclass, such as
 * name, address, and number of floors.
 *
 * Provides methods for moving residents in and out, checking if a person is
 * a resident, and determining the number of residents and whether the house
 * has a dining room.
 */

public class House extends Building {
    private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store in the ArrayList
    private boolean hasDiningRoom;

    /**
     * Constructs a House with the specified name, address, number of floors, and
     * whether it has a dining room.
     *
     * @param name          The name of the house.
     * @param address       The address of the house.
     * @param nFloors       The number of floors in the house.
     * @param hasDiningRoom True if the house has a dining room, false otherwise.
     */
    public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.residents = new ArrayList<String>();
        this.hasDiningRoom = hasDiningRoom;
        System.out.println("You have built a house: 🏠");
    }

    /**
     * Checks if the house has a dining room.
     *
     * @return True if the house has a dining room, false otherwise.
     */
    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }

    /**
     * Returns the number of residents currently in the house.
     *
     * @return The number of residents.
     */
    public int nResidents() {
        return this.residents.size();
    }

    /**
     * Adds a resident to the house if they are not already present.
     *
     * @param name The name of the person moving in.
     */
    public void moveIn(String name) {
        if (!residents.contains(name)) {
            residents.add(name);
        } else {
            System.out.println(name + " is already a resident of the house");
        }
    }

    /**
     * Removes a resident from the house if they are present.
     *
     * @param name The name of the person moving out.
     * @return The name of the person who moved out, or null if they were not a resident.
     */
    public String moveOut(String name) {
        if (residents.contains(name)) {
            residents.remove(name);
            return name;
        } else {
            throw new RuntimeException(name + " is not a resident of the house.");
        }
    }

    /**
     * Checks if a specified person is a resident of the house.
     *
     * @param person The name of the person to check.
     * @return True if the person is a resident, false otherwise.
     */
    public boolean isResident(String person) {
        return residents.contains(person);
    }

    /**
     * Main method to demonstrate the functionality of the House class by creating
     * a House instance with specified parameters.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        House myHouse = new House("Ziskind House", "Henshaw", 3, true);
        System.out.println(myHouse);
    }
}
