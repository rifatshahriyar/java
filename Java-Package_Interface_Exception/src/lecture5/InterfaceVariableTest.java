package lecture5;

import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) return NO;
        else if (prob < 60) return YES;
        else if (prob < 75) return LATER;
        else if (prob < 98) return SOON;
        else return NEVER;
    }
}

public class InterfaceVariableTest {
    public static void main(String[] args) {
        Question q = new Question();
        System.out.println(q.ask());
    }
}
