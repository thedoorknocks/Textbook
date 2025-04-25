public class Textbook extends Book{
    private int edition;

    public  Textbook(String title, double price, int edition){
        super(title, price);
        this.edition = edition;
    }

    public int getEdition(){
        return edition;
    }

    public String getBookInfo(){
        return super.getBookInfo() + "_" + edition;
    }

    public boolean canSubstituteFor(Textbook other){
        if(getTitle().equals(other.getTitle())){
            if(getEdition() >= other.getEdition()){
                return true;
            }
        }
        return false;
    }

}