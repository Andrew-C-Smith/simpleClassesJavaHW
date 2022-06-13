

public class Printer {

    private int numberOfSheets;
//    private int numberOfSheets;

    public Printer(int numberOfSheets){
        this.numberOfSheets = numberOfSheets;
    }

    public void print(int pages, int copies) {
       int totalPages = pages * copies;
       numberOfSheets = numberOfSheets - totalPages;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }
}
