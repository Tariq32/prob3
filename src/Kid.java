public class Kid
{//Create a java class named Kid the class should have the following
       // instance variables, constructor(s) and instance methods:

   /* A private instance variable of type String named name.
3 Pts_____
- A private instance variable of type String named gender.
3 Pts_____
- A private instance variable of type integer named age.*/

    private String name;
    private String gender;
    private  int age;
    //A public static integer variable named numberOfKids with an initial
    // value of 0.
    public static int numberOfKids= 0;

   /* A public default “no arg” constructor that sets the name to Jean-Marc,
    the gender to Male, and the age to 18.
            - It also increments the numberOfKids variable by 1*/
    public void Kid()
    {
        this.name= "Jean-Marc";
        this.gender="Male";
        this.age= 18;
        numberOfKids++;

    } /*An overloaded constructor that takes 3 parameters: a String for name, a
    String for gender and an integer for age, and sets the instance variables
    accordingly.
- It also increments the numberOfKids variable by 1 */

    public Kid(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        numberOfKids++;
    } //Make public Getter & Setter methods for each instance variable.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }/*A method named toString which returns a string with the details of a Kid.
    The following is an example of how the string could look:
    Name: Jean-Marc
    Gender: Male
    Age: 18*/


    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    /* 10 Pts _____
- A method named areTheyTwins which takes one class parameter of type
            Kid, and returns a boolean, the method checks if two Kids are twins, the
    method returns true if two Kids have the same age, otherwise it returns
false*/
    public boolean areTheyTwins(Kid twin){
        boolean twins;
        if (this.age == twin.age){
            twins = true;
        } else {
            twins = false;
        }
        return twins;
    }
    }

