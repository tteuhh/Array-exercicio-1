public class App {
    public static void main(String[] args) {

        int[] idades = {12, 27, 30, 18, 15, 10, 23, 19, 17, 13};
        
        System.out.println("Idades maiores que 18 anos: ");
        for (int idade : idades) {
            if (idade >= 18) {
                System.out.println(idade);
            }
        }

    }        

}
