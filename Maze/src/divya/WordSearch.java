// https://leetcode.com/problems/word-search/
package divya;

public class WordSearch {

        boolean ans;
        public boolean exist(char[][] board, String word) {
            int m = board.length, n = board[0].length;
            ans = false;
            boolean[][] visited = new boolean[m][n];
            for (int r = 0; r < m ; r++) {
                for (int c = 0; c < n; c++) {
                    dfs (board, word, m, n, r, c, 0, visited);
                    if (ans)
                        return true;
                }
            }
            return false;
        }

        public void dfs (char[][] board, String word, int m, int n, int r, int c,
                         int index, boolean[][] visited) {

            if (r < 0 || c < 0 || r >= m || c >= n || visited[r][c] ||
                    board[r][c] != word.charAt(index)) {
                return;
            }

            if (index == word.length()-1) {
                ans = true;
                return;
            }

            visited[r][c] = true;
            // we can go up, down, right and left side during backtracking
            dfs(board, word, m, n, r+1, c, index+1, visited);
            dfs(board, word, m, n, r, c+1, index+1, visited);
            dfs(board, word, m, n, r-1, c, index+1, visited);
            dfs(board, word, m, n, r, c-1, index+1, visited);
            visited[r][c] = false;
        }
    }

