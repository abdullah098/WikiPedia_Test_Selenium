import java.util.concurrent.TimeUnit;

public class TimeOut {
        public void timeoOut(int time){

            try{
                TimeUnit.SECONDS.sleep(time);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }



}
