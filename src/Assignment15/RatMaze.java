package Assignment15;
import java.util.*;

public class RatMaze {
    static List<String> paths;
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, -1, 1, 0};
    static char[] dir = {'D', 'L', 'R', 'U'};

    public static List<String> findPaths(int[][] maze, int n) {
        paths = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
            return paths;

        boolean[][] visited = new boolean[n][n];
        dfs(maze, 0, 0, "", visited, n);
        return paths;
    }

    private static void dfs(int[][] maze, int x, int y, String path, boolean[][] visited, int n) {
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i], newY = y + dy[i];
            if (newX >= 0 && newY >= 0 && newX < n && newY < n &&
                    maze[newX][newY] == 1 && !visited[newX][newY]) {
                dfs(maze, newX, newY, path + dir[i], visited, n);
            }
        }

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        List<String> result = findPaths(maze, 4);
        System.out.println(result);
    }
}
