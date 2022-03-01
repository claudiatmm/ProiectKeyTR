package clasa3Mostenire;

public class Regtangle {

    private int lenght;
    private int width;

    public Regtangle(int l, int wd) {
        setLenght(l);
        setWidth(wd);
    }

    private void setLenght(int lenght) {
        this.lenght = lenght;
    }

    private int getWidth() {
        return width;
    }

    private int getLenght() {
        return lenght;
    }

    private void setWidth(int width) {
        this.width = width;
    }



    public int calculateAria(){
        return lenght*width;
    }
}
