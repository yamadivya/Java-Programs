// https://leetcode.com/problems/robot-return-to-origin/

package divya;

public class RobotReturnOrigin {
    public boolean judgeCircle(String moves) {
        int countVertical = 0;
        int countHorizontal = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U' -> countVertical++;
                case 'D' -> countVertical--;
                case 'R' -> countHorizontal++;
                case 'L' -> countHorizontal--;
            }
        }
        return countVertical == 0 && countHorizontal == 0;
    }
}
