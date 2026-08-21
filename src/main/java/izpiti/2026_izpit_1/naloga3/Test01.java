
public class Test01 {

    public static void main(String[] args) {
        Tretja.Racun racun = new Tretja.Racun(10);
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(3, 50)));
        System.out.println(racun.izvedi(new Tretja.Priliv(7, 20)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(8, 40)));
        System.out.println(racun.izvedi(new Tretja.Priliv(10, 60)));
        System.out.println(racun.izvedi(new Tretja.OdlozeniOdliv(10, 90)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(10, 20)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(13, 10)));
        System.out.println(racun.izvedi(new Tretja.Priliv(17, 70)));
        System.out.println(racun.izvedi(new Tretja.Priliv(19, 50)));
        System.out.println(racun.izvedi(new Tretja.Priliv(20, 100)));
        System.out.println(racun.izvedi(new Tretja.Priliv(21, 40)));
    }
}
