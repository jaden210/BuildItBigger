package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {


    public final static ArrayList<String> jokes = new ArrayList<String>();

    public Jokes() {
        jokes.add("How much does a hipster weigh?\n" +
                "An instagram!");
        jokes.add("A man walks into a bar and says\n" +
                "\"I just got back from the battered woman's shelter, and boy are my arms tired.\"\n" +
                "Everyone laughed.\n" +
                "The man sat at the end of the bar drinking alone. \n" +
                "He was proud of the fine craftsmanship of the shelves he put up in the shelter's pantry, regardless of what others may think.");
        jokes.add("Why did Captain Kirk's wife have a turd on her head?\n" +
                "Because William Shatner!");
        jokes.add("What did the shoes say to the pants?\n" +
                "SUP, BRITCHES!");
        jokes.add("Why did Mozart kill all his chickens?\n" +
                "Because when he asked them who the best composer was, they'd all say \"Bach bach bach!\"");
        jokes.add("What did the green grape say to the purple grape?\n" +
                "Breathe dammit, BREATHE!");
        jokes.add("How do you catch a bra?\n" +
                "With a booby trap!");

    }




    public String getJoke() {
        Random r = new Random();
        return jokes.get(r.nextInt(jokes.size()));
    }
}
