/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Set;
public class Library extends Building {
  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
      if (!collection.containsKey(title)) {
        collection.put(title, true);
      } else {
        System.out.println(title + " is already in the collection");
      }
    }

    public String removeTitle(String title) {
      if (collection.containsKey(title)) {
        collection.remove(title);
        return title;
      } else {
        System.out.println(title + " is not in the collection");
        return null;
      }
    }

    public void checkOut(String title) {
      if (collection.containsKey(title) && collection.containsValue(true)) {
        collection.put(title, false);
      } else {
        System.out.println(title+ "is not in the collection or already checked out.");
      }
    }

    public void returnBook(String title) {
      if (collection.containsKey(title) && collection.containsValue(false)) {
        collection.put(title, true);
      } else {
        System.out.println(title+ "is not in the collection or already available.");
      }
    }

    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title) {
      return collection.containsValue(true);
    }

    public void printCollection() {
      System.out.println("Library Collection:");
      for (String title : collection.keySet()) {
        String status;
        if (collection.get(title)) {
          status = "Available";
      } else {
          status = "Checked Out";
      }
        System.out.println("Title: " + title);
        System.out.println("Availability: " + status);
      } 
    }


    public static void main(String[] args) {
      Library myLibrary = new Library("Neilson Library", "1 chapin way", 4);
    }
  }