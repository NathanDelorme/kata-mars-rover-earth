package info.dmerej;


import org.junit.jupiter.api.Test;

public class RoverMovesTest {
    Position startPos=new Position(4,2);


    //NORTH
    @Test
    public void moveForwardNorthTest(){
        Rover rover=new Rover(startPos,Direction.NORTH);
        rover.moveForward();
        assert rover.getPosition().equals(new Position(4,3));
    }
    @Test
    public void moveBackwardNorthTest(){
        Rover rover=new Rover(startPos,Direction.NORTH);
        rover.moveBackward();
        assert rover.getPosition().equals(new Position(4,1));
    }


    //EAST
    @Test
    public void moveForwardEastTest(){
        Rover rover=new Rover(startPos,Direction.EAST);
        rover.moveForward();
        assert rover.getPosition().equals(new Position(5,2));
    }
    @Test
    public void moveBackwardEastTest(){
        Rover rover=new Rover(startPos,Direction.EAST);
        rover.moveBackward();
        assert rover.getPosition().equals(new Position(3,2));
    }


}
