package info.dmerej;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverMovesTest {
    Position startPos=new Position(4,2);

    //FORWARD/BACKWARD MOVEMENT
    //NORTH
    @ParameterizedTest(name = "{0} is expected to output {1}")
    @MethodSource("moveForwardTestCases")
    public void moveForwardTest(Direction direction,Position expectedPosition){
        Rover rover=new Rover(startPos,direction);
        rover.moveForward();
        assertEquals(rover.getPosition(),expectedPosition);
    }
    private static Stream<Arguments> moveForwardTestCases() {
        return Stream.of(
                Arguments.of(Direction.NORTH, new Position(4,3)),
                Arguments.of(Direction.EAST, new Position(5,2)),
                Arguments.of(Direction.SOUTH, new Position(4,1)),
                Arguments.of(Direction.WEST, new Position(3,2))
        );
    }

    @ParameterizedTest(name = "Move {0}, expected output: {1}")
    @MethodSource("moveBackwardTestCases")
    public void moveBackwardTest(Direction direction,Position expectedPosition){
        Rover rover=new Rover(startPos,direction);
        rover.moveBackward();
        assertEquals(rover.getPosition(),expectedPosition);
    }
    private static Stream<Arguments> moveBackwardTestCases() {
        return Stream.of(
                Arguments.of(Direction.SOUTH, new Position(4,3)),
                Arguments.of(Direction.WEST, new Position(5,2)),
                Arguments.of(Direction.NORTH, new Position(4,1)),
                Arguments.of(Direction.EAST, new Position(3,2))
        );
    }

    //LEFT/RIGHT ROTATION
    //FROM NORTH
    @ParameterizedTest(name = "{0} is expected to output {1}")
    @MethodSource("rotateLeftTestCases")
    public void rotateLeftTest(Direction startDirection,Direction expectedDirection){
        Rover rover=new Rover(startPos,startDirection);
        rover.rotateLeft();
        assertEquals(rover.getDirection(),expectedDirection);
    }

    private static Stream<Arguments> rotateLeftTestCases() {
        return Stream.of(
                Arguments.of(Direction.SOUTH, Direction.EAST),
                Arguments.of(Direction.WEST, Direction.SOUTH),
                Arguments.of(Direction.NORTH, Direction.WEST),
                Arguments.of(Direction.EAST, Direction.NORTH)
        );
    }

    @ParameterizedTest(name = "{0} is expected to output {1}")
    @MethodSource("rotateRightTestCases")
    public void rotateRightTest(Direction startDirection,Direction expectedDirection){
        Rover rover=new Rover(startPos,startDirection);
        rover.rotateRight();
        assertEquals(rover.getDirection(),expectedDirection);
    }
    private static Stream<Arguments> rotateRightTestCases() {
        return Stream.of(
                Arguments.of(Direction.SOUTH, Direction.WEST),
                Arguments.of(Direction.WEST, Direction.NORTH),
                Arguments.of(Direction.NORTH, Direction.EAST),
                Arguments.of(Direction.EAST, Direction.SOUTH)
        );
    }
}
