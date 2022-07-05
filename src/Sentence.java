import java.lang.reflect.Constructor;

public class Sentence {

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;

    }

    @Override
    public boolean equals(Object obj) {
        Sentence sentence1 = (Sentence) obj;
        if (this.sentence == sentence1.sentence)
        {return true;
        }else
        {
            return false;
        }
    }

}