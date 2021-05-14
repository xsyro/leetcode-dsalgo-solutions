package code;

public class FindBiggestTwoDigits {

    public int solution(String stringConsistingDigits) {
        // write your code in Java SE 8
        //given string,find the biggest
        char[] characters = stringConsistingDigits.toCharArray();
        int lastInt = 0, maxNumber = 0;
        for(int count = 0, next = 1; count < characters.length; count++){
            if(next < characters.length) {
                lastInt = Integer.parseInt(characters[count] + "" + characters[next]);
                if(lastInt > maxNumber) maxNumber = lastInt;

            }
            next++;
        }
        return maxNumber;


    }

}
