public class EqualsApp {
    public static void main(String[] args) {
        String first = "Asade ";
        String second = "Kon";
        String third = first + second;
        String fourth = "Asade Kon";
        String tot = "Asade Kon";
        int pertama = 2;
        int kedua = 1+1;

        System.out.println(pertama);
        System.out.println(kedua);

        System.out.println(pertama==kedua);
        System.out.println(fourth==tot);

        System.out.println(third);
        System.out.println(fourth);

        System.out.println(third.equals(fourth));
        System.out.println(third==fourth);



    }




}
