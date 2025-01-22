# Feature: Moving Forward
## Scenario: Facing North
  Given   The rover has position (x=4, y=2) and facing North
  When    Rover moves forward
  Then    The rover has position (x=4, y=3) and facing North

## Scenario: Facing South
  Given   The rover has position (x=4, y=2) and facing South
  When    Rover moves forward
  Then    The rover has position (x=4, y=1) and facing South

## Scenario: Facing East
  Given   The rover has position (x=4, y=2) and facing East
  When    Rover moves forward
  Then    The rover has position (x=5, y=2) and facing East

## Scenario: Facing West
  Given   The rover has position (x=4, y=2) and facing West
  When    Rover moves forward
  Then    The rover has position (x=3, y=2) and facing West

---------------------------------

# Feature: Moving Backward
## Scenario: Facing North
  Given   The rover has position (x=4, y=2) and facing North
  When    Rover moves forward
  Then    The rover has position (x=4, y=1) and facing North

## Scenario: Facing South
  Given   The rover has position (x=4, y=2) and facing South
  When    Rover moves forward
  Then    The rover has position (x=4, y=3) and facing South

## Scenario: Facing East
  Given   The rover has position (x=4, y=2) and facing East
  When    Rover moves forward
  Then    The rover has position (x=3, y=2) and facing East

## Scenario: Facing West
  Given   The rover has position (x=4, y=2) and facing West
  When    Rover moves forward
  Then    The rover has position (x=5, y=2) and facing West

---------------------------------

# Feature: Turn Left
## Scenario: Facing North
  Given   The rover has position (x=4, y=2) and is facing North
  When    Rover turn on the left
  Then    The rover has position (x=4, y=2) and is facing West

## Scenario: Facing South
  Given   The rover has position (x=4, y=2) and is facing South
  When    Rover turn on the left
  Then    The rover has position (x=4, y=2) and is facing East

## Scenario: Facing East
  Given   The rover has position (x=4, y=2) and is facing East
  When    Rover turn on the left
  Then    The rover has position (x=4, y=2) and is facing North

## Scenario: Facing West
  Given   The rover has position (x=4, y=2) and is facing West
  When    Rover turn on the left
  Then    The rover has position (x=4, y=2) and is facing South

---------------------------------

# Feature: Turn Right
## Scenario: Facing North
  Given   The rover has position (x=4, y=2) and is facing North
  When    Rover turn on the right
  Then    The rover has position (x=4, y=2) and is facing East

## Scenario: Facing South
  Given   The rover has position (x=4, y=2) and is facing South
  When    Rover turn on the right
  Then    The rover has position (x=4, y=2) and is facing West

## Scenario: Facing East
  Given   The rover has position (x=4, y=2) and is facing East
  When    Rover turn on the right
  Then    The rover has position (x=4, y=2) and is facing South

## Scenario: Facing West
  Given   The rover has position (x=4, y=2) and is facing West
  When    Rover turn on the right
  Then    The rover has position (x=4, y=2) and is facing North