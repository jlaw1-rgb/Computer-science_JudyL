public class Robot {

    private int[] hallway;
    private int position; 
    private boolean isFacingRight;

    public Robot(int[] hallwayToClean, int startingPosition) {
        for (int i = 0; i < hallwayToClean.length; i++) {
            if (hallwayToClean[i] < 0) {
                hallwayToClean[i] = 0;
            }
        }
        this.hallway = hallwayToClean;
        if (startingPosition < 0) {
            startingPosition = 0;
        }
        if (startingPosition > hallway.length - 1) {
            startingPosition = hallway.length - 1;
        }
        this.position = startingPosition;
        this.isFacingRight = true;
    }
    
    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
            this.hallway = hallway;
        }
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > hallway.length - 1) {
            position = hallway.length - 1;
        }
        this.position = position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        String display = "";
        for (int i = 0; i < hallway.length; i++) {
            display = display + hallway[i] + " ";
        }
        display = display + "\n";
        for (int s = 0; s < position; s++) {
            display = display + " ";
            display = display + " ";
        }
        if (isFacingRight == true) {
            System.out.println(display + ">");
        } else {
            System.out.println(display + "<");
        }
    }

    public boolean isRobotBlockedByWall() {
        return (position == 0 && !isFacingRight)
            || (position == hallway.length - 1 && isFacingRight);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] != 0) {
            this.hallway[position] = hallway[position] - 1;
        }
        if (hallway[position] == 0) {
            if (isRobotBlockedByWall() == true) {
                this.isFacingRight = !isFacingRight;
            } else {
                if (isFacingRight == true) {
                    this.position = position + 1;
                } else {
                    this.position = position - 1;
                }
            }
        }
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (hallIsClear() == false) {
            move();
            count = count + 1;
            System.out.println("After move " + count + ": ");
            displayState();
        }
        return count;
    }
}