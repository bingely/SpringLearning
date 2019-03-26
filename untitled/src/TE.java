import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/5.
 */
public class TE {

    public static void main(String[] args) {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        System.out.println(df.format(day));

        long l = System.currentTimeMillis();



    }
}
