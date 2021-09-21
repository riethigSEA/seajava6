public class Classroom {
    public static void main(String[] args) {
        Wilder rainhard = new Wilder("Rainhard", true);
        Wilder martin = new Wilder("Martin", false);

        System.out.println(rainhard.whoAmI());
        System.out.println(martin.whoAmI());
    }
}
