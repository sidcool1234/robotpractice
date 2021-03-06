package com.sid.robotsimulation.model;

public class Robot {
    private Position currentPosition;
    private final Position initialPosition;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
        this.initialPosition = startPosition;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    private void moveLeft() {
        this.currentPosition = this.currentPosition.left();
    }

    private void moveRight() {
        this.currentPosition = this.currentPosition.right();
    }

    private void moveUp() {
        this.currentPosition = this.currentPosition.up();
    }

    private void moveDown() {
        this.currentPosition = this.currentPosition.down();
    }

    public void moveCommand(Directions ... directions) {
        for (Directions direction: directions) {
            switch (direction) {
                case UP: moveUp() ; break;
                case DOWN: moveDown();break;
                case LEFT: moveLeft(); break;
                case RIGHT: moveRight(); break;
            }
        }
    }
}