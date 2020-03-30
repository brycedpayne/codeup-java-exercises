public class ServerNameGenerator {

    private static String[] adjs = {"Angry", "Sleek", "Fast", "Mean", "Ubiquitous", "Green", "Remarkable", "Wild", "Clever", "Crazy"};
    private static String[] nouns = {"Ripley", "Newt", "Apone", "Hicks", "Hudson", "Vasquez", "Ghorman", "Bishop", "Drake", "Xenomorph"};


    public static String randomPos(String[] arr) {
        return arr[(int) (Math.random() * 10)];
    }

    public static void main(String[] args) {
        String serverName = randomPos(adjs) + "-" + randomPos(nouns);
        System.out.println("here is your server name:\n" + serverName);

    }

}
