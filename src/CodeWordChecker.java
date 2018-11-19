public class CodeWordChecker implements StringChecker{
    private int lowerbound = 6;
    private int upperbound = 20;
    private String bad;

    public CodeWordChecker(int lowerbound, int upperbound, String bad){
        this.lowerbound = lowerbound;
        this.upperbound = upperbound;
        this.bad = bad;
    }

    public CodeWordChecker(String bad){
        this.bad = bad;
    }

    public boolean isValid(String str){
        if(str.length() <= this.upperbound && str.length() >= this.lowerbound && str.indexOf(this.bad) == -1){
            return true;
        }
        return false;
    }
}
