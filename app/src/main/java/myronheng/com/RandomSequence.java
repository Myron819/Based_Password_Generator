package myronheng.com;

import java.util.Random;

public class RandomSequence {
    private String randSeq;
    private Character[] characters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '[', '{', ']', '}', '\\', '|', ';', ':', '"', '\'', ',', '<', '.', '>', '/', '?'};

    public RandomSequence(int length) {
        newSequence(length);
    }

    public void newSequence(int length) {
        Random rand = new Random();
        StringBuilder newSeq = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randInt = rand.nextInt(this.characters.length);
            newSeq.append(this.characters[randInt]);
        }
        this.randSeq = newSeq.toString();
    }

    public String getRandSeq() {
        return randSeq;
    }

    public void setRandSeq(String randSeq) {
        this.randSeq = randSeq;
    }
}
