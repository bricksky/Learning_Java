package extends1.ex;

public class Album extends Item{
    public String artits;

    // command + n -> 생성자 자동으로 만들어주는 단축키.
    public Album(String name, int price, String artits) {
        super(name, price);
        this.artits = artits;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트" + artits);
    }
}
