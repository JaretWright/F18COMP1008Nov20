package f18comp1008nov20;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author jwright
 */
public class Student {
    private int studentNum;
    private String firstName, lastName, gender;
    private LocalDate birthday;

    public Student(int studentNum, String firstName, String lastName, String gender, LocalDate birthday) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setBirthday(birthday);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if (studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student # must be greater than 0");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must start with an upper case letter");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.matches("[A-Z][a-z]*"))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must start with an upper case letter");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") ||
                gender.equalsIgnoreCase("female") ||
                gender.equalsIgnoreCase("other"))
            this.gender = gender;
        else
            throw new IllegalArgumentException("Gender must be male, female or other");
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    /**
     * This method returns the age based on the birthday passed in as an argument
     * @param birthday 
     */
    private int getAge(LocalDate birthday)
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }
    
    public int getAge()
    {
        return getAge(birthday); 
    }
    
    /**
     * This method validates that the Student is 4-105 years old and sets the
     * birthday instance variable
     * @param birthday - a LocalDate object describing the date the Student was born
     */
    public void setBirthday(LocalDate birthday) {
        int age = getAge(birthday);
        if (age >= 4 && age <= 105)
            this.birthday = birthday;
        else throw new IllegalArgumentException("student must be 4-105 years old");
    }
    
}
