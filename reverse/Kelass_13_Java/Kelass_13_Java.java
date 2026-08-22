public class Kelass_13_Java {
    public static void main(String[] args) {
        String encodedFlag = "BFPNE{w4i4_p4ss31a3_e0g13_z4fg3e_W4l4_Nff0LLL}";
        
        if (args.length == 0) {
            System.out.println("Usage: java Kelass_13_Java <your_guess>");
            System.out.println("Hint: Rahasia berada di balik perputaran 13 langkah...");
            return;
        }

        String userGuess = args[0];
        String encodedGuess = encodeFlag(userGuess);
        
        if (encodedGuess.equals(encodedFlag)) {
            System.out.println("Selamat! Anda berhasil memecahkan rahasia Java 13!");
        } else {
            System.out.println("Maaf, tebakan Anda masih salah. Coba lagi!");
        }
    }

    // Metode enkoding/dekoding ROT13
    private static String encodeFlag(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + (c - base + 13) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
