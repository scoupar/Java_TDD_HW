public class Printer {

    private int paperLeft;
    private int tonerVolume;


    public Printer(int paperLeft, int tonerVolume) {
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int print(int copies, int pages) {
        return this.paperLeft - copies * pages;
    }

    public boolean enoughPaper(int copies, int pages) {
        if (this.paperLeft < copies * pages) {
            return false;
        } else {
            return true;
        }
    }

    public int decreaseToner(int copies, int pages){
        return this.tonerVolume - copies * pages;

    }


}