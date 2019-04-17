package com.javacore.steve.command.Commands.common;

public class ConsoleCanvas extends Canvas {

    private char[][] pixies;
    private int width;
    private int height;

    public ConsoleCanvas(int width, int height){
        this.width = width;
        this.height = height;
        init();
        reset();
    }

    public void init(){
        pixies = new char[height][width];
    }

    private void reset(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixies[i][j] = '.';
            }
        }
    }

    public void draw(){
        for (int i = 0; i < height; i++) {
            System.out.print("\n");
            for (int j = 0; j < width; j++) {
                System.out.print(pixies[i][j] + "\t");
            }
        }

    }

    public void drawFrame(int x, int y, int size){
        for (int i = y; i < y + size; i++) {
            if (i == y || i == y + size - 1){
                for (int j = x; j < x + size; j++) {
                    pixies[i][j] = 'N';
                }
            } else {
                pixies[i][x] = 'N';
                pixies[i][x+size-1] = 'N';
            }
        }
        draw();
        reset();
    }

    public void drawSquareAt(int x, int y, int size){
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                pixies[i][j] = 'N';
            }
        }
        draw();
        reset();
    }

    public void setSymbolAt(int x, int y, char sym){
        pixies[x][y] = sym;
    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }

    public void drawSquare(int size){
        if (size < 2) {
            System.out.println("No square");
        }
        System.out.println("\n");
        for (int i = 0; i < size-1; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }

    }
}
