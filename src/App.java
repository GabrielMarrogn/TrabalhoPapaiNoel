import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtd = sc.nextInt();
        sc.next();

        int bonecos = 0;
        int arquitetos = 0;
        int musicos = 0;
        int desenhistas = 0;

        for (int i = 0; i < qtd; i++) {
            String[] arr = sc.nextLine().split(" ");
            if (arr[1].equals("bonecos")) {
                bonecos += Integer.parseInt(arr[2]);
            } else if (arr[1].equals("arquitetos")) {
                arquitetos += Integer.parseInt(arr[2]);
            } else if (arr[1].equals("musicos")) {
                musicos += Integer.parseInt(arr[2]);
            } else if (arr[1].equals("desenhistas")) {
                desenhistas += Integer.parseInt(arr[2]);
            }
        }

        int total = (bonecos / 8) + (arquitetos / 4) + (musicos / 6) + (desenhistas / 12);

        System.out.println(total);
        sc.close();
    }
}
