//Robot.java by Daragh Carroll t00201097

public class Robot {
    private String name;
    private int numMotors;
    private double powerDuration;
    /*private static int numOfRobots = 1;
    private int counter = numOfRobots++;*/

    // Mutator Methods

    public void setName(String name)
    {
        this.name = name;
    }//End setName()

    public void setNumMotors(int numMotors)
    {
        this.numMotors = numMotors;
    }//End setNumMotors()

    public void setPowerDuration(double powerDuration)
    {
        this.powerDuration = powerDuration;
    }//End setPowerDuration()

    // Accessor Methods

    public String getName()
    {
        return this.name;
    }//End getName()

    public int getNumMotors()
    {
        return this.numMotors;
    }//End getNumMotors()

    public double getPowerDuration()
    {
        return this.powerDuration;
    }//End getPowerDuration()

    /*public int getNumOfRobots()
    {
        return numOfRobots;
    }*/

    //toString

    @Override
    public String toString()
    {
        return "Name: " + getName() + "\nNumber of Motors: " + getNumMotors() + "\nPower Duration: " + getPowerDuration() + " hrs.";
    }

    //Constructors


}
