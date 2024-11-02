/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private Boolean hasDiningRoom;

  public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }
  public boolean hasDiningRoom() {
    return hasDiningRoom();
  }

  public int nResidents() {
    return this.residents.size();
  }

  public void moveIn(String name) {
    if (!residents.contains(name)){
      residents.add(name);
    } else {
      System.out.println(name + " is already a resident of the house");
    }
  }

  public String moveOut(String name) {
    if (residents.contains(name)){
      residents.remove(name);
      return name;
    } else {
      System.out.println(name + " is not a resident of the house yet");
      return null;
    }
  }

  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House myHouse = new House("Ziskind House", "Henshaw", 3, true);
    System.out.println(myHouse);
  }
}