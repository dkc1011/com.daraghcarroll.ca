// RobotAnalysis.java by Daragh Carroll t00201097

import javax.swing.*;

public class RobotAnalysis {
    public static void main(String[] args) {
        Robot[] robotTeam = new Robot[inputNumRobots()];

        for(int i=0; i<robotTeam.length; i++)
        {
            Robot newRobot = new Robot();
            newRobot.setName(inputRobotName(i));
            newRobot.setNumMotors(inputRobotMotors(i));
            newRobot.setPowerDuration(inputRobotPower(i));
            robotTeam[i] = newRobot;
        }//End for

        display(robotTeam);
        displayMostMotors(robotTeam);
        displayTop2Robots(top2RobotsByDuration(robotTeam));

        //JOptionPane.showMessageDialog(null, Robot.getNumOfRobots());
    }//End PSVM


    /**
     *
     * @return the integer defining how many robots the user wants on their team(the array size)
     */
    private static int inputNumRobots()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("How many robots do you want in your team? :"));
    }//End inputNumRobots()


    /**
     *
     * @param i - The integer counting the number of robots processed by the for loop
     * @return - The String dictating the name for the Robot object
     */
    private static String inputRobotName(int i)
    {
        return JOptionPane.showInputDialog("Please input a name for robot " + (i+1));
    }//End inputRobotName()


    /**
     *
     * @param i - The integer counting the number of robots processed by the for loop
     * @return - The integer dictating the number of motors in the Robot object
     */
    private static int inputRobotMotors(int i)
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of motors in robot " + (i+1)));
    }//End inputRobotMotors()


    /**
     *
     * @param i - The integer counting the number of robots processed by the for loop
     * @return - The double dictating the amount of power in hours remaining in the Robot object
     */
    private static double inputRobotPower(int i)
    {
        return Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of power for robot " + (i+1) + " in hours."));
    }//End inputRobotPower()


    //Creates a JText area and displays it
    private static void display(Robot[] robotTeam)
    {
        JTextArea jta = new JTextArea("Team:\n");
        for (int j=0; j<robotTeam.length; j++)
        {
            jta.append(robotTeam[j].toString());
            jta.append("\n");
        }//End for

        JOptionPane.showMessageDialog(null, jta, "Your Robot Team!", JOptionPane.INFORMATION_MESSAGE);
    }//End display()


    private static void displayMostMotors(Robot[] robotTeam)
    {
        int maxRobotIndex=0;

        for (int x=0; x<robotTeam.length; x++)
        {
            int maxRobotMotors=Integer.MIN_VALUE;


            if(robotTeam[x].getNumMotors() > maxRobotMotors)
            {
                maxRobotMotors = robotTeam[x].getNumMotors();
                maxRobotIndex = x;
            }//End If
        }//End for

        JOptionPane.showMessageDialog(null, "Robot with the most motors:\n\n" + robotTeam[maxRobotIndex].toString());
    }//End displayMostMotors()


    private static Robot[] top2RobotsByDuration(Robot[] robotTeam)
    {
        Robot[] top2Robot = new Robot[2];

        int maxRobotIndex1 = 0;
        int maxRobotIndex2 = 0;

        for (int y=0; y<robotTeam.length; y++)
        {
            double maxRobotPower1 = Double.MIN_VALUE;
            double maxRobotPower2 = Double.MIN_VALUE;

            if(robotTeam[y].getPowerDuration() > maxRobotPower2 && robotTeam[y].getPowerDuration() > maxRobotPower1)
            {
                maxRobotIndex1 = y;
            }
            else if(robotTeam[y].getPowerDuration() > maxRobotPower2 || robotTeam[y].getPowerDuration() < maxRobotPower1)
            {
                maxRobotIndex2 = y;
            }//End if/else
        }//End for

        top2Robot[0] = robotTeam[maxRobotIndex1];
        top2Robot[1] = robotTeam[maxRobotIndex2];

        return top2Robot;
    }//End top2RobotsByDuration()


    private static void displayTop2Robots(Robot[] top2Robot)
    {
        JTextArea jta = new JTextArea("Long Duration Robots\n\n");

        for (int k=0; k<2; k++)
        {
            jta.append(top2Robot[k].toString());
            jta.append("\n");
        }

        JOptionPane.showMessageDialog(null, jta, "Long Duration Robots", JOptionPane.INFORMATION_MESSAGE);
    }//End displayTop2Robots()
}


