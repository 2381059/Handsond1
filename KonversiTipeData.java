public class KonversiTipeData {
    public static void main(String[] args) {
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeData = tipeDataFloat;

        // Narrowing
        int tipeDataInteger = 129;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);
        String firstName, lastName;
        firstName = "Jeremy";
        lastName = "Panjaitan";

        System.out.println("%s" firstName, lastName);

    }
}
