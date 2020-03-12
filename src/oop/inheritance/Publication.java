package oop.inheritance;

public class Publication implements ISaleableItem{
    private String title;
    private Real price;
    private int copies;


    @Override
    public Real Price() {
        return null;
    }

    @Override
    public void sellCopy() {

    }

    public String ToString(){
        return null;
    }
}
