/* Ελευθέριος Ελευθεριάδης- Π2017166 */

import java.util.ArrayList;
import java.util.Set;

public class MultivalueContacts extends Contact implements Comparable {
	
	public MultivalueContacts(){}
	public MultivalueContacts(String n,long p) {
		this.fullname = n;
		this.phonenumber = p;
	}
	public MultivalueContacts(String n, String e) {
		this.fullname = n;
		this.email = e;
	}
	public MultivalueContacts(String n, long t, String e) {
		this.fullname = n;
		this.phonenumber = t;
		this.email = e;
	}
	
	private ArrayList<Long> phonenumbers = new ArrayList<Long>();
	private ArrayList<String> emails = new Arraylist<String>();
	/* addPhonenumbers takes a long and if it is a valid phonenumber, adds it to the phonenumbers list phonenumbers.
	 */
	public void addPhonenumber (long num) {
		if(num >= 2000000000L && num <= 9999999999L) 
			this.phonenumbers.add(num);	
		else 
            System.out.println("Invalid phone number "+p);
	}
	/* addEmail is mostly taken from the Contact.java class (as is the addPhonenumber) it checks if the given String is a valid email string, and if so, adds it to the emails list emails.
	 */
	public void addEmail (String mail) {
		if ( !mail.contains("@") ) {
            System.out.println("Invalid email "+mail+": no @");
        }
        else if ( !mail.contains(".") ) {
            System.out.println("Invalid email "+mail+": no .");
        }
        else if ( mail.contains("@.") ) {
            System.out.println("Invalid email "+mail+": @.");
        }
        else if ( mail.indexOf("@")+1 > e.indexOf(".") ) {
            System.out.println("Invalid email "+mail+": @.");
        }
        else if ( mail.endsWith(".") ) {
            System.out.println("Invalid email "+mail+": ends with .");
        }
        else if ( mail.startsWith("@") ) {
            System.out.println("Invalid email "+mail+": starts with @");
        }
        else {
            this.emails.add(mail);
        }
	}
	
	Set<long> phonenumsSet = new Set<Long>;
	/* getPhonenumbers passes ALL the phonenumbers to a Set phonenumsSet, and returns the set phonenumsSet.
	 */
	public Set <Long> getPhonenumbers() {
		if(size(this.phonenumsSet)==0)
			this.phonenumsSet.add(getPhonenumber);
		for (long n : this.phonenumbers) {
			this.phonenumsSet.add(n);
		}
		return this.phonenumsSet;
	}
	
	Set<String> emailsSet = new Set<String>;
	/* Exact same logic as the last one, but returns a String Set with all the emails.
	 */
	public Set <String> getEmails() {
		if(size(this.emailsSet)==0)
			this.emailsSet.add(getEmail);
		for(String s : this.emails) {
			this.emailsSet.add(s);
		}
		return this.emailsSet;
			
	}
	/* Uses the StringBuilder class to make dynamic String, and adds the fullname, initial phonenumbers and emails and all the other existing numbers and mails of this object to the StringBuilder object, makes a String from it, and returns the string..
	 */
	public String toString() {
		
		StringBuilder classString = new StringBuilder("Fullname : \t");
		classString.append(this.fullname+"\t");
		classString.append(Long.toString((size(this.phonenumbers)==0)?this.phonenumber:this.phonenumbers.get(size(this.phonenumbers - 1))));
		classString.append(" ; "+(size(this.emails)==0)?this.email:this.emails.get(size(this.emails - 1))+"\n");
		classString.append("\tOther phonenumbers :\t");
		for (int i=0; i<size(this.phonenumbers)-1 ; i++) {
			classString.append(Long.toString(this.phonenumbers.get(i))+" ; ");
		}
		classString.append("\n\tOther emails :\t");
		for (int i=0; i<size(this.emails)-1 ; i++) {
			classString.append(this.emails.get(i)+" ; ");
		}
		String contString = StringBuilder.toString(classString);
		return contString ;
	}	
	/* compareTo method of this class takes an MultivalueContacts object and compares its fullname variable to the object's that is calling the method fullname variable. For the actual comparsion it uses the compareTo method of the String class, and depending of the int value it returns, our method returns a String that says wheather the name that is calling the method comes before or after, or its exactly the same with the fullname variable of the given object.
	 */
	public String compareTo(MultivalueContacts a) {
		(this.fullname.compareTo(a.fullname)<0)? return ("The name "+this.fullname+"is after the name "+a+"."):(this.fullname.compareTo(a.fullname)>0)?return ("The name "+this.fullname+"is before the name "+a+"."): return "The names are exactly the same." ;
	}
}
