public class TestFinally {
    
    public static void main(String[] args) {
        try {
            System.out.println("Entrer votre code ");
            int x = System.in.read();
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());
        } finally {
            System.out.println("Merci de votre visite");
        }
    }

}
