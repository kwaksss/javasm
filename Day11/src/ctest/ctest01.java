package ctest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ctest01 {
    //10초 전으로 이동, "prev"명령어를 입력할 경우 동영상의 재생 위치를 10초전으로 이동.10초미만일경우 0분0초로.

    //10초 후로 이동, "next" 명령어 입력시 10초후로 이동. 남은게 10초미만일경우 동영상의 마지막 위치.
    //오프닝 건너뛰기, op_start <= 현재위치 <= op_end일경우, 자동으로 오프닝이 끝나는 위치로 이동.
    //동영상의 길이를 나타내는 문자열 video_len
    //기능 수행 직전의 재생위치 pos
    //오프팅 시작시각 op_start
    //오프닝 끝나는 시각 op_end
    //사용자의 입력을 나타내는 배열 commands
    //동영상의 위치를 mm:ss형식으로 return 하도록.


    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) throws ParseException {
        String answer = "";

        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");//mm:ss 타입으로 변경.
        Date format1 = sdf.parse(video_len);
        Date format2 = sdf.parse(pos);
        Date format3 = sdf.parse(op_start);
        Date format4 = sdf.parse(op_end);

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        Calendar cal4 = Calendar.getInstance();
        cal1.setTime(format1);
        cal2.setTime(format2);
        cal3.setTime(format3);
        cal4.setTime(format4);

        for(int i = 0;i < commands.length;i++) {
            if(commands[i].equals("next")) {
                cal1.add(Calendar.SECOND, 10); //10초 더한다.

            }else{//perv이면
                cal1.add(Calendar.SECOND, -10); // 10초 뺀다.

            }

        }





        return answer;
    }

    public static void main(String[] args) throws ParseException {

        String video_len = "34:33";
        String pos  = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = {"next","prev"};
        System.out.println(solution(video_len, pos, op_start, op_end, commands));






    }
}
