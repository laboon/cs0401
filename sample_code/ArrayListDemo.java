import java.util.ArrayList;

// Demo of ArrayList - see http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
// For the API

public class ArrayListDemo {

    public static void main(String[] args) {

	// Make a dynamically-sized array with any _class_
	// (reference variable) - can't use primitives!
	// Just like regular arrays, need to have the same type
	// throughout
	
	ArrayList<String> stringList = new ArrayList<String>();

	System.out.println(stringList.size());

	// ArrayList<KittyCat> kittyCatList = new ArrayList<KittyCat>();
	
	// Object -> Cat
	// Object -> String
	
	// ArrayList<Cat> catList = new ArrayList<Cat>();
	
	// This will not work - int is a primitive
	// ArrayList b = new ArrayList(<int>);

	// There is a way around that - wrapper classes
	// See WrapperClassDemo.java for details!

	// add items of the correct type using the add method
	stringList.add("Oberon");
	stringList.add("Titania");
	stringList.add("Puck");
	stringList.add("Peaseblossom");

	System.out.println("The Royal Court");
	for (int j=0; j < stringList.size(); j++) {
	    System.out.println(stringList.get(j)); // = array[j]
	}
	
	System.out.println("-----------------");
	// You can use a foreach here too!

	for (String fairyName : stringList) {
	    System.out.println(fairyName);
	}

	// The size will change automatically as you add or
	// remove items

	stringList.remove("Peaseblossom");
	System.out.println("Removed Peaseblossom, size of stringList is now: " + stringList.size());

	
	stringList.add("Cobweb");
	System.out.println("Added Cobweb, size of stringList is now: " + stringList.size());
	
	stringList.remove(2);


	stringList.add(0, "Bottom");
	stringList.add(0, "Bottom");
	stringList.add(0, "Duke of Athens");


	
	// boolean anyBottoms = stringList.remove("Bottom");
	// System.out.println(anyBottoms);

	// boolean anyBills = stringList.remove("Bill");
	// System.out.println(anyBills);
	
	for (String fairyName : stringList) {
	    System.out.println(fairyName);
	}

	
	while (stringList.contains("Bottom")) {
	    stringList.remove("Bottom");
	}
	
	// You can check if there are items by using .isEmpty()

	while (stringList.isEmpty() == false) {
	    String temp = stringList.remove(0);
	    System.out.println("Removed " + temp + "!");
	}

	// You can change an array to an ArrayList!

	String[] stringArray = {"Theseus", "Hippolyta", "Philostrate", "Egeus"};

	System.out.println("The Greeks");
	for (String greek : stringArray) {
	    stringList.add(greek);
	    System.out.println("Added Greek: " + greek);
	}

	// You can check if something exists in the ArrayList

	System.out.println("Theseus is a Greek: " + stringList.contains("Theseus"));
	System.out.println("Henry VIII is a Greek: " + stringList.contains("Henry VIII"));	

	// Or remove everything

	stringList.clear();
	System.out.println("The Greeks Have Perished! Size of stringList: " + stringList.size());
	
	
    }
    
}
