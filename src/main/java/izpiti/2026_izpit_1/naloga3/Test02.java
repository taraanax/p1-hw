
public class Test02 {

    public static void main(String[] args) {
        Tretja.Racun racun = new Tretja.Racun(50);
        System.out.println(racun.izvedi(new Tretja.Priliv(1, 20)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(1, 20)));
        System.out.println(racun.izvedi(new Tretja.Priliv(1, 50)));
        System.out.println(racun.izvedi(new Tretja.Priliv(1, 40)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(1, 50)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(1, 30)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(1, 10)));
        System.out.println(racun.izvedi(new Tretja.TakojsnjiOdliv(1, 30)));
        System.out.println(racun.izvedi(new Tretja.Priliv(1, 90)));
    }
}
