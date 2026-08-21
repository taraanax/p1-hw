
public class Test07 {

    public static void main(String[] args) {
        Tretja.Racun racun = new Tretja.Racun(1);
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1, 20)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1, 30)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1, 40)));
        System.out.println(racun.izvedi(new Tretja.Priliv(1, 200)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1000, 50)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1001, 60)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1002, 40)));
        System.out.println(racun.izvedi(new Tretja.Priliv(1002, 90)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(1003, 100)));
    }
}
