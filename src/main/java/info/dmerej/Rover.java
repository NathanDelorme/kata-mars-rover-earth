package info.dmerej;



public class Rover {
    private Position position;
    private Direction direction;

    public Rover(Position startPos, Direction startDirection) {
        this.position=startPos;
        this.direction=startDirection;
    }
    public void moveForward(){
        switch (direction){
            case NORTH -> position.setY(position.getY()+1);
            case EAST -> position.setX(position.getX()+1);
            case WEST -> position.setX(position.getX()-1);
            case SOUTH -> position.setY(position.getY()-1);
        }
    }
    public void moveBackward(){
        switch (direction){
            case NORTH -> position.setY(position.getY()-1);
            case EAST -> position.setX(position.getX()-1);
            case WEST -> position.setX(position.getX()+1);
            case SOUTH -> position.setY(position.getY()+1);
        }
    }

    public void rotateRight(){
        switch (direction){
            case NORTH -> direction=Direction.EAST;
            case EAST -> direction=Direction.SOUTH;
            case WEST -> direction=Direction.NORTH;
            case SOUTH -> direction=Direction.WEST;
        }
    }
    public void rotateLeft(){
        switch (direction){
            case NORTH -> direction=Direction.WEST;
            case EAST -> direction=Direction.NORTH;
            case WEST -> direction=Direction.SOUTH;
            case SOUTH -> direction=Direction.EAST;
        }
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
