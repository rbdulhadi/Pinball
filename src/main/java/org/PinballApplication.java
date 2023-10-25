package org;

import com.example.pinball.TheGame.GameRound;

import java.util.Scanner;

public class PinballApplication {

    public static void main(String[] args) {
        GameRound gameRound = new GameRound();
        Scanner scanner = new Scanner(System.in);
        gameRound.play(scanner);
    }
}