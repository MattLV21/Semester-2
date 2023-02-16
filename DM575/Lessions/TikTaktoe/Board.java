package DM575.Lessions.TikTaktoe;

public class Board {
    public String player; // X or O
    private String[] Board;
    private String[] base;
    
    public Board() {
        Board = new String[9];
        base = new String[9];
        for (int i = 0; i < Board.length; i++) {
            Board[i] = "" + (i+1);
            base[i] = "" + (i+1);
        }
    }
    /**
     * Computes the gcd
     * @param m natural number
     * @param n natural number
     * @return  the gcd of m, n
     */
    public static int gcd(int m, int n) {
        if (m == n) {
            return m;
        } else if (m < n) {
            return gcd(m, n-m);
        } else {
            return gcd(m-n, n);
        }
    }
    public static int gcdWhile(int m, int n) {
        while (m != n) {
            if (m < n) {
                n = n-m;
            } else {
                m = m-n;
            }
        }
        return m;
    }
    
    public String nextPlayer() {
        if (player == "X") {
            return "O";
        } else {
            return "X";
        }
    }
    public boolean makeMove(int cell) {
        if (!Board[cell - 1].equals(base[cell - 1])) {
            return false;
        } else {
            if (nextPlayer() == "X") {
                Board[cell - 1] = "X";
            }
            else {
                Board[cell - 1] = "O";
            }
            return true;
        }
    }
    public boolean isTie() {
        boolean tie = true;
        for (int i = 0; i < Board.length; i++) {
            if (Board[i].equals(base[i])) {
                tie = false;
            }
        }
        return tie;
    }
    public boolean won() {
        return false;
    }
    public void show() {
        for (int i = 0; i < Board.length; i++) {
            
            if ((i+1) % 3 == 0) {
                System.out.println(Board[i]);
            }
            else {
                System.out.print(Board[i] + " | ");
            }
        }
    }
}
