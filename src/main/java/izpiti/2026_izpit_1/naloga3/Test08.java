
public class Test08 {

    public static void main(String[] args) {
        Tretja.Racun racun = new Tretja.Racun(5);
        for (int dan = 10; dan < 20; dan++) {
            System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(dan, 100)));
        }
    }
}
