package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * This class represents an Employee entity that will be sorted by its
 * "natural order," defined to be by empID.
 * 
 * @author jlombardo
 */
public class Employee implements Comparable <Employee> {
    private int empID;
    private String lastName;
    private String firstName;
    private String ssn;
    private Object e;


    public Employee() {
    }

    public Employee(int empID, String lastName, String firstName, String ssn) {
        this.empID = empID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empID = empID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empID != other.empID) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.empID;
        return hash;
    }


     public int compareTo(Employee other) {
        
//    //  Employee o = (Employee)other;
//   
         // bring in third party library.
      return new CompareToBuilder()
             .append(this.ssn, other.ssn)
             .toComparison();
      
////        // NO Magic numbers! Use constants for readability!
//        final int BEFORE = -1;
//	final int EQUAL = 0;
//	final int AFTER = 1;
//
//    //    Employee e = (Employee)other;
//
//        if(this.equals(other)) return EQUAL;
//
//  //      if(this.empID < e.empID) return BEFORE;
//  //      if(this.empID > e.empID) return AFTER;
//
//     //  The String class already has a compareTo implementation, so
//     //  just use that.
//        int comparison = this.ssn.compareTo(e.getSsn());
//        if( comparison != EQUAL) return comparison;
//
//        return EQUAL; // default
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) throws IllegalArgumentException {
            if(value == null || value.length() == 0) {
                    throw new IllegalArgumentException("value cannot be null or zero length");
            }
            firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpID(int id) {
        this.empID = id;
    }

    public int getEmpID() {
        return empID;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

}
