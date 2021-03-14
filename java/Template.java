import java.io.*;
import java.util.*;
public class Template {
    //replaced my old template, for most online judge use
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    //------------------------------------------------------//
    //------------------------------------------------------//
    public static void main(String[] args) {
        //------------------------------------------------------//
        out.close();
    }
}
