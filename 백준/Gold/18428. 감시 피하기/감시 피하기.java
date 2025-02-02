import java.io.*;
import java.util.*;

public class Main {
    
    static class Point {
        int r;
        int c;
        
        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    static int N;
    static List<Point> teachers;
    static List<Point> traps;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean success;
    static char[][] map;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        teachers = new ArrayList<>();
        traps = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = st.nextToken().charAt(0);
                if (map[i][j] == 'T') teachers.add(new Point(i, j));
                else if (map[i][j] == 'X') traps.add(new Point(i, j));
            }
        }
        
        success = false;
        combination(0, 0);
        if (success) System.out.println("YES");
        else System.out.println("NO");
    }
    
    private static void combination(int idx, int depth) {
        if (depth == 3) {
            if (check()) {
                success = true;
            }
            return;
        }
        
        for (int i = idx; i < traps.size(); i++) {
            Point p = traps.get(i);
            map[p.r][p.c] = 'O';
            combination(i + 1, depth + 1);
            if (success) return;
            map[p.r][p.c] = 'X';
        }
    }
    
    private static boolean check() {
        for (Point t : teachers) {
            for (int dir = 0; dir < 4; dir++) {
                int nr = t.r;
                int nc = t.c;
                
                while (true) {
                    nr += dr[dir];
                    nc += dc[dir];
                    
                    if (0 > nr || nr >= N || 0 > nc || nc >= N) break;
                    if (map[nr][nc] == 'S') return false;
                    if (map[nr][nc] == 'O') break;
                }
            }
        }
        
        return true;
    }
}