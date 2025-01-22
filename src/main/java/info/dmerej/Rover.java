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

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
