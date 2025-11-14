public class Robot {

    private int[] hallway;
    private int position; 
    private boolean isFacingRight;

    public Robot(int[] hallwayToClean, int startingPosition) {
        this.hallway = hallwayToClean;
        this.position = startingPosition;
        this.isFacingRight = true;
    }
    
    public int[] getHallway() {
        return hallway;
    }

    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
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
        for (int s = 0; s <= position; s++) {
            display = display + " ";
        }
        if (isFacingRight == true) {
            System.out.println(display + ">");
        } else {
            System.out.println(display + "<");
        }
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if ((position == 0 && isFacingRight == false)|| (position == hallway.length && isFacingRight == true)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] != 0) {
            this.hallway[position] = this.hallway[position] - 1;
            if (hallway[position] == 0) {
                if (isRobotBlockedByWall() == true) {
                    isFacingRight = !isFacingRight;
                } else {
                    if (isFacingRight == true) {
                        this.position = position + 1;
                    } else {
                        this.position = position - 1;
                    }
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
        // to-do: implement this method

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
        // to-do: implement this method

        return count;
    }
}
