public class App {
    public static void main(String[] args) throws Exception {
        Ahorro persona1 = new Ahorro(38428374, "WestCOL");
        Ahorro persona2 = new Ahorro(23487237, "GirlofNox");

        persona1.deposito(3742742);
        persona2.deposito(683924);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
