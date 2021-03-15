public class Printer {

    private int paperLeft;


    public Printer(int paperLeft) {
        this.paperLeft = paperLeft;
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
}