public class Word extends Sentence {

    private String noVowelsWord;

    public Word( String s , String w)
    {
        super(s);
        w = w.replaceAll("[a,e,i,u,o,A,E,I,O,U]","");
        this.noVowelsWord= w;
    }

    public Word(String sentence) {
        super(sentence);
    }
    public String getNoVowelsWord()
    {
        return this.noVowelsWord;
    }

public boolean isSubstring()
{
    return  getSentence().contains(getNoVowelsWord());

}

}





















