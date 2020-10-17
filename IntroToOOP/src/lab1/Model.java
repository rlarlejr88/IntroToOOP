package lab1;

/**
 * @author Derrick Park
 */
public class Model {
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public Model() {

    }

    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName, lastName, height, weight, true, false);
    }

    public void setFirstName(String firstName) {
        if (3 <= firstName.length() && firstName.length() <= 20) {
            this.firstName = firstName;
        }
    }


    public void setLastName(String lastName) {
        if (3 <= lastName.length() && lastName.length() <= 20) {
            this.lastName = lastName;
        }
    }


    public void setHeight(int height) {
        if ((24 <= height) && (height <= 84)){
            this.height = height;
        }
    }

    public void setWeight(double weight) {
        if ((80 <= weight) && (weight <= 280)){
            this.weight = weight;
        }
    }

    public void setCanTravel(boolean  canTravel) {
      this.canTravel = canTravel;


    }

    public void setSmokes(boolean smokes) {
       this.smokes = smokes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getCanTravel() {
        return canTravel;
    }

    public boolean getSmokes() {
        return smokes;
    }


    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */


    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        return "";
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel == true) {
            System.out.println("Does travel ");
        } else {
            System.out.println("Does not travel ");
        }
        if (smokes == true) {
            System.out.println("Does smoke ");
        } else {
            System.out.println("Does not smoke ");
        }

    }
}