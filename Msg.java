 
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class mt2 extends Activity {
     // كائن من الكلاس SharedPreferences لحفظ قيمة متغير او اي اعدادات اخرى
   SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt2);

        // اعداد الكائن لحفظ القيم
        sharedPreferences = getSharedPreferences("msg",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // للحصول على قيمة المتغير show
        int show =sharedPreferences.getInt("show", 0);

        // اذا كانت لاتساوي 1 يقوم بعرض الرسالة وغير ذلك لايتم عرضها , ويقوم بحفظ قيمة 1 بالمتغير show
        if(show !=1){

            // هنا تضع اي رسالة تريدها ان تظهر عند تشغيل البرنامج لاول مرة

            // مثلا رسالة Toast
            Toast.makeText(mt2.this, " مرحبا , هذه الرسالة تظهر لمرة واحدة فقط", Toast.LENGTH_SHORT).show();

            // يحفظ القيمة 1 عند تشغيل البرنامج وعرض الرسالة
            editor.putInt("show", 1);
            editor.commit();
        }

    }


}
